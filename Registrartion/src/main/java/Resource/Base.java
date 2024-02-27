package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	WebDriver driver ;
	public Properties prop1 ;
   
	
	public WebDriver intializeDrivers() throws IOException {
	
		prop1 = new Properties();
		String propnpath = System.getProperty("user.dir")+"src\\main\\java\\Resource\\data1.properties";
		FileInputStream fs = new FileInputStream(propnpath);
		
		prop1.load(fs);
	
		
		String browsername = prop1.getProperty("browser");
		 
		if ( browsername.equalsIgnoreCase("chrome")) {
			new ChromeDriver();
		}
		else if ( browsername.equalsIgnoreCase("edge")) {
			new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
