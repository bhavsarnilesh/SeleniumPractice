package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class RakutenDemoAuto {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	String projectPath=System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.rakuten.com.tw/#");
    driver.findElement(By.linkText("登入")).click();
    driver.findElement(By.xpath("//div[@id='scrollingLayer']/div[2]/div[4]/div/div/div/div/label/div/input")).click();
    driver.findElement(By.xpath("//div[@id='scrollingLayer']/div[2]/div[4]/div/div/div/div/label/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='scrollingLayer']/div[2]/div[4]/div/div/div/div/label/div/input")).sendKeys("qatester@mail.rakuten.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(必須)'])[2]/following::div[9]")).click();
    driver.findElement(By.id("password_current")).click();
    driver.findElement(By.id("password_current")).clear();
    driver.findElement(By.id("password_current")).sendKeys("qatester");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='顯示密碼'])[1]/following::div[10]")).click();
  }

  @AfterClass(alwaysRun = true)
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
