import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Seleniumtest {
	public static void main (String [] args) {
		
		//System.setProperty("webdriver.gecko.driver", "/Users/Dell/eclipse-workspace/SeleniumFramework/Drivers/Gecko driver/geckodriver.exe" );
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumFramework\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.close();
		
	}

}
