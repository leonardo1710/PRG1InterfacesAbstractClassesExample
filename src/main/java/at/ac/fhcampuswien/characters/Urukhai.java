package at.ac.fhcampuswien.characters;

/**
 * Die Uruk-hai bildeten unter den Orks eine Art Elite
 * und waren nicht selten die Anführer der niederen Orks.
 */
public class Urukhai extends Orc implements Comparable<Urukhai> {

    private String name;
    private String weapon;

    public Urukhai(String name){
        super("Isengart");  // call base class constructor
        this.name = name;
    }

    @Override
    public void attackRoar(){
        System.out.println("ROOOOOOOAAR");
    }

    @Override
    public void walk(int distance) {
        System.out.println("Urukhai walk " + distance*2);
    }

    @Override
    public int compareTo(Urukhai o) {
        if(this.name.equals(o.name)){
            return 0;
        } else {
            return -1;
        }
    }
}
