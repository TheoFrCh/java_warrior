package OnBoardElements;

import Game.Cell;

//Attributes
public class Enemies extends Cell {
    private int cell;
    private String name;
    private int hp;
    private int attack;


//Constructor

    public Enemies (String name, int health, int attack,int cell) {
        super(cell);
        this.name = name;
        this.hp = health;
        this.attack = attack;
    }
//Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int health) {
        this.hp = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    //To string Method

    public String toString() {
        return

                "     Ennemi : " + name +
                        "     Points de vie : " + hp +
                        "     Force : " + attack;
    }

}

