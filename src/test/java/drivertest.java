import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class drivertest {
	public static void main(String [] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		

	//	WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https:saucedemo.com");
		WebElement username = driver.findElement(By.id("user-name"));
		
		username.sendKeys("standard_user");
		
		WebElement Password =driver.findElement(By.id("password"));
		
		Password.sendKeys("secret_sauce");
		
		
		
		WebElement Loginbutton=driver.findElement(By.id("login-button"));
		Loginbutton.click();
		
		//List<WebElement> listsofxpathElement=driver.findElements(By.xpath("//input"));
		
		//int count=listsofxpathElement.size();
		
		//System.out.println("count of xpathElement" : "+count");

		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
