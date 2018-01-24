/*
 @author: Arist
*/

package unit1.mathProblems;

import codehs.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hypotenuse extends ConsoleProgram {

    public void run() {


        double legOne = readDouble("Enter the length of the first leg: ");
        double legTwo = readDouble("Enter the length of the second leg: ");

        double hypotenuseLength = Math.sqrt(Math.pow(legOne, 2) + Math.pow(legTwo, 2));

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("\nThe length of the right triangle's hypotenuse is: " + df.format(hypotenuseLength));
    }
}