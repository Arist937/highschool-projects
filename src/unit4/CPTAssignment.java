package unit4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program CPTAssignment.java that contains a game where you are a player stuck in a castle and you must explore it to
 * find answers
 *
 * @author: A. Xu
 */

public class CPTAssignment {
    // global arrays for the first floor
    static String[] roomNames1;
    static String[] roomDescriptions1;
    static int[][] roomDirections1 = new int[15][4];
    static boolean[][] roomState1 = new boolean[15][5];

    // global arrays for the second floor
    static String[] roomNames2;
    static String[] roomDescriptions2;
    static int[][] roomDirections2 = new int[5][4];
    static boolean[][] roomState2 = new boolean[5][4];

    // global array for overall gameState
    static int[] gameState;

    // create a global scanner object
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // call method to initialize arrays
        initializeArrays();

        // run welcome screen until it returns true
        while (!welcomeScreen()) ;

        // Starting dialogue to begin game
        System.out.println("You find yourself in a castle, unaware of your past and without any memory of who you are. " +
                "Behind you lies the doors to leave, but they are locked, unable to be opened. Suddenly, a spirit appears and speaks to you:\n\n" +
                "Traveller, please free us from this castle. By defeating the knight in the top floor of the central tower, you can unchain us " +
                "from this place. The knight also has the key with him that unlocks the door to leave the castle. I recommend visiting each of " +
                "the towers in the corners of the castle. On the top floors, there are Ghosts that will aid you on your Journey. Save us...\n\n" +
                "The Ghost disappears into thin air.");

        // play the game until the player reaches the end, method begins movement and room descriptions
        playGame();
    }

    /**
     * A method initializeArrays that gives values to declared global arrays
     */
    public static void initializeArrays() {
        // hasRunes, hasEnchantedShield, hasEnchantedSword, hasEnchantedHelmet, hasEnchantedArmor
        roomState1[2] = new boolean[]{false, false, false, false, false};
        // hasPotions, Alchemy ingredients
        roomState1[4] = new boolean[]{false, false};
        // isSkeletonExamined, Skeleton's Journal
        roomState1[5] = new boolean[]{false, false};
        // hasEaten plate of food
        roomState1[8] = new boolean[]{false};
        // Cooking Ingredients, hasCookedMeal, hasStew
        roomState1[9] = new boolean[]{false, false, false};
        // hasSwordUpgrade, hasArmorUpgrade, hasEnchantingKnowledge, hasAlchemyKnowledge
        roomState1[11] = new boolean[]{false, false, false, false};
        // hasReceivedBlessing
        roomState1[13] = new boolean[]{false};

        // hasShield, hasAttemptedRiddle
        roomState2[0] = new boolean[]{false, false};
        // hasSword, hasAttemptedRiddle
        roomState2[1] = new boolean[]{false, false};
        // hasHelmet, hasAttemptedRiddle
        roomState2[2] = new boolean[]{false, false};
        // hasMetGhost, hasArmor, hasDrunkSpicyStew, hasAngeredGhost
        roomState2[3] = new boolean[]{false, false, false, false};

        // currentRoom, currentFloor nextRoom, booksRead
        gameState = new int[]{1, 1, -1, 0};

        // room names of floor 1
        roomNames1 = new String[]{"Southwest Tower", "Foyer", "Enchanting Room", "Southeast Tower", "Alchemy Room",
                "Courtyard", "Central Tower", "Hallway A", "Dining Room", "Kitchen", "Northwest Tower", "Library",
                "Hallway B", "Chapel", "Northeast Tower"};
        // room names of floor 1
        roomDescriptions1 = new String[]
                {"You make your way into the southwestern tower. There is a set of stairs leading to the top and the Dining room lies north.",
                        "You find yourself in the Foyer of a castle. In the north, there is a Hallway and to the east lies the enchanting room",
                        "You find yourself in the enchanting room. To the north, there is an alchemy room, to the south, there is the southeastern tower and to the west, there is the foyer of the castle",
                        "You find yourself in the southeastern tower of the castle. There is a set of stairs leading to the top and to the north, there is an enchanting room.",
                        "You make your way into the alchemy room. To the west lies a hallway and the enchanting room is south of here.",
                        "You make your way into the courtyard. To the east lies the central tower and you can return into the castle through the west. Near the entrance of the central tower, you notice a skeleton that seemed to have been crawling for life in its final moments.",
                        "You find yourself in the central tower. There is a set of stairs leading to the top and to the west, you can find courtyard",
                        "You make your way into a hallway. To the north, it leads into another hallway and to the west lies a dining room. The courtyard is to the east.",
                        "You make your way into a dining room. To the south lies the southwestern tower and the kitchen is to the north. A hallway lies to the east",
                        "You find yourself in a kitchen. To the south lies the dining room, the Northwestern Tower to the north and a hallway to the east",
                        "You make your way into the Northwestern Tower. There is a set of stairs leading to the top and to the south lies the kitchen.",
                        "You find yourself in a library. To the south is a hallway and the chapel is to the east. There are many books to read here.",
                        "You make your way into a hallway. There lies a library to the north, a kitchen to the west and the alchemy room to the east. To the south, there is another hallway.",
                        "You are in the chapel. To the west is the library and to the north is the Northeastern Tower",
                        "You find yourself in the northeastern tower of the castle. There is a set of stairs leading to the top and to the south lies the chapel."};

        // directions for floor one
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

        // roomNames of floor 2
        roomNames2 = new String[]{"top floor of the southwestern tower", "top floor of the southeastern tower", "Bedroom A", "Bedroom B"};
        // roomNames of floor 2
        roomDescriptions2 = new String[]
                {"You are on the top floor of the southwestern tower. You see a ghost in front of you. There is also a set of stairs leading down to the bottom of the tower.",
                        "You are on the top floor of the southeastern tower. You see a ghost in front of you. There is also a set of stairs leading down to the bottom of the tower.",
                        "You are on the top floor of the northeastern tower. You see a ghost in front of you. There is also a set of stairs leading down to the bottom of the tower.",
                        "You are on the top floor of the northwestern tower. You see a ghost in front of you. There is also a set of stairs leading down to the bottom of the tower.",
                        "You make your way onto the top floor of the Central Tower. A dormant knight stands there. His eyes suddenly open and he raises his sword, ready to strike you down. The set of stairs that you used to come up have been covered by a slab of stone"};

        // directions for floor two
        roomDirections2[0] = new int[]{-1, -1, -1, -1};
        roomDirections2[1] = new int[]{-1, -1, -1, -1};
        roomDirections2[2] = new int[]{-1, -1, -1, -1};
        roomDirections2[3] = new int[]{-1, -1, -1, -1};
        roomDirections2[4] = new int[]{-1, -1, -1, -1};
    }

    /**
     * A method welcomeScreen that welcomes the player to the game, offering instructions
     *
     * @return whether the game has begun or not
     */
    public static boolean welcomeScreen() {
        // declare variables
        String welcomeScreenInput;
        boolean isGameStarted = false;

        System.out.println("Welcome to my Game! Type \"instructions\" for some help with the controls and \"start\" when you are ready!");
        welcomeScreenInput = scanner.nextLine();

        // if user inputs instructions, give instructions
        if (welcomeScreenInput.equalsIgnoreCase("instructions")) {
            System.out.println("To move in the game, type \"n\", \"e\", \"s\", or \"w\" to move north, east, south or west. A very important tool in " +
                    "this game is the keyword \"examine\". Try to use it every room " +
                    "to make use of whats within each and every room. When given options to examine, simply type out the option again to examine." +
                    "When you are done examining, type \"finish\" to return. When in a room with " +
                    "something to fight, simply type the keyword \"fight\" and it will begin. Lastly, type the keyword \"stairs\" " +
                    "when you are in a room that contains stairs in order to go up or down. When confronted with a yes or no question, " +
                    "simply type \"yes\" or \"no\". Finally, when the options are numbered, type in the corresponding number to pick that option.");
        }
        // start game if user enters start
        else if (welcomeScreenInput.equalsIgnoreCase("start")) {
            System.out.println("Have fun!");
            isGameStarted = true;
        }
        // default to invalid option if user enters neither start or instructions
        else {
            System.out.println("Invalid Option");
        }

        return isGameStarted;
    }

    /**
     * A method finalBoss that calculates the final fight between the player and knight
     *
     * @return whether or not the boss has been defeated
     */
    public static boolean finalBoss() {
        // playerHealth, playerDamage
        double[] playerStats = {20, 0.5};
        // bossHealth, bossDamage
        double[] bossStats = {30, 7};
        boolean isBossDead = false;

        // if player got shield, decrease boss damage by 1
        if (roomState2[0][0]) {
            bossStats[1] = bossStats[1] - 1;
        }
        // if player got enchanted shield, decrease boss damage by 1.5
        else if (roomState1[2][1]) {
            bossStats[1] = bossStats[1] - 1.5;
        }

        // if player got sword, set damage to 3
        if (roomState2[1][0]) {
            playerStats[1] = 3;

            // if player got sword upgrade and obtained the sword, increase damage by 1
            if (roomState1[11][0]) {
                playerStats[1] = playerStats[1] + 1;
            }
        }
        // if player got enchanted sword, set damage to 4
        else if (roomState1[2][2]) {
            playerStats[1] = 4;

            // if player got sword upgrade and an enchanted sword, increase damage by 1
            if (roomState1[11][0]) {
                playerStats[1] = playerStats[1] + 1;
            }
        }

        // if player got helmet, decrease boss damage by 1
        if (roomState2[2][0]) {
            bossStats[1] = bossStats[1] - 1;
        }
        // if player got enchanted helmet, decrease boss damage by 1.5
        else if (roomState1[2][3]) {
            bossStats[1] = bossStats[1] - 1.5;
        }

        // if player got armor, decrease boss damage by 1
        if (roomState2[3][1]) {
            bossStats[1] = bossStats[1] - 1;

            // if player got armor upgrade, decrease damage by 1
            if (roomState1[11][1]) {
                bossStats[1] = bossStats[1] - 1;
            }
        }
        // if player got enchanted armor, decrease boss damage by 1.5
        else if (roomState1[2][4]) {
            bossStats[1] = bossStats[1] - 1.5;

            // if player got armor upgrade, decrease damage by 1
            if (roomState1[11][1]) {
                bossStats[1] = bossStats[1] - 1;
            }
        }

        // if player drank potion, increase playerHealth by 10 and increase damage by 1
        if (roomState1[4][0]) {
            playerStats[0] = playerStats[0] + 10;
            playerStats[1] = playerStats[1] + 1;
        }

        // if player ate the plate of food on the dining table, -5 health
        if (roomState1[8][0]) {
            playerStats[0] = playerStats[0] - 5;
        }

        // if player receives blessing, +5 health
        if (roomState1[13][0]) {
            playerStats[0] = playerStats[0] + 5;
        }

        // if player drank spicy stew, +5 health
        if (roomState2[3][2]) {
            playerStats[0] = playerStats[0] + 5;
        }

        System.out.println("You and the knight engage in combat...");

        // keep subtracting damage from health for both the player and boss to determine winner
        while (isBossDead == false) {
            bossStats[0] = bossStats[0] - playerStats[1];
            playerStats[0] = playerStats[0] - bossStats[1];

            // if player wins, isBossDead = true
            if (bossStats[0] <= 0) {
                isBossDead = true;
            }
            // if player loses, isBossDead remains false
            else if (playerStats[0] <= 0) {
                break;
            }
        }

        return isBossDead;
    }

    /**
     * A method playGame that starts the gameplay
     */
    public static void playGame() {
        // declare variables
        String userSelectedRoomStr = "";
        boolean done = false;

        // when game is not yet completed, continue running this code to play the game
        while (!done) {
            // print out description of room depending on floor
            if (gameState[1] == 1) {
                System.out.println(roomDescriptions1[gameState[0]]);
            } else if (gameState[1] == 2) {
                System.out.println(roomDescriptions2[gameState[0]]);
            }

            // user input
            userSelectedRoomStr = scanner.nextLine();

            // n, e, s, w movement only available on first floor
            if (gameState[1] == 1) {
                // if-elif-else structure for user to move north, east, south or west or do another action
                if (userSelectedRoomStr.equalsIgnoreCase("n")) {
                    gameState[2] = roomDirections1[gameState[0]][0];

                    if (gameState[2] != -1) {
                        gameState[0] = gameState[2];
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("e")) {
                    gameState[2] = roomDirections1[gameState[0]][1];

                    if (gameState[2] != -1) {
                        gameState[0] = gameState[2];
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("s")) {
                    gameState[2] = roomDirections1[gameState[0]][2];

                    if (gameState[2] != -1) {
                        gameState[0] = gameState[2];
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else if (userSelectedRoomStr.equalsIgnoreCase("w")) {
                    gameState[2] = roomDirections1[gameState[0]][3];

                    if (gameState[2] != -1) {
                        gameState[0] = gameState[2];
                    } else {
                        System.out.println("You cannot go there");
                    }
                } else {
                    done = otherActions(userSelectedRoomStr, done);
                }
            }
            // if on the second floor, go straight to otherActions
            else {
                done = otherActions(userSelectedRoomStr, done);
            }
        }
    }

    /**
     * A method otherActions that contains going up stairs, fighting and using doors
     *
     * @param userChoice what the player inputted
     * @param isGameDone whether or not the game is finished
     * @return whether or not the game is finished
     */
    public static boolean otherActions(String userChoice, boolean isGameDone) {
        boolean done = isGameDone;

        if (gameState[1] == 1) {
            // structure for player to go up the stairs
            if (userChoice.equalsIgnoreCase("stairs")) {
                if (gameState[0] == 0) {
                    System.out.println("You go up the stairs");
                    gameState[1] = 2;
                    gameState[0] = 0;
                } else if (gameState[0] == 3) {
                    System.out.println("You go up the stairs");
                    gameState[1] = 2;
                    gameState[0] = 1;
                } else if (gameState[0] == 10) {
                    System.out.println("You go up the stairs");
                    gameState[1] = 2;
                    gameState[0] = 3;
                } else if (gameState[0] == 14) {
                    System.out.println("You go up the stairs");
                    gameState[1] = 2;
                    gameState[0] = 2;
                } else if (gameState[0] == 6) {
                    System.out.println("You go up the stairs");
                    gameState[1] = 2;
                    gameState[0] = 4;
                } else {
                    System.out.println("There are no stairs...");
                }
            }
            // if user enters examine, the player examines rooms
            else if (userChoice.equalsIgnoreCase("Examine")) {
                examineFunction();
            }
            // if none of the above are met, user has entered invalid input
            else {
                System.out.println("Invalid Direction");
            }
        }
        // same as above but for floor 2
        else if (gameState[1] == 2) {
            if (userChoice.equalsIgnoreCase("stairs")) {
                if (gameState[0] == 0) {
                    System.out.println("You go down the stairs");
                    gameState[1] = 1;
                    gameState[0] = 0;
                } else if (gameState[0] == 1) {
                    System.out.println("You go down the stairs");
                    gameState[1] = 1;
                    gameState[0] = 3;
                } else if (gameState[0] == 2) {
                    System.out.println("You go down the stairs");
                    gameState[1] = 1;
                    gameState[0] = 14;
                } else if (gameState[0] == 3) {
                    System.out.println("You go down the stairs");
                    gameState[1] = 1;
                    gameState[0] = 10;
                } else {
                    System.out.println("There are no stairs...");
                }
            } else if (userChoice.equalsIgnoreCase("Examine")) {
                examineFunction();
            }
            // if user enters fight at the top of the central tower
            else if (userChoice.equalsIgnoreCase("Fight")) {
                if (gameState[0] == 4) {
                    if (finalBoss()) {
                        System.out.println("After a rough battle, you defeat the knight.");
                        System.out.println("You stand on the second floor of the central tower with the dead knight in front of your feet. A spirit Ghost appears out of thin air and speaks to you:\n\n" +
                                "Thank you adventurer, your efforts have freed the spirits of all those that perished in this castle. I am beyond thankful for your aid and we wish you good luck in your future endeavours.\n\n" +
                                "The spirit disappears after thanking you. After taking a moment to recount recent events and take in what happened, you search the knight's body. You find a key that hopefully will unlock " +
                                "the door in the foyer. You begin making your way down the central tower and back into the main castle to get back to the foyer.\n\n" +
                                "As you arrive at the foyer, you quickly unlock the door and step outside. After adjusting to the blinding light, you quickly realise that the castle was in the middle of nowhere. However, now" +
                                "that you are free, perhaps you will find the answers in your future travels...");
                        done = true;
                    } else {
                        System.out.println("The knight emerges victorious\n\n GAME OVER");
                        done = true;
                    }
                } else {
                    System.out.println("There is nothing to fight...");
                }
            } else {
                System.out.println("Invalid Direction");
            }
        }

        return done;
    }

    /**
     * A method examineFunction that allows the player to examine and interact with rooms
     */
    public static void examineFunction() {
        // declare variables
        String userAction = "";
        int userDialogueChooser;

        // examine functions for floor 1
        if (gameState[1] == 1) {
            // examine function for room 5
            if (gameState[0] == 5) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    System.out.println("Skeleton   Flowers   Grass   Sky");

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("Skeleton")) {
                        roomState1[5][0] = true;
                        System.out.println("You examine the skeleton and find a journal next to it. Would you like to read it?");

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
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 4
            else if (gameState[0] == 4) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");

                    if (roomState1[4][1] == true) {
                        System.out.println("Alchemy Table");
                    } else {
                        System.out.println("Alchemy Table   Alchemy Ingredients");
                    }

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("Alchemy Table")) {
                        System.out.println("An Alchemy Table, would you like to craft a potion?");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("yes")) {
                            // tests whether player already crafted potions or not
                            if (roomState1[4][0] == true) {
                                System.out.println("You already crafted potions");
                            }
                            // tests whether user has gotten alchemy ingredients or not
                            else if (roomState1[4][1] == true) {
                                // tests whether user has knowledge of alchemy
                                if (roomState1[11][3] == true) {
                                    System.out.println("You craft a health potion and a strength potion");
                                    // stores that the player has crafted a potion
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
                        if (roomState1[4][1] == true) {
                            System.out.println("You have already taken the alchemy ingredients");
                        } else {
                            System.out.println("A bunch of alchemy ingredients. Would you like to take them?");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("yes")) {
                                // gives player alchemy ingredients
                                roomState1[4][1] = true;
                                System.out.println("You take the alchemy ingredients");
                            } else {
                                System.out.println("You leave the alchemy ingredients alone");
                            }
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 9
            else if (gameState[0] == 9) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");

                    if (roomState1[9][0] == true) {
                        System.out.println("The Pot   Fire");
                    } else {
                        System.out.println("The Pot   Cooking Ingredients   Fire");
                    }

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("The Pot")) {
                        System.out.println("A cooking table, what would you like to cook?\n\n" +
                                "1. Spicy Stew\n" +
                                "2. Stew\n" +
                                "3. Curry\n" +
                                "4. Nevermind");

                        try {
                            userDialogueChooser = scanner.nextInt();
                            scanner.nextLine();

                            // tests whether the user cooked before or not
                            if (roomState1[9][1] == true) {
                                System.out.println("You've already cooked before. You no longer have the ingredients to cook anymore.");
                            }
                            else if (userDialogueChooser == 4) {
                                System.out.println("You don't cook anything");
                            }
                            // tests if user has gotten the cooking ingredients or not
                            else if (roomState1[9][0] == false) {
                                System.out.println("You have not yet made the necessary preparations to start cooking");
                            } else if (userDialogueChooser == 1) {
                                System.out.println("You cook a spicy stew");
                                // changes hasCookedStew to true
                                roomState1[9][1] = true;
                                // changes hasCookedSpicyStew to true
                                roomState1[9][2] = true;
                            } else if (userDialogueChooser == 2) {
                                System.out.println("You cook a stew");
                                // changes hasCookedStew to true
                                roomState1[9][1] = true;
                            } else if (userDialogueChooser == 3) {
                                System.out.println("You cook some curry");
                                // changes hasCookedStew to true
                                roomState1[9][1] = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Not a valid option");
                            scanner.nextLine();
                        }
                    } else if (userAction.equalsIgnoreCase("Cooking Ingredients")) {
                        // checks if user has already gotten the cooking ingredients
                        if (roomState1[9][0] == true) {
                            System.out.println("There are no more cooking ingredients");
                        } else {

                            System.out.println("A bunch of cooking ingredients. Would you like to take them?");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("yes")) {
                                // sets that the user has taken the cooking ingredients
                                roomState1[9][0] = true;
                                System.out.println("You take the cooking ingredients");
                            } else {
                                System.out.println("You leave the cooking ingredients alone");
                            }
                        }
                    } else if (userAction.equalsIgnoreCase("Fire")) {
                        System.out.println("There is a roaring fire ready for you to cook with.");
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 11
            else if (gameState[0] == 11) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    // tests if user has read more than 3 books
                    if (gameState[3] >= 3) {
                        System.out.println("You've read too many books, your head is starting to hurt.");
                        break;
                    } else {

                        System.out.println("What would you like to examine?");
                        System.out.println("Twin Secrets   The Book of Fate   A Game at Dinner   The Posting of the Hunt   Touching the Sky   Fire and Darkness   Hallgerd's Tale   The Betrayed");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("A Game at Dinner")) {
                            System.out.println("You gain the knowledge of alchemy");
                            // player has knowledge of alchemy to true
                            roomState1[11][3] = true;
                            // increases number of books read
                            gameState[3]++;
                        } else if (userAction.equalsIgnoreCase("Fire and darkness")) {
                            System.out.println("You feel that you have become better with swords");
                            // player has knowledge of better using swords to true
                            roomState1[11][0] = true;
                            // increases number of books read
                            gameState[3]++;
                        } else if (userAction.equalsIgnoreCase("Hallgerd's Tale")) {
                            System.out.println("The book teaches you how to efficiently use armor");
                            // player has knowledge of better using armor to true
                            roomState1[11][1] = true;
                            // increases number of books read
                            gameState[3]++;
                        } else if (userAction.equalsIgnoreCase("Twin Secrets")) {
                            System.out.println("You have gained the knowledge of Enchantment");
                            // player has knowledge of enchanting to true
                            roomState1[11][2] = true;
                            // increases number of books read
                            gameState[3]++;
                        } else if (userAction.equalsIgnoreCase("The book of fate") || userAction.equalsIgnoreCase("The Posting of the Hunt") || userAction.equalsIgnoreCase("Touching the Sky") || userAction.equalsIgnoreCase("The Betrayed")) {
                            System.out.println("Reading the book was a waste of time. You fail to learn anything of importance.");
                            // increases number of books read
                            gameState[3]++;
                        } else if (!userAction.equalsIgnoreCase("finish")) {
                            System.out.println("You can't examine that");
                        }
                    }
                }
            }
            // examine function for room 13
            else if (gameState[0] == 13) {
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
                            // player gets blessed
                            roomState1[13][0] = true;
                        } else {
                            System.out.println("You don't pray.");
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 2
            else if (gameState[0] == 2) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");

                    if (roomState1[2][0]) {
                        System.out.println("Enchanting Table   Candles");
                    } else {
                        System.out.println("Enchanting Table   Runes   Candles");
                    }
                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("Enchanting Table")) {
                        System.out.println("An Enchanting Table, would you like to enchant something?");

                        userAction = scanner.nextLine();

                        if (userAction.equalsIgnoreCase("yes")) {
                            // tests for whether or not player has knowledge of enchanting
                            if (!roomState1[11][2]) {
                                System.out.println("You do not have the knowledge to enchant items yet");
                            }
                            // tests whether or not the user has runes necessary for enchanting
                            else if (!roomState1[2][0]) {
                                System.out.println("You do not have the necessary runes to begin enchanting yet");
                            }
                            // if the conditions above are met, player can enchant items
                            else {
                                while (!userAction.equalsIgnoreCase("finish")) {
                                    // tests if the player has items to enchant or not
                                    if ((!roomState2[0][0] && !roomState2[1][0] && !roomState2[2][0] && !roomState2[3][1])) {
                                        System.out.println("You don't have anything to enchant");
                                        break;
                                    } else {
                                        System.out.print("Select item to enchant: ");

                                        // if statements to only print out options that the user has
                                        if (roomState2[0][0] && !roomState1[2][1]) {
                                            System.out.print("Shield   ");
                                        }
                                        if (roomState2[1][0] && !roomState1[2][2]) {
                                            System.out.print("Sword   ");
                                        }
                                        if (roomState2[2][0] && !roomState1[2][3]) {
                                            System.out.print("Helmet   ");
                                        }
                                        if (roomState2[3][1] && !roomState1[2][4]) {
                                            System.out.print("Armor   ");
                                        }

                                        System.out.println("");
                                        userAction = scanner.nextLine();

                                        if (userAction.equalsIgnoreCase("Shield")) {
                                            // tests if the user has the item
                                            if (!roomState2[0][0]) {
                                                System.out.println("Invalid Option");
                                            } else {
                                                System.out.println("You enchant your shield");
                                                // replaces normal item with enchanted item
                                                roomState1[2][1] = true;
                                                roomState2[0][0] = false;
                                            }
                                        }
                                        if (userAction.equalsIgnoreCase("Sword")) {
                                            // tests if the user has the item
                                            if (!roomState2[1][0]) {
                                                System.out.println("Invalid Option");
                                            } else {
                                                System.out.println("You enchant your sword");
                                                // replaces normal item with enchanted item
                                                roomState1[2][2] = true;
                                                roomState2[1][0] = false;
                                            }
                                        }
                                        if (userAction.equalsIgnoreCase("Helmet")) {
                                            // tests if the user has the item
                                            if (!roomState2[2][0]) {
                                                System.out.println("Invalid Option");
                                            } else {
                                                System.out.println("You enchant your helmet");
                                                // replaces normal item with enchanted item
                                                roomState1[2][3] = true;
                                                roomState2[2][0] = false;
                                            }
                                        }
                                        if (userAction.equalsIgnoreCase("Armor")) {
                                            // tests if the user has the item
                                            if (!roomState2[3][1]) {
                                                System.out.println("Invalid Option");
                                            } else {
                                                System.out.println("You enchant your armor");
                                                // replaces normal item with enchanted item
                                                roomState1[2][4] = true;
                                                roomState2[3][1] = false;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("You leave the Enchanting table alone");
                        }
                    } else if (userAction.equalsIgnoreCase("Runes")) {
                        if (roomState1[2][0] == true) {
                            System.out.println("There are no more runes");
                        } else {

                            System.out.println("A bunch of runes, would you like to take them?");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("yes")) {
                                // stores that the user has the runes
                                roomState1[2][0] = true;
                                System.out.println("You take the runes");
                            } else {
                                System.out.println("You leave the runes alone");
                            }
                        }
                    } else if (userAction.equalsIgnoreCase("Candles")) {
                        System.out.println("Beautiful Candles");
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 8
            else if (gameState[0] == 8) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    if (roomState1[8][0] == true) {
                        System.out.println("Oak Table   Oak Chair");
                    } else {
                        System.out.println("Plate of Food   Oak Table   Oak Chair");
                    }

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("Plate of Food")) {
                        // checks if the player ate the food already
                        if (roomState1[8][0] == true) {
                            System.out.println("You have already eaten the plate of food");
                        } else {
                            System.out.println("A plate of delicious looking food. Would you like to eat it?");

                            userAction = scanner.nextLine();

                            if (userAction.equalsIgnoreCase("yes")) {
                                System.out.println("You eat the plate of food. Something in it makes you feel sick.");
                                // stores that the player ate the plate of food
                                roomState1[8][0] = true;
                            } else {
                                System.out.println("You don't eat the food");
                            }
                        }
                    } else if (userAction.equalsIgnoreCase("Oak Table")) {
                        System.out.println("Beautiful oak table.");
                    } else if (userAction.equalsIgnoreCase("Oak Chair")) {
                        System.out.println("Beautiful oak chair.");
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            } else {
                System.out.println("There is nothing to examine");
            }
        }
        // beginning of examine function on floor 2
        else if (gameState[1] == 2) {
            // examine function for room 0
            if (gameState[0] == 0) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    System.out.println("The Ghost");

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("The Ghost")) {
                        System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                        // if user has not attempted the riddle yet
                        if (roomState2[0][1] == false) {
                            System.out.println("Hello traveller. If you want my help, solve this riddle for me: From the trunk of a willow and the scraped hide of a cow I am made. Suffering the fierce savagery of war I, with my own body, always save my bearer's body, Unless death takes the man's life. What fierce soldier endures such a fate Or receives so many deadly wounds in war?\n" +
                                    "1. Castle\n" +
                                    "2. House\n" +
                                    "3. Shield\n" +
                                    "4. Armor\n" +
                                    "5. Stone");
                            try {
                                userDialogueChooser = scanner.nextInt();
                                scanner.nextLine();

                                if (userDialogueChooser == 3) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this shield. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    // sets that the player successfully completed the riddle
                                    roomState2[0][0] = true;
                                    // sets attempted riddle to true
                                    roomState2[0][1] = true;
                                } else if (userDialogueChooser > 5) {
                                    System.out.println("What...? Try again");
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    // sets attempted riddle to true
                                    roomState2[0][1] = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("That is not a valid dialogue option");
                                scanner.nextLine();
                            }
                        } else if (roomState2[0][0] == true && roomState2[0][1] == true) {
                            System.out.println("Congratulations on solving my riddle. May that shield serve you well!");
                        } else {
                            System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 1
            else if (gameState[0] == 1) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    System.out.println("The Ghost");

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("The Ghost")) {
                        System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                        if (roomState2[1][1] == false) {
                            System.out.println("No one can see me or catch me in their palms. I spread the noisy sound of my voice quickly through the world; I can break to pieces the oak with my loud, crashing strength, As I beat against the high poles of the sky and traverse the fields.\n" +
                                    "1. Wind\n" +
                                    "2. Music\n" +
                                    "3. Sunshine\n" +
                                    "4. Sword\n" +
                                    "5. Fire");
                            try {
                                userDialogueChooser = scanner.nextInt();
                                scanner.nextLine();

                                if (userDialogueChooser == 1) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this sword. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    // sets that the player successfully completed the riddle
                                    roomState2[1][0] = true;
                                    // sets attempted riddle to true
                                    roomState2[1][1] = true;
                                } else if (userDialogueChooser > 5) {
                                    System.out.println("What...? Try again");
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    // sets attempted riddle to true
                                    roomState2[1][1] = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("That is not a valid dialogue option");
                                scanner.nextLine();
                            }
                        } else if (roomState2[1][0] == true && roomState2[1][1] == true) {
                            System.out.println("Congratulations on solving my riddle. May that sword serve you well!");
                        } else {
                            System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 2
            else if (gameState[0] == 2) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    System.out.println("The Ghost");

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("The Ghost")) {
                        System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                        if (roomState2[2][1] == false) {
                            System.out.println("I share a common fate with the sea, spinning the months around in alternate cycles. When the glory of my light-flowing form wanes so, too, the sea loses its swollen flood tides.\n" +
                                    "1. Sun\n" +
                                    "2. River\n" +
                                    "3. Calendar\n" +
                                    "4. Armor\n" +
                                    "5. Moon");
                            try {
                                userDialogueChooser = scanner.nextInt();
                                scanner.nextLine();

                                if (userDialogueChooser == 5) {
                                    System.out.println("Congratulations Traveller! That is the correct answer. To aid you in your journey, take this helmet. It will aid you with your fight with the knight in the central tower. I recommend heading to the other towers where you may find valuable information.");
                                    // sets that the player successfully completed the riddle
                                    roomState2[2][0] = true;
                                    // sets attempted riddle to true
                                    roomState2[2][1] = true;
                                } else if (userDialogueChooser > 5) {
                                    System.out.println("What...? Try again");
                                } else {
                                    System.out.println("That is incorrect. Unfortunately I cannot aid you on this journey.");
                                    // sets attempted riddle to true
                                    roomState2[2][1] = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("That is not a valid dialogue option");
                                scanner.nextLine();
                            }
                        } else if (roomState2[2][0] == true && roomState2[2][1] == true) {
                            System.out.println("Congratulations on solving my riddle. May that helmet serve you well!");
                        } else {
                            System.out.println("I'm sorry, since you were unable to solve my riddle, I cannot aid you on this journey. Try the other towers, you may find valuable information.");
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            }
            // examine function for room 3
            else if (gameState[0] == 3) {
                userAction = "";

                while (!userAction.equalsIgnoreCase("finish")) {
                    System.out.println("What would you like to examine?");
                    System.out.println("The Ghost");

                    userAction = scanner.nextLine();

                    if (userAction.equalsIgnoreCase("The Ghost")) {
                        System.out.println("A ghastly looking ghost that resembles a person. You can barely make it out. It speaks to you: \n");

                        // checks if the user angered the ghost or failed to give the correct stew
                        if (roomState2[3][3] == true) {
                            System.out.println("You failed my test. Get out of my face");
                            break;
                        }
                        // checks if the user met the ghost or not
                        else if (roomState2[3][0] == false) {
                            // checks if the user has the stew
                            if (roomState1[9][1] == false) {
                                System.out.println("Hello traveller. If you want my help, cook a meal for me in the kitchen down below. I would really like a spicy stew right now.\n\n" +
                                        "1. Can you even eat the stew? You're a Ghost!\n" +
                                        "2. Okay, I'll go make that stew for you\n" +
                                        "3. I'm not your servant. I'm not making anything for you.");

                                // sets has met ghost to true
                                roomState2[3][0] = true;

                                try {
                                    userDialogueChooser = scanner.nextInt();
                                    scanner.nextLine();

                                    if (userDialogueChooser == 1) {
                                        System.out.println("Why do you care? Just go make the damn stew!");
                                        break;
                                    } else if (userDialogueChooser == 2) {
                                        System.out.println("Thank you!");
                                        break;
                                    } else if (userDialogueChooser == 3) {
                                        System.out.println("Suit yourself");
                                        // sets angered ghost to true
                                        roomState2[3][3] = true;
                                        break;
                                    } else {
                                        System.out.println("What..?");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("That is not a valid dialogue option");
                                    scanner.nextLine();
                                }
                            }
                            // if user already has the stew
                            else if (roomState1[9][1] == true) {
                                System.out.println("Hello traveller. If you want my help, cook a meal for me in the kitchen down below. I would really like a spicy stew right now.\n\n" +
                                        "1. Can you even eat the stew? You're a Ghost!\n" +
                                        "2. Actually, I already have a stew right here\n" +
                                        "3. I'm not your servant. I'm not making anything for you.\n" +
                                        "4. You know what, I'm actually gonna eat this myself");

                                roomState2[3][0] = true;

                                try {
                                    userDialogueChooser = scanner.nextInt();
                                    scanner.nextLine();

                                    if (userDialogueChooser == 1) {
                                        System.out.println("Why do you care? Just go make the damn stew!");
                                        break;
                                    } else if (userDialogueChooser == 2) {
                                        // if player cooked the spicy stew
                                        if (roomState1[9][2] == true) {
                                            System.out.println("This is exactly what I wanted! Thanks! Here is a set of armor to aid you on your journey.");
                                            // sets received armor to true
                                            roomState2[3][1] = true;
                                        }
                                        // if user didn't cook spicy stew
                                        else {
                                            System.out.println("Bah! This isn't what I wanted! Get out of here, I'm not gonna help you.");
                                            // sets angered ghost to true
                                            roomState2[3][3] = true;
                                        }
                                        break;
                                    } else if (userDialogueChooser == 3) {
                                        System.out.println("Suit yourself");
                                        // sets angered ghost to true
                                        roomState2[3][3] = true;
                                        break;
                                    } else if (userDialogueChooser == 4) {
                                        System.out.println("How dare you...\n\n" +
                                                "You eat the stew... ");
                                        // if the player cooked spicy stew
                                        if (roomState1[9][2] == true) {
                                            System.out.println("The Stew invigorates you and makes you stronger!");
                                            // set player ate spicy stew to true
                                            roomState2[3][2] = true;
                                        } else {
                                            System.out.println("The stew doesn't do anything.");
                                        }
                                        // set angered ghost to true
                                        roomState2[3][3] = true;
                                    } else {
                                        System.out.println("What..?");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("That is not a valid dialogue option");
                                    scanner.nextLine();
                                }
                            }
                        }
                        // if user met the ghost before
                        else if (roomState2[3][0] == true) {
                            System.out.println("Welcome back! Do you have my stew?\n");

                            if (roomState1[9][1] == true) {
                                System.out.println("1. Yes! It's right here!\n" + "2. You know what, I'm actually gonna eat this myself\n" + "3. Like I would give you this. *Pours Stew On the Ground*");

                                try {
                                    userDialogueChooser = scanner.nextInt();
                                    scanner.nextLine();

                                    if (userDialogueChooser == 1) {
                                        if (roomState1[9][2] == true) {
                                            System.out.println("Ahhh. This is exactly what I wanted. Here you go! A set of armor to aid you on your journey");
                                            roomState2[3][1] = true;
                                        } else {
                                            System.out.println("Bah! This isn't what I wanted! Get out of here, I'm not gonna help you.");
                                            roomState2[3][3] = true;
                                        }
                                    } else if (userDialogueChooser == 2) {
                                        System.out.println("How dare you...\n\n" +
                                                "You eat the stew... ");

                                        // if the stew is spicy stew
                                        if (roomState1[9][2] == true) {
                                            System.out.println("The Stew invigorates you and makes you stronger!");
                                            // sets that you ate the stew
                                            roomState2[3][2] = true;
                                        }
                                        // if the stew is not a spicy stew and you ate it
                                        else {
                                            System.out.println("The stew doesn't do anything.");
                                        }
                                        roomState2[3][3] = true;
                                    } else if (userDialogueChooser == 3) {
                                        System.out.println("You're scum!");
                                        // sets angered ghost to true
                                        roomState2[3][3] = true;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("That is not a valid dialogue option");
                                    scanner.nextLine();
                                }
                            }
                            // if you met the ghost and you don't have the stew yet
                            else {
                                System.out.println("Oh, you don't have the stew yet. Be Quick!");
                            }
                        }
                    } else if (!userAction.equalsIgnoreCase("finish")) {
                        System.out.println("You can't examine that");
                    }
                }
            } else {
                System.out.println("There is nothing to examine");
            }
        }
    }
}