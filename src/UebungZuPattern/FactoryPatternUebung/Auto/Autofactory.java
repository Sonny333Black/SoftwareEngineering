package UebungZuPattern.FactoryPatternUebung.Auto;

import Pattern.FactoryPattern.model.Zombie;
import UebungZuPattern.FactoryPatternUebung.Auto.Model.Audi;
import UebungZuPattern.FactoryPatternUebung.Auto.Model.BWM;
import UebungZuPattern.FactoryPatternUebung.Auto.Model.Ferrarie;
import UebungZuPattern.FactoryPatternUebung.Auto.Model.IAuto;

import java.util.Random;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Autofactory implements IAutofactory {


    @Override
    public IAuto macheAuto() {
        Random rn = new Random();
        //random.nextInt(max - min + 1) + min
        int randomNumber = rn.nextInt(2) + 1;

        switch(randomNumber) {
            case 1:
                return new Audi();
            case 2:
                return new BWM();
            default :
                return new Ferrarie();
        }
    }
}
