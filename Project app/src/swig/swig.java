//package swig;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class swig {
//    static Scanner in = new Scanner(System.in);
//    public static void main(String[] args) throws IOException {
//        List<String> list = new LinkedList<>();
//        List<String>Own_list = new LinkedList<>();
//        File user = new File("E:\\swiggy\\user page.txt");
//        File Owner = new File("E:\\swiggy\\owner page.txt");
//        File owner_add_item = new File("E:\\swiggy\\owner add items.txt");
//        user.createNewFile();
//        Owner.createNewFile();
//        owner_add_item.createNewFile();
//
//        System.out.println("1.User login"+"\n"+"2.Hotel Owner login");
//        System.out.println("Enter your choice:");
//        int choice = in.nextInt();
//        switch(choice){
//            case 1:
//                customer login=new customer();
//                //login.New_user(list);
//               // login.login();
//                break;
//            case 2:
//                owner n1 = new owner();
//                //n1.owner_login(add_item);
//                //n.New_Owner(Own_list);
//
//        }
//
//    }
//}
//class user_constructor{
//    String Name,Email,user_id,Mobile,passw;
//    user_constructor(String Name,String Email,String user_id,String Mobile,String passw){
//        this.Name=Name;
//        this.Email=Email;
//        this.user_id=user_id;
//        this.Mobile=Mobile;
//        this.passw=passw;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setEmail(String email) {
//        Email = email;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setUser_id(String user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getUser_id() {
//        return user_id;
//    }
//
//    public void setMobile(String mobile) {
//        Mobile = mobile;
//    }
//
//    public String getMobile() {
//        return Mobile;
//    }
//
//    public void setPassw(String passw) {
//        this.passw = passw;
//    }
//
//    public String getPassw() {
//        return passw;
//    }
//}
//class owner{
//
//}
//class customer{
//    Scanner in= new Scanner(System.in);
//    void user_login() throws FileNotFoundException {
//        System.out.print("Please Enter your mobile number:");
//        String Mobile = in.next();
//        System.out.println("Please enter your password: ");
//        String pasw = in.next();
//        user_check(Mobile, pasw);
//    }
//    void New_user(List<String> list) throws IOException {
//
//        user_constructor login = new user_constructor();
//        String choice;
//        boolean f = true, ph = true;
////        FileWriter fw= new FileWriter("E:\\swiggy\\user page.txt");
//        System.out.println("******** 🙏 Welcome user 🙏 ********");
//        System.out.print("Please Enter your name:");
//        //in.nextLine();
//        String name = in.nextLine().toUpperCase();
//        login.setName(name);
//        do {
//            System.out.println("Please Enter your email id:");
//            String email = in.next();
//            Pattern p2 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
//            Matcher m2 = p2.matcher(email);
//            boolean b2 = m2.matches();
//            if (b2) {
//                login.setEmail(email);
//                f = false;
//            } else {
//                System.out.println("Your email is not valid ");
//            }
//        } while (f);
//        // System.out.println(login.getEmail());
//        String user_id;
//        System.out.println("Enter User-Id:");
//        user_id = in.next().toUpperCase();
//        login.setUser_id(user_id);
//        do {
//            System.out.println("Please Enter your Mobile number:");
//            String Phone = in.next();
//            Pattern p = Pattern.compile("[0-9]{10}");
//            Matcher m = p.matcher(Phone);
//            boolean b = m.matches();
//            //login.setMobile(String.valueOf(b));
//            if (b) {
//                login.setMobile(Phone);
//                ph = false;
//            } else {
//                System.out.println("Your Mobile no is not valid ");
//
//            }
//        } while (ph);
//
//
//        do {
//            System.out.println("Password must contain with A-Z and numbers and minimum 5 more characters:");
//            System.out.println("Please enter your password: ");
//            String pasw = in.next();
//            Pattern pat = Pattern.compile("[0-9A-Za-z]{5,}");
//            Matcher m1 = pat.matcher(pasw);
//            boolean bol = m1.matches();
//            if (bol) {
//                login.setPassw(pasw);
//                f = false;
//            } else {
//                System.out.println("Your Password is not valid ");
//                System.out.println("Please enter the correct and numbers:");
//
//            }
//        } while (f);
//        boolean repas = true;
//        do {
//            System.out.println("Please re-enter your above password:");
//            String new_passw = in.next();
//            if (login.getPassw().equals(new_passw)) {
//                repas = false;
//                break;
//            } else {
//                System.out.println("Your both password are not same");
//            }
//        } while (repas);
//
//        // call by object
//        //user_check(getName(), login.getEmail(), login.getUser_id(), login.getMobile(), login.getPassw());
//    }
//    void user_check(String Mobile, String passw) throws FileNotFoundException {
//        //user_login ul= new user_login();
//        boolean f1 = true;
//        File user = new File("E:\\swiggy\\user page.txt");
//        Scanner check = new Scanner(user);
//        while (check.hasNextLine()) {
//            String st_check = check.nextLine();
//            String[] check_arr = st_check.split("#");
//            //System.out.println(check_arr.length);
//            if (Mobile.equals(check_arr[3]) && passw.equals(check_arr[4])) {
//                f1 = false;
//                System.out.println("Welcome user");
//            }
//        }
//        check.close();
//        if (f1) {
//            System.out.println("Your Mobile number and password or not match");
//
//            System.out.println("If you want to login again(Y/N)");
//            String login = in.next().toUpperCase();
//            if (login.equals("Y")) {
//                //ul.login();
//            }
//            else {
//                System.exit(0);
//            }
//        }
//    }
//    void user_check(String name, String email, String user_id, String Mobile, String passw) throws IOException {
//        // System.out.println(name+""+email);
//        boolean f = true;
//        File user = new File("E:\\swiggy\\user page.txt");
//        Scanner check = new Scanner(user);
//        while (check.hasNextLine()) {
//            String st_check = check.nextLine();
//            String[] check_arr = st_check.split("#");
//            if(check_arr.length==0){
//                f=true;
//            }
//            else if (check_arr[1].equals(user_id) || check_arr[3].equals(Mobile)) {
//                f = false;
//                System.out.println("Sorry this user name ane the mail id is already registered..");
//                break;
//            }
//        }
//        FileWriter fw = new FileWriter("E:\\swiggy\\user page.txt", true);
//        if (true) {
//            fw.write(name + "#" + user_id + "#" + email + "#" + Mobile + "#" + passw);
//            fw.write("\n");
//            System.out.println("Successfully Registered..👍👍");
//            fw.flush();
//            fw.close();
//        }
//    }
//
//}