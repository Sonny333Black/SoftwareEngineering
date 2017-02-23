package Zettel3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Sonny on 13.01.2017.
 */
public class JUnitTest {
    @Test
    public void testAufgabe1(){
        Aufgabe1 testObj = new Aufgabe1();
        assertEquals(true,testObj.checkMat(301821));
    }

    @Test
    public void testAufgabe2(){
        Aufgabe2 testObj = new Aufgabe2();

        assertEquals(Aufgabe2.Art.gleichschenklig,testObj.bestimmeDreieck(3,2,3));
        assertEquals(Aufgabe2.Art.dreiecksUngleichung,testObj.bestimmeDreieck(3,3,7));
        assertEquals(Aufgabe2.Art.gleichseitig,testObj.bestimmeDreieck(2,2,2));
        assertEquals(Aufgabe2.Art.keinDreieck,testObj.bestimmeDreieck(6,0,1));
        assertEquals(Aufgabe2.Art.ungleichseitig,testObj.bestimmeDreieck(3,2,1));

    }
    @Test
    public void eigeneTests(){
        EigeneAufgabe testObj = new EigeneAufgabe();

        //assertNotEquals(Integer.MAX_VALUE, testObj.randomInt());


        assertEquals(4,testObj.ggtIt(12,8));


    }
}
