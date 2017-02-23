package UebungZuPattern.DecorationPattern;

import UebungZuPattern.DecorationPattern.Zusatz.Kaese;
import UebungZuPattern.DecorationPattern.Zusatz.Mais;
import UebungZuPattern.DecorationPattern.Zusatz.Tomaten;

/**
 * Created by Sonny on 17.01.2017.
 */
public class SubwayShop {


    public static void main (String args[]){
        System.out.println("Hier ist der Subway Shop");
        ISub test1 = new Brot();
        System.out.println(test1.name()+": "+test1.preis()+"€");

        System.out.println("neuer Sub");
        ISub sub1 = new Kaese(new Brot());
        System.out.println(sub1.name()+": "+sub1.preis()+"€");

        System.out.println("neuer Sub");
        sub1 = new Tomaten(new Kaese(new Brot()));
        System.out.println(sub1.name()+": "+sub1.preis()+"€");

        System.out.println("neuer spezial Sub");
        sub1 = new Tomaten(new Kaese(new Mais(new HittisBrot())));
        System.out.println(sub1.name()+": "+sub1.preis()+"€");

    }



}
