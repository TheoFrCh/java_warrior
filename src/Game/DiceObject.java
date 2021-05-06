package Game;

public class DiceObject {
    private int Dice;

    public DiceObject(int Dice) {
        this.Dice = Dice;
    }
    public int getDice(){return Dice;}
    public void setDice(int Dice) {Dice=Dice;}

    public String toString(){
        return "Le dé roule et affiche ... " + Dice;
    }
}
