import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class sort_NUM_STR {
    static int i, j;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the no of numeric array elements: ");
        int n = input.nextInt();
        sorted_num(n);
        System.out.print("Enter the no of String array elements: ");
        int ch_n = input.nextInt();
        Str_sort(ch_n);
    }

    public static void sorted_num(int n) {
        System.out.println("*******Numeric Sorted*******");
        int[] arr_num = new int[n];
        for (i = 0; i < n; i++) {
            arr_num[i] = input.nextInt();
        }
        System.out.print("The numeric array which is sorted before: ");
        System.out.println(Arrays.toString(arr_num));
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                int temp = 0;
                if (arr_num[i] > arr_num[j]) {
                    temp = arr_num[i];
                    arr_num[i] = arr_num[j];
                    arr_num[j] = temp;
                }
            }
        }
        System.out.print("The numeric Array which after sorted: ");
        System.out.println(Arrays.toString(arr_num));
    }

    public static void Str_sort(int m) {
        System.out.println("*******String Sorted*******");
        String[] str=new String[m];
        for(i=0;i<m;i++){
            str[i]=input.next();
        }
        System.out.print("The String array which is sorted before: ");
        System.out.println(Arrays.toString(str));
        for(i=0;i<m;i++){
            for (j=i+1;j<m;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.print("The String array which is sorted after: ");
        System.out.println(Arrays.toString(str));
    }
}