package unit2.forLoopProblems;
import codehs.*;


public class Budget extends ConsoleProgram {

    public void run(){
        double schoolBudget = readInt("Enter school budget: ");

        String nameOfItem;
        double priceOfItem;
        int quantityOfItem;

        for(int i = 0; i < schoolBudget; i += 0){
            nameOfItem = readLine("Enter name of item: ");
            priceOfItem = readDouble("Enter price of item: ");
            quantityOfItem = readInt("Enter quantity of item: ");

            schoolBudget = schoolBudget - (priceOfItem * quantityOfItem);

            System.out.println("You have " + schoolBudget + " dollars left");
        }
    }
}
