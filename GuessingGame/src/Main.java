import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner obj to get user input.
        Scanner scan = new Scanner(System.in);
        int attempts = 5;
        int i, guess;

        int number = 1 + (int) (1000 * Math.random());

        System.out.println("Welcome to the Guessing Game");
        System.out.println("-----------------------------");

        System.out.println("A number is chosen "
                           + "from 1 to 1000. "
                           + "Guess the number "
                           + "within 5 attempts to win the game.");

        System.out.println();

        //iterate over attempts.
        for (i = 0; i < attempts; i++) {
            System.out.println("Guess the number: ");
            guess = scan.nextInt();

            //if the random number is guessed display this message.
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number > guess && i != attempts -1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != attempts -1) {
                System.out.println("The number is " + "less than " + guess);
            }
            else {
                System.out.println("You lose! The number was " + number);
            }
        }
    }
}
