package UebungZuPattern.FactoryPatternUebung.Monster;

import Pattern.FactoryPattern.model.Alien;
import Pattern.FactoryPattern.model.IMonster;
import Pattern.FactoryPattern.model.Monster;
import Pattern.FactoryPattern.model.Zombie;

import java.util.Random;

/**
 * Created by Sonny on 15.01.2017.
 */

/*
Factory	Methode
ausgelagert	werden
*/
public class AusgangsKlasse {
    public static void main (String args[]){

        //DAS ist normal nicht gegeben
        IMonster monster;


        Random rn = new Random();
        int randomNumber = rn.nextInt(1) + 1;
        switch(randomNumber) {
            case 1: monster = new Zombie();
                break;
            case 2: monster = new Alien();
                break;
            default: monster = new Monster();
                break;
        }
        System.out.println(randomNumber);
        System.out.println(monster.getDescription());
    }

}
