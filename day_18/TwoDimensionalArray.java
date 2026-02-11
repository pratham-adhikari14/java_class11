import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[2][3];
        System.out.println("Enter numbers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
