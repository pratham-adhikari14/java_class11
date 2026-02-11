import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 2, c = 2;
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiplication Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
