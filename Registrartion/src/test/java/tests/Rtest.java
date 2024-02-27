package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resource.Base;
import pageobj.AccountCpage;
import pageobj.LandinggPage;
import pageobj.Register;

public class Rtest extends Base{

	
	public WebDriver driver;
	

	
	@Test
	public void register() throws IOException {
		

		driver = intializeDrivers();
		driver.get("https://tutorialsninja.com/demo/");
		
	
		
		LandinggPage page = new LandinggPage(driver);
		page.myaccountdropdown().click();
		page.Loginoption().click();
		page.continuebutton().click();
		
		Register reg = new Register(driver);
		reg.fnamefield().sendKeys("channu");
		reg.lnamefield().sendKeys("basava");
		reg.emailfield().sendKeys("channa12@gmail.com");
		reg.telephonefield().sendKeys("1278912790");
		reg.passwordfield().sendKeys("Channa@222");
		reg.Cpasswordfield().sendKeys("Channa@222");
		reg.ContinueButton().click();
		
		AccountCpage p = new AccountCpage(driver);
		
		System.out.println(p.loginpage().isDisplayed());
	}
		
		
		

	
}

