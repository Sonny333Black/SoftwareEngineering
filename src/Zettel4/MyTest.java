package Zettel4;import Zettel4.src.main.java.de.hs_fl.se.ClassUnderTest;
import Zettel4.src.main.java.de.hs_fl.se.ICollaborator;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sonny on 02.11.2016.
 */
public class MyTest extends EasyMockSupport {

    @Mock
    private WeblogBookmarkFolder folder;

    @TestSubject
    private final WeblogBookmarkFolder folderTest = new WeblogBookmarkFolder();

@Test
public void hittisTest(){
    WeblogBookmark testObj = new WeblogBookmark();
    testObj.setName("hitti");
    String sonny = "sonny";
    String amelandirlich ="amelandirlich.de";
    testObj.setId(sonny);
    testObj.setUrl(amelandirlich);
    assertEquals("hitti",testObj.getName());
    assertEquals("{"+sonny+", "+amelandirlich+"}",testObj.toString());
}

    @Test
    public void test(){
        WeblogBookmark hittiBookmark = new WeblogBookmark();
        WeblogBookmarkFolder folder = new WeblogBookmarkFolder();

        folder.addBookmark(hittiBookmark);
        folder.setName("test");
        Assert.assertEquals("test",folder.getName());
    }
}
