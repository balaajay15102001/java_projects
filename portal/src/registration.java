import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registration {
    static Scanner in = new Scanner(System.in);

    void user_reg(List<register> add_student)throws IOException, InterruptedException, SQLException, ClassNotFoundException {
        register login = new register();
        boolean f = true;
        boolean ph = true;
        System.out.println("******** \ud83d\ude4f Welcome User \ud83d\ude4f ********");
        System.out.print("Please Enter your name:");
        String name = this.in.nextLine().toLowerCase();
        login.setName(name);

        String reg_no;
        do {
            System.out.println("Please Enter your Register No:");
            reg_no = this.in.next();
            Pattern p2 = Pattern.compile("[0-9]{1,5}");
            Matcher m2 = p2.matcher(reg_no);
            boolean b2 = m2.matches();
            if (b2) {
                login.setRegno(reg_no);
                f = false;
            } else {
                System.out.println("Your Register No is not valid ");
            }
        } while(f);

        boolean bol;
        int maths;
        Pattern pat;
        Matcher m1;
        do {
            System.out.println("Please Enter your Maths Mark:");
            maths = this.in.nextInt();
            pat = Pattern.compile("[0-9]{1,4}");
            m1 = pat.matcher(Integer.toString(maths));
            bol = m1.matches();
            if (bol) {
                login.setMaths(maths);
                ph = false;
            }
            else {
                System.out.println("Your Maths Mark is not valid ");
            }
        } while(ph);

        boolean bols;
        int physics;
        Pattern pats;
        Matcher m2;
        boolean ph4 = true;
        do {
            System.out.println("Please Enter your Physics Mark:");
            physics = this.in.nextInt();
            pats = Pattern.compile("[0-9]{1,4}");
            m2 = pats.matcher(Integer.toString(physics));
            bols = m2.matches();
            if (bols) {
                login.setPhysics(physics);
                ph4 = false;
            }
            else {
                System.out.println("Your Physics Mark is not valid ");
            }
        } while(ph4);

        boolean bollss;
        int chemistry;
        Pattern pattd;
        Matcher m5;
        boolean ph5 = true;
        do {
            System.out.println("Please Enter your chemistry Mark:");
            chemistry = this.in.nextInt();
            pattd = Pattern.compile("[0-9]{1,4}");
            m5 = pattd.matcher(Integer.toString(chemistry));
            bollss = m5.matches();
            if (bollss) {
                login.setChemistry(chemistry);
                ph5 = false;
            }
            else {
                System.out.println("Your Chemistry Mark is not valid ");
            }
        } while(ph5);

        boolean bolls;
        int Total;
        Pattern patts;
        Matcher m4;
        boolean ph2 = true;
        do {
            System.out.println("Please Enter your Total Mark:");
            Total = this.in.nextInt();
            patts = Pattern.compile("[0-9]{1,4}");
            m4 = patts.matcher(Integer.toString(Total));
            bolls = m4.matches();
            if (bolls) {
                login.setTotal(Total);
                ph2 = false;
            }
            else {
                System.out.println("Your Total Mark is not valid ");
            }
        } while(ph2);

        boolean bolleans;
        int cutoff;
        Pattern pattss;
        Matcher m6;
        boolean ph3 = true;
        do {
            System.out.println("Please Enter your Cutoff Mark:");
            double cut=this.in.nextDouble();
            cutoff = (int) Math.floor(cut);
            pattss = Pattern.compile("[0-9]{1,3}");
            m6 = pattss.matcher(Integer.toString(cutoff));
            bolleans = m6.matches();
            if (bolleans) {
                login.setCutoff((int) Math.floor(cutoff));
                ph3 = false;
            }
            else {
                System.out.println("Your Cutoff Mark is not valid ");
            }
        } while(ph3);
        this.user_int(login.getName(),login.getRegno(),login.getMaths(),login.getPhysics(),login.getChemistry(),login.getTotal(),login.getCutoff(),add_student);

    }
    void user_int(String name,String reg_no,int maths,int physics,int chemistry,int Total,int cutoff,List<register> list) throws SQLException, ClassNotFoundException {
        boolean f = true;
        Iterator var8 = list.iterator();
        while(var8.hasNext()) {
            register user1 = (register) var8.next();
            if (list.size() == 0) {
                f = true;
            }
            else if (reg_no.equals(user1.getRegno())) {
                f = false;
                System.out.println("Sorry this user name ane the mail id is already registered..");
                break;
            }
        }
        if(f) {
            db_connect.db_execute("insert into  student_registration values('" + name + "','" + reg_no + "'," + maths + "," + physics + "," + chemistry + "," + Total + "," + cutoff + ");");
            System.out.println("Successfully Registered....!!!");
        }
        }


}
