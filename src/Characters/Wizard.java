package Characters;

//Extending this class to the hero class

public class Wizard extends Hero {

    //Calling the constructors

    public Wizard(String name) {
        super(name, " \n" +
                "                          ____ \n" +
                "                       .'* *.'\n" +
                "                    __/_*_*(_\n" +
                "                   / _______ \\\n" +
                "                  _\\_)/___\\(_/_ \n" +
                "                 / _((\\- -/))_ \\\n" +
                "                 \\ \\())(-)(()/ /\n" +
                "                  ' \\(((()))/ '\n" +
                "                 / ' \\)).))/ ' \\\n" +
                "                / _ \\ - | - /_  \\\n" +
                "                  ( .;''';. .'  )\n" +
                "                \\\"__ /    )\\ __\"/_\n" +
                "                 \\/  \\   ' /  \\/\n" +
                "                  .'  '...' ' )\n", 3, 8, 6, 15);
    }

    //To string Method

    @Override
    public String toString() {
        return super.toString();
    }
}