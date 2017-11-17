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
        int randomInt = myRandom.nextInt(99) + 1;
        int userGuess;

        // Loops 5 times
        for (int i = 0; i < 5; i++) {
            // Get user guess
            userGuess = readInt("Enter your guess: ");

            // If else structure to determine whether the number is too high or too low or right
            if (userGuess < randomInt){
                System.out.println("Too small");
            } else if ( userGuess > randomInt) {
                System.out.println("Too big");
            } else if (userGuess == randomInt){
                System.out.println("You got the right number!");
                break;
            }

            // if after 5 tries and the user can't guess correctly, print nice try
            if (i == 4){
                System.out.println("Nice try!");
            }
        }
    }
}
