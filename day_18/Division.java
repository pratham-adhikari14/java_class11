import java.util.Scanner;

public class Division {
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

        System.out.println("Division Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (B[i][j] != 0)
                    System.out.print(A[i][j] / B[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
