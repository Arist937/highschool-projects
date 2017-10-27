package unit2;
import codehs.*;


public class PurpleRain extends ConsoleProgram {

    public static String purpleRainLyrics;

    public void run(){
        lyrics();

        charCount();

        setVowelCount();
    }

    public static void lyrics(){
        System.out.println("Lyrics of Purple Rain:");

        purpleRainLyrics = "I never meant to cause you any sorrow\n" +
            "I never meant to cause you any pain\n" +
            "I only wanted to one time to see you laughing\n" +
            "I only wanted to see you\n" +
            "Laughing in the purple rain\n" +
            "\n" +
            "Purple rain, purple rain\n" +
            "Purple rain, purple rain\n" +
            "Purple rain, purple rain\n" +
            "I only wanted to see you\n" +
            "Bathing in the purple rain\n" +
            "\n" +
            "I never wanted to be your weekend lover\n" +
            "I only wanted to be some kind of friend\n" +
            "Baby, I could never steal you from another\n" +
            "It's such a shame our friendship had to end\n" +
            "\n" +
            "Purple rain, purple rain\n" +
            "Purple rain, purple rain\n" +
            "Purple rain, purple rain\n" +
            "I only wanted to see you\n" +
            "Underneath the purple rain\n" +
            "\n" +
            "Honey, I know, I know\n" +
            "I know times are changing\n" +
            "It's time we all reach out\n" +
            "For something new, that means you too\n" +
            "\n" +
            "You say you want a leader\n" +
            "But you can't seem to make up your mind\n" +
            "I think you better close it\n" +
            "And let me guide you to the purple rain\n" +
            "\n" +
            "Purple rain, purple rain\n" +
            "Purple rain, purple rain\n" +
            "If you know what I'm singing about up here\n" +
            "C'mon, raise your hand\n" +
            "\n" +
            "Purple rain, purple rain\n" +
            "I only want to see you\n" +
            "Only want to see you\n" +
            "In the purple rain\n" +
            "\n";

        System.out.println(purpleRainLyrics);
    }

    public static void charCount(){
        purpleRainLyrics = purpleRainLyrics.replaceAll("\n", "");

        System.out.println("There are " + purpleRainLyrics.length() + " characters in purple rain");
    }

    public static void setVowelCount(){
        int vowelCount = 0;

        for(int i = 0; i < purpleRainLyrics.length(); i++) {
            if(purpleRainLyrics.toLowerCase().charAt(i) == 'a') {
                vowelCount++;
            } else if (purpleRainLyrics.toLowerCase().charAt(i) == 'e'){
                vowelCount++;
            } else if (purpleRainLyrics.toLowerCase().charAt(i) == 'i'){
                vowelCount++;
            } else if (purpleRainLyrics.toLowerCase().charAt(i) == 'o'){
                vowelCount++;
            } else if (purpleRainLyrics.toLowerCase().charAt(i) == 'u'){
                vowelCount++;
            }
        }

        System.out.println("There are " + vowelCount + " vowels in Purple Rain");
    }

}