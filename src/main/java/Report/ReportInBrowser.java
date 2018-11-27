package Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReportInBrowser {
	
	public static void main(String arg[])
	{
		WebDriver driver1;
		//FirefoxProfile profile=Browser_Preference();
		System.setProperty("webdriver.gecko.driver","D:\\Jars\\Drivers\\New-geckodriver\\geckodriver.exe");
		
		driver1 = new FirefoxDriver();
	     
	     
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver1.get("file:///e:/Quality/trunk/Edinsight_Maven_Automation/target/test-output/emailable-report.html");
		
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.RIGHT).build().perform();`
	}

}
