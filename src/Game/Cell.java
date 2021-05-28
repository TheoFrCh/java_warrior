package Game;


import Characters.Hero;

/** Class cell is an abstract class parent of EmptyCell and Enemies
 * It contains the attribute
 * int cell
 */

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
    /**
     * Interaction between player and mobs
     * @param player takes the parameter player
     */
    public abstract void interaction(Hero player);

    public String toString() {
        return "Vous êtes sur la case" + cell;
    }
}
