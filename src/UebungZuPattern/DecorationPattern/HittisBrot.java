package UebungZuPattern.DecorationPattern;

/**
 * Created by Sonny on 17.01.2017.
 */
public class HittisBrot implements ISub {
    @Override
    public int preis() {
        return 50;
    }

    @Override
    public String name() {
        return "Hittis Brot";
    }
}
