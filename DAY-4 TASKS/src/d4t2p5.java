import java.util.Scanner;

public class d4t2p5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the string");
        String str= input.next();
        char[] n=str.toCharArray();
        for(int i=0;i<n.length;i++){
            int flag=0;
            for(int j=0;j<n.length;j++) {
                if (n[i] == n[j] && i!=j) {
                    flag = 1;
                    break;
                }
            }

                if (flag == 0) {
                    System.out.println("The first repeated element is:"+n[i]);
                    break;
                }

        }
    }
}
