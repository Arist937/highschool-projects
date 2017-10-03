
package unit1;

import codehs.*;

public class rads extends ConsoleProgram {

    public void run() {
        double degrees = readDouble("Enter degrees: ");
        double degreesToRadians = Math.toRadians(degrees);

        System.out.println(degrees + "degrees to radians is: " + degreesToRadians);
    }
}
