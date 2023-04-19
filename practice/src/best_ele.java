import java.util.Arrays;
import java.util.Scanner;

public class best_ele {
    static Scanner input = new Scanner(System.in);
    static int i, j;

    public static void main(String[] args) {
        System.out.println("Enter the number of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter the element:");
            arr[i] = input.nextInt();
        }

        for(i=0;i<n;i++){
            int sum=arr[i];
            for(j=i+1;j<n;j++){
                if(i<n-1) {
                    sum += arr[j];
                }
            }
            arr[i]=sum;
            sum=0;
            if(i==n-1){
                arr[i]=-1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
