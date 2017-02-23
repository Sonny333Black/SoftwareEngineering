package Zettel4.src.main.java.de.hs_fl.se;


import Zettel4.src.main.java.de.hs_fl.se.ClassUnderTest;
import Zettel4.src.main.java.de.hs_fl.se.ICollaborator;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Demo Easy Mock
 */
@RunWith(EasyMockRunner.class)
public class ClassUnderTestTest extends EasyMockSupport{
    @Mock
    private ICollaborator collaborator;

    @TestSubject
    private final ClassUnderTest classUnderTest = new ClassUnderTest();

    @Test
    public void testMock(){
        collaborator.documentAdded("test");
        replayAll();
        assertTrue(classUnderTest.addDocument("test", null));
        verifyAll();
    }


}
