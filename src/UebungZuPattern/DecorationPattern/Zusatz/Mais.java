package UebungZuPattern.DecorationPattern.Zusatz;

import UebungZuPattern.DecorationPattern.ISub;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Mais extends Zusatz{

    public Mais(ISub isub){
        super(isub);

    }

    @Override
    public int preis() {
        return isub.preis()+7;
    }

    @Override
    public String name() {
        return isub.name()+" und MAIS";
    }
}