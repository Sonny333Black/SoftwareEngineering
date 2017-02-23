package UebungZuPattern.FactoryPatternUebung.Monster;

import Pattern.FactoryPattern.model.IMonster;

/**
 * Created by Sonny on 15.01.2017.
 */
public class Main {

    public static void main(String args[]){
        for(int i=0;i<10;i++){
            IMonster monster = MonsterFactory.createMonster();
            System.out.println(monster.getDescription());
        }
    }
}
