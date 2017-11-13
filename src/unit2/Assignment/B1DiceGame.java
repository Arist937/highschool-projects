package unit2.Assignment;

import codehs.*;
import java.util.Random;

public class B1DiceGame extends ConsoleProgram {
    public void run() {
        // Create a random object that will be used to generate a number from 1 - 6
        Random myRandom = new Random();

        // Declare randomDiceRoll to store random number from 1 - 6 and store randomDiceRoll into diceRollOne and diceRollTwo
        int randomDiceRoll;
        int diceRollOne;
        int diceRollTwo;

        // For loop that runs 100 times
        for(int i = 0; i < 100; i++){
            randomDiceRoll = myRandom.nextInt(7);
            diceRollOne = randomDiceRoll;

            randomDiceRoll = myRandom.nextInt(7);
            diceRollTwo = randomDiceRoll;

            if((diceRollOne + diceRollTwo) == 2)  {
                System.out.println("Snake Eyes");
            }
            else if((diceRollOne + diceRollTwo) == 7) {
                System.out.println("Lucky Seven!");
            }
        }
    }
}
