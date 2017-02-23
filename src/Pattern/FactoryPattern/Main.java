package Pattern.FactoryPattern;
import Pattern.FactoryPattern.factories.SimpleMonsterFactory;
import Pattern.FactoryPattern.model.IMonster;



/**
 * Demo for a simple factory. Refactor this code
 */
public class Main {
    public static void main (String[] args) {
        IMonster monster = SimpleMonsterFactory.createMonster();
        System.out.print("test");
        System.out.print(monster.getDescription());
    }
}
