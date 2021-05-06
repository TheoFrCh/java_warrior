package Game;

import Characters.Guerrier;
import Characters.Hero;
import Characters.Magicien;

import java.util.Scanner;

public class Menu {
    public void choixPerso() {
        String choice;
        String name = "";
        Hero joueur = null;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bonjour, bienvenue dans Java warrior ! \n " +
                "Quel type de personnage voulez vous créer, un Guerrier ?[war]\n " +
                "Un Magicien ?[wiz]\n " +
                "Tu désire peut-être quitter ce merveilleux jeu ??????????? Appuie sur [q] alors...");
        choice = clavier.nextLine();

        if (choice.equals("war")) {
            System.out.println("Vous êtes donc un guerrier choisissez votre nom : ");
            name = clavier.nextLine();
            joueur = new Guerrier(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + joueur.toString());
            choice = "";
        }
        if (choice.equals("wiz")) {
            System.out.println("Vous êtes donc un magicien choisissez votre nom : ");
            name = clavier.nextLine();
            joueur = new Magicien(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + joueur.toString());
            choice = "";
        }

        if (choice.equals("q")) {
            System.out.print("pk tu quitte mon jeu t'est complètement maboul");
            System.exit(0);
        }

        System.out.println("Serait t'il enfin temps de commencer votre long(non) périple ? [y] or [n]");
        choice = clavier.nextLine();


        if (choice.equals("n")) {
            System.out.println("Très bien, je fait disparaître le personnage que vous avez créé, dit au revoir " + name);
            System.exit(0);
        }

        if (choice.equals("y")) {
            int caseLoc = Board.whereAmI();
            choice = "";
            String cmd = "\"C'est parti !\n" +
                    "\n" +
                    "\"Voici les commandes que tu peut utiliser le long de ton aventure : \n" +
                    "\"[cmd] Pour afficher ce menu de commandes\n" +
                    "\"[stat] Pour voir le Status de ton personnage\n" +
                    "\"[quit] Pour quitter la partie\n" +
                    "\"[de] Pour lancer le dé\n" +
                    "\"[f] Pour lancer un combat\n" +
                    "\"[run] Pour tenter de fuir\n" +
                    "\n" +
                    "\"Votre périple commence ici ! Lancez votre dé pour commencer !";
            System.out.println(cmd);
            while (caseLoc < 64) {
                choice = clavier.nextLine();

                if (choice.equals("de")) {
                    int diceRoll = Dice.diceRoll();
                    caseLoc = caseLoc + diceRoll;
                    System.out.println("Vous lancez le dé et faite un : [" + diceRoll + "] \n" +
                            "Vous vous situez désormais sur la case [" + caseLoc + "] du plateau");
                }
                if (choice.equals("cmd")) {
                    System.out.println(cmd);
                }
                if (choice.equals("quit")) {
                    System.out.println("Vous êtes sur de vouloir quitter ? Rien ne sera sauvegardé ! [y] or [n]");
                    choice = clavier.nextLine();
                    if (choice.equals("y")) {
                        System.exit(0);
                    }
                    if (choice.equals("n")) {
                        System.out.println("Tès bien ! Vous pouvez continuer.");
                    }
                }
                if (choice.equals("stat")) {
                    System.out.println("Vos stats : " + joueur.toString());
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
            clavier.close();

        }
    }
}
