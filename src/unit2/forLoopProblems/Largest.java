package unit2.forLoopProblems;

import codehs.*;


public class Largest extends ConsoleProgram {

    public void run() {
        int newNumber = 0;
        int oldNumber = 0;
        int largestNumber = 0;

        while (oldNumber != -1) {
            newNumber = readInt("Enter number: ");

            if (newNumber > oldNumber) {
                largestNumber = newNumber;
            }

            oldNumber = newNumber;
        }

        System.out.print("The biggest number is " + largestNumber);
    }
}
