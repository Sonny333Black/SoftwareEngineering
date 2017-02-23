package UebungZuPattern.FactoryPatternUebung.Auto;

import UebungZuPattern.FactoryPatternUebung.Auto.Model.IAuto;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Auto {
    public static void main(String args[]){
        IAuto auto = new Autofactory().macheAuto();
        System.out.println("Name: "+auto.getAutoName()+" Preis: "+auto.getAutoPreis());
        auto = new Autofactory().macheAuto();
        System.out.println("Name: "+auto.getAutoName()+" Preis: "+auto.getAutoPreis());
        auto = new Autofactory().macheAuto();
        System.out.println("Name: "+auto.getAutoName()+" Preis: "+auto.getAutoPreis());
    }
}
