import java.util.Scanner;
import java.util.Vector;

public class d4t4p2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Vector<String> vec_1 = new Vector<String>(4);
        System.out.print("Enter the number is: ");
        int n= input.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            String m=input.next();
            vec_1.add(m);//add method
        }

        // Second vector list

        Vector<String> vec_2 = new Vector<>(5);

        vec_2.add("Ajay");
        vec_2.add("Bala");
        vec_2.add("Nizar");
        vec_2.add("Rangesh");
        //Default vector size is 10;
        System.out.println("The vector 1 Capacity: "+ vec_1.capacity());//10
        System.out.println("The vector 2 Capatcity:"+vec_2.capacity());//5
        //display the current list
        System.out.println("The current vector-1 list elements is: "+vec_1);
        System.out.println("The current vector-2 list elements is: "+vec_2);
        //Combine both the vector by using add all method
        vec_1.addAll(vec_2);
        System.out.println("Combine vector 1 & 2 is: "+vec_1);
        //if the vector is contains or not by using contains command
        if(vec_1.contains("Bala"))
            System.out.println("Bala is contains in the given list");
        else
            System.out.println("Bala is not contain in the list");


        //Clone
        Vector<String> vec_clone = new Vector<String>();
         vec_clone = (Vector) vec_1.clone();
        System.out.println("The cloned vector of combined list is: "+ vec_1.clone());
        //Remove bala from the clone list
        vec_clone.remove("Bala");
        System.out.println(vec_clone);
    }
}
