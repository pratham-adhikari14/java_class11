import java.util.Scanner;

 class Guessnum {
    static int secrectNumber = 14;
    static int userInput;
    static Scanner sc = new Scanner(System.in);

    Guessnum(int SecNum, int userInput){
        secrectNumber = SecNum;
        this.userInput = userInput;
    }
<<<<<<< HEAD
    public static void main(String [] args)
 void Guessnum(){
    System.out.println("enter a number")
    scanner input = new scanner(System.in)
 }
   while(true){
  
    num2 = input.nextint();
=======
    
    static void getNumber(){
        System.out.print("Enter Your number here : ");
        userInput = sc.nextInt();
     }
>>>>>>> 50f9bd63c3139b9d883ea994de21a01e2939e0d8

     public static void main(String [] args) {
        boolean working = true;

        System.out.println(" Welcome to Number Guessing Game ");
        
        System.out.println("Guess a Number between 1 to 100");

        getNumber();

        while(working){
            if(secrectNumber < userInput){
                System.out.println("You Guessed is high");
                working = false;

            } else if(secrectNumber > userInput){
                System.out.println("Your Guess is Low");
                getNumber();

            } else if(secrectNumber == userInput){
                System.out.println("Your Guess is correct");
                getNumber();
            }
            else {
                System.out.println("Invalid Input");
                getNumber();
            }
            
        }
    }
 }