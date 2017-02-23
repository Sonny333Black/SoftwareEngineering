package UebungZuPattern.BuilderPattern;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Klausur1");
        SE klausur1 = new SEBuilder("Tests","Malen").erstelleKlausur();
        klausur1.ausgabe();

        System.out.println("Klausur2");
        SE klausur2 = new SEBuilder("Maven","UML","POM","Unit").erstelleKlausur();
        klausur2.ausgabe();
    }

}
