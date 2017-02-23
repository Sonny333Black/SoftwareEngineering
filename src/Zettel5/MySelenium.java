package Zettel5;

import junit.framework.Test;
import junit.framework.TestSuite;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Sonny on 14.01.2017.
 */
public class MySelenium {
    private WebDriver driver;
    private String baseUrl;
    private PageFactory seite;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonny\\IdeaProjects\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://blogs.apache.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @org.junit.Test
    public void facebook() throws Exception{
        String msg = "Dobby";
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("my@email.de");
        driver.findElement(By.id("pass")).sendKeys("");
        driver.findElement(By.id("u_0_o")).click();
        //driver.get("https://www.facebook.com/messages/");
        driver.findElement(By.cssSelector("#navItem_217974574879787 > a._5afe > div.linkWrap.noCount > span")).click();
        /*
        driver.findElement(By.cssSelector("span._l1")).click();
        driver.findElement(By.id("js_yb")).clear();
        */
        for (int i=0;i<50;i++){
            driver.findElement(By.tagName("textarea")).sendKeys(msg);
            driver.findElement(By.id("u_jsonp_2_8")).click();
        }

    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
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
