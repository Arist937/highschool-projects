package unit2.forLoopProblems;
import codehs.*;


public class OddSum extends ConsoleProgram {

    public void run(){
        int n = readInt("Enter value of n: ");
        int sum = 0;

        for (int i = 1; i <= n; i += 2){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
