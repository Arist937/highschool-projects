package unit4;

/**
 * A program ArrayAssignment.java that contains and tests four methods unluckyOne, after4, closeBy2 and diagonal
 * @author: A. Xu
 */

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] testArrayOne = {1, 3, 4, 5, 6, 2, 3};
        System.out.println(unluckyOne(testArrayOne));

        int[] testArrayTwo = {2, 4, 5, 2};
        for (int i = 0; i < after4(testArrayTwo).length; i++){
            System.out.print(after4(testArrayTwo)[i] + ", ");
        }

        int[] testArrayThree = {1, 2, 3};
        int[] testArrayFour = {2, 3, 10};
        System.out.println(closeBy2(testArrayThree, testArrayFour));

    }

    public static boolean unluckyOne(int[] numArray) {
        // declare boolean isUnluckyOne
        boolean isUnluckyOne;

        // if the first 2 values of an array are 1 followed by a 3, set isUnluckyOne to true
        if(numArray[0] == 1 && numArray[1] == 3) {
            isUnluckyOne = true;

        }
        // if the last two values of an array are 1 followed by a 3, set isUnluckyOne to true
        else if (numArray[numArray.length - 2] == 1 && numArray[numArray.length - 1] == 3){
            isUnluckyOne = true;
        }
        // if other two statements are not met, set isUnluckyOne to false
        else {
            isUnluckyOne = false;
        }

        return isUnluckyOne;
    }

    public static int[] after4(int[] numArray){
        // declare variable last4Location
        int last4Location = -1;

        // loop for the length of numArray
        for(int i = 0; i < numArray.length; i++){
            // if numArray at index i is equal to 4, set i to last4Location
            if(numArray[i] == 4){
                last4Location = i;
            }
        }

        // create new array after4Array with the size of numArray minus last4Location plus 1
        int[] after4Array = new int[numArray.length - (last4Location + 1)];
        // declare counter and set it to 0
        int counter = 0;

        // loop starting after last4Location to the end of the array
        for (int x = last4Location + 1; x < numArray.length; x++) {
            // set after4Array to the values after 4
            after4Array[counter] = numArray[x];
            // increment counter to go to the next index in after4Array
            counter++;
        }

        return after4Array;
    }

    public static int closeBy2(int[] nums1, int[] nums2){
        // declare integer variable numOfCloseBy
        int numOfCloseBy = 0;

        // loop for the length of array nums1
        for(int i = 0; i < nums1.length; i++){
            // if nums1 and nums2 at index i differ by 2 or 1, increment numOfCloseBy
            if(nums1[i] - nums2[i] <= 2 && nums1[i] - nums2[i] >= -2){
                numOfCloseBy++;
            }
        }

        return numOfCloseBy;
    }

    public static int[][] diagonal(int n){
        // create new 2d array to store square with diagonal
        int[][] diagonalGenerator = new int[n][n];

        // loop for the length of n
        for (int i = 0; i < n; i++) {
            // loop for the length of n
            for (int x = 0; x < n; x++) {
                // put a diagonal of 1s starting from the top right
                if(x == (n - (i + 1))){
                    diagonalGenerator[i][x] = 1;
                }
                // fill everything else with zeroes
                else {
                    diagonalGenerator[i][x] = 0;
                }
            }
        }

        return diagonalGenerator;
    }
}