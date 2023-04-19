import java.util.*;
public class fibonnaci {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count;
        System.out.println("Enter the number of series you want: ");
        count = input.nextInt();
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
