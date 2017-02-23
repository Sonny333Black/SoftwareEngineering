package Zettel6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;

/**
 * Created by Sonny on 17.01.2017.
 */
public class PASeite {

    private WebElement q;

    public void checkNeueErgebnisse(WebDriver pagePatternDriver,int anzahlAktuellerErgebnisse) {
        List<WebElement> childs = pagePatternDriver.findElements(By.className("file--mime-application-pdf"));
        if (childs.size() > anzahlAktuellerErgebnisse) {
            System.out.println("neue Ergebnisse");
            JOptionPane.showMessageDialog(null, "Hitti bekommt 1.0 ", "Ergebnisse", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("warten");
            //JOptionPane.showMessageDialog(null,  "Hitti wartet","keine Ergebnisse", JOptionPane.WARNING_MESSAGE);
        }
    }
}
