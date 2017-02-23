package Pattern.FactoryPattern.factories;

import Pattern.FactoryPattern.model.Alien;
import Pattern.FactoryPattern.model.IMonster;
import Pattern.FactoryPattern.model.Monster;
import Pattern.FactoryPattern.model.Zombie;

import java.util.Random;

/**
 * Created by milena
 */
public class SimpleMonsterFactory {
    public static IMonster createMonster(){
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
        return monster;
    }
}
