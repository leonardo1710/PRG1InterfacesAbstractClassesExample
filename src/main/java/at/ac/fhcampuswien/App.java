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

        Urukhai urukhai = new Urukhai();
        urukhai.attack();

        System.out.println(urukhai.toString());

        Snaga snaga = new Snaga();
        snaga.attack();
        System.out.println(snaga.toString());


        urukhai.walk(10);

    }
}
