package unit2.otherStuff;

import codehs.*;

import java.util.Random;

public class Accumulator extends ConsoleProgram {

    public void run() {
        Random myRandom = new Random();
        int randomInt;

        for (int i = 0; i < 1000; i++) {
            randomInt = myRandom.nextInt(100) + 1;
            System.out.println(randomInt);
        }

    }
}
