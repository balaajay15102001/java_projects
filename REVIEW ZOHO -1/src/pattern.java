import java.util.Scanner;

public class pattern {
    static Scanner input=new Scanner(System.in);
        public static void main(String[] args)
        {   int i,j;
            System.out.print("Enter number of row : ");
            int No=input.nextInt();
            System.out.print("Enter the Symbol you want to print in the diamond: ");
            char Symbol = input.next().charAt(0);
            for(i=1;i<=No;i++)
            {
                for( j=1;j<=No-i;j++)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=i*2-1;j++)
                {
                    System.out.print(Symbol);
                }
                System.out.println();
            }
            for(i=No-1;i>0;i--)
            {
                for(j=1;j<=No-i;j++)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=i*2-1;j++)
                {
                    System.out.print(Symbol);
                }
                System.out.println();
            }

        }
    }

