package Game;

import Characters.Warrior;
import Characters.Hero;
import Characters.Wizard;

import java.util.Scanner;

//Game menu
public class Menu {

    //Function game menu

    public void choixPerso() {
        String choice;
        Board myBoard = new Board();
        int boardLocation = 0;
        boolean startMenuTester = true;
        String name = "";
        Hero player = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bonjour, bienvenue dans Java warrior ! \n " +
                "Quel type de personnage voulez vous créer, un Guerrier ?[war]\n " +
                "Un Magicien ?[wiz]\n " +
                "Tu désire peut-être quitter ce merveilleux jeu ??????????? Appuie sur [q] alors...");
        choice = keyboard.nextLine();

        //Check if the player tap right words
        while (startMenuTester == true) {

            if (!choice.equals("war") && !choice.equals("wiz") && !choice.equals("q")) {
                System.out.println("Selectionnez [war] ou [wiz] ou [q], pas autre chose : ");
                choice = keyboard.nextLine();
                startMenuTester = true;
            } else startMenuTester = false;
        }
        //Select character and create new object from it then put the tester at true to exit the loop
        if (choice.equals("war")) {
            System.out.println("Vous êtes donc un guerrier choisissez votre nom : ");
            name = keyboard.nextLine();
            player = new Warrior(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + player.toString());
            startMenuTester = false;

        }
        if (choice.equals("wiz")) {
            System.out.println("Vous êtes donc un magicien choisissez votre nom : ");
            name = keyboard.nextLine();
            player = new Wizard(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + player.toString());
            startMenuTester = false;
        }
//For the player to quit
        if (choice.equals("q")) {
            System.out.print("pk tu quitte mon jeu t'est complètement maboul");
            System.exit(0);
        }

        System.out.println("Serait t'il enfin temps de commencer votre long(non) périple ? [y] or [n]");
        choice = keyboard.nextLine();
//Quit the game if player dont want to start
        if (choice.equals("n")) {
            System.out.println("Très bien, je fait disparaître le personnage que vous avez créé, dit au revoir " + name);
            System.exit(0);
        }
//Start the game
        if (choice.equals("y")) {
            choice = "";

//Variable for all the in-game commands
            String cmd = "\"Voici les commandes que tu peut utiliser le long de ton aventure : \n" +
                    "\"[cmd] Pour afficher ce menu de commandes\n" +
                    "\"[stat] Pour voir le Status de ton personnage\n" +
                    "\"[quit] Pour quitter la partie\n" +
                    "\"[de] Pour lancer le dé\n" +
                    "\"[f] Pour lancer un combat\n" +
                    "\"[run] Pour tenter de fuir\n";
            //show the commands
            System.out.println("Votre long(non) périple commence voici, les commandes qui vous permettrons de venir à bout du plateau maudit ! : ");
            System.out.println(cmd);


            //all the condition with the commands
            while (boardLocation < 64) {
                if (choice.equals("de")) {
                    int diceRoll = Dice.diceRoll();
                    boardLocation = boardLocation + diceRoll;
                    try {Cell currentCell = myBoard.getCell(boardLocation);}
                    catch (IndexOutOfBoundsException e) {
                        System.out.print("                                 _         _       _   _                 \n" +
                                "                                | |       | |     | | (_)                \n" +
                                "  ___ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___ \n" +
                                " / __/ _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __|\n" +
                                "| (_| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\\n" +
                                " \\___\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___/\n" +
                                "                  __/ |                                                  \n" +
                                "                 |___/                                                   ");
                    System.exit(0);
                    }
                    System.out.println("Vous lancez le dé et faite un : [" + diceRoll + "] \n" +
                            "Vous vous situez désormais sur la case [" + boardLocation + "] du plateau");
                    choice = "";
                }
                if (choice.equals("cmd")) {
                    System.out.println(cmd);
                }
                if (choice.equals("quit")) {
                    System.out.println("Vous êtes sur de vouloir quitter ? Rien ne sera sauvegardé ! [y] or [n]");
                    choice = keyboard.nextLine();
                    if (choice.equals("y")) {
                        System.exit(0);
                    }
                    if (choice.equals("n")) {
                        System.out.println("Tès bien ! Vous pouvez continuer.");
                    }
                }
                if (choice.equals("stat")) {
                    System.out.println("Vos stats : " + player.toString());
                }
                choice = keyboard.nextLine();
            }
        }
        System.out.print("                                 _         _       _   _                 \n" +
                "                                | |       | |     | | (_)                \n" +
                "  ___ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___ \n" +
                " / __/ _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __|\n" +
                "| (_| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\\n" +
                " \\___\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___/\n" +
                "                  __/ |                                                  \n" +
                "                 |___/                                                   ");
        keyboard.close();
        System.exit(0);

    }
}

