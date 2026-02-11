import java.util.Scanner;

class Guessnum {
    int num;

    Guessnum(int num) {
        this.num = num;
    }

    void playGame() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();

            if (userInput > num) {
                System.out.println("Your number " + userInput + " is bigger");
            } else if (userInput < num) {
                System.out.println("Your number " + userInput + " is smaller");
            } else {
                System.out.println("Your given number is equal");
                break;
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        Guessnum game = new Guessnum(14);
        game.playGame();
    }
}
