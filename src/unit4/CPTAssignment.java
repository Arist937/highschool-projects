package unit4;

import java.util.Scanner;

public class CPTAssignment {
    static String[] roomNames1;
    static String[] roomDescriptions1;
    static int[][] roomDirections1 = new int[9][4];

    static String[] roomNames2;
    static String[] roomDescriptions2;
    static int[][] roomDirections2 = new int[4][4];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        roomNames1 = new String[]{"Starting Position", "Hallway A1", "Hallway A2", "Hallway B1", "Hallway B2", "Kitchen",
                "Dining Room", "Hallway C2", "Hallway C1"};
        roomDescriptions1 = new String[]{"You find yourself in the middle of a hallway. It leads east and west",
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

        roomDirections1[0] = new int[]{-1, 1, -1, 2};
        roomDirections1[1] = new int[]{6, 8, -1, 2};
        roomDirections1[2] = new int[]{-1, 1, -1, 3};
        roomDirections1[3] = new int[]{4, 2, -1, -1};
        roomDirections1[4] = new int[]{-1, 5, 3, -1};
        roomDirections1[5] = new int[]{-1, 6, -1, 4};
        roomDirections1[6] = new int[]{-1, 7, 1, 5};
        roomDirections1[7] = new int[]{-1, -1, 8, 6};
        roomDirections1[8] = new int[]{7, -1, -1, 1};

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
        int currentRoom = 0;
        int nextRoom = -1;
        String userSelectedRoomStr;
        boolean done = false;

        while(done == false) {
            if(currentFloor == 1) {
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
                    if (currentRoom == 4) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 0;
                    }
                    else if(currentRoom == 7) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 1;
                    }
                    else {
                        System.out.println("There are no stairs...");
                    }
                } else {
                    System.out.println("Invalid Direction");
                }
            } else if (currentFloor == 2){
                System.out.println(roomDescriptions2[currentRoom]);
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
                    if (currentRoom == 4 || currentRoom == 7) {
                        currentFloor = 2;
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