package unit2.forLoopPractice;
import codehs.*;

public class Fib extends ConsoleProgram
{
    public void run()
    {
        int n = readInt("Enter n: ");
        int a = 1;
        int b = 0;
        int c;

        for(int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
