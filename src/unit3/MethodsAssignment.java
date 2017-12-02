package unit3;

public class MethodsAssignment {
    public static void main(String[] args) {
        System.out.println(lcm(60, 30));
    }

    public static int lcm(int val1, int val2) {
        // Declare variable lcmVal to store lcm
        int lcmVal = 0;

        while (val1 % val2 != 0){
            lcmVal += val1;
        }

        return lcmVal;
    }
}