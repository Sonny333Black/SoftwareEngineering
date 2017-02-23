package Zettel3;

/**
 * Created by Sonny on 13.01.2017.
 */
public class EigeneAufgabe {

    protected int randomInt(){
        int zufall = (int)Math.random();
        return zufall;
    }

    protected int ggtRe(int a,int b){
        if(b == 0){
            return a;
        }else{
            ggtRe(b,(a%b));
        }
        return 0;
    }
    protected int ggtIt(int zahl1,int zahl2){
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }
}
