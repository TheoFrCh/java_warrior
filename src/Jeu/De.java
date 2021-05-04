package Jeu;

public class De {
    public static int diceRoll() {
        int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
        return dice;
    }
}
