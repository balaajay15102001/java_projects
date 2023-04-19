import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class d4t4p6 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> int_1 = new ArrayList<>();
        System.out.print("Enter the number is: ");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            int m = input.nextInt();
            int_1.add(m);
        }
        System.out.print("before sorting the list:");
        System.out.println(int_1);
        Collections.sort(int_1,Collections.reverseOrder());
        System.out.print("After sorting the list in reverse: ");
        for (int i=0;i<n;i++){
            System.out.print(int_1.get(i)+" ");
        }
    }
}
