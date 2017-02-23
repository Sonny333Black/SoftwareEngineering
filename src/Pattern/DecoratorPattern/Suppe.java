package Pattern.DecoratorPattern;
/**
 * Implementation based on https://www.philipphauer.de/study/se/design-pattern/decorator.php
 */
class Suppe extends Beilage {
    public Suppe(IGericht gericht) {
        super(gericht);
    }

    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Suppe");
    }

    public double getPreis() {
        return gericht.getPreis() + 1.50;
    }
}

