package unit2;
import codehs.*;


public class DataValidation4 extends ConsoleProgram {

    public void run(){
        char beverageSelection;

        System.out.println("Beverage Menu");
        System.out.println("    a. Coffee");
        System.out.println("    b. Water");
        System.out.println("    c. Milk");

        beverageSelection = readLine("Which beverage would you like? ").charAt(0);

        while(beverageSelection!= 'a' && beverageSelection != 'b' && beverageSelection != 'c'){

            beverageSelection = readLine("Invalid beverage, please enter valid beverage: ").charAt(0);

        }

        System.out.println("Great Choice!");
    }
}
