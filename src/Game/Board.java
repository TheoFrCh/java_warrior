package Game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cellList;

    public Board(){
        cellList = new ArrayList<>();
        init();
    }

    public void init(){
        cellList.add(new Cell(1));

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
