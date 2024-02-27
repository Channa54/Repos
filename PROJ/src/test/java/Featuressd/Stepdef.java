package Featuressd;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {

	@Given(value = "^I vist the website$")
	public void I_vist_the_website() {
		
	}
	 
	

@When("user clicks")
public void user_clicks() {
   System.out.println("when u ser clicks ");
    
}

@Then("go and search the product")
public void go_and_search_the_product() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("he should not click on other")
public void he_should_not_click_on_other() {
    // Write code here that turns the phrase above into concrete actions

}



}
