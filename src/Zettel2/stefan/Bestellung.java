package Zettel2.stefan;

/**
 * Die Klasse Bestellung errechnet den Gesamtpreis und fordert den Kunden zum Zahlen auf.
 */
class Bestellung implements MehrwertsteuerPerLand {
    private Warenkorb warenkorb;

    Bestellung(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    public float getMehrwersteuerFürLand(String land) {
        float mehrwertsteuer = 0f;

        if (land.equals("DE")) {
            mehrwertsteuer = .07f;
        }

        return mehrwertsteuer;
    }

    public double getBestellungPreis() {
        double gesamt = 0.0;

        gesamt += warenkorb.getGesamtpreis();

        return gesamt * getMehrwersteuerFürLand("DE") + gesamt;
    }
}
