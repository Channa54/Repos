package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	PageFactory.initElements(driver, this);
	}
	@FindBy(id = "input-email")
	WebElement emailaddress;
	@FindBy(id="input-password")
	WebElement passwordfield;
	@FindBy(css= "input[value='Login']")
	WebElement Loginbutton;
   public WebElement emailaddress() {
	   return emailaddress;
   }
	public WebElement passwordfield() {
		return passwordfield;
	}
	public WebElement Loginbutton() {
		return Loginbutton;
	}
}
