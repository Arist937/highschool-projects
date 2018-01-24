package unit2.forLoopPractice;

import codehs.*;

public class Factorial extends ConsoleProgram {
    public void run() {
        int factorialNumber = readInt("Which number would you like to find the factorial of? ");
        int sum = 1;


        for (int i = factorialNumber; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
