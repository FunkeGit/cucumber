package hookstepCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class hook {
	
	private final WebDriver driver=new ChromeDriver();
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user inputs valid username and password")
	public void user_inputs_valid_username_and_password() {
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {


	}

	
	
}
	

