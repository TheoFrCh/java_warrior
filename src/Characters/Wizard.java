package Characters;

public class Wizard extends Hero {

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

    @Override
    public String toString() {
        return super.toString();
    }
}