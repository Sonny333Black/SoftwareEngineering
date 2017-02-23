package Zettel3;

/**
 * Created by Sonny on 13.01.2017.
 */
public class Aufgabe2 {
    protected enum Art{
        gleichseitig,
        gleichschenklig,
        ungleichseitig,
        dreiecksUngleichung,
        keinDreieck
    }

    protected Enum bestimmeDreieck(int a, int b, int c){
        if(a > 0 && b > 0 && c > 0){
            if((a+b) >= c && (a+c) >= b && (b+c) >= a){
                if(a == b || a == c || b == c){
                    if(a == b && a == c ){
                        return Art.gleichseitig;
                    }else{
                        return Art.gleichschenklig;
                    }
                }else{
                    return Art.ungleichseitig;
                }
            }else{
                return Art.dreiecksUngleichung;
            }
        }else{
            return Art.keinDreieck;
        }
    }
}
