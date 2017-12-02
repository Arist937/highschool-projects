package unit3;

public class MethodsAssignment {
    public static void main(String[] args) {
    }

    public static int lcm(int val1, int val2) {
        // Declare variable lcmVal to store lcm
        int lcmVal = val1;

        while (lcmVal % val2 != 0){
            lcmVal += val1;
        }

        return lcmVal;
    }


    public static void lcmTest(){
    }
}