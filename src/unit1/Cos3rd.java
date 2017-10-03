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
        double C = readDouble("Enter angle C: ");

        double cToRadians = Math.toRadians(C);

        double cLength = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(cToRadians));
        System.out.println(cLength);
    }
}
