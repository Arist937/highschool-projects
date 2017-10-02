package unit1;

import codehs.*;

public class Hours extends ConsoleProgram {

    public void run() {
        int numOfHours = readInt("Please enter the number of hours: ");
        int hoursToDays = numOfHours / 24;
        int remainingHours = numOfHours % 24;

        System.out.println(numOfHours + " converted to days is: " + hoursToDays + " days and " + remainingHours + " hours");
    }
}

