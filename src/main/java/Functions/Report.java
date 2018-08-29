package Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Report {
	 public static void main(String arg[])
	 { 
		 WebDriver driver;
		 String  baseUrl = "file:///E:/Quality/trunk/EdinsightAutomation/test-output/emailable-report.html";
		 System.setProperty("webdriver.gecko.driver","E:\\Quality\\trunk\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.get(baseUrl);
		  
	 } 

}
