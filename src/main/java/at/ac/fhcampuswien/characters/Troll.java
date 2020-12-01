package at.ac.fhcampuswien.characters;

public class Troll implements ICreature, ICanTurnIntoStone {    // classes can implement multiple interfaces
    private boolean isTurnedToStone = false;

    @Override
    public void turnIntoStone() {
        System.out.println("Troll turned to stone.");
        this.isTurnedToStone = true;
    }

    @Override
    public void walk(int distance) {
        System.out.println("Troll walk " + distance);
    }
}
