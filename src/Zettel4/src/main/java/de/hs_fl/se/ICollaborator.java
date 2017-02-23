package Zettel4.src.main.java.de.hs_fl.se;

/**
 * Created by milena on 27/10/2016.
 */
public interface ICollaborator {
    void documentAdded(String title);
    void documentChanged(String title);
    void documentRemoved(String title);
}
