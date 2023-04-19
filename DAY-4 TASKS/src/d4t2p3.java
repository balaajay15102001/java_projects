import java.util.Scanner;

public class d4t2p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = input.next();
        System.out.print("Enter the String 2: ");
        String str2 = input.next();
        int n=str1.length();
        int m=str2.length();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(n==m){
            for(int i=0;i<n;i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    System.out.println("The given word is Lexicographically");
                }
                else {
                    System.out.println("The given is not a Lexicographically string");
                }
                break;
            }
        }
    }
}
