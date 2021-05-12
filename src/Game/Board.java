package Game;

import OnBoardElements.EmptyCell;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cellList;

    //Create an arrayList

    public Board(){
        cellList = new ArrayList<>();
        init();
    }
    //Adding an init function to the board which will create the 64 emptyCell to the board when used

    public void init(){
        for (int i=0;i<64; i++) {
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
