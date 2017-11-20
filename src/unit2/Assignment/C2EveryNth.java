package unit2.Assignment;

import codehs.*;

/**
 * A program C2EveryNth.java that lets a user enter a word and the value of n. The program then
 * finds every nth character in the word entered starting at 0
 * @author: A. Xu
 */

public class C2EveryNth extends ConsoleProgram {

    public void run() {
        // Create variables userWord, newWord and valueN
        String userWord;
        String newWord = "";
        int valueN;

        // Get a word from the user and the value of n
        userWord = readLine("Enter your word: ");
        valueN = readInt("Enter the value of n: ");

        // Loop that runs for the length of the word that the user entered divided by 3
        for (int i = 0; i < userWord.length(); i += valueN) {
            // Add the valueNth char of userWord to newWord
            newWord = newWord + userWord.charAt(i);
        }

        // Print out newWord
        System.out.println(newWord);

    }
}