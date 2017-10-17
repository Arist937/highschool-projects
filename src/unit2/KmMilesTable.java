package unit2;
import codehs.*;


public class KmMilesTable extends ConsoleProgram {

    public void run(){

        double miles;

        for(int km = 10; km <= 100; km += 10) {
            miles = 0.621371 * km;
            System.out.println(km + "km > " + miles + "mi");
        }
    }
}
