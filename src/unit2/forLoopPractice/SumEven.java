package unit2.forLoopPractice;

import codehs.*;

public class SumEven extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter a number n: ");
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
