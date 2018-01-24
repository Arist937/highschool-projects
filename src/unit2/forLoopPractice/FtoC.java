package unit2.forLoopPractice;

import codehs.*;

public class FtoC extends ConsoleProgram {
    public void run() {
        double celsius;


        for (int fahrenheit = -30; fahrenheit <= 100; fahrenheit += 20) {
            celsius = (fahrenheit - 32) * ((double) 5 / 9);

            System.out.println(fahrenheit + " fahrenheit is " + celsius + " celsius");
        }
    }
}
