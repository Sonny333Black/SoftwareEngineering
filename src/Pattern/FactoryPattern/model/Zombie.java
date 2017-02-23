package Pattern.FactoryPattern.model;


/**
 * Created by milena
 * Sample monster implementation
 */
public class Zombie implements IMonster {
    @Override
    public int getHitPoints() {
        return 0;
    }

    @Override
    public double getVelocity() {
        return 1;
    }

    @Override
    public IWeapon getWeapon() {
        return null;
    }

    @Override
    public String getDescription() {
        return "I am a zombie and lurking!";
    }

}
