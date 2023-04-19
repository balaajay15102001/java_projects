import java.util.Arrays;
import java.util.Scanner;

public class sir_reiview2 {
    static Scanner input = new Scanner(System.in);
    static int i, j;

    public static void main(String[] args) {
        //int[] arr1 = {1,5,6,7,8,10};
        //int[] arr2={2,4,9};
        System.out.print("Enter the number of array in str1: ");
        int p=input.nextInt();
        int[] arr1=new int[p];
        for(i=0;i<p;i++){
            System.out.print("Enter the arr-1: ");
            arr1[i]=input.nextInt();
        }
        System.out.print("Enter the number of array in str1: ");
        int q=input.nextInt();
        int[] arr2 = new int[q];
        for(i=0;i<q;i++){
            System.out.print("Enter the arr-2: ");
            arr2[i]=input.nextInt();
        }
        int m=p;
        int res=m+q;
        int[] result=new int[res];
//        System.arraycopy(arr1,0,result,0,p);
//        System.arraycopy(arr2,0,result,p,q);
        for(int k=0;k<p;k++){
            result[k]=arr1[k];
        }
        for (int w=0;w<q;w++){
            result[m]=arr2[w];
            m++;
        }
        Arrays.sort(result);
        int[] new_arr2=new int[p];
        int j=0;
        for(i=0;i<p;i++){
            new_arr2[j]=result[i];
            j++;
            //System.out.println(new_arr2[i]);
        }
        System.out.println(Arrays.toString(new_arr2));
        int[] new_arr=new int[q];
        int i=0;
        for(j=p;j<res;j++){
            new_arr[i]=result[j];
            i++;
        }
       System.out.println(Arrays.toString(new_arr));

    }
}
