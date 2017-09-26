/*
 @author: Arist
*/

package unit1;

import codehs.*;

import javax.print.attribute.standard.JobOriginatingUserName;


public class UserInput extends ConsoleProgram{

    public void run() {
        String userName = readLine("What is your name? ");

        int userAge = readInt("What is your age? ");

        double userCurrentMark = readDouble("What is your current mark? ");

        boolean userLocker = readBoolean("Have you been assigned a locker?\n\n ");

        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Current Mark: " + userCurrentMark);
        System.out.println("Has this person recieved a locker: " + userLocker);
    }
}

