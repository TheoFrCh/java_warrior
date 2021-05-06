package Game;

public class Dice {
    public static int diceRoll() {
        int dice = (int)(Math.random()*6) + 1;
        return dice;
    }
}
