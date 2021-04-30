package Menu;

import Personnages.Guerrier;
import Personnages.Magicien;

import javax.naming.Name;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        String name;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bonjour, bienvenue dans Java warrior ! \n " +
                "Quel type de personnage voulez vous créer un Guerrier ?(tape 1)\n " +
                "Un Magicien ?(Tape 2)\n " +
                "Tu désire peut-être quitter ce merveilleux jeu ??????????? Appuie sur 3 alors...");
        choice = clavier.nextInt();
        clavier.nextLine();

        if (choice == 1) {
            System.out.println("Vous êtes donc un guerrier choisissez votre nom : ");
            name = clavier.nextLine();
            Guerrier joueur = new Guerrier(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats "+ name + ":"+ joueur.toString());

        }
        if (choice == 2) {
            System.out.println("Vous êtes donc un magicien choisissez votre nom : ");
            name = clavier.nextLine();
            Magicien joueur = new Magicien(name);
            System.out.println("Wow " + name + " c'est un... sacré nom... ");
            System.out.println("Voici tes stats "+ name + ":"+ joueur.toString());
        }
        if (choice == 3) {
            System.out.print("pk tu quitte mon jeu t'est complètement maboul");
            System.exit(0);
        }

        clavier.close();
    }
}
