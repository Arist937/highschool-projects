package unit1.livehack1;
import codehs.*;

/**
 * A program LiveHackProblem2.java that lets you enter the temperature in celsius, and then converts and prints the
 * temperature in fahrenheit.
 * @author: A. Xu
 */

public class LiveHackProblem2 extends ConsoleProgram {

    public void run() {
        // Introduce Program
        System.out.println("Hello. This program lets you enter a temperature in celsius and then converts it to" +
                " fahrenheit.");

        // CREATE variables tempConvertedToFahrenheit and tempInCelsius
        double tempCelsius;
        double tempToFahrenheit;

        // GET value for temperature in Celsius from user
        tempCelsius = readDouble("Enter the temperature in celsius: ");

        // COMPUTE celsius conversion to fahrenheit using formula tempToFahrenheit = tempInCelsius(9/5) + 32
        tempToFahrenheit = (tempCelsius * ((double) 9 / 5)) + 32;

        // PRINT tempToFahrenheit
        System.out.println("The temperature in fahrenheit is " + tempToFahrenheit + " degrees.");
    }
}