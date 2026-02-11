import java.util.Scanner;
public class Classwork{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     String a[] = new String[5];

     System.out.println("Enter the names");

     for(int i=0; i<a.length; i++){
       a[i] = input.nextLine();
     }

     
     System.out.println("The names are");

     for(int i=0; i<a.length; i++){
        System.out.println(a[i]);
      
     }

  }
    
}