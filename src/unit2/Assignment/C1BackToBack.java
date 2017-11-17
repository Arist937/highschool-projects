package unit2.Assignment;

import codehs.*;

/**
 * A program C1BackToBack.java that lets a user enter a word and adds the last letter of that word
 * to the front and back
 * @author: A. Xu
 */

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

        // Print the new word
        System.out.println(newWord);
    }
}