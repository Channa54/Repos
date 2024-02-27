package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class OneTest extends Base {
     public WebDriver driver;
	@Test
	public void onetest() throws IOException {
		System.out.println("one test ");
		
		driver = IntializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
}
