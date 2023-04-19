import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class d4t4p4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number is: ");
        int n = input.nextInt();
        insert(n);
    }
    public static void insert(int n){
        LinkedList<String> link = new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            String m = input.next();
            link.add(m);
        }
        Iterator<String> ite = link.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        LinkedList<String> link_2 = new LinkedList<>();
        link_2.add("Santhosh");
        link_2.add("Priya");
        link_2.add("Sample");
        System.out.println(link_2);
        link.addAll(link_2);
        link.addFirst("Aju");
        link.addLast("Ammu");

        // remove
        link.remove("Aju");
        System.out.println("The deleted after we print the list:"+link);
        //update
        link.set(3,"Aju");
        System.out.println("The updated list is : "+link);

    }
}
