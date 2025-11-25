package day_2;

import java.util.Scanner;

public class Positive{ 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = input.nextInt();

        if(num<0){
            System.out.println("The number " + num + "is Negative");

        }
        
        else if(num==0){
            System.out.println("The number" + num + "is neither negative nor positive");
        }
        
         else{
            System.out.println("The number" + num + "positive");
        }

        input.close();
    }
    
}