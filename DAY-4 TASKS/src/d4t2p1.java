import java.util.Scanner;

public class d4t2p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the given String: ");
        String str = input.next();
        System.out.print("Enter the index with the given string:");
        int n= input.nextInt();
        System.out.println("The given index number is: "+str.charAt(n));
    }
}
