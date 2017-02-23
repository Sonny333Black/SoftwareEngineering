package Pattern.AbstractFactory.factories;

/**
 * Created by milena
 * The abstract factory for levels
 */
public interface ILevelFactory {
    /**
     * The factory method for monsters (one product family in the UML diagram)
     * @return the newly created IMonster
     */
    public Pattern.AbstractFactory.model.IMonster createMonster();

    /**
     * The factory method for items (the other product family in the UML diagram)
     * @return the newly created IMonster
     */
    public Pattern.AbstractFactory.model.IItem createItem();

}
