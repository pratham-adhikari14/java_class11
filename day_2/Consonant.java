package day_2;

import java.util.Scanner;
public class Consonant{
  
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
        System.out.println("Please Enter Letter From A to Z in small letters : \n");

         char C = input.nextLine().charAt(0);
     
   

     if(C == 'a'|| C == 'e' || C == 'i' || C == 'o' || C == 'u' ){
       System.out.println("The Entered Letter is Vowel Letter");       
     }

     else{
       System.out.println("The Entered Letter is Consonant Letter");
     }

  }
}
