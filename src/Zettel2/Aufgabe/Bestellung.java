package Zettel2.Aufgabe;

/**
 * Die Klasse Bestellung errechnet den Gesamtpreis und fordert den Kunden zum Zahlen auf.
 */
public class Bestellung {

    public Warenkorb warenkorb;


    public Bestellung (Warenkorb warenkorb){
        this.warenkorb = warenkorb;
    }

    public double getGesamtpreis() {
        double gesamt = 0.0;

        for (int i=0; i<warenkorb.produkte.length;i++) {
            Produkt produkt = warenkorb.produkte[i];
            gesamt = gesamt + produkt.preis * produkt.anzahl;
        }
        MehrwertsteuerPerLand mehrwert = new MehrwertsteuerPerLand();


        return gesamt*mehrwert.getMehrwersteuerFürLand("DE") + gesamt;

    }
}
