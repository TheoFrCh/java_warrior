package OnBoardElements;

import Characters.Hero;
import Game.Cell;

/**
 * Class which allows to create new enemies on the board it extends the Cell class
 * @see Cell
 */
//Attributes
public abstract class Enemies extends Cell {
    private int cell;
    private String name;
    private int hp;
    private int attack;

    //Constructor
    public Enemies(String name, int health, int attack, int cell) {
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
    /**
     * Interaction between player and mobs
     * @param player takes the parameter player
     */
    public void interaction(Hero player) {
int currentHp= player.getHp();
int enemyHp= getHealth();
        while (currentHp > 0 && enemyHp > 0) {
            currentHp = player.getHp() - getAttack();
            System.out.println("Un " + name + " vous attaque !");
            System.out.println("Le " + name + " vous inflige " + getAttack() + " de dégats ils vous reste " + currentHp + "pv");
            player.setHp(currentHp);
            enemyHp = getHealth() - player.getAttack();
            System.out.println("Vous infligez " + player.getAttack() + " de dégats ils reste " + enemyHp + " au " + name);
            setHealth(enemyHp);
        }
        if (player.getHp() <= 0) {
            System.out.println("Vous êtes Mort");
            System.exit(0);
        }
        if (getHealth() <= 0) {
            System.out.println("Vous tuez le " + name);
        }
    }

}

