package unit1;

import codehs.*;

public class Minutes extends ConsoleProgram {

    public void run() {
        int numOfMinutes = readInt("Please enter the number of minutes: ");
        int minutesToDays = numOfMinutes / 1440;
        int remainingHours = (numOfMinutes % 1440) / 60;
        int remainingMinutes = (numOfMinutes % 1440) % 60;

        System.out.println(numOfMinutes + " converted to days is: " + minutesToDays + " days and " + remainingHours + " hours and " + remainingMinutes + " minutes");
    }
}

