package unit2.Assignment;

import codehs.*;

public class C1BackToBack extends ConsoleProgram {
    public void run() {
        // Variable userWord to get input and newWord that stores the final word
        String userWord = "";
        String newWord;

        // While loop to ensure that user cannot input nothing
        while (userWord == "") {
            // Get input from the user
            userWord = readLine("Enter a word: ");
        }

        // Stores new word with user word with it's last letter on the back and front
        newWord = userWord.substring(userWord.length() - 1) + userWord + userWord.substring(userWord.length() - 1);
        // Print the new world
        System.out.println(newWord);
    }
}