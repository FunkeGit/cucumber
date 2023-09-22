package TestFramework;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActuions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		//Actions class is used to automate keys on the keyboard
		
		Actions actionprovider=new Actions(driver);
		
		Actions keydown=actionprovider.keyDown(Keys.CONTROL).sendKeys("a").build();
		
		keydown.perform();

	}

}
