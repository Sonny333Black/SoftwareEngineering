package Zettel4;
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import java.util.ArrayList;

//import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertEquals;

/**
 * Solution for exercise 4
 */
@RunWith(EasyMockRunner.class)
public class WeblogBookmarkTest {

    @Mock
    private WeblogBookmarkFolder mock = createMock(WeblogBookmarkFolder.class);
    @TestSubject
    private WeblogBookmark classUnderTest = new WeblogBookmark();

    @Before
    public void setUp() {
        System.out.println("blubb");
        //mock = createMock(WeblogBookmarkFolder.class);
        //classUnderTest = new WeblogBookmark();
    }

    @Test
    public void testCalculatePriority0() {
        ArrayList<WeblogBookmark> list = new ArrayList<WeblogBookmark>();
        list.add(new WeblogBookmark());

        EasyMock.expect(mock.getBookmarks()).andReturn(list);
        EasyMock.replay(mock);
        classUnderTest.calculatePriority();
        assertEquals("prio ist 0", new Integer(0), classUnderTest.getPriority());

    }


    @Test
    public void testCalculatePriority3() {
        ArrayList<WeblogBookmark> list = new ArrayList<WeblogBookmark>();
        WeblogBookmark bookmark1 = new WeblogBookmark();
        bookmark1.setPriority(1);

        WeblogBookmark bookmark2 = new WeblogBookmark();
        bookmark2.setPriority(2);

        WeblogBookmark bookmark3 = new WeblogBookmark();
        bookmark3.setPriority(3);

        WeblogBookmark bookmark4 = new WeblogBookmark();
        bookmark4.setPriority(7);

        list.add(bookmark1);
        list.add(bookmark2);
        list.add(bookmark3);
        list.add(bookmark4);

        EasyMock.expect(mock.getBookmarks()).andReturn(list).times(2);
        EasyMock.replay(mock);

        classUnderTest.calculatePriority();
        assertEquals("prio ist 3", new Integer(2), classUnderTest.getPriority());

    }
}