package at.ac.fhcampuswien.characters;

/**
 * Die Uruk-hai bildeten unter den Orks eine Art Elite
 * und waren nicht selten die Anführer der niederen Orks.
 */
public class Urukhai extends Orc implements Comparable<Urukhai> {

    private String name;
    private int age;
    private String weapon;

    public Urukhai(String name, int age){
        super("Isengart");  // call base class constructor
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
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
        if(this.age == o.getAge()) {
            return 0;
        } else if(this.age < o.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.age;
    }
}
