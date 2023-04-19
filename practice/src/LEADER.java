import java.util.Scanner;

public class LEADER {
    static int i,j;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of element: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        for(i=0;i<n;i++){
            int leader=0;
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    leader=1;
                    break;
                }
            }

            if(leader==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
