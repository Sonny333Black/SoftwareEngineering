package Pattern.AbstractFactory;

import Pattern.AbstractFactory.factories.GraveyardLevelFactory;
import Pattern.AbstractFactory.factories.ILevelFactory;
import Pattern.AbstractFactory.model.IMonster;

/**
 * Created by milena
 * Demonstrates the use of the abstract factory pattern. Please compare to your UML diagram from the blackboard
 */
public class Main {
    public static void main (String[] args) {
        //in this example we know the concrete implementation of the factory. In another scenario it might be injected
        //with dependency injection or likewise so that we can work with the abstract type / interface only
        ILevelFactory graveYard = new GraveyardLevelFactory();

        IMonster monster = graveYard.createMonster();

        //test to see that the correct concrete monster is created
        System.out.println(monster.getDescription());

    }
}
