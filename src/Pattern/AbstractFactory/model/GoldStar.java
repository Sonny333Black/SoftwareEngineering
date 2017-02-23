package Pattern.AbstractFactory.model;

/**
 * Created by milena on 21/10/14.
 * Demo implementation of an IItem
 */
public class GoldStar implements IItem {
    @Override
    public int getBonusPoints() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "I am a golden Star";
    }
}
