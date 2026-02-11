import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 2, c = 2;
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        System.out.println("Addition Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(A[i][j] + B[i][j] + " ");
            System.out.println();
        }
    }
}
