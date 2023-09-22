package TestFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		// WebElement searchBox=driver.findElement(By.name("q"));
		// searchBox.sendKeys("Love", Keys.ENTER);
		
		driver.navigate().to("https://trytestingthis.netlify.app/");
		
		List<WebElement> options=driver.findElements(By.name("Optionwithcheck[]"));//locating multiple elements
		
		for(WebElement element : options) 
		{
			
			System.out.println(element.getText());
		}
		
		//Best way to locate web element ID, Css Selector(#id,.classname), XPATH, Relative Locators(to locate element that have no dynamic locator).
		
		
		// TODO Auto-generated method stub

	}

}
