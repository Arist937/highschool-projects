package unit2.forLoopProblems;

import codehs.*;


public class Div2 extends ConsoleProgram {

    public void run() {
        int counter = 0;
        int number = readInt("Enter a number: ");

        for (int i = number; i > 1; i -= 2) {
            counter++;
        }

        System.out.println("Your number can be divided " + counter + " times");
    }
}
