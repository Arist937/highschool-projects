package unit3;

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
     *
     */
    public static int lcm(int val1, int val2) {
        // Declare variable lcmVal to store lcm
        int lcmVal = val1;

        while (lcmVal % val2 != 0) {
            lcmVal += val1;
        }

        return lcmVal;
    }


    public static void lcmTest() {
        System.out.println("lcm Test");

        System.out.println("Test 1");
        System.out.println("lcm(14396, 1923)");
        System.out.println("Expected Result: 27683508");
        System.out.println("Actual Result: " + lcm(14396, 1923));

        System.out.println("Test 2");
        System.out.println("lcm(306, 21809)");
        System.out.println("Expected Result: 6673554");
        System.out.println("Actual Result: " + lcm(306, 21809));

        System.out.println("Test 3");
        System.out.println("lcm(11063, 17570)");
        System.out.println("Expected Result: 194376910");
        System.out.println("Actual Result: " + lcm(11063, 17570));

        System.out.println("Test 4");
        System.out.println("lcm(65, 10)");
        System.out.println("Expected Result: 130");
        System.out.println("Actual Result: " + lcm(65, 10));

        System.out.println("Test 5");
        System.out.println("lcm(192, 245)");
        System.out.println("Expected Result: ");
        System.out.println("Actual Result: 47040" + lcm(192, 245));
    }

    /**
     * A method censorPlus that censors all characters with + unless specified by the word parameter
     *
     * @param phrase
     * @param word
     * @return word that has been censored
     *
     */
    public static String censorPlus(String phrase, String word) {
        // Stores final censored string
        String censoredWord = "";
        // Finds index of word within the phrase
        int wordLocation = phrase.indexOf(word);

        // If wordLocation is -1, word does not exist within the phrase
        do {
            // For loop will be used to scroll through all characters in phrase
            for(int i = 0; i < phrase.length(); i++){
                if (i == wordLocation) {
                    censoredWord = censoredWord + word;

                    i += word.length() - 1;

                    wordLocation = phrase.indexOf(word, wordLocation + 1);

                } else {
                    censoredWord = censoredWord + '+';
                }
            }
        } while (wordLocation != -1);

        return censoredWord;
    }

    public static void censorPlusTest(){
        System.out.println("\ncensorPlus Test");

        System.out.println("Test 1");
        System.out.println("censorPlus(\"12xy34\", \"xy\")");
        System.out.println("Expected Result: ++xy++");
        System.out.println("Actual Result: " + censorPlus("12xy34", "xy"));

        System.out.println("Test 2");
        System.out.println("censorPlus(\"12xy34\", \"1\"");
        System.out.println("Expected Result: 1+++++");
        System.out.println("Actual Result: " + censorPlus("12xy34", "1"));

        System.out.println("Test 3");
        System.out.println("\"12xy34xyabcxy\", \"xy\"");
        System.out.println("Expected Result: ++xy++xy+++xy");
        System.out.println("Actual Result: " + censorPlus("12xy34xyabcxy", "xy"));

        System.out.println("Test 4");
        System.out.println("censorPlus(\"1234f123rwqrvwqfverwqq5wte\", \"q\"");
        System.out.println("Expected Result: ++++++++++q+++q+++++qq++++");
        System.out.println("Actual Result: " + censorPlus("1234f123rwqrvwqfverwqq5wte", "q"));

        System.out.println("Test 5");
        System.out.println("censorPlus(\"1234abchello worldpoi09@#$#$\", \"hello world\"");
        System.out.println("Expected Result: +++++++hello world++++++++++");
        System.out.println("Actual Result: 47040" + censorPlus("1234abchello worldpoi09@#$#$", "hello world"));

        System.out.println("Test 6");
        System.out.println("censorPlus(\"adsfsadfasdfasdf\", \"@\")");
        System.out.println("Expected Result: ++++++++++++++++");
        System.out.println("Actual Result: 47040" + censorPlus("adsfsadfasdfasdf", "@"));

        System.out.println("Test 7");
        System.out.println("censorPlus(\"aaaaaaaaaaaaaaa\", \"a\"");
        System.out.println("Expected Result: aaaaaaaaaaaaaaa");
        System.out.println("Actual Result: 47040" + censorPlus("aaaaaaaaaaaaaaa", "a"));
    }
}