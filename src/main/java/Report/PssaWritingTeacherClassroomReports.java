package Report;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class PssaWritingTeacherClassroomReports extends BaseClassOne

{
	@Test(priority=1)
	public void TCED39501()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Writing
			click("//a[contains(text(),'PSSA Writing')]");
			Thread.sleep(2000);
			
			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Classroom Reports')]");
			
			//Assert the the Header Name as PSSA | Writing Reports
			Assert.assertEquals(getText("//h3[@class='subheading']"),"PSSA | Writing Reports");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED39502()
	{
		try
		{
			//To check the Labels in the Teacher Classroom Reports
			
			//Click on Single Year PSSA Writing
			click("//a[contains(text(),'Single Year PSSA Writing')]");
			
			//Assert the heading :   "Single Year PSSA Writing Analysis"
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year PSSA Writing Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED39503()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Writing
			click("//a[contains(text(),'PSSA Writing')]");
			Thread.sleep(2000);
			
			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Classroom Reports')]");
			
			//Click on  Longitudinal PSSA Writing
			click("//a[contains(text(),'Longitudinal PSSA Writing')]");
			
			//Assert the heading Longitudinal PSSA Writing Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Longitudinal PSSA Writing Analysis");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED39504()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Writing
			click("//a[contains(text(),'PSSA Writing')]");
			Thread.sleep(2000);
			
			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Classroom Reports')]");
			
			//Click on  PSSA/Course Grade Comparison Report
			click("//a[contains(text(),'PSSA/Course Grade Comparison Report')]");
			
			//Assert the heading Longitudinal PSSA Writing Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"PSSA Course Grade Comparison");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']");
			
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
