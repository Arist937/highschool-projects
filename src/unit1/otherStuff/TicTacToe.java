/*
 @author: Arist
*/

package unit1.otherStuff;
import java.util.ArrayList;
import java.util.Scanner;


public class TicTacToe{

    public static ArrayList<String> obj = new ArrayList<String>();
    public static Scanner read = new Scanner(System.in);
    public static int victor = 0;

    public static void main(String []args) {
        int x = 0;


        firstSetUp();
        game();
    }

    public static void game() {
    resetBoard();
    victor = 0;

    while (victor == 0) {
        while (victor == 0) {

            drawGame();

            playerOne();

            result();
            break;
        }
        while (victor == 0) {

            drawGame();

            playerTwo();

            result();
            break;
        }
    }
    repeatProgram();
}

    public static void drawGame(){
        System.out.println("----------------");
        System.out.println("a | " + obj.get(0) + " | " + obj.get(1) + " | " + obj.get(2) + " |");
        System.out.println("----------------");
        System.out.println("b | " + obj.get(3) + " | " + obj.get(4) + " | " + obj.get(5) + " |");
        System.out.println("----------------");
        System.out.println("c | " + obj.get(6) + " | " + obj.get(7) + " | " + obj.get(8) + " |");
        System.out.println("----------------");
        System.out.println("    1   2   3");
    }

    public static void playerOne(){

        System.out.print("Player X, which square would you like to modify? ");
        String playerOneDecision = read.nextLine();

        while(true) {
            if (playerOneDecision.equalsIgnoreCase("a1") && obj.get(0).equalsIgnoreCase(" ")) {
                obj.set(0, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("a2") && obj.get(1).equalsIgnoreCase(" ")) {
                obj.set(1, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("a3") && obj.get(2).equalsIgnoreCase(" ")) {
                obj.set(2, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("b1") && obj.get(3).equalsIgnoreCase(" ")) {
                obj.set(3, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("b2") && obj.get(4).equalsIgnoreCase(" ")) {
                obj.set(4, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("b3") && obj.get(5).equalsIgnoreCase(" ")) {
                obj.set(5, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("c1") && obj.get(6).equalsIgnoreCase(" ")) {
                obj.set(6, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("c2") && obj.get(7).equalsIgnoreCase(" ")) {
                obj.set(7, "X");
                break;
            } else if (playerOneDecision.equalsIgnoreCase("c3") && obj.get(8).equalsIgnoreCase(" ")) {
                obj.set(8, "X");
                break;
            } else {
                System.out.print("Sorry, that is not a valid , please enter a valid square ");
                playerOneDecision = read.nextLine();
            }
        }
    }

    public static void playerTwo(){
        System.out.print("Player O, which square would you like to modify? ");
        String playerTwoDecision = read.nextLine();

        while(true) {
            if (playerTwoDecision.equalsIgnoreCase("a1") && obj.get(0).equalsIgnoreCase(" ")) {
                obj.set(0, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("a2") && obj.get(1).equalsIgnoreCase(" ")) {
                obj.set(1, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("a3") && obj.get(2).equalsIgnoreCase(" ")) {
                obj.set(2, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("b1") && obj.get(3).equalsIgnoreCase(" ")) {
                obj.set(3, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("b2") && obj.get(4).equalsIgnoreCase(" ")) {
                obj.set(4, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("b3") && obj.get(5).equalsIgnoreCase(" ")) {
                obj.set(5, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("c1") && obj.get(6).equalsIgnoreCase(" ")) {
                obj.set(6, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("c2") && obj.get(7).equalsIgnoreCase(" ")) {
                obj.set(7, "O");
                break;
            } else if (playerTwoDecision.equalsIgnoreCase("c3") && obj.get(8).equalsIgnoreCase(" ")) {
                obj.set(8, "O");
                break;
            } else {
                System.out.print("Sorry, that is not a valid , please enter a valid square ");
                playerTwoDecision = read.nextLine();
            }
        }
    }

    public static void resetBoard(){
        obj.set(0, " ");
        obj.set(1, " ");
        obj.set(2, " ");
        obj.set(3, " ");
        obj.set(4, " ");
        obj.set(5, " ");
        obj.set(6, " ");
        obj.set(7, " ");
        obj.set(8, " ");
    }

    public static void firstSetUp(){
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
        obj.add(" ");
    }

    public static void result(){
        if (obj.get(0).equalsIgnoreCase(obj.get(1)) && obj.get(0).equalsIgnoreCase(obj.get(2)) && !obj.get(0).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(0) + " Wins!");
            victor = 1;
        }
        else if(obj.get(3).equalsIgnoreCase(obj.get(4)) && obj.get(3).equalsIgnoreCase(obj.get(5)) && !obj.get(3).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(3) + " Wins!");
            victor = 1;
        }
        else if(obj.get(6).equalsIgnoreCase(obj.get(7)) && obj.get(6).equalsIgnoreCase(obj.get(8)) && !obj.get(6).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(6) + " Wins!");
            victor = 1;
        }
        else if(obj.get(0).equalsIgnoreCase(obj.get(3)) && obj.get(0).equalsIgnoreCase(obj.get(6)) && !obj.get(0).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(0) + " Wins!");
            victor = 1;
        }
        else if(obj.get(1).equalsIgnoreCase(obj.get(4)) && obj.get(1).equalsIgnoreCase(obj.get(7)) && !obj.get(1).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(1) + " Wins!");
            victor = 1;
        }
        else if(obj.get(2).equalsIgnoreCase(obj.get(5)) && obj.get(2).equalsIgnoreCase(obj.get(8)) && !obj.get(2).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(2) + " Wins!");
            victor = 1;
        }
        else if(obj.get(0).equalsIgnoreCase(obj.get(4)) && obj.get(0).equalsIgnoreCase(obj.get(8)) && !obj.get(0).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(0) + " Wins!");
            victor = 1;
        }
        else if(obj.get(2).equalsIgnoreCase(obj.get(4)) && obj.get(2).equalsIgnoreCase(obj.get(6)) && !obj.get(2).equals(" ")){
            drawGame();
            System.out.println("Player " + obj.get(2) + " Wins!");
            victor = 1;
        }
        else if(!obj.get(0).equalsIgnoreCase(" ") && !obj.get(1).equalsIgnoreCase(" ") && !obj.get(2).equalsIgnoreCase(" ") &&
                !obj.get(3).equalsIgnoreCase(" ") && !obj.get(4).equalsIgnoreCase(" ") && !obj.get(5).equalsIgnoreCase(" ") &&
                !obj.get(6).equalsIgnoreCase(" ") && !obj.get(7).equalsIgnoreCase(" ") && !obj.get(8).equalsIgnoreCase(" ")){

            drawGame();
            System.out.println("It's a draw!");
            victor = 1;
        }
    }

    public static void repeatProgram(){
        while(true) {
            System.out.println("Would you like to play again?");
            String repeatProgram = read.nextLine();

            while (true) {
                if (repeatProgram.equalsIgnoreCase("Yes")) {
                    System.out.println("Great, have fun!");
                    game();
                    break;
                } else if (repeatProgram.equalsIgnoreCase("No")) {
                    System.out.println("I hope you had fun! See you next time;");
                    System.exit(0);
                } else {
                    System.out.println("I'm sorry, I didn't get that, would you like to play again?");
                    repeatProgram = read.nextLine();
                }
            }
        }
    }
}