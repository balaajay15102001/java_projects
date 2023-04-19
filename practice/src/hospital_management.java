import java.util.*;
public class hospital_management{
    public static void main(String[] args) {
        System.out.println("*******WELCOME TO HOSPITAL MANAGEMENT SYSTEM*******");
        hospital entry = new hospital();
        entry.hospital();
    }
}
class hospital{
    static int choice;
    static Scanner input = new Scanner(System.in);
    public static void hospital(){
        {
            System.out.println("1.Doctor");
            System.out.println("2.Patient");
            System.out.print("Enter your Choice: ");
             Bill obj = new Bill();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    obj.doctor_details();
                    break;
                case 2:
                    obj.patient_details();
                    break;
                default:
                    System.out.println("Thank you");
                    break;
            }
        } while (choice < 3);
    }
}
class doctors {
    static Scanner input = new Scanner(System.in);

    static void doctor_details() {
        System.out.print("Are you a Doctor (Y/N):");
        char choice = input.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.print("you Login or Signup:");
            String Doc_choice = input.next();
            if (Doc_choice.equalsIgnoreCase("Login"))
                login();
//             else if (Doc_choice.equalsIgnoreCase("Sign in")) {
//                 signin();
//             }
        } else
            System.out.println("Thank you..");

    }


    private static void login() {
        System.out.println("Enter your User name:");
        String user_name = input.next();
        System.out.println("Enter your password:");
        String password = input.next();
        System.out.println("Thank you login..:)");
    }
}

    class patient extends doctors {
        static String name, address;
        static long mobile_no;
        static Scanner input = new Scanner(System.in);

        static void patient_details() {
            System.out.println("Enter your details:");
            System.out.print("NAME:");
            name = input.next();
            System.out.print("Enter your Address:");
            address = input.next();
            System.out.print("Enter your Mobile number:");
            mobile_no = input.nextLong();
            System.out.println("***********Thank you for giving your details..:)**********");
            System.out.print("if you have any problem(Y/N):");
            char choice = input.next().charAt(0);
            if (choice == 'Y' || choice == 'y')
                treatment();


        }

        public static void treatment() {
            String Name = name;
            String Address = address;
            long Mobile = mobile_no;
            char choice;
            System.out.print("Enter your problem:");
            String problem = input.next();
            if (problem.equalsIgnoreCase("Body pain") || problem.equalsIgnoreCase("Sleeping problem")) {
                System.out.println("Hi Welcome, " + Name);
                System.out.println("Your Details is: " + Name + " " + Address + " " + Mobile + " ");
                System.out.println("Your Room no:108");
                System.out.println("Your treatment Doctor:Dr.A.Priyadharshini.,M.B.B.S.");
            } else {
                System.out.println("Hi Welcome, " + Name);
                System.out.println("Your Details is: " + Name + " " + Address + " " + Mobile + " ");
                System.out.println("Your Room no:110");
                System.out.println("Your treatment Doctor:Dr.A.Santhosh.,M.B.B.S.");
            }
            //System.out.println("Thank you for your Treatment....Get Well Soon..:)");
            Bill obj1 = new Bill();
//            System.out.println("If your Treatment is completed.. if you have a bill(Y/N):");
   //         char choice = input.next().charAt(0);

            do {
                System.out.print("If your Treatment is completed.. if you have a bill(Y/N):");
                System.out.println("1.If you have a bill\n2.You need some time");
                 choice = input.next().charAt(0);
                //System.out.println(choice);
                switch (choice) {
                    case 1:
                        if (choice == 'Y' || choice == 'y')
                            obj1.bill(Name, Address, Mobile, problem);
                    case 2:
                            System.out.println("Ok then you can continue.. and get the bill");
                            break;
                    default:
                        System.out.println("Enter the correct choice..");

                }
            } while (choice != 'n' || choice != 'N');
        }
    }
class Bill extends patient{
    public static void bill(String Name,String Address,long Mobile,String problem){
        if (problem.equalsIgnoreCase("Body pain") || problem.equalsIgnoreCase("Sleeping problem")) {
            System.out.println("Hi Welcome, " + Name);
            System.out.println("Your Details is: " + Name + " " + Address + " " + Mobile + " ");
            System.out.println("Your treatment Doctor:Dr.A.Priyadharshini.,M.B.B.S.");
            System.out.println("Your Consulting fees is: Rs.1000/-");
        }
         else{
            System.out.println("Hi Welcome, " + Name);
            System.out.println("Your Details is: " + Name + " " + Address + " " + Mobile + " ");
            System.out.println("Your treatment Doctor:Dr.A.Santhosh.,M.B.B.S.");
            System.out.println("Your Consulting fees is: Rs.1000/-");
        }

    }
}


