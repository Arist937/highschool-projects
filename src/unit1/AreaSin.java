package unit1;

import codehs.*;

public class AreaSin extends ConsoleProgram {

    public void run() {
        double a = readDouble("Enter length of a: "); //GET and CREATE length of a
        double b = readDouble("Enter length of b: "); //GET and CREATE length of b
        double C = readDouble("Enter measure of angle C: "); //GET and CREATE angle of C

        double areaTriangle = ((a)*(b)*Math.sin(Math.toRadians(C))) / 2; //COMPUTE for area


        System.out.println(areaTriangle); //OUPUT area
    }
}

