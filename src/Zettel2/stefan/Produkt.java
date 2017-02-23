package Zettel2.stefan;

/**
 * Ein Produkteintrag im Warenkorb
 */
class Produkt {
    // Produktid
    private int id;
    // Name des Produkts
    private String name;
    // Preis des Produkts
    private double preis;
    // Anzahl der Produkte im Warenkorb
    private int anzahl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
