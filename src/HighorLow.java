import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        int randomValue;

        int playerGuess;

        boolean loop = true;

        System.out.println("Welcome to the guessing game!");

        randomValue = rand.nextInt(1, 10);

        do {

            System.out.println("Please input your guess to the number that is between 1 and 10:");

            if (in.hasNextInt()) {

                playerGuess = in.nextInt();

                in.nextLine();

                if (playerGuess >= 1 && playerGuess <= 10) {

                    System.out.println("The random value was " + randomValue);

                    if (playerGuess < randomValue) {

                        System.out.println("Your guess was too low");

                    } else if (playerGuess > randomValue) {

                        System.out.println("Your Guess was too high");

                    } else {

                        System.out.println("You were correct. Congratulations!!!");

                    }

                    loop = false;

                }
                else {

                    System.out.println("Error: Input type is invalid. Try again...");

                }
            }
            else {

                System.out.println("Error: Input type is invalid. Try again...");

                in.nextLine(); //code looped infinitely without this line

            }
        } while (loop == true);
    }
}
