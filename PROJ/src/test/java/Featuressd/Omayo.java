package Featuressd;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


public class Omayo {
	
	WebDriver driver ;
	
    @Given(value = "^when user enters the application URL$")
	public void  when_user_enters_the_application_URL() {
		
        driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://clarity.fs.capgemini.com/niku/nu#action:homeActionId");
    	
    		
	}
    @When(value = "^user enters username credentials \"([^\"]*)\" and password \"([^\"]*)\" into the fields$")
    public void  user_enters_username_credentials_username_and_password_password_into_the_fields(String username , String password) {
    	
    	driver.findElement(By.id("ppm_login_username")).sendKeys("CADEPPA");
    	driver.findElement(By.id("ppm_login_password")).sendKeys("WTM3YH!777");
    	
    }
	@And(value = "^click on the login button$")
	public void click_on_the_login_button() {
		
		driver.findElement(By.id("ppm_login_button")).click();
	}
	@Then(value = "^should be able to login with \"([^\"]*)\" conditions$")
	public void should_be_able_to_login_with_expected_conditions(String expected) {
		driver.findElement(By.xpath("//span@[id='ppm_header_user']"));
		
	}
}
