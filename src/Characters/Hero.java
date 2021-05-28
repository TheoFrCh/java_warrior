package Characters;

public abstract class Hero {
    /**
     * Hero Class which is parent of the Warrior and Wizard classes
     * It contains the attributes name (String) , picture (String) , hp (int) , attack (int) , maxHealth (int) ,
     * maxAttack (int)
     */
    //Attributes
    private String name;
    private String picture;
    private int hp;
    private int attack;
    private int maxHealth;
    private int maxAttack;

//Constructor
    public Hero(String name,String picture, int hp, int attack, int maxHealth, int maxAttack) {
        this.name = name;
        this.picture= picture;
        this.hp = hp;
        this.attack = attack;
        this.maxHealth = maxHealth;
        this.maxAttack = maxAttack;
    }
//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture(){
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    //To string Method
    @Override
    public String toString() {
        return  " Votre nom de héros est '" + name + '\'' +
                ", Vous avez " + hp + " points de vie"+
                ", et " + attack +" points d'attaque, voici votre faciès" + picture;
    }
}