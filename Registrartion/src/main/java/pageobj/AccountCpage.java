package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCpage {
    WebDriver driver;
	public AccountCpage(WebDriver driver ) {
		this .driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="login page")
	WebElement loginpage;
	
	public WebElement loginpage() {
		return loginpage;
	}
	
}
