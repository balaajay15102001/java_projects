import java.util.Scanner;

public class d4t2p9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = input.next();
        char[] num=str1.toCharArray();
        int len=num.length;
        if(len>2){
            char temp;
            for(int i=0;i<len-1;i++){
               if(i==len-2){
                   temp = num[i];
                   num[i]=num[len-1];
                   num[len-1]=temp;

               }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}
