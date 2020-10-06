package Report;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class CollegeSATReports_TeacherClassroomReports extends BaseClassOne {
	
	
	@Test(priority=1)
	public void TCED43401()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click College SAT
			click("//a[contains(text(),'College SAT')]");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");
			
			//Assert the the Header Name as College SAT Reports 
			Assert.assertEquals(getText("//h3[@class='subheading']"),"College SAT Reports");
			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	
	@Test(priority=2)
	public void TCED43402()
	{
		try
		{
			//Click Single Year College SAT
			click("//a[contains(text(),'Single Year College SAT')]");
			
			//Assert the the Header Name as Single Year College SAT Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year College SAT Analysis");
			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void TCED43403()
	{
		try
		{
			//click on Logout button		 
			click("//*[@id='ctl00_A3']");
			Thread.sleep(2000);
			//Assert the page Header as "Edinsight Login"					
			Assert.assertEquals(driver.getTitle(),"EdInsight Login");
			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
