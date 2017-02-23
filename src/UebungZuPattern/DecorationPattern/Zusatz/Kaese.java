package UebungZuPattern.DecorationPattern.Zusatz;

import UebungZuPattern.DecorationPattern.ISub;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Kaese extends Zusatz {

    public Kaese (ISub isub){
        super (isub);
    }
    @Override
    public int preis() {
        return isub.preis()+2;
    }

    @Override
    public String name() {
        return isub.name() + " und Käse";
    }
}
