import java.util.Iterator;
import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        LinkedList<String> lin_list = new LinkedList<>();
        lin_list.add("Bala");
        lin_list.add("Murugan");
        lin_list.add("Ajay");
        lin_list.add("Aju");
        Iterator<String> itr=lin_list.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
    }
}
