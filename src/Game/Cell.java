package Game;


public abstract class Cell {
    private int cell;

    public Cell(int cell) {
        this.cell = cell;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }


    public String toString() {
        return "Vous êtes sur la case" + cell;
    }
}
