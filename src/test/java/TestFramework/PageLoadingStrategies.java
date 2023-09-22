 package TestFramework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingStrategies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Page Loading Strategy: Normal,Eager and None
		
		ChromeOptions pageoptions=new ChromeOptions();
		pageoptions.setPageLoadStrategy(PageLoadStrategy.NONE);//PUT Eager where appropriate
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");

	}

}
