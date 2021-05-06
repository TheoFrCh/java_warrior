package Game;

public class BoardObject {
    private int Case;

    public BoardObject(int Case) {
        this.Case = Case;
    }

    public int getCase() {
        return Case;
    }

    public void setCase(int Case) {
        Case = Case;
    }

    public String toString() {
        return "Vous êtes sur la case" + Case;
    }
}
