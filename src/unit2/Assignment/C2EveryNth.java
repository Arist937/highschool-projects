package unit2.Assignment;

import codehs.*;

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

        System.out.println(newWord);
    }
}