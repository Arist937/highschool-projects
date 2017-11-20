package unit2.Assignment;

import codehs.*;
import java.util.Random;

/**
 * A program B2GuessingGame.java that generates a number from 1 - 100 and lets the user try to
 * guess the number. The user has 5 tries.
 * @author: A. Xu
 */

public class B2GuessingGame extends ConsoleProgram {

    public void run() {

        // Create a random object that will be used to generate a number from 1 - 100
        Random myRandom = new Random();

        // Create a random number and variable to store user guesses
        int randomInt = myRandom.nextInt(100) + 1;
        int userGuess;

        System.out.println(randomInt);

        // Loops 5 times
        for (int i = 0; i < 5; i++) {
            // Get user guess
            userGuess = readInt("Enter your guess: ");

            // if after 5 tries and the user can't guess correctly, print nice try
            if (i == 4 && userGuess != randomInt){
                System.out.println("Wrong number but nice try!");
            }
            // If guess is lower than the random number print too low
            else if (userGuess < randomInt){
                System.out.println("Too low, guess again.");
            }
            // If guess is higher than the random number print too high
            else if ( userGuess > randomInt) {
                System.out.println("Too high, guess again.");
            }
            // If guess is the random number tell user they got the right number
            else if (userGuess == randomInt){
                System.out.println("You got the right number!");
                break;
            }
        }

    }
}