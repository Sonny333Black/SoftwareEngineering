package Pattern.DecoratorPattern;
/**
 * Implementation based on https://www.philipphauer.de/study/se/design-pattern/decorator.php
 */
public abstract class Beilage implements IGericht {

    protected IGericht gericht;

    public Beilage(IGericht gericht) {
        this.gericht = gericht;
    }
}

