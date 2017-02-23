package UebungZuPattern.FactoryPatternUebung.Monster;

import Pattern.FactoryPattern.model.Alien;
import Pattern.FactoryPattern.model.IMonster;
import Pattern.FactoryPattern.model.Monster;
import Pattern.FactoryPattern.model.Zombie;

import java.util.Random;

/**
 * Created by Sonny on 15.01.2017.
 */
public class MonsterFactory {
    public static IMonster createMonster(){
        IMonster monster;

        Random rn = new Random();
        //random.nextInt(max - min + 1) + min
        int randomNumber = rn.nextInt(2) + 1;

        switch(randomNumber) {
            case 1: monster = new Zombie();
                break;
            case 2: monster = new Alien();
                break;
            default: monster = new Monster();
                break;
        }
        return monster;
    }
}
