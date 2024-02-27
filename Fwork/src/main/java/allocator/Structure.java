package allocator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Structure {
	WebDriver driver ;
	public Properties p;
	
	public WebDriver Starter() throws IOException {
		
		 p = new Properties();
		String ppath = "C:\\Users\\CADEPPA\\OneDrive - Capgemini\\Documents\\Imp Box\\Fworksrc\\main\\java\\allocator\\bata.properties";
		FileInputStream sf = new FileInputStream(ppath);
		p.load(sf);
	
		String browsername = p.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
	
	
}
