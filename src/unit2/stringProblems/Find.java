package unit2.stringProblems;
import codehs.*;

public class Find extends ConsoleProgram {
    public void run(){
        String word = readLine("Enter your word: ");
        int letterLocation = readInt("Which character would you like to find? ");

        System.out.println("The character at " + letterLocation + " is " + word.substring((letterLocation - 1), letterLocation));
    }
}