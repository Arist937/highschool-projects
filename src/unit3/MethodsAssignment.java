package unit3;

public class MethodsAssignment {
    public static void main(String[] args) {
        lcmTest();
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
        System.out.println(lcm(14396, 1923));
        System.out.println(lcm(306, 21809));
        System.out.println(lcm(11063, 17570));
        System.out.println(lcm(65, 10));
        System.out.println(lcm(192, 245));
    }

    public static String censorPlus(String phrase, String word){
        
    }
}