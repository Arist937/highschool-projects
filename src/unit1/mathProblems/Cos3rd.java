/*
My first program

Author: @Arist Xu
*/

package unit1.mathProblems;

import codehs.*;

public class Cos3rd extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length a: ");//GET and CREATE length of a
        double b = readDouble("Enter length b: "); //GET and CREATE length of b
        double C = readDouble("Enter measure of angle C: "); //GET and CREATE angle of C

        double cLength = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(C))); //COMPUTE cosine law
        System.out.println(cLength); //OUTPUT result
    }
}
