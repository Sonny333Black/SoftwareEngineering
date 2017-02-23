package Zettel4.src.main.java.de.hs_fl.se;

/**
 * Created by milena on 27/10/2016.
 */
public class ClassUnderTest {
    private ICollaborator listener;

    public void setListener(ICollaborator listener) {
        this.listener = listener;
    }

    protected boolean addDocument(String title, byte[] doc) {
        //imagine some logic you want to test here
        listener.documentAdded(title);
        return true;
    }

    public boolean removeDocument(String title){
        return false;
    }
    public boolean removeDocuments(String[] titles){
        return false;
    }




}
