import java.util.Scanner;

public class d4t2p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String arr1 = input.nextLine();
        System.out.println("Enter the String 2: ");
        String arr2 = input.nextLine();
        char array[] = arr2.toCharArray();
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '?' || array[i] == '*' || array[i] == '+') {
                array[i] = '\0';
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '\0') {
                str += array[i];
            }
        }
        if (arr1.contains(str)) {
            System.out.println("Pattern matches");
        } else {
            System.out.println("Pattern Not matches");
        }
    }
}
