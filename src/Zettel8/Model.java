package Zettel8;

import java.util.Observable;

/**
 * Created by Sonny on 14.01.2017.
 */
public class Model extends Observable {
    private String landname;
    private String waehrungsname;
    private double wechselkurs;

    public Model() {}

    public String getLandname() {
        return landname;
    }

    public double getWechselkurs() {
        return wechselkurs;
    }

    public void setWechselkurs(double wechselkurs) {
        this.wechselkurs = wechselkurs;
        setChanged();
        this.notifyObservers(wechselkurs);
    }

    public String getWaehrungsname() {
        return waehrungsname;
    }

    public void setWaehrungsname(String waehrungsname) {
        this.waehrungsname = waehrungsname;
    }

    public void setLandname(String landname) {
        this.landname = landname;
    }







}
