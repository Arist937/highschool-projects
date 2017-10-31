package unit2.livehack2;
import codehs.*;

/**
 * A program Livehack2Problem1.java that lets you enter the future year and find the distance of
 * the desert to the park in each year from 2017 to the entered year
 * @author: A. Xu
 */

public class Livehack2Problem1 extends ConsoleProgram {

    public void run(){

        // CREATE variables distanceFromPark and futureYear and SET distanceFromPark to 3000
        int distanceFromPark = 3000;
        int futureYear;

        // GET the future year from user
        futureYear = readInt("Enter the future year: ");

        // LOOP until all years from 2017 to futureYear are outputted
        for (int i = 2017; i <= futureYear; i++){
            // OUTPUT the year and the desert distance from the park
            System.out.println("Year: " + i + ", Desert Edge Distance: " + distanceFromPark);
            // COMPUTE distanceFromPark after i years
            distanceFromPark = distanceFromPark - 48;
        }

    }
}
