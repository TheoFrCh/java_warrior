package Personnages;

public class Magicien extends Hero {

    public Magicien(String name) {
        super(name, "               ____ \n" +
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