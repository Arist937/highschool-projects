package unit4;

import java.util.Scanner;

public class CPTAssignment {
    static String[] roomNames1;
    static String[] roomDescriptions1;
    static int[][] roomDirections1 = new int[15][4];

    static String[] roomNames2;
    static String[] roomDescriptions2;
    static int[][] roomDirections2 = new int[4][4];

    public static void main(String[] args) {
        boolean skeletonExamined = false;

        Scanner scanner = new Scanner(System.in);

        boolean[][] roomState = new boolean[15][4];
        // hasPotions, Alchemy ingredients
        roomState[4] = new boolean[]{false, false};
        // isSkeletonExamined, Skeleton's Journal
        roomState[5] = new boolean[]{false, false};
        // hasEaten plate of food
        roomState[8] = new boolean[]{false};
        // hasSwordUpgrade, hasArmorUpgrade, hasEnchantingKnowledge, hasAlchemyKnowledge
        roomState[11] = new boolean[]{false, false, false, false};
        // hasReceivedBlessing
        roomState[13] = new boolean[]{false};

        roomNames1 = new String[]{"Southwest Tower", "Foyer", "Enchanting Room", "Southeast Tower", "Alchemy Room",
                "Courtyard", "Central Tower", "Hallway A", "Dining Room", "Kitchen", "Northwest Tower", "Library",
                "Hallway B", "Chapel", "Northeast Tower"};
        roomDescriptions1 = new String[]
                {"You make your way into the southwestern tower. The Dining room lies north.",
                        "You find yourself in the Foyer of a castle. There is set of stairs that bring you to the second floor of the castle. In the north, there is a Hallway and to the east lies the enchanting room",
                        "You find yourself in the enchanting room. To the north, there is an alchemy room, to the south, there is the southeastern tower and to the west, there is the foyer of the castle",
                        "You find yourself in the southeastern tower of the castle. To the north, there is an enchanting room.",
                        "You make your way into the alchemy room. To the west lies a hallway and the enchanting room is south of here.",
                        "You make your way into the courtyard. To the east lies the central tower and you can return into the castle through the west. Near the entrance of the central tower, you notice a skeleton that seemed to have been crawling for life in its final moments.",
                        "You find yourself in the central tower. To the west, you can find courtyard",
                        "You make your way into a hallway. To the north, it leads into another hallway and to the west lies a dining room.",
                        "You make your way into a dining room. To the south lies the southwestern tower and the kitchen is to the north",
                        "You find yourself in a kitchen. To the south lies the dining room, the Northwestern Tower to the north and a hallway to the east",
                        "You make your way into the Northwestern Tower. To the south lies the kitchen.",
                        "You find yourself in a library. To the south is a hallway and the chapel is to the east",
                        "You make your way into a hallway. There lies a library to the north, a kitchen to the west and the alchemy room to the east",
                        "You are in the chapel. To the west is the library and to the north is the Northeastern Tower",
                        "You find yourself in the northeastern tower of the castle. To the south lies the chapel."};

        roomDirections1[0] = new int[]{8, -1, -1, -1};
        roomDirections1[1] = new int[]{7, 2, -1, -1};
        roomDirections1[2] = new int[]{4, -1, 3, 1};
        roomDirections1[3] = new int[]{2, -1, -1, -1};
        roomDirections1[4] = new int[]{-1, 12, 2, -1};
        roomDirections1[5] = new int[]{-1, 6, -1, 7};
        roomDirections1[6] = new int[]{-1, -1, -1, 5};
        roomDirections1[7] = new int[]{12, 5, 1, 8};
        roomDirections1[8] = new int[]{9, 7, 0, -1};
        roomDirections1[9] = new int[]{10, 12, 8, -1};
        roomDirections1[10] = new int[]{-1, -1, 9, -1};
        roomDirections1[11] = new int[]{-1, 13, 12, -1};
        roomDirections1[12] = new int[]{11, 4, 7, 9};
        roomDirections1[13] = new int[]{14, -1, -1, 11};
        roomDirections1[14] = new int[]{-1, -1, 13, -1};

        roomNames2 = new String[]{"Hallway D1", "Hallway D2", "Bedroom A", "Bedroom B"};
        roomDescriptions2 = new String[]{"You find yourself in a hallway, it extends to the east and a bedroom lies" +
                "south. There is a set of stairs on the western end.",
                "You find yourself in a hallway, extending west and a bedroom lies south. " +
                        "There is a set of stairs on the eastern end.",
                "You find yourself in a bedroom. To the north there is a hallway.",
                "You find yourself in a bedroom, to the north there is a hallway."};

        roomDirections2[0] = new int[]{-1, 1, 3, -1};
        roomDirections2[1] = new int[]{-1, -1, 2, 0};
        roomDirections2[2] = new int[]{1, -1, -1, -1};
        roomDirections2[3] = new int[]{0, -1, -1, -1};

        int currentFloor = 1;
        int currentRoom = 1;
        int nextRoom = -1;
        String userSelectedRoomStr;
        String userAction = "";
        boolean done = false;

        System.out.println("You find yourself in a castle, unaware of your past and without any memory of who you are. " +
                "Behind you lies the doors to leave, but they are locked, unable to be opened. " +
                "Perhaps the answers that you seek lie within the castle.\n");

        while (done == false) {
            if (currentFloor == 1) {
                System.out.println(roomDescriptions1[currentRoom]);
                userSelectedRoomStr = scanner.nextLine();

                if (userSelectedRoomStr.equalsIgnoreCase("n")) {
                    nextRoom = roomDirections1[currentRoom][0];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("e")) {
                    nextRoom = roomDirections1[currentRoom][1];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("s")) {
                    nextRoom = roomDirections1[currentRoom][2];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("w")) {
                    nextRoom = roomDirections1[currentRoom][3];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("stairs")) {
                    if (currentRoom == 1) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 0;
                    } else {
                        System.out.println("There are no stairs...");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("Examine")) {
                    if (currentRoom == 5) {
                        System.out.println("What would you like to examine?");
                        System.out.println("Skeleton");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("Skeleton")) {
                            skeletonExamined = true;
                            System.out.println("You examine the skeleton and find a journal next to it. Would you like to read it?");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("yes")) {
                                System.out.println("You take the journal from the skeleton. It reads: \n\nTo leave this castle, I have to defeat the knight in the central tower. I'm a pretty big guy, I can take on anyone no problem! Time to get out of this hellhole castle.");
                            }
                        }
                    } else {
                        System.out.println("There is nothing to examine");
                    }
                } else {
                    System.out.println("Invalid Direction");
                }
            } else if (currentFloor == 2) {
                System.out.println(roomDescriptions2[currentRoom]);
                userSelectedRoomStr = scanner.nextLine();

                if (userSelectedRoomStr.equalsIgnoreCase("n")) {
                    nextRoom = roomDirections2[currentRoom][0];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("e")) {
                    nextRoom = roomDirections2[currentRoom][1];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("s")) {
                    nextRoom = roomDirections2[currentRoom][2];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("w")) {
                    nextRoom = roomDirections2[currentRoom][3];

                    if (nextRoom != -1) {
                        currentRoom = nextRoom;
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("stairs")) {
                    if (currentRoom == 0) {
                        System.out.println("You go down the stairs");
                        currentFloor = 1;
                        currentRoom = 4;
                    } else if (currentRoom == 1) {
                        System.out.println("You go down the stairs");
                        currentFloor = 1;
                        currentRoom = 7;
                    } else {
                        System.out.println("There are no stairs...");
                    }
                } else {
                    System.out.println("Invalid Direction");
                }
            }
        }
    }
}