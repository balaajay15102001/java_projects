import java.util.*;
public class d4t2p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter the Replace word: ");
        String str2 = input.next();
        System.out.print("Enter the Update word: ");
        String str3 = input.next();
        String replaceString=str1.replace(str2,str3);
        System.out.println(replaceString);
        }

}
