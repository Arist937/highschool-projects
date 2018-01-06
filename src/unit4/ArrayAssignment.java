package unit4;

/**
 * A program ArrayAssignment.java that contains and tests four methods unluckyOne, after4, closeBy2 and diagonal
 * @author: A. Xu
 */

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] testArrayOne = {1, 3, 4, 5, 6, 2, 3};
        System.out.println(unluckyOne(testArrayOne));
    }

    public static boolean unluckyOne(int[] numArray) {
        // declare boolean isUnluckyOne
        boolean isUnluckyOne = false;

        // if the first 2 values of an array are 1 followed by a 3, set isUnluckyOne to true
        if(numArray[0] == 1 && numArray[1] == 3) {
            isUnluckyOne = true;

        }
        // if the last two values of an array are 1 followed by a 3, set isUnluckyOne to true
        else if (numArray[numArray.length - 2] == 1 && numArray[numArray.length - 1] == 3){
            isUnluckyOne = true;
        }

        return isUnluckyOne;
    }
}