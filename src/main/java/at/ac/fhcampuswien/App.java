package at.ac.fhcampuswien;

import at.ac.fhcampuswien.characters.Orc;
import at.ac.fhcampuswien.characters.Snaga;
import at.ac.fhcampuswien.characters.Troll;
import at.ac.fhcampuswien.characters.Urukhai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args){

        Troll troll = new Troll();
        troll.walk(10);
        troll.turnIntoStone();

        Urukhai urukhai = new Urukhai("Azog", 112);
        urukhai.attack();
        urukhai.walk(10);

        Snaga snaga = new Snaga();
        snaga.attack();
        snaga.walk(10);

        System.out.println(snaga.toString());   // calls base class toString() implementation

        Urukhai urukhai1 = new Urukhai("Bolg", 48);


        List<Urukhai> list = new ArrayList<>();
        list.add(urukhai);
        list.add(urukhai1);

        System.out.println("Before sorted");
        for(Urukhai u: list){
            System.out.println(u.toString());
        }

        Collections.sort(list);     // sorted based on compareTo implementation in Urukhai class

        System.out.println("After sorted");
        for(Urukhai u: list){
            System.out.println(u.toString());
        }

    }
}
