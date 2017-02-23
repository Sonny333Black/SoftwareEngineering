package KlausurnaheAufgaben.Aufgabe7;

/**
 * Created by Sonny on 16.01.2017.
 */
public class Kunde {
    public Kunde(){
        Flugauskunftssystem fa = new Flugauskunftssystem();
        int preis = fa.getFlugpreis(1999,"Kuba");
        if(preis<800){
            Flugbuchungssystem fb = new Flugbuchungssystem();
            Boolean buchungsbestaeigung = fb.buchen(1992,"Kuba");
        }else{
            preis = fa.getFlugpreis(1999,"Kuba");
        }

    }
}
