package Pattern.AbstractFactory.model;


/**
 * Created by milena on 02/10/14.
 * Demo monster implementation
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
