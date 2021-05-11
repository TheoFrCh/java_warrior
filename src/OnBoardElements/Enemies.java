package OnBoardElements;

public abstract class Enemies {
    private String name;
    private int hp;
    private int attack;

    public Enemies(String name, int health, int attack) {
        this.name = name;
        this.hp = health;
        this.attack = attack;

    }

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

    public int getAttack() { return attack; }
    public void setAttack(int attack) {
        this.attack = attack;
    }


    public String toString() {
        return

                "     Ennemi : " + name +
                        "     Points de vie : " + hp +
                        "     Force : " + attack;
    }

}

