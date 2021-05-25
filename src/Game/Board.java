package Game;

import Items.LightningBolt;
import OnBoardElements.Dragons;
import OnBoardElements.EmptyCell;
import OnBoardElements.Goblins;
import OnBoardElements.Witches;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cellList;

    //Create an arrayList

    public Board() {
        cellList = new ArrayList<>();
        init();
    }
    //Adding an init function to the board which will create the 64 emptyCell to the board when used

    public void init() {

        for (int i = 0; i < 64; i++) {
            if (i == 3 & i == 6 && i == 9 & i == 12 & i == 15 & i == 18 & i == 21 && i == 24 & i == 27 & i == 30) {
                cellList.add(new Goblins());
            }
            if (i == 10 & i == 20 & i == 25 & i == 32 & i == 35 & i == 36 & i == 37 & i == 40 & i == 44 & i == 47){
                cellList.add(new Witches());
            }
            if (i == 45 & i == 52 & i == 56 & i == 62){
                cellList.add(new Dragons());
            }
                cellList.add(new EmptyCell(i));
        }
    }

    //Getter
    public Cell getCell(int index) {
        return cellList.get(index);
    }

    //To string method
    @Override
    public String toString() {
        return "Board{" +
                "cellList=" + cellList +
                '}';
    }
}
