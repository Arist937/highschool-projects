package unit4;

public class RelatedArrays {
    public static void main(String[] args) {
        String[] players = {"Joe Hart", "Ronaldo", "Messi", "Aguero", "Pele", "Rooney", "Pogba", "Fabregas"};
        int[] scores = {-99, 1, 99, 100, -100, -2, 5, 30};

        for (int i = 0; i < 8; i++) {
            System.out.println(players[i] + ", " + scores[i]);
        }

        int highestScore = scores[0];
        int highestScorePosition = 0;

        for (int x = 0; x < 8; x++) {
            if (highestScore < scores[x]) {
                highestScore = scores[x];
                highestScorePosition = x;
            }
        }

        System.out.println("Highest score player is: " + players[highestScorePosition] + " at " + scores[highestScorePosition]);
    }
}
