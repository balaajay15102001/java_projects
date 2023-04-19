import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class swiggy {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {

        File user = new File("E:\\swiggy\\user page.txt");
        File Owner = new File("E:\\swiggy\\owner page.txt");
        File owner_add_item = new File("E:\\swiggy\\owner add items.txt");
        File delivary_list = new File("E:\\swiggy\\delivary list.txt");
        user.createNewFile();
        Owner.createNewFile();
        owner_add_item.createNewFile();
        delivary_list.createNewFile();

        List<login_user> list = new LinkedList<>();
        List<owner_login>Own_list = new LinkedList<>();
        List<item_list>add_item_list = new LinkedList<>();
        Map<String,String> owner_mp =new HashMap<>();
       // List<owner_login> add_item=new LinkedList<>();

       // File user = new File("E:\\swiggy\\user page.txt");
        Scanner read = new Scanner(user);
        while (read.hasNextLine())
        {
            String s = read.nextLine();
            String[] x = s.split("#");
            if(x.length>0) {
                list.add(new login_user(x[0],x[1],x[2],x[3],x[4]));
            }
        }
        read.close();

        //File Owner = new File("E:\\swiggy\\owner page.txt");
        Scanner own = new Scanner(Owner);
        while(own.hasNextLine()){
            String s= own.nextLine();
            String[] x = s.split("#");
            if(x.length>0) {
                Own_list.add(new owner_login(x[0],x[1],x[2],x[3],x[4],x[5],x[6],x[7]));
            }
        }
        own.close();
      //  System.out.println(Own_list);
        Scanner add = new Scanner(owner_add_item);
        while (add.hasNextLine()) {
            String s = add.nextLine();
            String[] x = s.split("#");
            if(x.length>0) {
                //hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quant + "#" + price
                add_item_list.add(new item_list(x[0], x[1], x[2], x[3], x[4], Integer.parseInt(x[5]), Integer.parseInt(x[6])));
            }
        }
        add.close();
        //DETAILS
        System.out.println("**************** Welcome to Buggy *****************");
        System.out.println("|-----------------------------|");
        System.out.println("  1.User login"+"\n"+"  2.Hotel Owner login\n  3.Admin login");
        System.out.println("|-----------------------------|");
        System.out.println("Enter your choice:");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("|-----------------------|");
                System.out.println("  1.New user \n  2.user login");
                System.out.println("|-----------------------|");
                System.out.println("Enter your choice:");
                int choice1 = in.nextInt();
                switch (choice1) {
                    case 1:
                    user_login login = new user_login();
                    login.New_user(list);
                        break;
                    case 2:
                        user_login log = new user_login();
                         log.login(add_item_list,list);
                         break;
                }
                break;
            case 2:
                System.out.println("|-----------------------|");
                System.out.println("  1.New owner \n  2.Owner login");
                System.out.println("|-----------------------|");
                System.out.println("Enter your choice:");
                int choice2 = in.nextInt();
                switch (choice2) {
                    case 1:
                        owners m = new owners();
                        m.New_Owner(Own_list,add_item_list);
                        break;
                    case 2:
                        owners m1 = new owners();
                        m1.owner_login(add_item_list);
                        break;
                }

            case 3:
                System.out.println("******** Welcome admin *******");
                System.out.println("Enter your password..");
                String pass= in.next().toUpperCase();
                if(pass.equals("ADMIN")) {
                    System.out.println("To add a delivary boy in the application");
                    delivary d1 = new delivary();
                    d1.delivery_add();
                }
                break;
        }

        FileWriter fw1 = new FileWriter("E:\\swiggy\\user page.txt");
        for(login_user i:list){
            fw1.write(i.toString()+"\n");
        }
        fw1.close();
        FileWriter fw2 = new FileWriter("E:\\swiggy\\owner page.txt");
        for(owner_login i:Own_list){
            fw2.write(i.toString()+"\n");
        }
        fw2.close();
        FileWriter fw3 = new FileWriter("E:\\swiggy\\owner add items.txt");
        for(item_list i:add_item_list){
            fw3.write(i.toString()+"\n");
        }
        fw3.close();
    }

}
class login_user{

    Scanner in = new Scanner(System.in);
    //name + "#" + user_id + "#" + email + "#" + Mobile + "#" + passw
    private String name,email,pasw,user_id,mobile;
//encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }

    public String getPasw() {
        return pasw;
    }

    public void setPasw(String pasw) {
        this.pasw = pasw;
    }
    login_user(){

    }
    login_user(String name ,String user_id , String email , String mobile ,String pasw){
        this.name=name;
        this.user_id=user_id;
        this.email=email;
        this.mobile=mobile;
        this.pasw=pasw;
    }

    public String toString(){return name+"#"+user_id+"#"+email+"#"+mobile+"#"+pasw;}
}
class owner_login{
    //hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quan + "#" + price
    private String name,email,pasw,mobile,hotel_type,Hotel_id,address,location;

    public owner_login(String Hotel_id, String name, String email,String hotel_type ,String address ,String location, String mobile, String pasw) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.address=address;
        this.hotel_type =hotel_type;
        this.Hotel_id=Hotel_id;
        this.location=location;
        this.pasw=pasw;
    }
    owner_login(){

    }

    public String toString(){
        //hotel_id,name,email,hotel_type,address,location,mobile ,pasw
        return Hotel_id + "#" +name + "#" + email +"#"+hotel_type+"#"+address+"#"+location+ "#" + mobile + "#" + pasw;
    }

    public void setHotel_id(String hotel_id) {Hotel_id = hotel_id;}
    public String getHotel_id() {return Hotel_id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setEmail(String email) {this.email = email;}
    public String getEmail() {
        return email;
    }

    public void setHotel_type(String hotel_type) {
        this.hotel_type = hotel_type;
    }
    public String getHotel_type() {
        return hotel_type;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setPasw(String pasw) {
        this.pasw = pasw;
    }
    public String getPasw() {
        return pasw;
    }

}
class item_list{
    //hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quan + "#" + price
    private String hot_id,name,hot_loc,code,item;
    private int quant,price;
    item_list(String hot_id,String name,String hot_loc,String code,String item,int quant,int price){
        this.hot_id=hot_id;
        this.name=name;
        this.hot_loc=hot_loc;
        this.code=code;
        this.item=item;
        this.quant=quant;
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHot_id() {
        return hot_id;
    }

    public void setHot_id(String hot_id) {
        this.hot_id = hot_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHot_loc() {
        return hot_loc;
    }

    public void setHot_loc(String hot_loc) {
        this.hot_loc = hot_loc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getPrice() {
        return price;
    }


    public String toString(){
        return hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quant + "#" + price;
    }
}
abstract class pass{
   abstract void password(List<login_user> list) throws IOException;
}
class forgot_pass extends pass{
    static Scanner in = new Scanner(System.in);
    @Override
    void password(List<login_user> list) throws IOException {
        login_user login = new login_user();
        String choice;
        boolean f = true, ph = true;
        System.out.print("Please Enter your name:");
        //in.nextLine();
        String us_name = in.nextLine().toUpperCase();
        //set name
        login.setName(us_name);
        for(login_user user:list){
                if(us_name.equals(user.getName())){
                    list.remove(user);
                    break;
                }
        }
        //System.out.println(list);
        //email
        do {
            System.out.println("Please Enter your email id:");
            String email = in.next();
            Pattern p2 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
            Matcher m2 = p2.matcher(email);
            boolean b2 = m2.matches();
            if (b2) {
                login.setEmail(email);
                f = false;
            } else {
                System.out.println("Your email is not valid ");
            }
        } while (f);
        // System.out.println(login.getEmail());
        String user_id;
        System.out.println("Enter User-Id:");
        user_id = in.next().toUpperCase();
        login.setUser_id(user_id);
        do {
            System.out.println("Please Enter your Mobile number:");
            String Phone = in.next();
            Pattern p = Pattern.compile("[0-9]{10}");
            Matcher m = p.matcher(Phone);
            boolean b = m.matches();
            //login.setMobile(String.valueOf(b));
            if (b) {
                login.setMobile(Phone);
                ph = false;
            } else {
                System.out.println("Your Mobile no is not valid ");

            }
        } while (ph);


        do {
            System.out.println("Password must contain with A-Z and numbers and minimum 5 more characters:");
            System.out.println("Please enter your password: ");
            String pasw = in.next();
            Pattern pat = Pattern.compile("[0-9A-Za-z]{5,}");
            Matcher m1 = pat.matcher(pasw);
            boolean bol = m1.matches();
            if (bol) {
                login.setPasw(pasw);
                f = false;
            } else {
                System.out.println("Your Password is not valid ");
                System.out.println("Please enter the correct and numbers:");

            }
        } while (f);
        boolean repas = true;
        do {
            System.out.println("Please re-enter your above password to confirm:");
            String new_passw = in.next();
            if (login.getPasw().equals(new_passw)) {
                repas = false;
                break;
            }
            else {
                System.out.println("Your both password are not same");
            }
        } while (repas);

        // call by object
        user_login n = new user_login();
        n.user_check(login.getName(), login.getEmail(), login.getUser_id(), login.getMobile(), login.getPasw(),list);
        //list.add(new login_user(name, user_id, email,Mobile,passw));
    }
}


class user_login{
    Scanner in = new Scanner(System.in);

    void login(List<item_list> array_item_list,List<login_user> list) throws IOException, InterruptedException {
        System.out.println("******** 🙏 Welcome User 🙏 ********");
        System.out.print("Please Enter your mobile number:");
        String Mobile = in.next();
        System.out.println("Please enter your password: ");
        String pasw = in.next();
        user_check(Mobile, pasw,array_item_list,list);
    }

    void New_user(List<login_user> list) throws IOException {

        login_user login = new login_user();
        String choice;
        boolean f = true, ph = true;
        System.out.println("******** 🙏 Welcome User 🙏 ********");
        System.out.print("Please Enter your name:");
        //in.nextLine();
        String name = in.nextLine().toUpperCase();
        //set name
        login.setName(name);
        //email
        do {
            System.out.println("Please Enter your email id:");
            String email = in.next();
            Pattern p2 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
            Matcher m2 = p2.matcher(email);
            boolean b2 = m2.matches();
            if (b2) {
                login.setEmail(email);
                f = false;
            } else {
                System.out.println("Your email is not valid ");
            }
        } while (f);
        // System.out.println(login.getEmail());
        String user_id;
        System.out.println("Enter User-Id:");
        user_id = in.next().toUpperCase();
        login.setUser_id(user_id);
        do {
            System.out.println("Please Enter your Mobile number:");
            String Phone = in.next();
            Pattern p = Pattern.compile("[0-9]{10}");
            Matcher m = p.matcher(Phone);
            boolean b = m.matches();
            //login.setMobile(String.valueOf(b));
            if (b) {
                login.setMobile(Phone);
                ph = false;
            } else {
                System.out.println("Your Mobile no is not valid ");

            }
        } while (ph);


        do {
            System.out.println("Password must contain with A-Z and numbers and minimum 5 more characters:");
            System.out.println("Please enter your password: ");
            String pasw = in.next();
            Pattern pat = Pattern.compile("[0-9A-Za-z]{5,}");
            Matcher m1 = pat.matcher(pasw);
            boolean bol = m1.matches();
            if (bol) {
                login.setPasw(pasw);
                f = false;
            } else {
                System.out.println("Your Password is not valid ");
                System.out.println("Please enter the correct and numbers:");

            }
        } while (f);
        boolean repas = true;
        do {
            System.out.println("Please re-enter your above password to confirm:");
            String new_passw = in.next();
            if (login.getPasw().equals(new_passw)) {
                repas = false;
                break;
            }
            else {
                System.out.println("Your both password are not same");
            }
        } while (repas);

        // call by object
         user_check(login.getName(), login.getEmail(), login.getUser_id(), login.getMobile(), login.getPasw(),list);
    }
    //Overloading the user_check method by 3 parameter
    // for already registeration process
    void user_check(String Mobile, String passw,List<item_list> array_item_list,List<login_user> list) throws IOException, InterruptedException {

        user_login ul= new user_login();
        boolean f1 = true;
        File user = new File("E:\\swiggy\\user page.txt");
        Scanner check = new Scanner(user);
        while (check.hasNextLine()) {
            String st_check = check.nextLine();
            String[] check_arr = st_check.split("#");
            if (Mobile.equals(check_arr[3]) && passw.equals(check_arr[4])) {
                String user_name=check_arr[0];
                f1 = false;
                //System.out.println("Welcome user");
                user(array_item_list,user_name);
            }
        }
        check.close();
        if (f1) {
            System.out.println("Your Mobile number and password or not match");

            System.out.println("If you want to login again(Y)\nIf you forgot the password(N)");
            String login = in.next().toUpperCase();
            if (login.equals("Y")) {
                ul.login(array_item_list,list);
            }
            else {
                pass fp = new forgot_pass();
                fp.password(list);
                System.exit(0);
            }
        }
    }

    // for new user
    void user_check(String name, String email, String user_id, String Mobile, String passw,List<login_user> list) throws IOException {
        boolean f = true;
        File user = new File("E:\\swiggy\\user page.txt");
        Scanner check = new Scanner(user);
        while (check.hasNextLine()) {
            String st_check = check.nextLine();
            String[] check_arr = st_check.split("#");
            //System.out.println(check_arr[3]);
            if(check_arr.length==0){
                f=true;
            }
            else if (user_id.equals(check_arr[1]) || Mobile.equals(check_arr[3])) {
                f = false;
                System.out.println("Sorry this user name ane the mail id is already registered..");
                break;
            }
        }
        if (f) {
            list.add(new login_user(name, user_id, email,Mobile,passw));
            System.out.println("Successfully Registered..👍👍");
        }
    }

    void user(List<item_list> array_item_list,String user_name) throws IOException, InterruptedException {
        List<String> cart = new LinkedList<>();
        System.out.println("|------------------------------------|");
        System.out.println("  1.view order \n  2.view all your purchasing bill");
        System.out.println("|------------------------------------|");
        System.out.println("Enter your choice:");
        int choice= in.nextInt();
        switch (choice){
            case 1:
                order ord = new order();
                int i=1;
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                System.out.println(String.format("%18s %18s %20s %18s %19s %20s","Hotel_id" ,"Hotel Name","Hotel location","Code","Item", "Quantity" , "Price"));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                for(item_list show_item_list:array_item_list){
                    if(i<5) {
                        System.out.println(String.format("%18s %18s %18s %18s %18s %18s", show_item_list.getHot_id()
                                , show_item_list.getName(), show_item_list.getHot_loc(), show_item_list.getItem(), show_item_list.getQuant(), show_item_list.getPrice()));
                        System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                    }
                    else {
                        break;
                    }
                    i++;
                }
                ord.search_and_order(array_item_list,cart,user_name);
                break;

            case 2:
                bill user_bill = new bill();
                user_bill.users_cart_list(user_name);
        }
    }
}

//login hotels list
class owners {
    Scanner in = new Scanner(System.in);
    static owner_login login = new owner_login();

    void owner_login(List<item_list>add_item_list ) throws IOException {
        System.out.print("Please Enter your mobile number:");
        String Mobile = in.next();
        System.out.println("Please enter your password: ");
        String pasw = in.next();
        owner_check(Mobile, pasw,add_item_list);
    }

    void New_Owner(List<owner_login> own_list,List<item_list>add_item_list) throws IOException {
        String choice;
        boolean f = true, ph = true;
        System.out.println("******** 🙏 Welcome Owner 🙏 ********");
        //Hotel_id
        System.out.println("Enter Hotel-Id:");
        String Hotel_id = in.next().toUpperCase();
        login.setHotel_id(Hotel_id);
        //hotel name
        System.out.print("Please Enter your Hotel name:");
        in.nextLine();
        String name = in.nextLine().toUpperCase();
        login.setName(name);
        //email id
        do {
            System.out.println("Please Enter your hotel email id for registration process:");
            String email = in.next();
            Pattern p2 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
            Matcher m2 = p2.matcher(email);
            boolean b2 = m2.matches();
            if (b2) {
                login.setEmail(email);
                f = false;
            } else {
                System.out.println("Your email is not valid ");
            }
        } while (f);

        //hotel type
        System.out.println("Enter your hotel type(pure Veg/Non-Veg/Both Veg and non veg):");
        in.nextLine();
        String hotel_type = in.nextLine().toUpperCase();
        login.setHotel_type(hotel_type);
        //Address
        System.out.println("Enter your address with pincode:");
        //in.nextLine();
        String Hot_address = in.nextLine();
        //System.out.println();
        login.setAddress(Hot_address);
        //location
        System.out.println("Enter your location for finding for land mark:");
        String Hot_loc = in.nextLine().toUpperCase();
        login.setLocation(Hot_loc);
        //Mobile number
        do {
            System.out.println("Please Enter your Mobile number:");
            String Phone = in.next();
            Pattern p = Pattern.compile("[0-9]{10}");
            Matcher m = p.matcher(Phone);
            boolean b = m.matches();
            if (b) {
                login.setMobile(Phone);
                ph = false;
            } else {
                System.out.println("Your Mobile no is not valid ");

            }
        } while (ph);
        //password
        do {
            System.out.println("Password must contain with A-Z and numbers and minimum 5 more characters:");
            System.out.println("Please enter your password: ");
            String pasw = in.next();
            Pattern pat = Pattern.compile("[0-9A-Za-z]{5,}");
            Matcher m1 = pat.matcher(pasw);
            boolean bol = m1.matches();
            if (bol) {
                login.setPasw(pasw);
                f = false;
            } else {
                System.out.println("Your Password is not valid ");
                System.out.println("Please enter the correct and numbers:");

            }
        } while (f);
        //re-enter password
        boolean repas = true;
        do {
            System.out.println("Please re-enter your above password to confirm:");
            String new_passw = in.next();
            if (new_passw.equals(login.getPasw())) {
                    owner_check(login.getHotel_id(), login.getName(), login.getEmail(),login.getHotel_type(), login.getAddress(),
                           login.getLocation(), login.getMobile(), login.getPasw(),own_list,add_item_list);
                repas = false;
                break;
            } else {
                System.out.println("Your both password are not same");
            }
        } while (repas);
        //calling function
    }


    void owner_check(String Mobile, String passw, List<item_list> add_item_list) throws IOException {
        boolean f1 = true;
        File user = new File("E:\\swiggy\\owner page.txt");
        Scanner check = new Scanner(user);
        while (check.hasNextLine()) {
            String st_check = check.nextLine();
            String[] check_arr = st_check.split("#");
            if (Mobile.equals(check_arr[6]) && passw.equals(check_arr[7])) {
                f1 = false;
                //hot_id,name,hot_loc
                String hot_id=check_arr[0];
                String name=check_arr[1];
                String hot_loc=check_arr[5];
               // System.out.println(hot_id+name+hot_loc);
                System.out.println("Welcome owner");
                owner_items own_add = new owner_items();
               own_add.choose_items(add_item_list,hot_id,name,hot_loc);
            }
        }
        check.close();
        if (f1) {
            System.out.println("Your Mobile number and password or not match");
            System.out.println("If you want to login again(Y/N)");
            String login = in.next().toUpperCase();
            if (login.equals("Y")) {
                owners n=new owners();
                n.owner_login(add_item_list);
            }
            else {
                System.exit(0);
            }
        }
    }
    void owner_check(String hotel_id, String name, String email,String hotel_type, String address, String location,
                     String mobile, String pasw, List<owner_login> own_list,List<item_list>add_item_list) throws IOException {
        // System.out.println(name+""+email);
        boolean f = true;
        File owner = new File("E:\\swiggy\\owner page.txt");
        owner_login login = new owner_login();
        Scanner check = new Scanner(owner);
        while (check.hasNextLine()) {
            String st_check = check.nextLine();
            String[] check_arr = st_check.split("#");
            System.out.println(Arrays.toString(check_arr));
            if(check_arr.length == 0){
                f=true;
            }
            else if (email.equals(check_arr[2]) || mobile.equals(check_arr[5])) {
                f = false;
                System.out.println("Sorry this user name ane the mail id is already registered..");
                break;
            }
        }
            own_list.add(new owner_login(hotel_id,name,email,hotel_type,address,location,mobile ,pasw));
            System.out.println("Successfully Registered..👍👍");

        }
    }

//after login process

class owner_items{
    static Scanner in = new Scanner(System.in);
    //String hot_id,name,email,hot_loc,item,mobile,code,quantity,price;
    void choose_items(List<item_list>add_item_list,String hot_id,String name,String hot_loc) throws IOException {
            System.out.println("|-----------------------|");
            System.out.println("  1.Add items \n  2.Update item \n  3.Remove item");
            System.out.println("|-----------------------|");
            System.out.println("Enter your choice:");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    add_items(add_item_list,hot_id,name,hot_loc);
                    break;
                case 2:
                    update_item(add_item_list,name);
                    break;
                case 3:remove_item(add_item_list);
                        break;

                default:
            }
    }
    void add_items(List<item_list>add_item_list,String hot_id,String name,String hot_loc) throws IOException {
        String choice;
        do {
            System.out.println("Enter the item:");
            in.nextLine();
            String item = in.nextLine().toUpperCase();
           // System.out.println("Please add 's' end of the code if it is measured by pcs:");
            System.out.println("Enter the code of the item:");
            String code = in.next();
            System.out.println("Enter the Quantity of the item:");
            int quan = in.nextInt();
            System.out.println("Enter the price:");
            int price = in.nextInt();
            item_check(item,code,quan,price,add_item_list,hot_id,name,hot_loc);
            System.out.println("if you want to add more items(Y/N):");
            choice = in.next().toUpperCase();
        }
        while (choice.equals("Y"));
        System.out.println("Your items is added Successfully 👍👍");
    }

    void item_check(String item,String code,int quan,int price,List<item_list>add_item_list
            ,String hot_id,String name,String hot_loc) throws IOException {
        login_user own = new login_user();
        boolean x1 = true;
        File owner_add_item = new File("E:\\swiggy\\owner add items.txt");
        String choice;
        Scanner it1 = new Scanner(owner_add_item);
        while (it1.hasNextLine()) {
            String s1 = it1.nextLine();
            String[] x = s1.split("#");
            if (x.length == 0) {
                x1 = true;
                break;
            }
            else if (item.equals(x[4])) {
                System.out.println("this item is already there..");
                x1 = false;
                break;
            }
        }
        FileWriter fw = new FileWriter("E:\\swiggy\\owner add items.txt");
        if (x1) {
            add_item_list.add(new item_list(hot_id,name,hot_loc,code,item,quan,price));
            System.out.println("Successfully added");
        }
        fw.flush();
        fw.close();
    }

    //update item
    void update_item(List<item_list> add_item_list,String name) throws IOException {
        System.out.println("Enter the item name would you wish to change:");
        String item_name = in.next().toUpperCase();
        System.out.println("Please enter what would be change(Price/Quantity/Code/Location):");
        String change = in.next().toUpperCase();
        for (item_list j : add_item_list) {
            if (name.equals(j.getName())) {
                System.out.println(item_name);
                System.out.println(j.getItem());
                //System.out.println("=======");
                if (item_name.equals(j.getItem()))
                {
                    //System.out.println("******");
                    if (change.equals("PRICE")) {
                        System.out.println("Enter the price:");
                        int cor = in.nextInt();
                        j.setPrice(cor);
                        break;
                    } else if (change.equals("CODE")) {
                        System.out.print("Enter the updated code:");
                        int code = in.nextInt();
                        j.setCode(String.valueOf(code));
                        System.out.println("Successfully updated..👍👍");
                        break;
                    } else if (change.equals("QUANTITY")) {
                        System.out.print("Enter the updated quantity:");
                        int quant = in.nextInt();
                        j.setQuant(quant);
                        System.out.println("Successfully updated..👍👍");
                        break;
                    } else if (change.equals("LOCATION")) {
                        System.out.print("Enter the updated location:");
                        String loc = in.next();
                        j.setHot_loc(loc);
                        System.out.println("Successfully updated..👍👍");
                        break;
                    }
                }
            }
        }
        System.out.println(add_item_list);
    }

    void remove_item(List<item_list>array_item_list){
        System.out.println("Enter the food item you change:");
        String name = in.next();
        int j=0;
        for(item_list i:array_item_list){
            if(i.getName().equals(name)){
                array_item_list.remove(i);
                break;
            }
            j++;
        }
        System.out.println("Successfully removed");
    }
}
class order {
    Scanner in = new Scanner(System.in);

    void search_and_order(List<item_list> array_item_list, List<String> cart,String user_name) throws IOException, InterruptedException {
        System.out.println();
        System.out.println("*************** Welcome to swag ordering *****************");
        System.out.println();
        System.out.print("Search hotel or food item you want:");
        String hot = in.nextLine().toUpperCase();
        System.out.println();
        File f = new File("E:\\swiggy\\owner add items.txt");
        Scanner f_sear = new Scanner(f);
        while (f_sear.hasNextLine()) {
            String s = f_sear.nextLine();
            String[] str = s.split("#");
            if (hot.equals(str[1])) {
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                System.out.println(String.format("%18s %18s %20s %18s %19s %20s","Hotel_id" ,"Hotel Name","Hotel location","Code","Item", "Quantity" , "Price"));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                for (item_list i : array_item_list) {
                    String hotel_check = i.getName();
                    if (hot.equals(hotel_check)) {
                        //hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quant + "#" + price
                        System.out.println(String.format("%18s %18s %18s %18s %18s %18s", i.getHot_id()
                                , i.getName(), i.getHot_loc(), i.getItem(), i.getQuant(), i.getPrice()));
                        System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                        //System.out.println(s);
                    }
                }
                break;
            } else if (hot.equals(str[4])) {
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                System.out.println(String.format("%18s %18s %20s %18s %19s %20s","Hotel_id" ,"Hotel Name","Hotel location","Code","Item", "Quantity" , "Price"));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                for (item_list i : array_item_list) {
                    String check = i.getItem();
                    if (hot.equals(check)) {
                        System.out.println(String.format("%18s %18s %18s %18s %18s %18s", i.getHot_id()
                                , i.getName(), i.getHot_loc(), i.getItem(), i.getQuant(), i.getPrice()));
                        System.out.println("|--------------------|-------------------|--------------------|---------------------|---------------------|---------------------|");
                    }
                }
                break;
            }
        }
        System.out.println();
        System.out.println("would you like to add the current item to cart(Y/N):");
        String ch;
        order n = new order();
        ch = in.next().toUpperCase();
        int choice;
        if (ch.equals("Y")) {
            cart(array_item_list, cart,user_name);
        }
        else {
            System.out.println("|-------------------------------------------------|");
            System.out.println("  would you want more items in \n same hotel press-->(\"1\") " +
                    "\n  different hotel press -->(\"2\") \n  Exit press-->(\"3\")");
            System.out.println("|-------------------------------------------------|");
            System.out.println("Enter your choice:");
            choice = in.nextInt();
            if (choice == 1) {
                n.cart(array_item_list, cart,user_name);
            } else if (choice == 2) {
                n.search_and_order(array_item_list, cart,user_name);
            } else {
                System.out.println("Thanks for using the application");
                System.exit(0);
            }
        }
    }

    void cart(List<item_list> add_item_list, List<String> cart,String user_name) throws IOException, InterruptedException {
        String ch;
        float price = 0;
        System.out.println("Enter the hotel name:");
        in.nextLine();
        String hotel_name = in.nextLine().toUpperCase();
        System.out.println("Enter item name:");
        String item_name = in.nextLine().toUpperCase();
        System.out.println("Enter Quantity you want:");
        int quan = in.nextInt();
        for (item_list j : add_item_list) {
            if (hotel_name.equals(j.getName()) && item_name.equals(j.getItem())) {
                price = ((float) j.getPrice() / j.getQuant()) * quan;
            }
        }
        int choice;
        float total = 0;
        for (item_list i : add_item_list) {
            if (hotel_name.equals(i.getName()) && item_name.equals(i.getItem())) {
                cart.add(hotel_name + "#" + item_name + "#" + quan + "#" + price);
            }
        }

        System.out.println("|-------------------------------------------------|");
        System.out.println("  Would you want more items in" +
                "\n  different hotel press -->(\"1\") \n  view cart -->(\"2\")\n  Exit press-->(\"3\")");
        System.out.println("|-------------------------------------------------|");
        System.out.println("Enter your choice:");
        choice = in.nextInt();
        order n = new order();
        if (choice == 1) {
            n.search_and_order(add_item_list, cart,user_name);
        } else if (choice == 2) {
            System.out.println("If you view your cart(Y/N):");
            ch = in.next().toUpperCase();
            if (ch.equals("Y")) {
                System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                System.out.println(String.format("%17s %16.5s %17s %18.5s","Product Name","Code","Quantity","Price"));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                for (String i : cart) {
                    String[] j = i.split("#");
                    System.out.println(String.format("%18s %18s %18s %18s", j[0], j[1], j[2], j[3]));
                    System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                    total = total + Float.parseFloat(j[3]);
                }
                    System.out.println("   TOTAL                                                              " + total);
                System.out.println("|-----------------------------------------------------------------------------------|");
            }
            System.out.println();
            System.out.println("|----------------------------------------------------------------------|");
            System.out.println("  If you want to take the cart as bill press-->(\"1\")" +
                    " \n  If you want to change the cart items press --->(\"2\")" +
                    "\n  Add more item in the cart press --->(\"3\")\n  If you want to remove an item form the list press --->(\"4\")" +
                    "\n  Exit press -->(\"5\")");
            System.out.println("|----------------------------------------------------------------------|");
            int choice2;
            System.out.println("Enter your choice:");
            choice2 = in.nextInt();
            if (choice2 == 1) {
                bill view_bill = new bill();
                view_bill.user_bill_file(cart, total,user_name);
            } else if (choice2 == 2) {
                change_item_cart(cart, total,user_name);
            }
            else if (choice2 == 3) {
                System.out.println();
                order or =new order();
                or.search_and_order(add_item_list, cart, user_name);
            }
            else if (choice2 == 4) {
                remove(cart, total,user_name);
            }
        }
        else {
            System.out.println("Thanks for using the application");
        }

    }

    void change_item_cart(List<String> cart, float bill_total,String user_name) throws IOException, InterruptedException {
        System.out.print("Enter the Hotel name would you wish to change:");
        in.nextLine();
        String name = in.nextLine().toUpperCase();
        System.out.println();
        System.out.println("Enter the item name would you wish to change:");
        String it_name = in.nextLine().toUpperCase();
        System.out.println("if you want to change the quantity(Y/N)");
        String change = in.next().toUpperCase();
        if (change.equals("Y")) {
            for (String i : cart) {
                String[] j = i.split("#");
                if (name.equals(j[0])) {
                    if (it_name.equals(j[1])) {
                        System.out.print("Enter the updated quantity:");
                        int quant = in.nextInt();
                        float price = (Float.parseFloat(j[3]) / Float.parseFloat(j[2])) * quant;
                        String newItem = j[0] + "#" + j[1] + "#" + quant + "#" + price;
                        cart.remove(i);
                        cart.add(newItem);
                        System.out.println("Successfully updated..👍👍");
                        break;
                    }
                }
            }
            //System.out.println(cart);
            float updat_bill_total=0;
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            System.out.println(String.format("%17s %16.5s %17s %18.5s","Product Name","Code","Quantity","Price"));
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            for (String i : cart) {
                String[] j = i.split("#");
                System.out.println(String.format("%18s %18s %18s %18s", j[0], j[1], j[2], j[3]));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                updat_bill_total = updat_bill_total + Float.parseFloat(j[3]);
            }
            System.out.println("If you want to send a cart to bill(Y/N):");
            String s = in.next().toUpperCase();
            if (s.equals("Y")) {
                bill view_bill = new bill();
                view_bill.user_bill_file(cart, updat_bill_total,user_name);
            } else {
                System.exit(0);
            }
        }
    }

    void remove(List<String> cart, float bill_total,String user_name) throws IOException, InterruptedException {
        System.out.println("|--------------------|-------------------|--------------------|---------------------|");
        System.out.println(String.format("%17s %16.5s %17s %18.5s", "Hotel Name", "Item Name", "Quantity", "Price"));
        System.out.println("|--------------------|-------------------|--------------------|---------------------|");
        for (String i : cart) {
            String[] j = i.split("#");
            System.out.println(String.format("%18s %19s %20s %21s", j[0], j[1], j[2], j[3]));
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");

        }
            System.out.println("   TOTAL                                                          " + bill_total);
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
        System.out.print("Which item you want to remove from the list:");
        String name = in.next().toUpperCase();
        //int j = 0;
        for (String i : cart) {
            String[] m = i.split("#");
            if (name.equals(m[1])) {
                cart.remove(i);
                break;
            }
            //j++;
        }
        System.out.println("Successfully removed");
        String ch;
        //System.out.println(cart);
        float total = 0;
        System.out.println("If you view your cart(Y/N):");
        ch = in.next().toUpperCase();
        if (ch.equals("Y")) {
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            System.out.println(String.format("%18s %19s %20s %21s", "hotel_name", "item_name", "quantity", "price"));
            for (String i : cart) {
                String[] arr_cart = i.split("#");
                System.out.println(String.format("%18s %18s %18s %18s", arr_cart[0], arr_cart[1], arr_cart[2], arr_cart[3]));
                System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                total = total + Float.parseFloat(arr_cart[3]);
            }
                System.out.println("TOTAL                                                               " + total);
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            System.out.println("If you want to send a cart to bill(Y/N):");
            String s = in.next().toUpperCase();
            if (s.equals("Y")) {
                bill view_bill = new bill();
                view_bill.user_bill_file(cart, total,user_name);
            } else {
                System.exit(0);
            }

        }
    }
}

    class bill {
        static Scanner in = new Scanner(System.in);

        void user_bill_file(List<String> cart, float bill_total,String user_name) throws IOException, InterruptedException {
            File f = new File("E:\\swiggy\\user bill.txt");
            f.createNewFile();
            System.out.println("Enter the Today's date:");
            String bill_date = in.next();
            FileWriter user_cart_bill = new FileWriter("E:\\swiggy\\user bill.txt", true);
            user_cart_bill.write("  Name:" + user_name + "   " + "  Date:" + bill_date);
            user_cart_bill.write("\n");
            user_cart_bill.write("|--------------------|-------------------|--------------------|---------------------|");
            user_cart_bill.write("\n");
            user_cart_bill.write(String.format("%18s %19s %20s %21s", "hotel_name", "item_name", "quantity", "price"));
            user_cart_bill.write("\n");
            System.out.println("|-----------------------------------------------------------------------------------|");
            System.out.println(" Name:" + user_name + "   " + " Date:" + bill_date);
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            System.out.println(String.format("%18s %19s %20s %21s", "hotel_name", "item_name", "quantity", "price"));
            for (String bill_file : cart) {
                String[] cart_items = bill_file.split("#");
                user_cart_bill.write("|--------------------|-------------------|--------------------|---------------------|");
                user_cart_bill.write("\n");
                user_cart_bill.write(String.format("%18s %19s %20s %21s", cart_items[0], cart_items[1], cart_items[2], cart_items[3]));
                user_cart_bill.write("\n");
                System.out.println("|--------------------|-------------------|--------------------|---------------------|");
                System.out.println(String.format("%18s %19s %20s %21s", cart_items[0], cart_items[1], cart_items[2], cart_items[3]));
            }
            user_cart_bill.write("|--------------------|-------------------|--------------------|---------------------|");
            user_cart_bill.write("\n");
            user_cart_bill.write("        Total                                                       "+String.valueOf(bill_total));
            user_cart_bill.write("\n");
            user_cart_bill.write("|-----------------------------------------------------------------------------------|");
            user_cart_bill.write("\n");
            System.out.println("|--------------------|-------------------|--------------------|---------------------|");
            System.out.println("        Total                                                       "+bill_total);
            System.out.println("|-----------------------------------------------------------------------------------|");
            user_cart_bill.flush();
            user_cart_bill.close();
            System.out.println();
            System.out.println("------------------------ Your order is placed ------------------------");
            System.out.println("You confirm your order and make payment(Y/N):");
            String payment_choice = in.next().toUpperCase();
            if (payment_choice.equals("Y")){
                payment user_pay = new payment();
                user_pay.user_payment();
            }
            else {
                System.out.println("Thank you using this Application ");
                System.exit(0);
            }
        }

        void users_cart_list(String user_name){
            try{
                File user_cart_bill= new File("E:\\swiggy\\user bill.txt");
                Scanner user_bill_cart_list= new Scanner(user_cart_bill);
                int t=0;
                while(user_bill_cart_list.hasNextLine()){
                    String bill_line=user_bill_cart_list.nextLine();
                   // String[] bill_arr=bill_line.split("#");
                    boolean find=bill_line.contains(user_name);
                    while (find){
                        System.out.println(bill_line);
                        if(bill_line.contains("Total")){
                            String x[] =bill_line.split(" ");
                            find=false;
                            System.out.println("|-----------------------------------------------------------------------------------|");
                            break;
                        }
                        bill_line= user_bill_cart_list.nextLine();
                    }
                }
                user_bill_cart_list.close();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    class payment extends Thread{
    static Scanner in = new Scanner(System.in);
    void user_payment() throws FileNotFoundException, InterruptedException {
        System.out.println("1.UPI Transaction \n2.Card Transaction");
        System.out.println("Enter your payment choice:");
        int payment_choice=in.nextInt();
        switch (payment_choice){
            case 1:
                System.out.println("************ Welcome to UPI Transaction ************");
                UPI();
                break;
            case 2:
                System.out.println("************ Welcome to Card Transaction ************");
                Bank_no();
                break;
        }
    }
    static void UPI() throws FileNotFoundException, InterruptedException {
        ArrayList<String> upi= new ArrayList<>();
        System.out.println("Enter your UPI id:");
        String upi_id = in.next();
        System.out.println("Please enter your UPid password:");
        String upi_password =in.next();
        Pattern p2 = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m2 = p2.matcher(upi_id);
        Matcher m3 = p2.matcher(upi_password);
        boolean bool_upi_id = m2.matches();
        boolean bool_upi_pass=m3.matches();
            if (bool_upi_id && bool_upi_pass) {
                int time_for_wait=5,k=5;
                for(int waiting_time=time_for_wait;waiting_time>0;waiting_time--){
                   // System.out.println("++++");
                    System.out.println("Your payment is processed with in " +k+ " Min");
                    System.out.println("Please wait");
                    sleep(1000);
                    k--;
                }
            }
        System.out.println("Your amount is debited..");
        sleep(10000);
        System.out.println("Your Payment is Successfull");
        delivary assinged = new delivary();
        assinged.delivary_assigned();
    }
    void Bank_no() throws InterruptedException, FileNotFoundException {
        System.out.println("Enter your account number:");
        String acc_no = in.next();
        System.out.println("Enter your card number");
        String card_no = in.next();
        System.out.println("Enter your cvv");
        String cvv = in.next();
        int time_for_wait=5,k=5;
        System.out.println("|---------------------------------------------------------------------|");
        for(int waiting_time=time_for_wait;waiting_time>0;waiting_time--){
            System.out.println("Your payment is processed with in " +k+ " Min");
            System.out.println("Please wait");
            sleep(1000);
            k--;
        }
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("                     Your amount is debited..");
        sleep(10000);
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("                   Your Payment is Successfull");
        System.out.println("|---------------------------------------------------------------------|");
        delivary assinged = new delivary();
        assinged.delivary_assigned();
    }
    }
    class delivary extends Thread {
    static Scanner in = new Scanner(System.in);
    void delivery_add() throws IOException {
        System.out.println("Enter your name:");
        String delivary_name = in.nextLine().toUpperCase();
        System.out.println();
        System.out.println("Enter the location:");
        String delivary_location = in.nextLine().toUpperCase();
        FileWriter fw = new FileWriter("E:\\swiggy\\delivary list.txt",true);
        fw.write(delivary_name+"#"+delivary_location);
        fw.write("\n");
        fw.close();
        System.out.println("Successfully added");
    }
    void delivary_assigned() throws FileNotFoundException, InterruptedException {
        File delivar=new File("E:\\swiggy\\delivary list.txt");
        Scanner delivar_file = new Scanner(delivar);
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("Please enter your location:");
        String user_location= in.next().toUpperCase();
        try {
            while (delivar_file.hasNextLine()) {
                String file = delivar_file.nextLine();
                String[] deli_file_arr = file.split("#");
                if (user_location.equals(deli_file_arr[1])) {
                    System.out.println("Your delivary man is assigned");
                    sleep(1000);
                    System.out.println("Your delivary man name is: "+ deli_file_arr[0]);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        int time_for_wait=5,k=5;
        System.out.println("|---------------------------------------------------------------------|");
        for(int waiting_time=time_for_wait;waiting_time>0;waiting_time--){
            //System.out.println("++++");
            System.out.println("Your delivered is confirm with in " +k+ " Min");
            System.out.println("Please wait");
            sleep(1000);
            k--;
        }
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("                      Delivered with in 15 min.");
        System.out.println("|---------------------------------------------------------------------|");
        System.out.println("                   Thank you for using our application");
        System.out.println("|---------------------------------------------------------------------|");
    }
    }

