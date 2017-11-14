package unit2.Assignment;

import codehs.*;

import java.util.Random;

public class B2GuessingGame extends ConsoleProgram {
    public void run() {
        // Create a random object that will be used to generate a number from 1 - 100
        Random myRandom = new Random();

        // Create a random number and variable to store user guesses
        int randomInt = myRandom.nextInt(100);
        int userGuess;


        for (int i = 0; i < 5; i++) {
            userGuess = readInt("Enter your guess: ");

            if (userGuess < randomInt){
                System.out.println("Too small");
            } else if ( userGuess > randomInt) {
                System.out.println("Too big");
            } else if (userGuess == randomInt){
                System.out.println("You got the right number!");
                break;
            }
        }
    }
}
