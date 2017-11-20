package unit2.Assignment;

import codehs.*;

/**
 * A program A1FreezingHot.java that lets a user enter two temperatures and it determines whether
 * the temperatures are considered freezing hot (one higher than 100, one lower than 200)
 * @author: A. Xu
 */

public class A1FreezingHot extends ConsoleProgram {

    public void run(){

        // Declare variables temperatureOne, temperatureTwo and isFreezingHot
        int temperatureOne;
        int temperatureTwo;
        boolean isFreezingHot;

        // Get two temperatures temperatureOne and temperatureTwo from user
        temperatureOne = readInt("Enter the first temperature: ");
        temperatureTwo = readInt("Enter the second temperature: ");

        // Determine if the temperatures inputted by the user are Freezing Hot
        if (temperatureOne > 100 && temperatureTwo < 0){
            isFreezingHot = true;
        }
        else if (temperatureOne < 0 && temperatureTwo > 100) {
            isFreezingHot = true;
        }
        else {
            isFreezingHot = false;
        }

        // Output the boolean isFreezingHot
        System.out.println(isFreezingHot);

    }
}
