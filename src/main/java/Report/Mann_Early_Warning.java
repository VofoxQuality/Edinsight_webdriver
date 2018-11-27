package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Mann_Early_Warning extends BaseClassOne
{
	@Test(priority=1)
	public void TCED37101()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//Asert the the Header Name as Early Warning Alerts  
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Alerts");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED37102()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//Asert the the Header Name as Early Warning Alerts  
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Alerts");
			
//			Asert the labels:-Alert Type 
//			Asert the labels:-Run Report by Building  
//			Asert the labels:-School Type 
//			Asert the labels:-Current Building/District 
//			Asert the labels:-Current Grade 
//			Asert the labels:-Current Subgroup(s) 
//			Asert the labels:-Gender
//			Asert the labels:-Ethnicity 
//			Asert the labels:-ELL
//			Asert the labels:-IEP 
//			Asert the labels:-Gifted 
//			Asert the labels:-Econ. Disadvantaged
//			Asert the labels:-Title1 
//			Asert the labels:-Title3 
//			Asert the labels:-Medical Issue
//			Asert the labels:-Migrant 
//			Asert the labels:-504 
//			Asert the labels:-MTSS Tiered 
//			Asert the labels:-Run Report by Student Group  
//			Asert the labels:-Student Group 
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED37103()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			Thread.sleep(2000);
			
			//Assert the Validation message "You must select an alert type.
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblErrorMessages']"),"You must select an alert type.");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED37104()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//select alert type: Attendance
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Attendance");
			
			//Select any School Type 
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");
			
			//select Current Subgroup(s) : GENDER
			click("//*[@id='ctl00_MainContent_ctl06_chkLstSubgroups_0']");
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Asset the report header : Early Warning Attendance
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");		
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=5)
	public void TCED37105()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//* Assert the Labels:- Current Building/District
//			* Assert the Labels:- Grade
//			* Assert the Labels:- Current Subgroups 
//			* Assert the label:- Student Count
//			
//			* Assert the Heading:-Student Id 
//			* Assert the Heading:-Last Name 
//			* Assert the Heading:-First Name 
//			* Assert the Heading:-Grade 
//			* Assert the Heading:-School 
//			* Assert the Heading:-Ethnicity 
//			* Assert the Heading:-IEP 
//			* Assert the Heading:-MTSS Tiered 
//			* Assert the Heading:-Total Attendance Count 
//			* Assert the Heading:-Total Full Day Absences 
//			* Assert the Heading:-Excused 
//			* Assert the Heading:-Unexcused 
//			* Assert the Heading:-Total Half Day Absences 
//			* Assert the Heading:-Half Day Excused 
//			* Assert the Heading:-Half Day Unexcused 
//			* Assert the Heading:-Total Tardies
//			* Assert the Heading:-Tardy Excused 
//			* Assert the Heading:-Tardy Unexcused 
//			* Assert the Heading:-Other
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=6)
	public void TCED37106()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			
			//Click on all other Grids (Except Student id)
			verify_sort_ascending("//a[contains(text(),'Last Name')]");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED37107()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			
			//Click on all other Grids (Except Student id)
			verify_sort_ascending("//a[contains(text(),'Last Name')]");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED37108()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//input[@id='ctl00_MainContent_btnExportCSV']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED37109()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//input[@id='ctl00_MainContent_btnExportpdf']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void verify_sort_ascending(String locator) throws Exception
	{
		click(locator);		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(find(locator+"//following::span[1]")).build().perform();
		
		Thread.sleep(3000);
		String tool_tip=find(locator+"//following::span[1]").getText();	
		
		System.out.println(tool_tip);
		
		Assert.assertEquals(tool_tip,"Sorted asc");		
	}

}
