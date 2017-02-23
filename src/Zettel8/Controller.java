package Zettel8;

import java.util.Observer;

/**
 * Created by Sonny on 14.01.2017.
 */
public class Controller {

    protected Model model;
    protected Observer view;

    public Controller(View view) {
        this.model = new Model();
        this.view = view;
        model.addObserver(view);
        model.setWaehrungsname("Rubin");
        model.setLandname("Indien");
        model.setWechselkurs(72.39);
    }

    public double calc(double betrag){
        double betrag2=0;
        betrag2=betrag*model.getWechselkurs();
        return betrag2;
    }


}
