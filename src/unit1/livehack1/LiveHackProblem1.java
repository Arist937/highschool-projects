package unit1.livehack1;
import codehs.*;

/**
 * A program LiveHackProblem1.java that lets you enter the length of side a of a regular,
 * tetrahedron and then calculates and prints the face area.
 * @author: A. Xu
 */

public class LiveHackProblem1 extends ConsoleProgram {

    public void run() {
        // Introduce Program
        System.out.println("Hello. This program lets you enter the length of side a of a rectangular" +
                " tetrahedron and then finds its surface area.");

        // CREATE variables lengthSideA and faceArea
        double lengthSideA;
        double faceArea;

        // GET value of length of side a from user
        lengthSideA = readDouble("Enter the length of side a: ");

        // COMPUTE face area using the formula faceArea = (sqrt3/4)*lengthSideA**2
        faceArea = (Math.sqrt(3) / 4) * Math.pow(lengthSideA, 2);

        // PRINT faceArea
        System.out.println("The area of a rectangular tetrahedron with side length " + lengthSideA + " is " + faceArea);
    }
}