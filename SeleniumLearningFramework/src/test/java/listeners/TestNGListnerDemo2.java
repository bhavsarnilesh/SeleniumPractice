package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListnerDemo2 {
	
	@Test
	public void testA()
	{
		System.out.println("I'm Inside test1");
	}
	@Test
	public void testB()
	{
		System.out.println("I'm Inside test2");
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("web.driver.chrome", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		
		
	}
	@Test
	public void testC()
	{
		System.out.println("I'm Inside test3");
		throw new SkipException("This test case skipped");
	}
	@Test
	public void testD()
	{
		System.out.println("I'm Inside test4");
	}
	
	

}
