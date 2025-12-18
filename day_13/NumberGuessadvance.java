import java.util.Scanner;

class NumberGuessadvance {
    private int secretNumber;

 
    NumberGuessadvance() {
        secretNumber = 14;
    }

    void startGame() {
        Scanner sc = new Scanner(System.in);
        int guess;
        int difference;

        System.out.print("Enter your number 1 to 100: ");
        guess = sc.nextInt();

        difference = guess - secretNumber;

        if (difference == 0) {
            System.out.println("Correct! You guessed the number.");
        }
        else if (difference <= 10 && difference >= 0) {
            System.out.println("Very close! You are near the secret number.");
        }
        else if (difference > 0) {
            System.out.println("Too high!");
        }
        else {
            System.out.println("Too low!");
        }

        sc.close();
    }

    public static void main(String[] args) {
        NumberGuessadvance game = new NumberGuessadvance();
        game.startGame();
    }
}
