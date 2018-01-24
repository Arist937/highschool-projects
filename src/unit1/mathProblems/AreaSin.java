package unit1.mathProblems;

import codehs.*;

public class AreaSin extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length of a: "); //GET and CREATE length of a
        double b = readDouble("Enter length of b: "); //GET and CREATE length of b
        double C = readDouble("Enter measure of angle C: "); //GET and CREATE angle of C

        double areaTriangle = ((a) * (b) * Math.sin(Math.toRadians(C))) / 2; //COMPUTE for area


        System.out.println(areaTriangle); //OUPUT area
    }

    public static class Cos3rd extends ConsoleProgram {

        public void run() {
            double a = readDouble("Enter length a: ");//GET and CREATE length of a
            double b = readDouble("Enter length b: "); //GET and CREATE length of b
            double C = readDouble("Enter measure of angle C: "); //GET and CREATE angle of C

            double cLength = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(C))); //COMPUTE cosine law
            System.out.println(cLength); //OUTPUT result
        }
    }
}

