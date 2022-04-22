import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("wendriver.chrome.drier",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
//		DesiredCapabilities caps= DesiredCapabilities.chrome();
//		caps.setCapability(caps.pla, true);
		
		//WebDriver driver= new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
//	start-maximized: Opens Chrome in maximize mode
//	incognito: Opens Chrome in incognito mode
//	headless: Opens Chrome in headless mode
//	disable-extensions: Disables existing extensions on Chrome browser
//	disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//	make-default-browser: Makes Chrome default browser
//	version: Prints chrome browser version
//	disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software

		
		//driver.get("https://google.com/");
//		driver.findElement(By.name("q")).sendKeys("Automations");
//		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
//		driver.close();
	}

}
