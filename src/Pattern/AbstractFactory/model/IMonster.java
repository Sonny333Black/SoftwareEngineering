package Pattern.AbstractFactory.model;

/**
 * Created by milena on 02/10/14.
 * Interface for monsters. Created by the abstract factory.
 */
public interface IMonster {

    public int getHitPoints();
    public double getVelocity();
    public IWeapon getWeapon();
    public String getDescription();

}
