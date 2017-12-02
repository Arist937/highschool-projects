package unit3;

public class MethodsAssignment {
    public static void main(String[] args) {
        lcmTest();
        System.out.println(censorPlus("12xy34", "xy"));
    }

    public static int lcm(int val1, int val2) {
        // Declare variable lcmVal to store lcm
        int lcmVal = val1;

        while (lcmVal % val2 != 0) {
            lcmVal += val1;
        }

        return lcmVal;
    }


    public static void lcmTest() {
        System.out.println(lcm(14396, 1923));
        System.out.println(lcm(306, 21809));
        System.out.println(lcm(11063, 17570));
        System.out.println(lcm(65, 10));
        System.out.println(lcm(192, 245));
    }

    public static String censorPlus(String phrase, String word) {
        // Stores final censored string
        String censoredWord = "";
        // Finds index of word within the phrase
        int wordLocation = phrase.indexOf(word);

        // If wordLocation is -1, word does not exist within the phrase
        while (wordLocation != -1){
            // For loop will be used to scroll through all characters in phrase
            for(int i = 0; i < phrase.length(); i++){
                if (i != wordLocation){
                    censoredWord = censoredWord + '+';
                } else {
                    censoredWord = censoredWord + word;

                    // Increases i by the length of word to skip parts of phrase that include the word
                    i += word.length() - 1;

                    // Try to find another occurrence of word
                    wordLocation = phrase.indexOf(word, wordLocation + 1);
                }
            }
        }
        return censoredWord;
    }
}