import java.util.Scanner;

public class d4t2p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = input.next();
        System.out.print("Enter the String 2: ");
        String str2 = input.next();
        int n=str1.length();
        int q=str2.length();
        int diff=n-q;
        if(n==q){
            System.out.println(str1+str2);
        }
        else if (n>q) {
            String a = str1.substring(diff,n)+str2;
            System.out.println(a);
        }
        else {
            String b = str2.substring(diff,q)+str1;
            System.out.println(b);
        }
    }
}
