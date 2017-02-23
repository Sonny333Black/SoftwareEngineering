package Zettel3;

/**
 * Created by Sonny on 13.01.2017.
 */
public class Aufgabe1 {
    protected boolean anmeldungZurKlausur(int matrikelnummer, String fach){
        switch (fach){
            case "DB":
                if (checkMat(matrikelnummer)) return true;
            case "SPROG":
                if (checkMat(matrikelnummer)) return true;
            case "Software Engineering":
                if (checkMat(matrikelnummer)) return true;
            default:
                //geht nicht
                return false;
        }
    }

    protected boolean checkMat(int matrikelnummer){
        if(100000<=matrikelnummer&& matrikelnummer <= 9999999)
        {
            return true;
        }
        return false;
    }
}
