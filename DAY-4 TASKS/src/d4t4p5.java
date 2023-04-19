import java.util.*;

public class d4t4p5 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> int_1 = new ArrayList<>();
        System.out.print("Enter the number is: ");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            int m = input.nextInt();
            int_1.add(m);
        }
        Collections.sort(int_1);
        System.out.print("After Sorting the list:");
        System.out.println(int_1);
    }
}
