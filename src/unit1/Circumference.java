package unit1;

import codehs.*;

public class Circumference extends ConsoleProgram {

    public void run() {
        double radius = readDouble("Enter the radius: ");
        double circumferenceLength = Math.PI * 2 * radius;
        System.out.println("The length of the circumference of your circle is " + circumferenceLength);
    }
}

