package unit4;

/**
 * A program ArrayAssignment.java that contains and tests four methods unluckyOne, after4, closeBy2 and diagonal
 * @author: A. Xu
 */

public class ArrayAssignment {
    public static void main(String[] args){

        System.out.println("unluckyOne Tests:");

        int[] testArrayOne = {1, 3, 4, 5, 6, 2, 3};
        System.out.println(unluckyOne(testArrayOne));

        int[] testArrayTwo = {103, 3, 4, 5, 6, 1, 4};
        System.out.println(unluckyOne(testArrayTwo));

        int[] testArrayThree = {2, 3, 4, 1, 3, 2, 5, 7};
        System.out.println(unluckyOne(testArrayThree));

        System.out.println("\nafter4 Tests:");

        int[] testArrayFour = {2, 4, 5, 2};
        for (int i = 0; i < after4(testArrayFour).length; i++){
            System.out.print(after4(testArrayFour)[i] + ", ");
        }
        System.out.println();

        int[] testArrayFive = {4, 4, 1, 2, 3};
        for (int i = 0; i < after4(testArrayFive).length; i++){
            System.out.print(after4(testArrayFive)[i] + ", ");
        }
        System.out.println();

        int[] testArraySix = {1, 2, 3, 5, 6, 7, 8};
        for (int i = 0; i < after4(testArraySix).length; i++){
            System.out.print(after4(testArraySix)[i] + ", ");
        }
        System.out.println();

        System.out.println("\ncloseBy2 Tests:");

        int[] testArraySeven = {1, 2, 3};
        int[] testArrayEight = {2, 3, 10};
        System.out.println(closeBy2(testArraySeven, testArrayEight));

        int[] testArrayNine = {1, 2, 3, 9};
        int[] testArrayTen = {10, 30, 10, 50};
        System.out.println(closeBy2(testArrayNine, testArrayTen));

        int[] testArrayEleven = {1, 2, 3};
        int[] testArrayTwelve = {1, 2, 4};
        System.out.println(closeBy2(testArrayEleven, testArrayTwelve));

        System.out.println("\ndiagonal tests:");

        for (int i = 0; i < diagonal(5).length; i++) {
            for (int j = 0; j < diagonal(5)[i].length; j++) {
                System.out.print(diagonal(5)[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < diagonal(10).length; i++) {
            for (int j = 0; j < diagonal(10)[i].length; j++) {
                System.out.print(diagonal(10)[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < diagonal(7).length; i++) {
            for (int j = 0; j < diagonal(7)[i].length; j++) {
                System.out.print(diagonal(7)[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * A method unluckyOne that tries to find a 1 followed by a 3 within an array at the start and the end, displaying
     * true or false depending on whether the method found one or not
     *
     * @param numArray Array that the method looks in
     * @return isUnluckyOne boolean that returns whether the method found an unlucky one or not
     */
    public static boolean unluckyOne(int[] numArray){
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

    /**
     * A method after4 that examines an array and returns all the values within the array after the last 4
     *
     * @param numArray the Array that the method examines
     * @return after4Array the final array with the values that show up after 4
     */
    public static int[] after4(int[] numArray){
        // declare last4Location
        int last4Location = -1;

        // loop for the length of numArray
        for(int i = 0; i < numArray.length; i++){
            // if numArray at index i is equal to 4, set i to last4Location
            if(numArray[i] == 4){
                last4Location = i;
            }
        }

        // if the array has no indexes that contain 4 output empty array
        if(last4Location == -1){
            int[] emptyArray = new int[0];
            return emptyArray;
        } else {
            // create new array after4Array with the size of numArray minus last4Location plus 1
            int[] after4Array = new int[numArray.length - (last4Location + 1)];
            // declare counter and set it to 0
            int counter = 0;

            // loop starting after last4Location to the end of the array
            for (int x = last4Location + 1; x < numArray.length; x++) {
                // set after4Array to the values after 4
                after4Array[counter] = numArray[x];
                // increment counter to
                counter++;
            }

            return after4Array;
        }
    }


    /**
     * A method closeBy2 that examines two arrays and finds the number of times the two arrays at the same index
     * differ by 1 or 2
     *
     * @param nums1 first array of numbers
     * @param nums2 secpmd array of numbers
     * @return
     */
    public static int closeBy2(int[] nums1, int[] nums2){
        // declare integer variable numOfCloseBy
        int numOfCloseBy = 0;

        // loop for the length of array nums1
        for(int i = 0; i < nums1.length; i++){
            // if nums1 and nums2 at index i differ by 2 or 1, increment numOfCloseBy
            if(nums1[i] - nums2[i] != 0 && (nums1[i] - nums2[i] <= 2 && nums1[i] - nums2[i] >= -2)){
                numOfCloseBy++;
            }
        }

        return numOfCloseBy;
    }

    /**
     * A method diagonalGenerator that takes in a size n and forms a square with a diagonal from the top right
     * to the bottom left with 1's
     *
     * @param n side length of the square that the method creates
     * @return diagonalGenerator the 2d Array that holds the square with a diagonal
     */
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
                // put 0s above the diagonal of 1s
                else if (x < (n - (i + 1))){
                    diagonalGenerator[i][x] = 0;
                }
                // put 2s below the diagonal of 1s
                else if (x > (n - (i + 1))){
                    diagonalGenerator[i][x] = 2;
                }
            }
        }

        return diagonalGenerator;
    }

}