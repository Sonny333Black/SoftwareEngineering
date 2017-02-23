package Pattern.DecoratorPattern;
/**
 * Implementation based on https://www.philipphauer.de/study/se/design-pattern/decorator.php
 */
public class Steak implements IGericht {

    public void druckeBeschreibung() {
        System.out.print("Hüftsteak");
    }

    public double getPreis() {
        return 13.0;
    }

}
