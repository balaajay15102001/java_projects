import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class No_1_array_reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        out.println("Enter the number of array");
        int n=in.nextInt();
        //Wrapper class is used in array because of using the Collections
        Integer arr[] =new Integer[n];
        for(int i=0;i<n;i++){
            out.print("Please enter the value of arr["+i+"]:");
            arr[i]=in.nextInt();
        }
        out.println("Before reversing the array:");
        out.println(Arrays.asList(arr));
        out.println("After reverse an array by using Collections:");
        Collections.reverse(Arrays.asList(arr));
        out.print(Arrays.asList(arr));

    }
}
