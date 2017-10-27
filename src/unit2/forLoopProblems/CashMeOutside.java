package unit2.forLoopProblems;
import codehs.*;


public class CashMeOutside extends ConsoleProgram {

    public void run(){
        int quantity = 0;
        int numOfProducts;

        double price = 0;
        double tentativeCost;
        double totalCost = 0;

        numOfProducts = readInt("How many products do you want to buy? ");

        for (int i = 1; i <= numOfProducts; i++){
            quantity = readInt("Enter quantity of product " + i + ": ");
            price = readDouble("Enter the price of product " + i + ": ");

            tentativeCost = quantity * price;
            totalCost = tentativeCost + totalCost;
        }

        double finalCost = totalCost * 1.13;
        System.out.println(finalCost);
    }
}