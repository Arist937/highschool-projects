package unit2;
import codehs.*;


public class DataValidation3 extends ConsoleProgram {

    public void run(){
        int mark = readInt("Enter mark: ");

        while(mark < 0 || mark > 100){
            mark = readInt("Invalid mark, please enter valid mark: ");
        }

        System.out.println("Your mark is " + mark);
    }
}
