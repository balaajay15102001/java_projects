import java.util.ArrayList;
import java.util.Scanner;

public class d4t4p7 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> int_1 = new ArrayList<>();
        int_1.add(1);
        int_1.add(2);
        int_1.add(4);
        int_1.add(7);
        int_1.add(9);
        int_1.add(100);
        System.out.println("Enter the size by default method: "+int_1.size());
        int count =0;
        for (int i=0;i<int_1.size();i++){
            count++;
        }
        System.out.println("The size of the list: "+count);


    }
}
