package unit2;
import codehs.*;


public class Accumulator extends ConsoleProgram {

    public void run(){

        int sum = 0;
        int n = readInt("Enter value of n: ");

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
