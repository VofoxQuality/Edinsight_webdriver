package Report;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class NWEA_Reports extends BaseClassOne{


	@Test(priority=1)
	public void TCED43101()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			Thread.sleep(2000);
			//Assert the the Header Name as NWEA Reports
			Assert.assertEquals(getText("//h3[@class='subheading']"),"NWEA Reports");

			String B= getText("//span[@class='blackheading']");
			String C= getText("//span[@class='blueheading']");

			//Assert the label: Superintendent View OnHand School District
			Assert.assertEquals((B+C),"Superintendent ViewOnHand School District");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void TCED43102()
	{
		try
		{	
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			//Click on  RIT Range
			click("//a[contains(text(),'RIT Range')]");
			
			//Assert the heading :  "NWEA | RIT Range"
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | RIT Range");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=3)
	public void TCED43103()
	{
		try
		{	
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			//Click on  Probability of Passing PSSA
			click("//a[contains(text(),'Probability')]");
			
			//Assert the heading :  " NWEA | PSSA Pass Probability "
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | PSSA Pass Probability");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=4)
	public void TCED43104()
	{
		try
		{	
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			//Click on  NWEA SubTest (Goal) Report
			click("//a[contains(text(),'NWEA SubTest (Goal)')]");
			
			//Assert the heading :  " NWEA | Subtest (Goal) Level Report "
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Subtest (Goal) Level Report");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void TCED43105()
	{
		try
		{	

			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			//Click on NWEA SubTest (Goal) Report By Teacher
			click("//tr[@id='ctl00_MainContent_ReportListSingleAssessment1_ctl00_trSubtestGoalReportByTeacher']//a[@class='header'][contains(text(),'NWEA')]");
			
			//Assert the heading :  " NWEA | PSSA Pass Probability "
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Subtest (Goal) Level Report By Teacher");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=6)
	public void TCED43106()
	{
		try
		{	
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			// Click NWEA
			click("//div[@class='left']//div//a[contains(text(),'NWEA')]");

			//Click on Teacher Classroom Reports
			click("//a[contains(text(),'Teacher Classroom')]");
			
			//Assert the heading :  " NWEA Reports "
			Assert.assertEquals(getText("//h3[@class='subheading']"), "NWEA Reports");

			//Click on Exit Button
			click("//a[@id='ctl00_A3']");	
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
}

