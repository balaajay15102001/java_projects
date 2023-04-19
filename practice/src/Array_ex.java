import java.util.*;
public class Array_ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = input.nextInt();
        System.out.println("Enter the column");
        int col = input.nextInt();
        //int [][]array = {{4,3,2,1},{1,2,4},{7}};
        int [][] array = new int[row][col];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element: ");
                array[row][col]=input.nextInt();
            }
            }
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
