package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.Landingpage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	public WebDriver driver;
	 Logger log ;
	@Test(dataProvider = "getlogindata")
	public void login(String email, String password, String Expectedstatus) throws IOException, InterruptedException {
        
         
		Landingpage page = new Landingpage(driver);
		page.myaccountdropdown().click();
		log.debug("paassed");
		page.Loginoption().click();

		Thread.sleep(3000);

		LoginPage loginpage = new LoginPage(driver);
		// loginpage.emailaddress().sendKeys(prop.getProperty("email")); if we use
		// properties file for single data
		loginpage.emailaddress().sendKeys(email);
		loginpage.passwordfield().sendKeys(password);
		loginpage.Loginbutton().click();

		AccountPage accountpage = new AccountPage(driver);
		System.out.println(accountpage.Editaccountinformation().isDisplayed());
		// Assert.assertTrue(accountpage.Editaccountinformation().isDisplayed());
		String actualresult = null;
		try {
			if(accountpage.Editaccountinformation().isDisplayed()) {
				actualresult = "succesfull";
			}
		}
		catch(Exception e) {
			actualresult = "Failure";
		}
         Assert.assertEquals(actualresult, Expectedstatus);
         log.info("passed");
	}

	
	@DataProvider
	public Object[][] getlogindata() {
		Object[][] data = { { "arun.selenium@gmail.com", "Second@123", "succesfull" },
				{ "dummy@gami.com", "dummy", "Failure" } };
		return data;
	}
	
	@BeforeMethod
	public void Open() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver = IntializeDriver();
		driver.get(prop.getProperty("url"));
		log.debug("launcheddd");
	}

	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
}
