package demo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITDemo {

	static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
		
//		driver.get("https://rms.rakuten.com.tw/provisional_login");
//		driver.findElement(By.xpath("//input[@id='authenticate_email_address']")).sendKeys("alkash@cybage.com");
//		driver.findElement(By.xpath("//input[@id='authenticate_password']")).sendKeys("Rakuten@12");
//		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.ENTER);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='circle hero-1']")));
//		driver.findElement(By.xpath("//div[@class='circle hero-1']")).click();
		
		
//		By selector = By.xpath("//div[@class='circle hero-1']");

		//finding the list of all elements
//		List<WebElement> list = driver.findElements(selector);

		/*Iterating over the collection may throw StaleElementReference exception due to DOM refresh
		according to my knowledge for loop is best in such case
		*/
//		for (int i = 0; i<list.size(); i++){

//		    new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(selector));

		    //Click on the title
//		    driver.findElements(selector).get(i).click();

		    //Navigating back to the main page. This is not feasible but no other option present due to page structure
		    //driver.navigate().back();
		}
}

