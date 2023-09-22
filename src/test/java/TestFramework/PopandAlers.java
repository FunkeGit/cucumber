package TestFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopandAlers {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handling JS Alerts
		
		/*driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert")) 
		{
			System.out.println("You successfully clicked an alert");
		}*/
		
		//JS Confirm
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();//to cancel alerts
		
		if(driver.getPageSource().contains("You clicked: Cancel")) 
		{
			System.out.println("You clicked: Cancel");
		}
		
		//Prompt Alert
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Automation step by step");
		alert3.accept();
		
		if(driver.getPageSource().contains("You entered: Automation step by step")) 
		{
			System.out.println("You entered: Automation step by step");
		}
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
