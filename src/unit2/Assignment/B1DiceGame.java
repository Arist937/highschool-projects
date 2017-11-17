package unit2.Assignment;

import codehs.*;
import java.util.Random;

/**
 * A program B1DiceGame.java that simulates 100 double dice rolls and determines if the two die
 * add up to 2 (snake eyes) or 7 (lucky seven)
 * @author: A. Xu
 */

public class B1DiceGame extends ConsoleProgram {
    public void run() {
        // Create a random object that will be used to generate a number from 1 - 6
        Random myRandom = new Random();

        // Declare randomDiceRoll to store random number from 1 - 6 and store randomDiceRoll into diceRollOne and diceRollTwo
        int randomDiceRoll;
        int diceRollOne;
        int diceRollTwo;

        // For loop that runs 100 times
        for (int i = 0; i < 100; i++){
            // Generate number from 1 - 6 and store it in diceRollOne
            randomDiceRoll = myRandom.nextInt(6) + 1;
            diceRollOne = randomDiceRoll;

            // Generate number from 1 - 6 and store it in diceRollTwo
            randomDiceRoll = myRandom.nextInt(6) + 1;
            diceRollTwo = randomDiceRoll;

            // Determine if the rolls create snake eyes or a lucky seven
            if ((diceRollOne + diceRollTwo) == 2)  {
                System.out.println("Snake Eyes");
            }
            else if ((diceRollOne + diceRollTwo) == 7) {
                System.out.println("Lucky Seven!");
            }
        }
    }
}
