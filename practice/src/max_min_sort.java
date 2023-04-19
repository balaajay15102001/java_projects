import java.util.Arrays;
import java.util.Scanner;

public class max_min_sort {
    static Scanner input = new Scanner(System.in);
    static int i,j;
    public static void main(String[] args) {
        System.out.println("Enter the number of element: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++) {
            System.out.print("Enter the element:");
            arr[i] = input.nextInt();
        }
        for(i=0;i<n;i++){
            int temp=0;
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int[] array2=new int[n];
        int max=n-1;
        int min=0;
        for(i=0;i<n;i++){
           if(i%2==0){
               array2[i]=arr[max];
               max--;
           }
           else{
               array2[i]=arr[min];
               min++;
           }
        }
        System.out.println(Arrays.toString(array2));
        }
    }

