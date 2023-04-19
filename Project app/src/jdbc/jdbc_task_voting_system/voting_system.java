package jdbc.jdbc_task_voting_system;

import org.postgresql.util.OSUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class db{
    static void db_execute(String query) throws  SQLException
    {
        Connection conc = null;
        try {
            Class.forName("org.postgresql.Driver");
            conc = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
            Statement stmt = conc.createStatement();
            //System.out.println(query);
            stmt.execute(query);
            conc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    static ResultSet  db_execute_query(String query) throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
            Statement s=c.createStatement();
            //System.out.println(query);
            ResultSet d=s.executeQuery(query);
            c.close();
            return d;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return null;
    }
}

public class voting_system {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        System.out.println("|---------------------|");
        System.out.println("  1.Voters\n  2.Admin");
        System.out.println("|---------------------|");
        System.out.println("Enter your choice:");
        int person_choice= in.nextInt();
        switch(person_choice){
            case 1:
                voters vote = new voters();
                vote.voters_choice();
                break;
            case 2:
                System.out.println("Please enter your password:");
                String admin_pass = in.next().toUpperCase();
                if(admin_pass.equals("ADMIN")){
                    System.out.println("*********** Welcome Admin *********");
                    admin admin= new admin();
                    admin.admin_choice();
                    break;
                }
        }
    }
}
class voters{
    static Scanner in = new Scanner(System.in);
    void voters_choice() throws SQLException {
        System.out.println("1.Voters Log In\n2.Voters Registers");
        System.out.println("Enter your choice:");
        int voters_choice=in.nextInt();
        in.nextLine();
        switch (voters_choice){
            case 1:
                voters_log_in();
                break;
            case 2:
                System.out.println("******* Welcome to Voting System *********");
                voters_registers();
                break;
        }
    }

    void voters_log_in() throws SQLException {
        db.db_execute_query("Select * from voter_user_details;");
        try {
            System.out.println("Please Enter your Name:");
            String Name = in.nextLine();
            System.out.println();
            System.out.println("Please enter your password:");
            String user_password_login = in.next();

            ResultSet user_check = db.db_execute_query("Select * from  voter_user_details");
            while (user_check.next()) {
                String User_Name=user_check.getString(2);
                String pass=user_check.getString(4);
                if(Name.equals(User_Name)&& user_password_login.equals(pass)){
                    System.out.println("***** Welcome Voter *****");
                    voters_add();
                }
            }
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    void voters_registers() throws SQLException {

        String user_password_en = null,user_pass2=null;
        boolean ph=true;
        System.out.println("Please Enter your Aadhaar number:");
        String Aadhaar = in.nextLine();
        System.out.println("Please enter your name");
        String user_name=in.nextLine();
            System.out.println("Please Enter Your Mobile Number:");
            String user_mobile=in.nextLine();
        boolean f=true;
        do {
            System.out.println("Password must contain within A-Z , numbers and minimum 5 characters:");
            System.out.println("Please enter your password: ");
            String pasw = in.next();
            Pattern pat = Pattern.compile("[0-9A-Za-z]{5,}");
            Matcher m1 = pat.matcher(pasw);
            boolean bol = m1.matches();
            if (bol) {
                user_password_en=pasw;
                user_pass2=pasw;
                //login.setPasw(pasw);
                f = false;
            } else {
                System.out.println("Your  Password is not valid ");
                System.out.println("Please enter the correct numbers:");

            }
        } while (f);
        
        boolean repas = true;
        do {
            System.out.println("Please re-enter your above password to confirm:");
            String new_passw = in.next();
            if (user_pass2.equals(new_passw)) {
                repas = false;
                break;
            }
            else {
                System.out.println("Your both entered password and current entered password are not same");
            }
        } while (repas);
        if(repas==false) {
            db.db_execute(" insert into voter_user_details values('" +Aadhaar + "','" + user_name + "','"+user_mobile+"','"+ user_password_en + "');");
            System.out.println("********* Thank you registering *********");
        }
        System.out.println("If you want to login(Y/N)");
        String login = in.next().toUpperCase();
        in.nextLine();
        if(login.equals("Y")) {
            voters_log_in();
        }
        else{
            System.out.println("Thank you for Using");
            System.exit(1);
        }
    }
    void voters_add() throws SQLException {
        System.out.println("Enter your aadhar number:");
        String aadhar = in.next();
        boolean f=true;
        ResultSet voters_check = db.db_execute_query("Select aadhar_no from voting_system;");
        while(voters_check.next()) {
            if (aadhar.equals(voters_check.getString(1))) {
                f=false;
                System.out.println("********* You already Voted **********");
                System.exit(0);
            }
        }
        if(f){
            System.out.println("Which party you put vote");
            System.out.println("1.party-1\n2.party-2\n3.party-3");
            System.out.println("Please Enter the party you would like to vote:");
            int voters_choice = in.nextInt();
            int party_1, party_2, party_3;
            switch (voters_choice) {
                case 1:
                    party_1 = 1;
                    party_2 = 0;
                    party_3 = 0;
                    db.db_execute(" insert into voting_system values('" + aadhar + "','" + party_1 + "','" + party_2 + "','" + party_3 + "');");
                    System.out.println("******** Thank you  for Voting *********");
                    break;
                case 2:
                    party_1 = 0;
                    party_2 = 1;
                    party_3 = 0;
                    db.db_execute(" insert into voting_system values('" + aadhar + "','" + party_1 + "','" + party_2 + "','" + party_3 + "');");
                    System.out.println("********** Thank you for Voting **********");
                    break;
                case 3:
                    party_1 = 0;
                    party_2 = 0;
                    party_3 = 1;
                    db.db_execute(" insert into voting_system values('" + aadhar + "','" + party_1 + "','" + party_2 + "','" + party_3 + "');");
                    System.out.println("********** Thank you for Voting **********");
                    break;
            }
        }
    }
}
class admin{
    static Scanner in = new Scanner(System.in);
    void admin_choice() throws SQLException {
        System.out.println("|-----------------------------|");
        System.out.println("  1.View the Voters List\n  2.Result of Voting");
        System.out.println("|-----------------------------|");
        System.out.println("Enter your choice:");
        int admin_choice = in.nextInt();
        switch (admin_choice) {
            case 1:
                System.out.println("View the Voters List");
                voters_list();
                break;
            case 2:
                System.out.println("Result of Voting");
                result_of_voting();
                break;
        }
    }
    void voters_list() throws SQLException {
        ResultSet list_of_voters=db.db_execute_query("Select * from voter_user_details;");
        System.out.println("|--------------------|-------------------|--------------------|");
        System.out.println(String.format("%18s %18s %20s","Aadhar no","Voters name","Voters Mobile no"));
        System.out.println("|--------------------|-------------------|--------------------|");

        while (list_of_voters.next()){
            System.out.println(String.format("%18s %18s %18s ",list_of_voters.getString(1),list_of_voters.getString(2)
            ,list_of_voters.getString(3)));
            System.out.println("|--------------------|-------------------|--------------------|");

        }
    }
    void result_of_voting() throws SQLException {
        int party_1=0,party_2=0,party_3=0;
        ResultSet list_of_voters=db.db_execute_query("Select * from voting_system;");
        ResultSet count_party_1=db.db_execute_query("Select Sum(party_1) from voting_system;");
        while(count_party_1.next()){
            party_1=count_party_1.getInt(1);
        }
        ResultSet count_party_2=db.db_execute_query("Select Sum(party_2) from voting_system;");
        while(count_party_1.next()){
            party_2=count_party_2.getInt(1);
        }
       // System.out.println("********"+count_party_2);
        ResultSet count_party_3=db.db_execute_query("Select Sum(party_3) from voting_system;");
        while(count_party_3.next()){
            party_3=count_party_3.getInt(1);
        }
        System.out.println("|--------------------|-------------------|--------------------|--------------------|");
        System.out.println(String.format("%18s %18s %20s %18s","Aadhar no","Party-1","Party-2","Party-3"));
        System.out.println("|--------------------|-------------------|--------------------|--------------------|");
        while (list_of_voters.next()){
            System.out.println(String.format("%18s %18s %18s %18s",list_of_voters.getString(1),list_of_voters.getString(2)
                    ,list_of_voters.getString(3),list_of_voters.getString(4)));
            System.out.println("|--------------------|-------------------|--------------------|--------------------|");
        }
        int result = Math.max((Math.max(party_1,party_2)),party_3);
        ArrayList<String> majority = new ArrayList<>();
        int i=0;
        if(result==party_1){
            majority.add("party-1");
        }
        if (result==party_2) {
            majority.add("party-2");
        }
        if (result==party_3){
            majority.add("party-3");
        }
        if(majority.size()==1){
            System.out.println("The majority votes are taken by :"+majority.get(0));
            System.out.println("The total number of votes taken by "+majority.get(0)+" is :"+result);
        }
        else{
            System.out.println();
            //System.out.print("The Parties are: ");
            System.out.print("The majority votes are taken by : ");
            for(String j:majority){
                System.out.print(j+",");
            }
            System.out.println();
            System.out.println("The total number of votes taken is :"+result);
        }

    }
    }