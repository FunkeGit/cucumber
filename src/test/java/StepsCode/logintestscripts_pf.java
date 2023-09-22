package StepsCode;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.loginPF;
//import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintestscripts_pf {
	
	
	private final WebDriver driver=new ChromeDriver();
	loginPF login;
	HomePage_PF home;
	

	@Given("browser is opened")
	public void browser_is_opened() {
		
		driver.navigate().to("https://saucedemo.com");
	 
	 
	 System.out.println("Inside-Step browser is opened");
	}



	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login=new loginPF(driver);
		
		login.validusername(username);
		login.validpassword(password);
	
				
	    
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		
		login.clickLogin();
//		driver.findElement(By.id("login-button")).click();
	    
	}

	@Then("user is navigated to the home page and sees title")
	public void user_is_navigated_to_the_home_page_and_sees_title() {
		
		home=new HomePage_PF(driver);
		home.titleisvisible();
		
		
		
		
		
		
	
	    
	}

//	@After()
//	public void closeBrowser()
//	{
//	driver.quit();
//	}
//
//
//	}

}
