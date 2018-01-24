package unit4;

public class CPTAssignment {
    static String[] roomNames;
    static String[] roomDescriptions;
    static int[][] roomDirections;

    public static void main(String[] args){
        roomNames = new String[]{"Starting Position", "Hallway A1", "Hallway A2", "Hallway B1", "Hallway B2", "Kitchen",
                "Dining Room", "Hallway C2", "Hallway C1"};
        roomDescriptions = new String[]{"You find yourself in the middle of a hallway. It leads east and west",
                "You find yourself on the right side of your starting hallway. To the " +
                        "North, there is a dining room and the east leads to another hallway",
                "You find yourself on the left side of your starting hallway. The west " +
                        "leads to another hallway",
                "You find yourself in another hallway with the east leading back and the " +
                        "North leads further down the hallway",
                "You find yourself further down the hallway with a kitchen to the east" +
                        "and a set of stairs",
                "You are in a kitchen, with a dining room to the east and a hallway to " +
                        "the west",
                "You find yourself in a dining room with a hallway to the south and a kitchen " +
                        "to the west",
                "You find yourself in another hallway. It extends south.",
                "You find yourself in a hallway that extends north"};
    }
}