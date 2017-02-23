package Pattern.AbstractFactory.factories;

import Pattern.AbstractFactory.model.GoldStar;
import Pattern.AbstractFactory.model.IItem;
import Pattern.AbstractFactory.model.IMonster;
import Pattern.AbstractFactory.model.Zombie;

/**
 * Created by milena
 * Concrete Implementation of the ILevelFactory. In this demo we have only one concrete implementation of the
 * {@link ILevelFactory}. In reality you will find several implementations
 */
public class GraveyardLevelFactory implements ILevelFactory {
    @Override
    public IMonster createMonster() {
        return new Zombie();
    }

    @Override
    public IItem createItem() {
        return new GoldStar();
    }
}
