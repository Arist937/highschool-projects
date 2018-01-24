package unit2.livehack2;

import codehs.*;

/**
 * A program Livehack2Problem2.java that computes the year the desert is within 500m of the park
 * and the year that the park needs to close down
 *
 * @author: A. Xu
 */

public class Livehack2Problem2 extends ConsoleProgram {

    public void run() {

        // CREATE and SET variables distanceFromPark to 3000 and yearToClose to 2017
        int distanceFromPark = 3000;
        int yearToClose = 2017;

        // LOOP until distane from park is lower than 500m
        while (distanceFromPark > 500) {
            // COMPUTE the distance of park after each year
            distanceFromPark = distanceFromPark - 48;
            // INCREMENT yearToClose to find the year after 2017 where the park is within 500m
            yearToClose++;
        }

        // OUTPUT yearToClose
        System.out.println("The park will need to close in " + yearToClose);

    }
}
