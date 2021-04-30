package Personnages;

public class Magicien {
    private String name;
    private String picture = "\n" +
            "                     ____ \n" +
            "                  .'* *.'\n" +
            "               __/_*_*(_\n" +
            "              / _______ \\\n" +
            "             _\\_)/___\\(_/_ \n" +
            "            / _((\\- -/))_ \\\n" +
            "            \\ \\())(-)(()/ /\n" +
            "             ' \\(((()))/ '\n" +
            "            / ' \\)).))/ ' \\\n" +
            "           / _ \\ - | - /_  \\\n" +
            "          (   ( .;''';. .'  )\n" +
            "          _\\\"__ /    )\\ __\"/_\n" +
            "            \\/  \\   ' /  \\/\n" +
            "             .'  '...' ' )\n";
    private int hp = 3;
    private int attack = 8;

    public Magicien() {
        name = "";
    }

    public Magicien(String name) {
        this.name = name;
    }

    public Magicien(String name, String picture, int hp, int attack) {
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

    @Override
    public String toString() {
        return "Votre Magicien s'appelle " +
                name + "... ,\n" +
                "ses point de vie sont de " + hp +
                "pv, \n et son attaque de " + attack +
                "points, \n Voici votre faciès : " + picture +
                "Vous êtes laid";
    }
}
