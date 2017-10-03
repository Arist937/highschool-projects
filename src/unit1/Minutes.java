package unit1;

import codehs.*;

public class Minutes extends ConsoleProgram {

    public void run() {
        int numOfMinutes = readInt("Please enter the number of minutes: "); //GET and CREATE number of minutes
        int minutesToDays = numOfMinutes / 1440; //CREATE days and set it to converting minutes to days
        int remainingHours = (numOfMinutes % 1440) / 60; //CREATE remainingHours and set it to hours that remain after finding number of days
        int remainingMinutes = (numOfMinutes % 1440) % 60; //CREATE remaining minutes and find minutes left after finding days and hours

        System.out.println(numOfMinutes + " converted to days is: " + minutesToDays + " days and " + remainingHours + " hours and " + remainingMinutes + " minutes"); //OUTPUT final result
    }
}

