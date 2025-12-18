import java.util.Scanner;

 class Guessnumber {
    static int secrectNumber = 14;
    static int userInput;
    static Scanner sc = new Scanner(System.in);

    Guessnumber(int SecNum, int userInput){
        secrectNumber = SecNum;
        this.userInput = userInput;
    }
    
    static void getNumber(){
        System.out.print("Enter Your number here : ");
        userInput = sc.nextInt();
     }

     public static void main(String [] args) {
        boolean working = true;

        System.out.println(" Welcome to Number Guessing Game "); 
        System.out.println("Guess a Number between 1 to 100");

        getNumber();

        while(working){
            if(secrectNumber < userInput){
                System.out.println("Your number is higher");
               getNumber();

            } else if(secrectNumber > userInput){
                System.out.println("Your number is Lower");
                getNumber();

            } else if(secrectNumber == userInput){
                System.out.println("Your number is correct");
                getNumber();
            }
            
            else {
                System.out.println("Invalid Input");
                getNumber();
            }
            
        }
    }
 }

 /*(counter=0 ; counter = userInuput - secnum = <20 is close ,
  counter = userInuput - secnum = <5 is extreamly close )
  