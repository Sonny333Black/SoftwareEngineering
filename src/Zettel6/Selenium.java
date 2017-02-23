package Zettel6;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Selenium {
    private String baseUrl;
    private PageFactory seite;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private WebDriver pagePatternDriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonny\\IdeaProjects\\Selenium\\chromedriver.exe");

        pagePatternDriver = new HtmlUnitDriver();
        baseUrl = "https://blogs.apache.org";
        pagePatternDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @org.junit.Test
    public void notenAushang() throws Exception{

        pagePatternDriver.get("http://www.hs-flensburg.de/node/2438");
        int anzahlAktuellerErgebnisse = 9;

        PASeite page = PageFactory.initElements(pagePatternDriver,PASeite.class);

        while(true){
            page.checkNeueErgebnisse(pagePatternDriver,anzahlAktuellerErgebnisse);
            Thread.sleep(60000);
        }



    }
    @After
    public void tearDown() throws Exception {
        pagePatternDriver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            pagePatternDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            pagePatternDriver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = pagePatternDriver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
