package UebungZuPattern.DecorationPattern;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Brot implements ISub {
    @Override
    public int preis() {
        return 5;
    }

    @Override
    public String name() {
        return "Brot";
    }
}
