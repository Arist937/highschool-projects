package unit1;

import codehs.*;

public class AreaSin extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length of a: ");
        double b = readDouble("Enter length of b: ");
        double C = readDouble("Enter measure of angle C: ");

        double areaTriangle = ((a)*(b)*Math.sin(Math.toRadians(C))) / 2;


        System.out.println(areaTriangle);
    }
}

