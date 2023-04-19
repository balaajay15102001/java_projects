package jdbc;
import java.sql.*;
import java.io.*;
import java.sql.DriverManager.*;
import java.util.Scanner;

public class appli_jdbc {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
//            String s="CREATE TABLE Students" + "(id INTEGER not NULL, " + " firstName VARCHAR(25), " + " lastName VARCHAR(25), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
//            stmt.executeUpdate(s);
//            System.out.println("Created Successfully..");
            //insert
//            String insert="insert into Student values(2,'Jega','muthumani',18);";
//            stmt.executeUpdate(insert);
//            String insert2="insert into Student values(4,'bala','muthu',21)";
//            stmt.executeUpdate(insert2);
//            System.out.println("Inserted sucessfully");

//            ResultSet rs=stmt.executeQuery("select * from Student");
//            while(rs.next())
////                System.out.println(rs.getString("id")+"  "+rs.getString("firstName")+"  "+rs.getString("lastName")+" "+rs.getString("age"));
//                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));


            //delete
//            String del="delete from student where id=3";
//            stmt.executeUpdate(del);
//            System.out.println("Delete successfully");
//
//            ResultSet rs=stmt.executeQuery("select * from Student");
//            while(rs.next())
////                System.out.println(rs.getString("id")+"  "+rs.getString("firstName")+"  "+rs.getString("lastName")+" "+rs.getString("age"));
//                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));


            //read
//            String read="Select * from Student";
//            stmt.executeUpdate(read);
            ResultSet rs=stmt.executeQuery("select * from Student");
            while(rs.next())
//                System.out.println(rs.getString("id")+"  "+rs.getString("firstName")+"  "+rs.getString("lastName")+" "+rs.getString("age"));
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));


         con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("open");
    }
}
