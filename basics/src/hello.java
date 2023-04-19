import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Jency");
        fruit obj=new fruit();
            obj.apple();
            obj.orange();
        Veg obj2=new Veg();
            obj2.tomato();
    }
}
class fruit{
    static Scanner scan =new Scanner(System.in);
    void apple(){
        System.out.println("Enter the fruit name: ");
        String str=scan.next();
        System.out.println("The given fruit name is: "+ str);

    }
    void orange(){
        System.out.println("Enter");
        String str=scan.next();
        System.out.println("The given fruit name is: "+ str);
    }
}
class Veg{
    void tomato(){
        System.out.println("Cabbage");
    }
}
