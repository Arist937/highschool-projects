package unit1;
import codehs.*;


public class AvgMarks extends ConsoleProgram{

    public void run() {
        double mark1 = readDouble("Enter first mark: ");
        double mark2 = readDouble("Enter second mark: ");
        double mark3 = readDouble("Enter third mark: ");
        double mark4 = readDouble("Enter fourth mark: ");

        double avg = (mark1 + mark2 + mark3 + mark4)/4;

        System.out.println("\nYour average is: " + avg);

        if(avg >= 90){
            System.out.println("Wow, you're smart");
        }
        else if(avg >= 80){
            System.out.print("Nice!");
        }
        else if(avg >= 70){
            System.out.println("Decent");
        }
        else if(avg >= 60){
            System.out.println("You're almost there!");
        }
        else{
            System.out.println("...");
        }
    }
}

