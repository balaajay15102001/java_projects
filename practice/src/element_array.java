import java.util.Arrays;
import java.util.Scanner;

public class element_array {
    static Scanner input = new Scanner(System.in);
    static int i, j;

    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8,10};
        int[] arr2={2,4,9};
        int p=arr.length;
        int q=arr2.length;
        int res=p+q;
        int[] result=new int[res];
        //arraycopy
        System.arraycopy(arr,0,result,0,p);
        //array copy
        System.arraycopy(arr2,0,result,p,q);
        //sort
        Arrays.sort(result);
        for(i=0;i<p;i++){
            arr[i]=result[i];
        }
        System.out.println(Arrays.toString(arr));
        int[] array=new int[q];
        int i=0;
        for(j=p;j<res;j++){
            array[i]=result[j];
            i++;
        }
        System.out.println(Arrays.toString(array));

    }
}
