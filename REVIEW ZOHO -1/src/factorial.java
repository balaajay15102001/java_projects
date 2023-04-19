import java.sql.SQLOutput;
import java.util.Scanner;

public class factorial {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the factorial number you want:");
        int fact = input.nextInt();
        System.out.println("FACTORIAL OF "+fact+"! THE NUMBER:"+factorial(fact));
    }
    static int factorial(int fact){
        if(fact<1)
            return 1;
        else
            return fact*factorial(fact-1);
    }
}
