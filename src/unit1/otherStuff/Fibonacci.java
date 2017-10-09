/*
 @author: Arist
*/

package unit1.otherStuff;
import codehs.*;


public class Fibonacci extends ConsoleProgram{

    public void run() {
        String a1 = "a1";
        String a2 = "a2";
        String a3 = "a3";
        String b1 = "b1";
        String b2 = "b2";
        String b3 = "b3";
        String c1 = "c1";
        String c2 = "c2";
        String c3 = "c3";

        while(true) {

            System.out.println("----------------");
            System.out.println("| " + a1 + " | " + b1 + " | " + c1 + " |");
            System.out.println("----------------");
            System.out.println("| " + a2 + " | " + b2 + " | " + c2 + " |");
            System.out.println("----------------");
            System.out.println("| " + a3 + " | " + b3 + " | " + c3 + " |");
            System.out.println("----------------");

            String playerOneDecision = readLine("Player one, which square would you like to modify? ");
            String playerTwoDecision = "c3";

            if(playerOneDecision.equals("a1")){
                a1 = "X ";
            }
            else if(playerOneDecision.equals("a2")){
                a2 = "X ";
            }
            else if(playerOneDecision.equals("a3")){
                a3 = "X ";
            }
             else if(playerOneDecision.equals("b1")){
                b1 = "X ";
            }
            else if(playerOneDecision.equals("b2")){
                b2 = "X ";
            }
            else if(playerOneDecision.equals("b3")){
                b3 = "X ";
            }
            else if(playerOneDecision.equals("c1")){
                c1 = "X ";
            }
            else if(playerOneDecision.equals("c2")){
                c2 = "X ";
            }

            else if(playerOneDecision.equals("c3")){
                c3 = "X ";
            }
            else{
                System.out.println("Not a valid answer, please enter another number");
                playerOneDecision = readLine("Which square would you like to modify?");
            }

            if(playerTwoDecision.equals("a1")){
                a1 = "O ";
            }
            else if(playerTwoDecision.equals("a2")){
                a2 = "O ";
            }
            else if(playerTwoDecision.equals("a3")){
                a3 = "O ";
            }
            else if(playerTwoDecision.equals("b1")){
                b1 = "O ";
            }
            else if(playerTwoDecision.equals("b2")){
                b2 = "O ";
            }
            else if(playerTwoDecision.equals("b3")){
                b3 = "O ";
            }
            else if(playerTwoDecision.equals("c1")){
                c1 = "O ";
            }
            else if(playerTwoDecision.equals("c2")){
                c2 = "O ";
            }

            else if(playerTwoDecision.equals("c3")){
                c3 = "O ";
            }
            else{
                System.out.println("Not a valid answer, please enter another number");
                playerOneDecision = readLine("Which square would you like to modify?");
            }

            if(a1.equals(b1) && a1.equals(c1) && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(a2 == b2 && a2 == c2 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(a3 == b3 && a3 == c3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(a1 == a2 && a1 == a3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(b1 == b2 && b1 == b3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(c1 == c2 && c1 == c3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(a1 == b2 && a1 == c3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
            if(c1 == b2 && c1 == a3 && a1.equals("X")){
                System.out.println("Player One Wins!");
                break;
            }
        }
    }
}

