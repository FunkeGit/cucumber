package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPF {
	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement txt_loginbtn;
	
	WebDriver driver;
	
	public loginPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void validusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void validpassword(String password) {
		txt_username.sendKeys(password);
	}
	
	public void clickLogin() {
		txt_loginbtn.click();
	}

}
