package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo { 
	
	
	static WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest	
	public void setup(String browserName) {
		
		System.out.println("Browser Name is:"+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {			
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(1000);
		
	}
	
	public void teardown()
	{
		driver.close();
		System.out.println("Test Completed Successfully");
	}

	
}
