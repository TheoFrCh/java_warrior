package Jeu;

import Personnages.Guerrier;
import Personnages.Hero;
import Personnages.Magicien;

import java.util.Scanner;

public class Menu {
    public void choixPerso() {
        int choice;
        String name = "";
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bonjour, bienvenue dans Java warrior ! \n " +
                "Quel type de personnage voulez vous créer, un Guerrier ?(tape 1)\n " +
                "Un Magicien ?(Tape 2)\n " +
                "Tu désire peut-être quitter ce merveilleux jeu ??????????? Appuie sur 3 alors...");
        choice = clavier.nextInt();
        clavier.nextLine();

        if (choice == 1) {
            System.out.println("Vous êtes donc un guerrier choisissez votre nom : ");
            name = clavier.nextLine();
            Hero joueur = new Guerrier(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + joueur.toString());
            choice = 0;

        }
        if (choice == 2) {
            System.out.println("Vous êtes donc un magicien choisissez votre nom : ");
            name = clavier.nextLine();
            Hero joueur = new Magicien(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats " + name + ":" + joueur.toString());
            choice = 0;
        }

        if (choice == 3) {
            System.out.print("pk tu quitte mon jeu t'est complètement maboul");
            System.exit(0);
        }

        System.out.println("Serait t'il enfin temps de commencer votre long(non) périple ? (1=non 2=oui)");
        choice = clavier.nextInt();


        if (choice == 1) {
            System.out.println("Très bien, je fait disparaître le personnage que vous avez créé, dit au revoir à " + name + " j'espère qu'il ne pèsera pas trop lourd dans ta conscience");
            System.exit(0);
        }

        if (choice == 2) {
            int caseLoc = Plateau.whereAmI();

            while (caseLoc < 64) {
                int diceRoll = De.diceRoll();
                System.out.println("C'est parti alors ton personnage à un dé et il est obligé de le lancer pour avancer, bizarre non ? Le dé se lance... et affiche le nombre : " + diceRoll+ "\n" +
                        "Et vous vous situez sur la case "+caseLoc);
                caseLoc = caseLoc + diceRoll;

            }
            if (caseLoc >= 64) {
                System.out.print("                                 _         _       _   _                 \n" +
                        "                                | |       | |     | | (_)                \n" +
                        "  ___ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___ \n" +
                        " / __/ _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __|\n" +
                        "| (_| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\\n" +
                        " \\___\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___/\n" +
                        "                  __/ |                                                  \n" +
                        "                 |___/                                                   ");
            }
            clavier.close();
        }
    }
}
