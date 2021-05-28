package OnBoardElements;

/**
 * Class which allows to init an empty cell heritage of Cell class
 * @see Game.Cell
 */

import Characters.Hero;
import Game.Cell;

public class EmptyCell extends Cell {
    public EmptyCell(int cell){
        super(cell);
    }

    /**
     * Interaction between player and mobs
     * @param player takes the parameter player
     */
    @Override
    public void interaction(Hero player) {
        System.out.println("Rien de spécial sur cette case profitez en pour vous reposer");
    }
}
