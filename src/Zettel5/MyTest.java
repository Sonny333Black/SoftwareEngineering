package Zettel5;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class MyTest {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sonny\\IdeaProjects\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.de/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.get("http://www.hs-flensburg.de/");
		driver.findElement(By.name("keys")).clear();
		driver.findElement(By.name("keys")).sendKeys("Gajek");
		driver.findElement(By.id("edit-submit")).click();
		//Hier nur ein assert --
		//Thread.sleep(500);
		assertTrue(isElementPresent(By.tagName("li")));
	}

	@Test
	public void testzettel5() throws Exception {
		driver.get("https://blogs.apache.org");
		assertTrue(isElementPresent(By.cssSelector("div.dayTitle")));
		assertTrue(isElementPresent(By.cssSelector("p.entryDescription")));
		assertTrue(isElementPresent(By.linkText("Read more...")));
		driver.findElement(By.linkText("Read more...")).click();
		assertTrue(isElementPresent(By.cssSelector("p.entryTitle")));
		assertTrue(isElementPresent(By.cssSelector("div.entryBox")));
		assertTrue(isElementPresent(By.id("q")));
		driver.findElement(By.id("q")).click();
		driver.findElement(By.id("q")).sendKeys("Trump4praesi");
		Thread.sleep(500);
		driver.findElement(By.id("searchbutton")).click();
		assertEquals("Showing 1 - 0 of total 0 search results", driver.findElement(By.cssSelector("h3")).getText());
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
