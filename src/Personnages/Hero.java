package Personnages;

public class Hero {
    private String name;
    private int hp;
    private int attack;
    private int maxHealth;
    private int maxAttack;


    public Hero(String name, int hp, int attack, int maxHealth, int maxAttack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.maxHealth = maxHealth;
        this.maxAttack = maxAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int healthMax) {
        this.maxHealth = healthMax;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int attackMax) {
        this.maxAttack = maxAttack;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}