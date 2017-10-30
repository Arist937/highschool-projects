package unit2.forLoopProblems;
import codehs.*;


public class TripCalculator extends ConsoleProgram {

    public void run(){

        double fuelEfficiency = readDouble("What is your vehicle's fuel efficiency per 100km? ");
        double costOfFuel = readDouble("What is the cost of fuel? ");
        int numOfTrips = readInt("How many trips have you travelled? ");

        double distanceTravelled;
        double totalTravelled = 0;

        for (int i = 1; i <= numOfTrips; i++){
            distanceTravelled = readDouble("How far did you travel in km on trip " + i + "? ");
            totalTravelled = totalTravelled + distanceTravelled;
        }

        System.out.println(totalTravelled);

        System.out.println("You spent " + costOfFuel * (totalTravelled / 100) * fuelEfficiency + " dollars on gas");
    }
}
