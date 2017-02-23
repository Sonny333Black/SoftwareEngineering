package Zettel2.stefan;

import java.util.ArrayList;

public class TightCoupling {
    public static void main(String[] args) {
        Produkt kekse = new Produkt();
        kekse.setId(1);
        kekse.setName("Cookies");
        kekse.setAnzahl(2);
        kekse.setPreis(1.78);

        Produkt getränk = new Produkt();
        getränk.setId(2);
        getränk.setName("Milch");
        getränk.setAnzahl(1);
        getränk.setPreis(0.79);

        Warenkorb warenkorb = new Warenkorb();
        ArrayList<Produkt> produkte = warenkorb.getProdukte();

        produkte.add(getränk);
        produkte.add(kekse);

        Bestellung bestellung = new Bestellung(warenkorb);
        System.out.println("Der Gesamtpreis ist " + bestellung.getBestellungPreis());
    }
}
