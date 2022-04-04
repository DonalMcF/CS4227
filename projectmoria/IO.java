package projectmoria;
import java.io.*;
import java.util.List;

import PlayerInput.*;

public final class IO {
    public static void playerCrit() {
        System.out.println("Nice! You landed a critical hit! (x2 Damage)");
    }

    public static void monsterCrit() {
        System.out.println("Ouch! The monster landed a critical hit! "
                + "(x2 Damage)");
    }

    public static void Welcome() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Welcome traveler.......");
        System.out.println("To the mines of Moria! ");
        System.out.println("-----------------------");
        System.out.println("       MAIN MENU       ");
        System.out.println("_______________________");
        System.out.println();
        System.out.println(" 1.      New Game        ");
        System.out.println();
        System.out.println(" 2.     Load Game        ");
        System.out.println();
        System.out.println(" 3.      Settings        ");
        System.out.println();
        System.out.println(" 4.       Credits        ");
        System.out.println();
        System.out.println(" 5.     Exit Game        ");
        System.out.println();
        System.out.print(" Make a Selection: ");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void newGameIntroduction() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("------------------");
        System.out.println("CHOOSE A CHARACTER");
        System.out.println("------------------");
        System.out.println();
        System.out.println("1. WARRI0R");
        System.out.println("----------");
        System.out.println("A tough, well-rounded fighter with"
                + " a balanced skillset.");
        System.out.println();
        System.out.println("2. DUELIST");
        System.out.println("----------");
        System.out.println("A quick, nimble duelist with an"
                + "aptitude for landing critical attacks.");
        System.out.println();
        System.out.println("________________________");
        System.out.print("Choose Either Character: ");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static boolean displayPlayerStats(String name, String description,
            int maxHitPoints, int minDamage, int maxDamage, int defense,
            double critChance) {
        ButtonPress userButton = new ButtonPress();
        GameRemote remote = new GameRemote();
            
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(name);
        System.out.println("-------");
        System.out.println(description);
        System.out.println();
        System.out.println("MAX HP: " + maxHitPoints);
        System.out.println();
        System.out.println(
                "ATTACK: " + minDamage + "-" + maxDamage);
        System.out.println();
        System.out.println("DEFENSE(Scale:1-5): " + defense);
        System.out.println();
        System.out.println("CRIT CHANCE: " + critChance + "%");
        System.out.println();
        System.out.println("ARE YOU SURE YOU WANT TO PLAY AS A "
                + name.toUpperCase() + "? "
                + "(enter/return)");
        System.out.println();
        System.out.println();
        System.out.println();
        if (ProjectMoria.USERINPUT.nextLine().equals("enter")) {
            remote.setCommand( new EnterCommand( userButton));
            return remote.buttonPressed();
            
        } else {
            remote.setCommand( new ReturnCommand( userButton));
            return remote.buttonPressed();
        }
    }

    public static void credits() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Would you like to proceed to the main menu? (enter/return)");
        if (ProjectMoria.USERINPUT.nextLine().equals("enter")) {
            ProjectMoria.mainMenu();
        }
    }
    
    public static void generalPrompts(Player player) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("You arrive at Room [" + player.getCurrX() + "]["
                + player.getCurrY() + "]");
        System.out.println("You have some options: ");
        System.out.println("Inspect the room for items(i)   ");
    }
    
    public static void movePlayer(Player player) {
        MovementDirection userDirection = new MovementDirection();
        GameRemote remote = new GameRemote();

        if (Dungeon.isNorthDirection() == true) {
            System.out.println("North (up)\n");
        }
        if (Dungeon.isSouthDirection() == true) {
            System.out.println("South (down)\n");
        }
        if (Dungeon.isEastDirection() == true) {
            System.out.println("East (left)\n");
        }
        if (Dungeon.isWestDirection() == true) {
            System.out.println("West (right)\n");
        }

        System.out.print("Where would you like to travel?: ");
        String selection = ProjectMoria.USERINPUT.nextLine();
        if (selection.equals("up") && Dungeon.isNorthDirection()) {
            remote.setCommand( new UpCommand( userDirection));
            remote.buttonPressed();
            player.setCurrY(player.getCurrY() + 1);
        } else if (selection.equals("down") && Dungeon.isSouthDirection()) {
            remote.setCommand( new DownCommand( userDirection));
            remote.buttonPressed();
            player.setCurrY(player.getCurrY() - 1);
        } else if (selection.equals("left") && Dungeon.isEastDirection()) {
            remote.setCommand( new LeftCommand( userDirection));
            remote.buttonPressed();
            player.setCurrX(player.getCurrX() + 1);
        } else if (selection.equals("right") && Dungeon.isWestDirection()) {
            remote.setCommand( new RightCommand( userDirection));
            remote.buttonPressed();
            player.setCurrX(player.getCurrX() - 1);
        }

    }

    public static void battleIntro(Player player, Room room) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("You arrive at Room [" + player.getCurrX() + "]["
                + player.getCurrY() + "]");
        System.out.println("You enter the room and look around and see...");
        System.out.println(room.getDescription() + "\n\n");
        System.out.println("Number of monsters: " + room.getNumOfMonsters());
        System.out.println("Your fight with " + room.getMonster().getName()
                + " begins.\n");
    }

    public static void battle(Player player, Monster monster, Room room) {
        List<Item> inventory = player.getInventory();
        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\nMonster HP: " + monster.getHitPoints()
                    + "    " + "Player HP: " + player.getHitPoints());
            System.out.println("----------------------------------");
            System.out.print("\nAttack (enter)   Heal (return)");
            String action = ProjectMoria.USERINPUT.nextLine();
            if (action.equals("enter")) {
                monster.defend(player);
                if (monster.isAlive()) {
                    player.defend(monster);
                }
            } else if (action.equals("return")) {
                boolean potionExists = false;
                if (!inventory.isEmpty()) {
                    for (int i = 0; i < inventory.size(); i++) {
                        potionExists = false;
                        if (inventory.get(i).getName().equals("Potion")) {
                            player.heal(inventory.get(i));
                            potionExists = true;
                            break;
                        }
                    }
                }
                if (potionExists == false) {
                    System.out.println("You've exhuasted your supply of "
                            + "potions!");
                    battle(player, monster, room);
                }
                if (monster.isAlive()) {
                    player.defend(monster);
                }
            }
        }
        if (!player.isAlive()) {
            System.out.println("Your lifeless body hits the floor.  GAME OVER");
        } else if (!monster.isAlive()) {
            System.out.println("The monster has been defeated!");
            System.out.println("--------------------------------\n");
        }

    }

    public static void playerHitPointsMessage(int damage, Monster monster) {
        System.out.println("The " + monster.getName() + " hit you for "
                + damage + " damage.");
    }

    public static void monsterHitPointsMessage(int damage, Monster monster) {
        System.out.println("You hit the " + monster.getName()
                + " for " + damage + " damage.");
    }

    public static void heal(int hitPoints) {
        System.out.println("You drink the potion and heal 20 points!");
        System.out.println("Player HP: " + hitPoints);
    }

}
