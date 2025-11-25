package day_1;

import java.util.Scanner; // Import the Scanner class to read user input

public class AddTwoNumbers {
  public static void main(String[] args) {
        // Declare variables to store the two numbers and their sum
        int number1, number2, sum;

        // Create a Scanner object to read input from the console
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first integer: ");
        number1 = inputScanner.nextInt(); // Read the first integer from the user

        // Prompt the user to enter the second number
        System.out.print("Enter the second integer: ");
        number2 = inputScanner.nextInt(); // Read the second integer from the user

        // Calculate the sum of the two numbers
        sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner to release system resources
        inputScanner.close();
    }
}
