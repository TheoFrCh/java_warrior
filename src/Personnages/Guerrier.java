package Personnages;



public class Guerrier {

    private String name;
    private String picture;
    private int hp = 5;
    private int attack = 5;

    public Guerrier() {
        name = "";
    }

    public Guerrier (String name){
        this.name=name;
    }

    public Guerrier(String name, String picture, int hp, int attack) {
        this.name = name;
        this.picture = picture;
        this.hp = hp;
        this.attack = attack;
    }

    public void setName() {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }
}

