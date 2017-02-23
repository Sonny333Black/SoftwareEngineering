package Zettel8;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 * Created by Sonny on 14.01.2017.
 */
public class View implements Observer {

    protected static Controller cont;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Neuerkurs: "+arg.toString());
    }

    public void main(){
        cont = new Controller(this);
        double betrag,betrag2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Betrag ein? (double)");
        betrag = scan.nextDouble();
        betrag2 = cont.calc(betrag);
        System.out.println("Das sind in Rubin: "+betrag2);
    }
}
