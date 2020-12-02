package at.ac.fhcampuswien;

import at.ac.fhcampuswien.characters.Orc;
import at.ac.fhcampuswien.characters.Snaga;
import at.ac.fhcampuswien.characters.Troll;
import at.ac.fhcampuswien.characters.Urukhai;

public class App {
    public static void main(String[] args){

        Troll troll = new Troll();
        troll.walk(10);
        troll.turnIntoStone();


        Urukhai urukhai = new Urukhai("Azog");
        urukhai.attack();
        urukhai.walk(10);

        Urukhai urukhai1 = new Urukhai("Bolg");

        System.out.println(urukhai.equals(urukhai1));   // equals method is based on comparable interface implemented in Urukhai class

        System.out.println(urukhai.toString());

        Snaga snaga = new Snaga();
        snaga.attack();
        snaga.walk(10);

        System.out.println(snaga.toString());
    }
}
