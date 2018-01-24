package unit3;

import java.util.Scanner;

public class ArraysTutorial {
    public static void main(String[] args) {
        bestStudent();
    }

    public static void examples() {
        int[] canCounts;
        canCounts = new int[5];

        canCounts[0] = 2;
        canCounts[1] = 0;
        canCounts[2] = 5;
        canCounts[3] = 9;
        canCounts[4] = 4;

        System.out.println("First class: " + canCounts[0] + ", Last class: " + canCounts[4]);

        String[] favoriteSongs;
        favoriteSongs = new String[5];

        favoriteSongs[0] = "Something just like this";
        favoriteSongs[1] = "Viva la Vida";
        favoriteSongs[2] = "Believer";
        favoriteSongs[3] = "Good life";
        favoriteSongs[4] = "See you again";

        System.out.println(favoriteSongs[2]);

        double[] menuItems;
        menuItems = new double[6];

        menuItems[0] = 9.99;
        menuItems[1] = 6.99;
        menuItems[2] = 2.99;
        menuItems[3] = 13.99;
        menuItems[4] = 15.99;
        menuItems[5] = 4.99;

        System.out.println(menuItems[4]);
    }

    public static void bestStudent() {
        int[] marks;
        marks = new int[10];

        String[] names;
        names = new String[10];

        Scanner read = new Scanner(System.in);
        int mark;
        String name;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a mark: ");
            mark = read.nextInt();
            marks[i] = mark;

            System.out.println("Enter a name: ");
            name = read.nextLine();
            names[i] = name;
        }

        int highestMark = 0;
        int highestMarkPosition = -1;

        for (int x = 0; x < 10; x++) {
            if (marks[x] > highestMark) {
                marks[x] = highestMark;
                highestMarkPosition = x;
            }
        }

        System.out.println("Best student: " + marks[highestMarkPosition] + ", " + names[highestMarkPosition]);
    }
}