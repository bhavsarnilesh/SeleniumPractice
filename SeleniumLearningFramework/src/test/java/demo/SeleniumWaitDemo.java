package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWaitDemo {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	public void seleniumWaits() {
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Implicite wait pulling time : 250 ms 
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		
		driver.findElement(By.name("abcd")).click();
		
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
