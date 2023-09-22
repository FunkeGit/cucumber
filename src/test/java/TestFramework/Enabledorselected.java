package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabledorselected {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app");
		
		WebElement Radiobutton=driver.findElement(By.cssSelector("#female"));
		
		System.out.println(Radiobutton.isEnabled());
		System.out.println(Radiobutton.isSelected());
		// TODO Auto-generated method stub

	}

}
