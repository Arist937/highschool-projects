package unit2.stringProblems;
import codehs.*;

public class Find_FullName extends ConsoleProgram {
    public void run(){
        String fullName = readLine("Enter your full name: ");
        int endOfFirstName = fullName.indexOf(" ");

        System.out.println("The first name is: " + fullName.substring(0, endOfFirstName));
        System.out.println("The last name is: " + fullName.substring(endOfFirstName + 1, fullName.length()));
    }
}
