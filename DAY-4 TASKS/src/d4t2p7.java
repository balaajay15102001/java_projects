import java.util.Scanner;
 public class d4t2p7 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the String 1: ");
                String str1 = input.next();
                System.out.print("Enter the String 2: ");
                String str2=input.next();
                String str3=str1+str1;
                if(str3.contains(str2)){
                    System.out.println("String 3 contains String 2");
                }
                else {
                    System.out.println("String 3 not contain String 2");
                }
            }
}
