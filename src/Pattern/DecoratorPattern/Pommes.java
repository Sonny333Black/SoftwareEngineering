package Pattern.DecoratorPattern;
/**
 * Implementation based on https://www.philipphauer.de/study/se/design-pattern/decorator.php
 */
class Pommes extends Beilage {
    public Pommes(IGericht gericht) {
        super(gericht);
    }
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Pommes");
    }
    public double getPreis() {
        return gericht.getPreis() + 2.50;
    }
}