package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://google.com");
		/*WebElement element=driver.findElement(By.tagName("form"));
		element.findElement(By.name("q")).sendKeys("love", Keys.ENTER)*/;//FINDING ELEMNET INSIDE ANOTHER ELEMENT
		
		//hOW TO GET AN active elemnrt(element I am working on)
		
		driver.get("https://google.com");
		WebElement searchbox =driver.findElement(By.name("q")).sendKeys("Love");
		

	}

}
