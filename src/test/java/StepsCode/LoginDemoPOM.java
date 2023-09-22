package StepsCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPagelOCATORS;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class LoginDemoPOM {
	
private final WebDriver driver=new ChromeDriver();
	

//@Given("browser is opened")
//public void browser_is_opened() {
//	
//	driver.navigate().to("https://saucedemo.com");
// 
// 
// System.out.println("Inside-Step browser is opened");
//}
//
//
//
//@When("user enters (.*) and (.*)$")
//
//public void user_enters_username_and_password(String username, String password) {
//	
//	LoginPagelOCATORS login=new LoginPagelOCATORS(driver);
//	login.validusername(username);
//	login.validpassword(password);
//			
//	//driver.findElement(By.id("user-name")).sendKeys(username);
//	//driver.findElement(By.id("password")).sendKeys(password);
//	
//    
//}
//
//@And("user clicks the login button")
//public void user_clicks_the_login_button() {
//	
//	login.clicklogin();
//	//driver.findElement(By.id("login-button")).click();
//    
//}
//
//@Then("user is navigated to the product page")
//public void user_is_navigated_to_the_product_page() {
//	
//	driver.getPageSource().contains("Product");
//    
//}
//
//@After()
//public void closeBrowser()
//{
//driver.quit();
//}
//
//
//}
//	
//	
//
