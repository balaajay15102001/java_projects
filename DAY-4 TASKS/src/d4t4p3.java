import java.util.*;

public class d4t4p3 {
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
        System.out.println("The printed list is "+int_1);
        //Changing the element by using set method
        int_1.set(2,100);
        //sorting of the given list
        Collections.sort(int_1);
        //Traversing the function...
        Iterator<Integer> itr = int_1.iterator();
        System.out.println("The list are: ");
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
        //contains of a number 100.
        if(int_1.contains(100)){
            int index=int_1.indexOf(100);
            int_1.remove(index);
        }
        System.out.println(int_1);
    }
}
