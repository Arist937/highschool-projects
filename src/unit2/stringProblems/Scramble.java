package unit2.stringProblems;

import codehs.*;

public class Scramble extends ConsoleProgram {
    public void run() {
        String word = readLine("Enter your word: ");

        String firstHalf = word.substring(0, word.length() / 2);
        String secondHalf = word.substring((word.length() / 2), word.length());

        System.out.println("First half of word: " + firstHalf);
        System.out.println("Second half of word: " + secondHalf);
        System.out.println("Final scrambled word: " + secondHalf + firstHalf);
    }
}
