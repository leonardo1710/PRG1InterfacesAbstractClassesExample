package at.ac.fhcampuswien.characters;

public abstract class Orc implements ICreature {
    protected String location;  // all subclasses can access this variable

    public Orc(String location){
        this.location = location;
    }

    public void attackRoar(){
        System.out.println("Orc attack! Grrrr!");
    }

    public void attack(){
        System.out.println("Do attack");
        this.attackRoar();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void walk(int distance) {
        System.out.println("Orc walk " + distance);
    }

    protected void eat(){
        System.out.println("mhhh lecker Hobbits.");
    }

}
