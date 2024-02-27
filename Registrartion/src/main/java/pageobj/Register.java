package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	WebDriver driver;
	public Register(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement fnamefield;
	
	@FindBy(name="lastname")
	WebElement lnamefield;
	
	@FindBy(name="email")
	WebElement emailfield;
	
	@FindBy(name="telephone")
	WebElement telephonefield;
	
	@FindBy(name="password")
	WebElement passwordfield;
	
	@FindBy(name="confirm")
	WebElement Cpasswordfield;
	
	@FindBy(name="agree")
	WebElement checkboxfield;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement ContinueButton;
	
	public WebElement fnamefield() {
		return fnamefield;
	}
	
	public WebElement lnamefield() {
		return lnamefield;
	}
	
	public WebElement emailfield() {
		return emailfield;
	}
	
	public WebElement telephonefield() {
		return telephonefield;
	}
	public WebElement passwordfield() {
		return passwordfield;
	}
	
	public WebElement Cpasswordfield() {
		return Cpasswordfield;
	}
	
	public WebElement checkboxfield() {
		return checkboxfield;
	}
	public WebElement ContinueButton() {
		return ContinueButton;
	}
	
	
}
