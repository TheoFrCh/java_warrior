package OnBoardElements;


import Characters.Hero;
import Game.Cell;

public class EmptyCell extends Cell {
    public EmptyCell(int cell){
        super(cell);
    }

    @Override
    public void interaction(Hero player) {
        System.out.println("Rien de spécial sur cette case profitez en pour vous reposer");
    }
}
