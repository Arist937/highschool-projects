package unit4;

import java.util.Scanner;

public class CPTAssignment {
    static String[] roomNames1;
    static String[] roomDescriptions1;
    static int[][] roomDirections1 = new int[15][4];

    static String[] roomNames2;
    static String[] roomDescriptions2;
    static int[][] roomDirections2 = new int[4][4];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int booksRead = 0;

        boolean[][] roomState1 = new boolean[15][4];
        // hasPotions, Alchemy ingredients
        roomState1[4] = new boolean[]{false, false};
        // isSkeletonExamined, Skeleton's Journal
        roomState1[5] = new boolean[]{false, false};
        // hasEaten plate of food
        roomState1[8] = new boolean[]{false};
        // hasSwordUpgrade, hasArmorUpgrade, hasEnchantingKnowledge, hasAlchemyKnowledge
        roomState1[11] = new boolean[]{false, false, false, false};
        // hasReceivedBlessing
        roomState1[13] = new boolean[]{false};

        boolean[][] roomState2 = new boolean[4][4];
        //hasShield, hasAttemptedRiddle
        roomState2[0] = new boolean[]{false, false};
        //hasSword, hasAttemptedRiddle
        roomState2[1] = new boolean[]{false, false};
        //hasArmor, hasAttemptedRiddle
        roomState2[2] = new boolean[]{false, false};
        //hasHelmet, hasAttemptedRiddle
        roomState2[3] = new boolean[]{false, false};

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

        if (roomState1[5][0] == true) {
            roomDescriptions1[6] = "You make your way into the courtyard. To the east lies the central tower and you can return into the castle through the west. Near the entrance of the central tower, there remains the skeleton that you examined";
        }

        roomDirections1[0] = new int[]{8, -1, -1, -1};
        roomDirections1[1] = new int[]{7, 2, -1, -1};
        roomDirections1[2] = new int[]{4, -1, 3, 1};
        roomDirections1[3] = new int[]{2, -1, -1, -1};
        roomDirections1[4] = new int[]{-1, -1, 2, 12};
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
        roomDescriptions2 = new String[]
                {"You are on the second floor of the southwestern tower. You see a ghost in front of you.",
                        "You are on the second floor of the southeastern tower",
                        "You are on the second floor of the northeastern tower",
                        "You are on the second floor of the northwestern tower"};

        roomDirections2[0] = new int[]{-1, -1, -1, -1};
        roomDirections2[1] = new int[]{-1, -1, -1, -1};
        roomDirections2[2] = new int[]{-1, -1, -1, -1};
        roomDirections2[3] = new int[]{-1, -1, -1, -1};

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
                    if (currentRoom == 0) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 0;
                    } else if (currentRoom == 3) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 1;
                    } else if (currentRoom == 10) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 3;
                    } else if (currentRoom == 14) {
                        System.out.println("You go up the stairs");
                        currentFloor = 2;
                        currentRoom = 2;
                    } else {
                        System.out.println("There are no stairs...");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("Examine")) {
                    if (currentRoom == 5) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("Skeleton   Flowers   Grass   Sky");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("Skeleton")) {
                                roomState1[5][0] = true;
                                System.out.println("You examine the skeleton and find a journal next to it. Would you like to read it and take it?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    roomState1[5][1] = true;
                                    System.out.println("You take the journal from the skeleton. It reads: \n\nTo leave this castle, I have to defeat the knight in the central tower. I'm a pretty big guy, I can take on anyone no problem! Time to get out of this hellhole castle.");
                                }
                            } else if (userAction.equalsIgnoreCase("Flowers")) {
                                System.out.println("Beautiful Flowers");
                            } else if (userAction.equalsIgnoreCase("Grass")) {
                                System.out.println("Green Grass");
                            } else if (userAction.equalsIgnoreCase("Sky")) {
                                System.out.println("You see the beautiful blue sky.");
                            }
                        }
                    } else if (currentRoom == 4) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("Alchemy Table   Alchemy Ingredients");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("Alchemy Table")) {
                                System.out.println("An Alchemy Table, would you like to craft a potion?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    if (roomState1[4][1] == true) {
                                        if (roomState1[11][3] == true) {
                                            System.out.println("You craft a health potion and a strength potion");
                                            roomState1[4][0] = true;
                                        } else {
                                            System.out.println("You don't have the knowledge to craft any potions. Perhaps you should try the library");
                                        }
                                    } else {
                                        System.out.println("You don't have any ingredients to work with");
                                    }
                                } else {
                                    System.out.println("You leave the alchemy table alone");
                                }
                            } else if (userAction.equalsIgnoreCase("Alchemy Ingredients")) {
                                System.out.println("A bunch of alchemy ingredients. Would you like to take them?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    roomState1[4][1] = true;
                                    System.out.println("You take the alchemy ingredients");
                                } else {
                                    System.out.println("You leave the alchemy ingredients alone");
                                }
                            }
                        }
                    } else if (currentRoom == 11) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            if (booksRead >= 3) {
                                System.out.println("You've read too many books, your head is starting to hurt.");
                                break;
                            }

                            System.out.println("What would you like to examine?");
                            System.out.println("Twin Secrets   The Book of Fate   A Game at Dinner   The Posting of the Hunt   Touching the Sky   Fire and Darkness   Hallgerd's Tale   The Betrayed");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("A Game at Dinner")) {
                                System.out.println("You gain the knowledge of alchemy");
                                roomState1[11][3] = true;
                                booksRead++;
                            } else if (userAction.equalsIgnoreCase("Fire and darkness")) {
                                System.out.println("You feel that you have become better with swords");
                                roomState1[11][0] = true;
                                booksRead++;
                            } else if (userAction.equalsIgnoreCase("Hallgerd's Tale")) {
                                System.out.println("The book teaches you how to efficiently use armor");
                                roomState1[11][1] = true;
                                booksRead++;
                            } else if (userAction.equalsIgnoreCase("Twin Secrets")) {
                                System.out.println("You have gained the knowledge of Enchantment");
                                roomState1[11][2] = true;
                                booksRead++;
                            } else {
                                System.out.println("Reading the book was a waste of time. You fail to learn anything of importance.");
                                booksRead++;
                            }
                        }
                    } else if (currentRoom == 13) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("The Altar");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("the altar")) {
                                System.out.println("An altar to God, made of Oak. Would you like to pray?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    System.out.println("You pray at the altar and receive a blessing. You feel invigorated and stronger");
                                    roomState1[13][0] = true;
                                } else {
                                    System.out.println("You don't pray.");
                                }
                            }
                        }
                    } else if (currentRoom == 2) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("Enchanting Table");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("Enchanting Table")) {
                                System.out.println("An enchanting table, what would you like to enchant?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    System.out.println("You pray at the altar and receive a blessing. You feel invigorated and stronger");
                                    roomState1[13][0] = true;
                                } else {
                                    System.out.println("You don't pray.");
                                }
                            }
                        }
                    } else if (currentRoom == 8) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("Plate of Food");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("Plate of Food")) {
                                System.out.println("A plate of delicious looking food. Would you like to eat it?");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("yes")) {
                                    System.out.println("You eat the plate of food. Something in it makes you feel sick.");
                                    roomState1[8][0] = true;
                                } else {
                                    System.out.println("You don't eat the food");
                                }
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
                        currentRoom = 0;
                    } else {
                        System.out.println("There are no stairs...");
                    }
                }  else if(userSelectedRoomStr.equalsIgnoreCase("Examine")){
                    if (currentRoom == 0) {
                        userAction = "";

                        while (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("What would you like to examine?");
                            System.out.println("The Ghost");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("The Ghost")) {
                                System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                                if(roomState2[0][1] == false) {
                                    System.out.println("Hello traveller. If you want my help, solve this riddle for me: From the trunk of a willow and the scraped hide of a cow I am made. Suffering the fierce savagery of war I, with my own body, always save my bearer's body, Unless death takes the man's life. What fierce soldier endures such a fate Or receives so many deadly wounds in war?\n" +
                                            "Castle   House   Shield   Armor   Stone");

                                    userAction = scanner.nextLine();

                                    if (userAction.equalsIgnoreCase("Shield")) {
                                        System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this shield. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                        roomState2[0][0] = true;
                                        roomState2[0][1] = true;
                                    } else {
                                        System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                        roomState2[0][1] = true;
                                    }
                                } else if(roomState2[0][0] == true && roomState2[0][1] == true){
                                    System.out.println("Congratulations on solving my riddle. May that shield serve you well!");
                                } else {
                                    System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                                }
                            }
                        }
                    }
                } else if (currentRoom == 1) {
                    userAction = "";

                    while (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("What would you like to examine?");
                        System.out.println("The Ghost");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("The Ghost")) {
                            System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                            if(roomState2[0][1] == false) {
                                System.out.println("No one can see me or catch me in their palms. I spread the noisy sound of my voice quickly through the world; I can break to pieces the oak with my loud, crashing strength, As I beat against the high poles of the sky and traverse the fields.\n" +
                                        "Wind   Music   Sunshine   Sword   Fire");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("Wind")) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this sword. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    roomState2[1][0] = true;
                                    roomState2[1][1] = true;
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    roomState2[1][1] = true;
                                }
                            } else if(roomState2[1][0] == true && roomState2[1][1] == true){
                                System.out.println("Congratulations on solving my riddle. May that sword serve you well!");
                            } else {
                                System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                            }
                        }
                    }
                }  else if (currentRoom == 2) {
                    userAction = "";

                    while (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("What would you like to examine?");
                        System.out.println("The Ghost");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("The Ghost")) {
                            System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                            if(roomState2[0][1] == false) {
                                System.out.println("I share a common fate with the sea, spinning the months around in alternate cycles. When the glory of my light-flowing form wanes so, too, the sea loses its swollen flood tides.\n" +
                                        "Sun   River   Calendar   Armor   Moon");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("Moon")) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this helmet. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    roomState2[2][0] = true;
                                    roomState2[2][1] = true;
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    roomState2[2][1] = true;
                                }
                            } else if(roomState2[2][0] == true && roomState2[2][1] == true){
                                System.out.println("Congratulations on solving my riddle. May that helmet serve you well!");
                            } else {
                                System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                            }
                        }
                    }
                }  else if (currentRoom == 3) {
                    userAction = "";

                    while (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("What would you like to examine?");
                        System.out.println("The Ghost");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("The Ghost")) {
                            System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                            if(roomState2[0][1] == false) {
                                System.out.println("Hello traveller. If you want my help, solve this riddle for me: From the trunk of a willow and the scraped hide of a cow I am made. Suffering the fierce savagery of war I, with my own body, always save my bearer's body, Unless death takes the man's life. What fierce soldier endures such a fate Or receives so many deadly wounds in war?\n" +
                                        "Castle   House   Shield   Armor   Stone");

                                userAction = scanner.nextLine();

                                if (userAction.equalsIgnoreCase("Shield")) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this shield. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    roomState2[0][0] = true;
                                    roomState2[0][1] = true;
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    roomState2[0][1] = true;
                                }
                            } else if(roomState2[0][0] == true && roomState2[0][1] == true){
                                System.out.println("Congratulations on solving my riddle. May that shield serve you well!");
                            } else {
                                System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid Direction");
                }
            }
        }
    }
}