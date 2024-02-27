package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import allocator.Structure;

public class Regis extends Structure {

	
	WebDriver driver;
	@Test
	public void rtest() throws IOException {
		
		driver = Starter();
		driver.get(p.getProperty("url"));
		
	}
	
	
}
