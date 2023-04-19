import java.util.Scanner;

public class CALCULATOR {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter the operation:");
        char operation = input.next().charAt(0);
        System.out.println("Enter the number 2:");
        int num2 = input.nextInt();
        opera(num1,num2,operation);
    }
        static void opera(int num1,int num2,char operation){
        if(operation == '+')
            System.out.println( "The Add of "+num1 +" and" +num2+"is "+(num1+num2));
        else if (operation == '-')
            System.out.println("The Sub of "+num1 +" and" +num2+"is "+(num1-num2));
        else if (operation=='*')
            System.out.println("The Mul of "+num1 +" and" +num2+"is"+(num1*num2));
        else if(operation == '/')
            System.out.println("The Div of "+num1 +" and" +num2+"is"+(num1/num2));
        else if (operation=='%')
            System.out.println("The Mod of "+num1 +"and" +num2+"is"+(num1%num2));

    }
}
