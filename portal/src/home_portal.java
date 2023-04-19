import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class home_portal {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) throws SQLException, IOException, InterruptedException, ClassNotFoundException {
        List<register> list = new LinkedList<>();
        ResultSet registration = db_connect.connectExecuteQuery(" select * from  student_registration;");

        while(registration.next()) {
            list.add(new register(registration.getString(1), registration.getString(2), registration.getInt(3), registration.getInt(4), registration.getInt(5), registration.getInt(6), registration.getInt(7)));
        }

        System.out.println("**************** Welcome to Buggy *****************");
        System.out.println("|-----------------------------|");
        System.out.println("  1.Registration\n  2.View_portal");
        System.out.println("|-----------------------------|");
        System.out.println("Enter your choice:");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("|-----------------------|");
                System.out.println("Welcome to Registration");
                System.out.println("|-----------------------|");
                registration register = new registration();
                register.user_reg(list);
                }
                          }

    }






