package day_2;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two numbers from user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Adding the numbers
        int sum = num1 + num2;

        // Displaying the result
        System.out.println("The sum is: " + sum);

        sc.close();
    }
    
}
