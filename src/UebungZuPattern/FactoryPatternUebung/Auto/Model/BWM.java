package UebungZuPattern.FactoryPatternUebung.Auto.Model;

/**
 * Created by Sonny on 17.01.2017.
 */
public class BWM implements IAuto {
    @Override
    public int getAutoPreis() {
        return 124934;
    }

    @Override
    public String getAutoName() {
        return "BMW";
    }
}
