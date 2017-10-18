package unit2.forLoopPractice;
import codehs.*;

public class Sum5 extends ConsoleProgram
{
    public void run()
    {
        int sum = 0;
        int userNumber;

        for(int i = 0; i < 5; i++) {
            userNumber = readInt("Enter a number: ");

            sum = sum + userNumber;
        }

        System.out.println(sum);
    }
}
