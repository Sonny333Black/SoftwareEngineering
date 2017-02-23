package Zettel8;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sonny on 14.01.2017.
 */
public class JUnitTest {
    private Controller cont;

    @Before
    public void setUp(){
        cont = new Controller(new View());
    }

    @Test
    public void testCalc(){
        assertEquals(72.39, cont.calc(1),0);
        //assertEquals(cont.model.getWechselkurs(),cont.calc(1),DELTA);
    }


}
