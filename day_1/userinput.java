package day_1;

import java.util.Scanner;

public class userinput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing the number
        System.out.println(number);

        scanner.close(); 
    }
}        
