package Pattern.DecoratorPattern;
/**
 * Implementation based on https://www.philipphauer.de/study/se/design-pattern/decorator.php
 */
public class Main {

    public static void main(String[] args) {
        IGericht gericht = new Pommes(new Steak());
        gericht.druckeBeschreibung();
        //Steak mit Pommes
        System.out.println(" für "+gericht.getPreis() + " Euro");


        gericht = new Suppe(gericht);
        gericht.druckeBeschreibung();
        //Steak, Pommes, Suppe
        System.out.println(" für "+gericht.getPreis() + " Euro");

    }
}
