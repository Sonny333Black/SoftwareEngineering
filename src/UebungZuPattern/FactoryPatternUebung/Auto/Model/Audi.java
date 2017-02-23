package UebungZuPattern.FactoryPatternUebung.Auto.Model;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Audi implements IAuto {
    @Override
    public int getAutoPreis() {
        return 100000;
    }

    @Override
    public String getAutoName() {
        return "Audi";
    }
}
