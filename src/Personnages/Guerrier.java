package Personnages;



public class Guerrier {

    private String name;
    private String picture = "\n" +
            "                           __.--|~|--.__                               ,,;/;\n" +
            "                         /~     | |    ;~\\                          ,;;;/;;'\n" +
            "                        /|      | |    ;~\\\\                      ,;;;;/;;;'\n" +
            "                       |/|      \\_/   ;;;|\\                    ,;;;;/;;;;'\n" +
            "                       |/ \\          ;;;/  )                 ,;;;;/;;;;;'\n" +
            "                   ___ | ______     ;_____ |___....__      ,;;;;/;;;;;'\n" +
            "             ___.-~ \\\\(| \\  \\.\\ \\__/ /./ /:|)~   ~   \\   ,;;;;/;;;;;'\n" +
            "         /~~~    ~\\    |  ~-.     |   .-~: |//  _.-~~--,;;;;/;;;;;'\n" +
            "        (.-~___     \\.'|    | /-.__.-\\|::::| //~     ,;;;;/;;;;;'\n" +
            "        /      ~~--._ \\|   /          `\\:: |/      ,;;;;/;;;;;'\n" +
            "     .-|             ~~|   |  /V\"\"\"\"V\\ |:  |     ,;;;;/;;;;;' \\\n" +
            "    /                   \\  |  ~`^~~^'~ |  /    ,;;;;/;;;;;'    ;\n" ;

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

    @Override
    public String toString() {
        return "Votre Guerrier s'appelle " +
                name + "... ,\n" +
                "ses point de vie sont de " + hp +
                "pv, \n et son attaque de " + attack +
                "points, \n Voici votre faciès : "+ picture+
                "Vous êtes laid";
    }
}

