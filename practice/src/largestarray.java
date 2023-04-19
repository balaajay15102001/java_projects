import java.util.Arrays;
import java.util.Collections;

public class largestarray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,0,4,6};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Largest number using the said array numbers:");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }
}
