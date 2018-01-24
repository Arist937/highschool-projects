package unit3;

/**
 * A program MethodAssignment.java that contains and tests two methods lcm and censorPlus
 *
 * @author: A. Xu
 */

public class MethodsAssignment {
    public static void main(String[] args) {
        lcmTest();
        censorPlusTest();
    }

    /**
     * A method lcm that finds the lcm of two numbers
     *
     * @param val1 the first value
     * @param val2 the second value
     * @return the lcm of the two values
     */
    public static int lcm(int val1, int val2) {
        // if values are negative, error
        if (val1 < 0 || val2 < 0) {
            throw new IllegalArgumentException("Numbers need to be positive!");
        }

        // Declare variable lcmVal to store lcm
        int lcmVal = val1;

        // while lcmVal is not divisible by val2, loop
        while (lcmVal % val2 != 0) {
            // keep adding lcmVal by val1 until divisible by val2
            lcmVal += val1;
        }

        // return lcm
        return lcmVal;
    }

    /**
     * A method lcmTest that tests the method lcm
     */
    public static void lcmTest() {
        System.out.println("lcm Test");

        System.out.println("\nTest 1");
        System.out.println("lcm(14396, 1923)");
        System.out.println("Expected Result: 27683508");
        System.out.println("Actual Result: " + lcm(14396, 1923));

        System.out.println("\nTest 2");
        System.out.println("lcm(306, 21809)");
        System.out.println("Expected Result: 6673554");
        System.out.println("Actual Result: " + lcm(306, 21809));

        System.out.println("\nTest 3");
        System.out.println("lcm(11063, 17570)");
        System.out.println("Expected Result: 194376910");
        System.out.println("Actual Result: " + lcm(11063, 17570));

        System.out.println("\nTest 4");
        System.out.println("lcm(65, 10)");
        System.out.println("Expected Result: 130");
        System.out.println("Actual Result: " + lcm(65, 10));

        System.out.println("\nTest 5");
        System.out.println("lcm(192, 245)");
        System.out.println("Expected Result: 47040");
        System.out.println("Actual Result: " + lcm(192, 245));

        System.out.println("\nTest 6");
        System.out.println("lcm(192, -245)");
        System.out.println("Expected Result: Numbers need to be positive!");
        try {
            System.out.println("Actual Result: " + lcm(192, -245));
        } catch (IllegalArgumentException lcmError) {
            System.out.println("Actual Result: " + lcmError.getMessage());
        }

        System.out.println("\nTest 7");
        System.out.println("lcm(0, 245)");
        System.out.println("Expected Result: 0");
        System.out.println("Actual Result: " + lcm(0, 245));

        System.out.println("\nTest 8");
        System.out.println("lcm(-51, 309)");
        System.out.println("Expected Result: Numbers need to be positive!");
        try {
            System.out.println("Actual Result: " + lcm(-51, 309));
        } catch (IllegalArgumentException lcmError) {
            System.out.println("Actual Result: " + lcmError.getMessage());
        }
    }

    /**
     * A method censorPlus that censors all characters with + unless specified by the word parameter
     *
     * @param phrase given phrase to censor
     * @param word   word to not censor within phrase
     * @return word that has been censored
     */
    public static String censorPlus(String phrase, String word) {
        // if string phrase is empty, error
        if (phrase.length() == 0) {
            throw new IllegalArgumentException("String phrase cannot be empty");
        }

        // Stores final censored string
        String censoredWord = "";
        // Finds index of word within the phrase
        int wordLocation = phrase.indexOf(word);

        // run this code
        do {
            // For loop will be used to scroll through all characters in phrase
            for (int i = 0; i < phrase.length(); i++) {
                // if location of i is same as wordLocation, run
                if (i == wordLocation) {
                    // add word to censored word
                    censoredWord = censoredWord + word;

                    // move i forward by length of word
                    i += word.length() - 1;

                    // get new wordLocation after the existing one
                    wordLocation = phrase.indexOf(word, wordLocation + 1);

                } else {
                    // add a plus to censoredWord
                    censoredWord = censoredWord + '+';
                }
            }
            // keep running code until wordLocation becomes -1
        } while (wordLocation != -1);

        // return final censored word
        return censoredWord;
    }

    /**
     * A method censorPlusTest that tests the method censorPlus
     */
    public static void censorPlusTest() {
        System.out.println("\ncensorPlus Test");

        System.out.println("\nTest 1");
        System.out.println("censorPlus(\"12xy34\", \"xy\")");
        System.out.println("Expected Result: ++xy++");
        System.out.println("Actual Result: " + censorPlus("12xy34", "xy"));

        System.out.println("\nTest 2");
        System.out.println("censorPlus(\"\", \"1\")");
        System.out.println("Expected Result: String phrase cannot be empty");
        try {
            System.out.println("Actual Result: " + censorPlus("", "1"));
        } catch (IllegalArgumentException censorError) {

            System.out.println("Actual Result: " + censorError.getMessage());
        }

        System.out.println("\nTest 3");
        System.out.println("\"12xy34xyabcxy\", \"xy\"");
        System.out.println("Expected Result: ++xy++xy+++xy");
        System.out.println("Actual Result: " + censorPlus("12xy34xyabcxy", "xy"));

        System.out.println("\nTest 4");
        System.out.println("censorPlus(\"1234f123rwqrvwqfverwqq5wte\", \"q\"");
        System.out.println("Expected Result: ++++++++++q+++q+++++qq++++");
        System.out.println("Actual Result: " + censorPlus("1234f123rwqrvwqfverwqq5wte", "q"));

        System.out.println("\nTest 5");
        System.out.println("censorPlus(\"1234abchello worldpoi09@#$#$\", \"hello world\"");
        System.out.println("Expected Result: +++++++hello world++++++++++");
        System.out.println("Actual Result: " + censorPlus("1234abchello worldpoi09@#$#$", "hello world"));

        System.out.println("\nTest 6");
        System.out.println("censorPlus(\"adsfsadfasdfasdf\", \"@\")");
        System.out.println("Expected Result: ++++++++++++++++");
        System.out.println("Actual Result: " + censorPlus("adsfsadfasdfasdf", "@"));

        System.out.println("\nTest 7");
        System.out.println("censorPlus(\"aaaaaaaaaaaaaaa\", \"a\"");
        System.out.println("Expected Result: aaaaaaaaaaaaaaa");
        System.out.println("Actual Result: " + censorPlus("aaaaaaaaaaaaaaa", "a"));

        System.out.println("\nTest 8");
        System.out.println("censorPlus(\"\", \"hello\")");
        System.out.println("Expected Result: String phrase cannot be empty");
        try {
            System.out.println("Actual Result: " + censorPlus("", "hello"));
        } catch (IllegalArgumentException censorError) {

            System.out.println("Actual Result: " + censorError.getMessage());
        }
    }
}