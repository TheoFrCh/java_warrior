package Characters;


//Extending this class to the hero class

public class Warrior extends Hero {


    //Calling the constructors

    public Warrior(String name) {

        //Setting the constructor

        super(name, "\n" +
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
                "    /                   \\  |  ~`^~~^'~ |  /    ,;;;;/;;;;;'    ;\n" ,5, 5, 10, 10);
    }

    //To string Method

    @Override
    public String toString() {
        return super.toString();
    }
}