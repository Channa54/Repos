package epack;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {

	WebDriver driver;
	ExtentReports rp;
	@BeforeMethod
	public void testconfiguration() {
		
		String reportpath = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setReportName("leave management");
		reporter.config().setDocumentTitle("lma system");
		 rp = new ExtentReports();
		rp.attachReporter(reporter);
		rp.setSystemInfo("operating system","windows10");
		rp.setSystemInfo("testedby","chanu");
		
	}
	
	
	
	@Test
	public void Login() {
	    ExtentTest etest = rp.createTest("Login created");
		 driver = new ChromeDriver();
		 etest.info("chrome browaser launched");
		driver.manage().window().maximize();
		driver.get("https://lms.in.capgemini.com/");
		etest.info("navigated to chrome browser");
		
		 driver.findElement(By.linkText("ApplyLeave")).click();
		String actultext = driver.findElement(By.xpath("//label[text()='Effective Leave']")).getText();
		
		if( actultext.equalsIgnoreCase("Effective Leave")) {
			System.out.println("paased");
		}
		else {
			System.out.println("False");
		}
		}
	
	public void testclosure() {
		driver.close();
		rp.flush();
	}
	
	
	}
	


	  
	  

