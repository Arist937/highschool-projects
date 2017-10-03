/*
My first program

Author: @Arist Xu
*/

package unit1;

import codehs.*;

public class Cos3rd extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length a: ");
        double b = readDouble("Enter length b: ");
        double C = readDouble("Enter measure of angle C: ");

        double cLength = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(C)));
        System.out.println(cLength);
    }
}
