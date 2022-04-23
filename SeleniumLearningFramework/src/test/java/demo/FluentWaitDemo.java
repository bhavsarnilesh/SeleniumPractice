package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.w3c.dom.html.HTMLLinkElement;

import com.google.common.base.Function;

public class FluentWaitDemo {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		test();
	}

	public static void test() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				

		Wait<WebDriver> wait = new FluentWait(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement = driver.findElement(By.linkText("https://en.wikipedia.org/wiki/Automation"));
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element Found");
		       }
		       
		       return linkElement;
		       
		     }
		   });
		
		
		element.click();
		driver.close();
	}
	
}
