import java.util.Scanner;

public class MAT_ADD {
    static Scanner input = new Scanner(System.in);
    static int i, j;

    public static void main(String[] args) {
        System.out.println("Enter the square matrix of row and the coloumn");
        System.out.print("Enter the number of row:");
        int n = input.nextInt();
        System.out.println("Enter the number of column:");
        int m = input.nextInt();
        int[][] mat_1 = new int[n][m];
        int[][] mat_2 = new int[n][m];
        System.out.println("********* 1 MATRIX ***********");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("Enter the element of " + n + " row and " + m + " column is: ");
                mat_1[i][j] = input.nextInt();
            }
        }
        System.out.println("********** 2 MATRIX **********");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("Enter the element of " + n + " row and " + m + " column is: ");
                mat_2[i][j] = input.nextInt();
            }
        }
        Add(mat_1, mat_2, n, m);

    }

    public static void Add(int[][] mat_1, int[][] mat_2, int row, int col) {
        int add[][] = new int[row][col];
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                add[i][j] = mat_1[i][j] + mat_2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
