package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandinggPage {

	WebDriver driver;
	
	public LandinggPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath="//a[@title = 'My Account']")
	  WebElement myaccountdropdownn;
	  
	  @FindBy(linkText = "Login")
		WebElement Loginoption;
	  
	  @FindBy(linkText = "Continue")
	  WebElement continuebutton;
	
	  public WebElement myaccountdropdown() {
			return myaccountdropdownn;
		}
		
		public WebElement Loginoption() {
			return Loginoption;
		}
		public WebElement continuebutton() {
			return continuebutton;
		}
	  
	  
	  
}
