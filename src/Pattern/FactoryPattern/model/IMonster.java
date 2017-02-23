package Pattern.FactoryPattern.model;

/**
 * Created by milena
 * Interface for monsters that are created by the abstract factory.
 */
public interface IMonster {

    public int getHitPoints();
    public double getVelocity();
    public IWeapon getWeapon();
    public String getDescription();

}
