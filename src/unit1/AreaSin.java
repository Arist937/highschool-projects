package unit1;

import codehs.*;

public class AreaSin extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length of a: ");
        double b = readDouble("Enter length of b: ");
        double C = readDouble("Enter measure of angle C: ");

        double cToRadians = Math.toRadians(C);

        double areaTriangle = ((a)*(b)*Math.sin(cToRadians)) / 2;


        System.out.println(areaTriangle);
    }
}

