package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
    public WebDriver driver;
	@Test
	public void twotest() throws IOException {
		System.out.println("two test");
		
		driver = IntializeDriver();
		driver.get(prop.getProperty("url"));
		Assert.assertTrue(false);
	}
	
}
