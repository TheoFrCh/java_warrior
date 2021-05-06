package Objets;

public class Arme {
    private String name;
    private int force;

    public Arme(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int force() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Arme{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }
}
