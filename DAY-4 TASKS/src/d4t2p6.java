import java.util.Scanner;

public class d4t2p6 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the String 1: ");
                String str1 = input.next();
                char[] num=str1.toCharArray();
                int len=num.length;
                int quot=len/2;
                if(len%2==0){
                    for(int i=0;i<quot;i++){
                        System.out.print(num[i]);
                    }
                    System.out.println();
                    for(int j=quot;j<len;j++){
                        System.out.print(num[j]);
                    }
                }
    }
}
