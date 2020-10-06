package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class PercentileBreakdown extends BaseClassOne{
	
	@Test(priority=1)
	public void TCED43201()
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
			click("//a[contains(text(),'Percentile Breakdown')]");
			

			//Assert the the Header Name as Single Year College SAT Analysis
			Assert.assertEquals(getText("//span[@class='subheading']"),"College SAT Percentile Breakdown");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	

@Test(priority=2)
public void TCED43502()
{
	try
	{
		//Application should be in the  Single Year College SAT Analysis

		//Assert the labels:-College SAT Testing Year:
		Assert.assertEquals(getText("//td[contains(text(),'College SAT Testing Year')]"),"College SAT Testing Year");

		//Assert the labels: Run Report by Building/Grade
		Assert.assertEquals(getText("//label[contains(text(),'Run Report by Building/Grade')]"),"Run Report by Building/Grade");	
		

		//Assert the Current Building
		Assert.assertEquals(getText("//td[contains(text(),'Current Building/District')]"),"Current Building/District");	

		//Assert the Current Grade Level
		Assert.assertEquals(getText("//td[contains(text(),'Current Grade Level')]"),"Current Grade Level");
		
		
		
		//Assert the Current Building
		Assert.assertEquals(getText("//td[contains(text(),'Current Subgroup(s)')]"),"Current Subgroup(s)");	

		//Assert the Current Grade Level
		Assert.assertEquals(getText("//label[contains(text(),'Run Report by Student Group')]"),"Run Report by Student Group");
		
		//Assert the Current Building
		Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");	

		//Assert the Gender
		Assert.assertEquals(getText("//label[contains(text(),'Gender')]"),"Gender");
		
		//Assert the ELL
		Assert.assertEquals(getText("//label[contains(text(),'ELL')]"),"ELL");
		
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'IEP')]"),"IEP");
		
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Gifted')]"),"Gifted");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Econ. Disadvantaged')]"),"Econ. Disadvantaged");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Title1')]"),"Title1");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Title3')]"),"Title3");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Medical Issue')]"),"Medical Issue");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'Migrant')]"),"Migrant");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'504')]"),"504");
					
		//Assert the Ethnicity
		Assert.assertEquals(getText("//label[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");
		
		
	}	
		
	catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void TCED43503()
	{
		try
		{
			
			//Click on the gender sub group
			click("//input[@id='ctl00_MainContent_ctl01_chkLstSubgroups_0']");
			
			
			//Assert the Gender
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//Click on the search button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the the Header Name as Single Year College SAT Analysis
			Assert.assertEquals(getText("//span[@class='subheading']"),"College SAT Percentile Breakdown");
			
		}	
		
		catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
	@Test(priority=4)
	public void TCED43504()
	{
		try
		{
			
			//Assert the Content
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trReportHeader']/td/b/span"),"School Type : All Schools\nCurrent Building/District : OnHand School District\nGrade : Any Grade");
			
			//Assert the Content
			Assert.assertEquals(getText("//b[contains(text(),'SAT Academic Year:')]"),"SAT Academic Year: 2014-2015");
			
			//Assert the Content
			Assert.assertEquals(getText("//b[contains(text(),'Current Subgroup(s):')]"),"Current Subgroup(s): Male");
			
			//Assert the Content
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMath']"),"Mathematics");
			
			//Assert the Content
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblReading']"),"Critical Reading");
			
			//Assert the Content
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblWriting']"),"Writing");
		}	
		
		catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
	@Test(priority=5)
	public void TCED43505()
	{
		try
		{
				//Assert.assertTrue(isElementPresent("//img[@id='ctl00_MainContent_ctl45_Image']"));
				
				//Assert.assertTrue(isElementPresent("//img[@id='ctl00_MainContent_ctl15_Image']"));
				
				Assert.assertTrue(isElementPresent("//*[@fill='url(#kdef14)']"));
				
		}
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED43506()
	{
		try
		{

			//Application should be in the PSSA Teacher ComparisonReport   page			
			FileDelete();
			
			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
            waitFor_downloadfile();	
            Thread.sleep(500);
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .CSV");	
			
		
		}
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
		
		@Test(priority=7)
		public void TCED43507()
		{
			try
			{

				
				
				//Click on Add report to favorite button
				click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
				
				//Assert the the Header Name as Single Year College SAT Analysis
				Assert.assertEquals(getText("//span[@class='subheading']"),"College SAT Percentile Breakdown");			
				
			}
			
			catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
		
		@Test(priority=8)
		public void TCED43508()
		{
			try
			{

				
				//Click on Add report to favorite button
				Thread.sleep(1000);
				click("//*[@fill='url(#kdef14)']");
					
				FileDelete();
				
				//Click on Export to CSV
				Thread.sleep(5000);
				click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
				
	            waitFor_downloadfile();	
	            Thread.sleep(500);
				
				//Assert the downloaded csv file
				//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .CSV");	
				
				 
			}
			
			catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
		@Test(priority=9)
		public void TCED43509()
		{
			try
			{

				
				
				
				//Application should be in the PSSA Teacher ComparisonReport   page			
				FileDelete();
				
				//Click on Export to CSV
				click("//input[@id='ctl00_MainContent_btnExportCSV']");
				
	            waitFor_downloadfile();	
	            Thread.sleep(500);
				
				//Assert the downloaded csv file
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
				
				 
			}
			
			catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
		@Test(priority=10)
		public void TCED43510()
		{
			try
			{

				
				
				
				//Application should be in the PSSA Teacher ComparisonReport   page			
				FileDelete();
				
				//Click on Export to CSV
				click("//input[@id='ctl00_MainContent_btnExportPDF']");
				
	            waitFor_downloadfile();	
	            Thread.sleep(500);
				
				//Assert the downloaded csv file
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .CSV");	
				
				 
			}
			
			catch (Exception e)
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}
	}
}	

	


