package TestFramework;

import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		//String firstWindow=driver.getWindowHandle();//google is the first window
		
		//driver.navigate().to("https://saucedemo.com");//code for moving to another window
		
		//System.out.println(driver.getCurrentUrl());
		
		/*driver.navigate().back();//code for going back to the previous window. e.g from saucedemo back to login
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);*/
		
		
		
		/*driver.switchTo().newWindow(WindowType.WINDOW);//CODE TO OPEN A BLANK WINDOW ON THE web
		
		driver.switchTo().newWindow(WindowType.TAB);//Code to open a new tab
		
		driver.switchTo().window(firstWindow);*/
		
		  //Checking the size of the window;height and width
		
		//driver.manage().window().getSize().getWidth();
		//driver.manage().window().getSize().getHeight();
		
		
		
		//Dimension size= driver.manage().window().getSize();
		
		//System.out.println(size.getWidth);
	//	System.out.println(size.getHeight);
		
		//driver.manage().window().setSize(new Dimension(800,600));//to set new 
		
		//CHECKING AND SETTING POSITION
		
		//driver.manage().window().getPosition().getX();
		//driver.manage().window().getPosition().getY();
		
		//Point position=driver.manage().window().getPosition();
		
		//WINDOW MANAGEMENT TO MAXIMIZE,MINIMIZE AND FULLSCREEN
		
		/*driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);*/
		
		//TAKING SCREENSHOT
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, newFile("./image1.png"));
		
		WebElement element=driver.findElement(By.cssSelector(".lnXdpd"));//taking screenshot of an element
		File scrFile2=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, newFile("./image2.png"));
		
		
		
		Thread.sleep(2000);
		
		//driver.close();//closes current window
		
		//driver.quit();//closes all the windows
		
		
	
		
		
	
		// TODO Auto-generated method stub

	}

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
