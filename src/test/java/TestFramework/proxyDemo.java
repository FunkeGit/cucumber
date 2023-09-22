package TestFramework;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import java.lang.reflect.Proxy;

public class proxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Proxy to get webservices on selenium
		
		Proxy proxy=new Proxy();
		
		proxy.setAutodetect(false);
		//proxyweb.setHttpProxy("localhost:8080");
		proxy.setSslProxy("localhost:8080");//local host means the IP address of the web app being tested
		
		ChromeOptions options=new ChromeOptions();
		options.setCapability("proxy", proxy);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://google.com");
		
		

	}

}
