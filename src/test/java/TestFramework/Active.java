package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Active {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		
		
		//String Text=searchbox.getText();
		//String Tag=searchbox.getTagName();//to get tagname
		//String css=searchbox.getCssValue("color");
		
		//System.out.println(Text);
		
		//driver.findElement(By.className("LC20lbMBeuODKV0Md")).click();
		
		//String title=driver.switchTo().activeElement().getAttribute("title");//to get attribute of active element
		
		System.out.println(title);
		// TODO Auto-generated method stub

	}

}
