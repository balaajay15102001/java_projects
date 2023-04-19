//Atm using Encaptulation method
import java.util.*;
import static java.lang.Math.*;

public class ATM {
    static Scanner input = new Scanner(System.in);
    static withdraw obj2 = new withdraw();
    public static void main(String[] args) {
        //to view the customer details
        customer obj1 = new customer();
        obj1.cus_details();
    }
    public static void Atm_details(){
        int choice;
        // withdraw is an another object which is used to get the details of the customer
        withdraw obj2 = new withdraw();
        // Create an object for Balance check class for to check the balance..
        Balance_check aobj = new Balance_check();
        //deposit is another object taken in this class
        deposit obj3 = new deposit();
        //do While is used to ask more number of time we run the program.
        System.out.println("********WELCOME TO MARIYAMMAN INDIAN BANK********");
        System.out.println("1.Deposit \n2.Withdraw \n3.Balance Enquiry\n4.EXIT");
        System.out.print("Enter your choice: ");
        do{
             choice = input.nextInt();
            switch(choice){
                case 1:obj3.deposit();
                break;
                case 2:obj2.withdraw();
                break;
                case 3:aobj.Acc_balance();
                break;
                case 4:break;
                default:
                    System.out.println("Enter the valid choice!!!!");
            }

        }while(choice!=4);

    }
}
/*Account class had the customer details of the customer's Name ,Account no and email */
/*We us getter and setter method in the Account*/
//Encapsulation is better..
class Account{
   private long Account_no;
   private String Name,email;
   private float amount;
    Balance_check aobj = new Balance_check();
    public long getAccount_no(){
        return Account_no;
    }
    public void setAccount_no(long Account_no) {
        this.Account_no = Account_no;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = Name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getAmount() {
        double balance = aobj.Acc_balance();
        return  balance;
    }
}
/*In the class deposit we use the function in heritance concept,the deposit class is inherited by the class Account*/
class deposit extends Account{
    static Scanner input = new Scanner(System.in);
    public void deposit(){
        Balance_check bal = new Balance_check();
        Account obj = new Account();
        System.out.println("Hi Respected Customer");
        System.out.print("If you deposit your amount in BM bank(Y/N): ");
        char choice = input.next().charAt(0);
        if(choice == 'y' || choice =='Y'){
            System.out.print("Please enter the amount you deposit: ");
            long dep = input.nextInt();
            System.out.println("Your Transaction is processed...");
            System.out.print("If you check the Balance of your account(Y/N): ");
            char choice_1 = input.next().charAt(0);
            if(choice_1 == 'y' || choice_1 =='Y'){
                bal.balance_det(dep);
            }

        }

    }
}
// Balance_check class is used to check the balance of the Customer
class Balance_check {
    private static double balance(double dep) {
        double acc_bal = dep + 1000;
        return acc_bal;
    }

    public void balance_det(double dep) {
        double bal = balance(dep);
        System.out.println("Your account balance is : " + bal);
    }

    public double Acc_balance() {
        //System.out.println("Your account balance is:2000");
        //double n = 1500;
        float n=1000+(float)(Math.random()*100000);
        System.out.println("your account balance is: "+n);
        return n;
    }
}
    //withdraw class is to to withdraw the amount and check the balance to the customer
    class withdraw {
        static Scanner input = new Scanner(System.in);
        Balance_check aobj = new Balance_check();

        public void withdraw() {
            withdraw obj2 = new withdraw();
            System.out.println("Enter the amount you withdraw:");
            long withdraw_amt = input.nextLong();
            double amt =  aobj.Acc_balance()-(double) withdraw_amt ;
            //view the balance of the customer
            System.out.println("Your account balance is:" + amt);

        }
    }

//customer class is used for the customer details
class customer{
    static Scanner input = new Scanner(System.in);
    public static void cus_details(){
        Account obj = new Account();
        System.out.print("Enter the account no: ");
        obj.setAccount_no(input.nextLong());
        System.out.print("Enter your email: ");
        obj.setEmail(input.next());
        System.out.print("Enter your name: ");
        obj.setName(input.next());
        System.out.println("Please wait your transaction is processed..");
        ATM det = new ATM();
        det.Atm_details();
    }
        }


