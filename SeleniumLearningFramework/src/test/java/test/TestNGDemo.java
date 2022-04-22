package test;


//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.GoogleSearchPage;

public class TestNGDemo {
	
	static WebDriver driver = null;
	public static String browserName= null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
	}
	
	@Test
	public static void googleSearch() {
		
		driver.get("https://www.google.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Selenium");
		//GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		//GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test completed Successfully");
	}

}
