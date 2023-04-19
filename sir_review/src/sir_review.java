import java.util.Arrays;
import java.util.Collections;

public class sir_review {
    public static void main(String[] args) {
        Integer[] name={1,2,3,0,4,6};
        Arrays.sort(name, Collections.reverseOrder());
        System.out.print("Largest number using the said array numbers:");
        for (int i=0;i<name.length;i++)
            System.out.print(name[i]);
    }
}

