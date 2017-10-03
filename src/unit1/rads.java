
package unit1;

import codehs.*;

public class rads extends ConsoleProgram {

    public void run() {
        double degrees = readDouble("Enter degrees: "); //GET and CREATE degrees
        double degreesToRadians = Math.toRadians(degrees); //GET and CREATE degrees to radians and set it to degrees converted to radians

        System.out.println(degrees + "degrees to radians is: " + degreesToRadians); //OUTPUT result
    }
}
