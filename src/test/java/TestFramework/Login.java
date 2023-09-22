package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String args[])  {
		
		WebDriver driver = new ChromeDriver();
		
		driver. get("https://devoms.omnibiz.app");
		
		//driver.navigate().to("https://devoms.omnibiz.app"); another code for launching URL
		
		
		
		System.out.println(driver.getTitle());
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Thread.sleep(2000);
		
	}

}
