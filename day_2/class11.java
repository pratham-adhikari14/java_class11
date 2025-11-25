package day_2;
import java.util.Scanner;

public class class11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Welcome to class 11 == \n");

        System.out.println("Enter the service you want \n");

        System.out.println("Service we provide :\n");

        System.out.println("1.Software Development");
        System.out.println("2.Automation");
        System.out.println("3.Web Development");
        System.out.println("0.Exit");

        System.out.println("Enter your choice : ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
         System.out.println("You have Successfully Entered into Software Development");
                
                break;
                

                      case 2:
         System.out.println("You have Successfully Entered into Automation");
                
                break;
        
                      case 3:
         System.out.println("You have Successfully Entered into Web Development");
                
                break;


         
                      case 0:
         System.out.println("Exiting Successfully ...... Goodbye !");
                
                break;



            default:
                System.out.println("Invalid Option!");
        }
    }
