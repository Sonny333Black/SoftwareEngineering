package UebungZuPattern.DecorationPattern.Zusatz;

import UebungZuPattern.DecorationPattern.ISub;

/**
 * Created by Sonny on 17.01.2017.
 */
public abstract class Zusatz implements ISub{
    protected ISub isub;
    public Zusatz(ISub isub){
        this.isub = isub;
    }
}
