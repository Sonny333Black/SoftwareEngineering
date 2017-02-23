package Zettel2.Aufgabe;
/**
 * Testanwendung
 */
public class TightCoupling {
    public static void main(String[] args){

        Produkt kekse = new Produkt();
        kekse.id = 1;
        kekse.name = "Cookies";
        kekse.anzahl = 2;
        kekse.preis = 1.78;

        Produkt getränk = new Produkt();
        getränk.id = 2;
        getränk.name = "Milch";
        getränk.anzahl = 1;
        getränk.preis = 0.79;

        Warenkorb warenkorb = new Warenkorb();

        Produkt[]  produkte = new Produkt[2];
        produkte[0] = getränk;
        produkte[1] = kekse;

        warenkorb.produkte = produkte;

        Bestellung bestellung = new Bestellung(warenkorb);
        System.out.println("Der Gesamtpreis ist " + bestellung.getGesamtpreis());


    }
}
