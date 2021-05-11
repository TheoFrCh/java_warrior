package Game;

import OnBoardElements.EmptyCell;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cellList;

    public Board(){
        cellList = new ArrayList<>();
        init();
    }

    public void init(){
        for (int i=0;1<64; i++) {
            cellList.add(new EmptyCell(i));
        }
    }

    public Cell getCell(int index) {
        return cellList.get(index);
    }

    @Override
    public String toString() {
        return "Board{" +
                "cellList=" + cellList +
                '}';
    }
}
