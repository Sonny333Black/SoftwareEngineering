package Zettel2.stefan;

import java.util.ArrayList;

/**
 * Der Warenkorb besteht aus mehreren Produkten
 */
class Warenkorb  {
    private ArrayList<Produkt> produkte = new ArrayList<>();

    public ArrayList<Produkt> getProdukte() {

        return produkte;
    }

    public double getGesamtpreis() {
        double gesamt = 0.0;

        for (Produkt p : produkte) {
            gesamt += p.getPreis() * p.getAnzahl();
        }

        return gesamt;
    }
}
