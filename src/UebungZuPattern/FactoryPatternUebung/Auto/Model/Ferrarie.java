package UebungZuPattern.FactoryPatternUebung.Auto.Model;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Ferrarie implements IAuto {
    @Override
    public int getAutoPreis() {
        return 312123123;
    }

    @Override
    public String getAutoName() {
        return "Ferrarie";
    }
}
