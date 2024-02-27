package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Base {

      WebDriver  driver;
	public Properties prop;
	
	public WebDriver IntializeDriver() throws IOException {

		
		 prop = new Properties();
		
         String proppath = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		
		FileInputStream fs = new FileInputStream(proppath);
		
		prop.load(fs);
		
		
		//String browsername = "chrome";
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")){
			
	      
			//WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("edge")) {
			
			//WebDriverManager.firefoxdriver().setup();
			 driver = new EdgeDriver();
			
		}else if(browsername.equalsIgnoreCase("IE")) {
			
			//WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}
		
		
		   driver.manage().window().maximize();
		 
		return driver;
		
		
		}
	
	
	public void takesscreenshot(String testname, WebDriver driver) throws IOException {
		
		 File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  String destinationfilepath = System.getProperty("user.dir")+"\\screenshots\\"+testname+".png";
		  FileUtils.copyFile(sourcefile, new File(destinationfilepath));
	}
	
	}
	

