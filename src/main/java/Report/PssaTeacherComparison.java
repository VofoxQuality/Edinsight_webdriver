package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import Library.BaseClassOne;


public class PssaTeacherComparison extends BaseClassOne
{
	@Test(priority=1)
	public void TCED39801()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			Thread.sleep(2000);
			
			//PSSA Teacher ComparisonReport
			click("//a[contains(text(),'PSSA Teacher')]");
			
			//Assert the the Header Name as PSSA Teacher Comparison
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Teacher Comparison");					
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED381302()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport page.
			
			//Assert the labels:-Testing PSSA Year   
			Assert.assertEquals(getText("//td[contains(text(),'Testing PSSA Year')]"),"Testing PSSA Year");
			
			//Assert the labels:-Testing Building/District 
			Assert.assertEquals(getText("//td[contains(text(),'Testing Building/District')]"),"Testing Building/District");
			
			//Assert the labels:-All Buildings
			Assert.assertEquals(find("//input[@id='ctl00_MainContent_rcbProvider_Input']").getAttribute("value"),"All Buildings");

			//Assert the labels:-Testing Grade   
			Assert.assertEquals(getText("//td[contains(text(),'Testing Grade')]"),"Testing Grade");
			
			//Assert the labels:-Run By 
			Assert.assertEquals(getText("//td[contains(text(),'Run By')]"),"Run By");
			
			//Assert the labels:-Current Subgroup(s)
			Assert.assertEquals(getText("//td[contains(text(),'Current Subgroup(s)')]"),"Current Subgroup(s)");
			
			//Assert the labels:-Gender 
			Assert.assertEquals(getText("//label[contains(text(),'Gender')]"),"Gender");
			
			//Assert the labels:-Ethnicity 
			Assert.assertEquals(getText("//label[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the labels:-ELL
			Assert.assertEquals(getText("//label[contains(text(),'ELL')]"),"ELL");
			
			//Assert the labels:-IEP 
			Assert.assertEquals(getText("//label[contains(text(),'IEP')]"),"IEP");
			
			//Assert the labels:-Gifted 
			Assert.assertEquals(getText("//label[contains(text(),'Gifted')]"),"Gifted");
			
			//Assert the labels:-Econ. Disadvantaged
			Assert.assertEquals(getText("//label[contains(text(),'Econ. Disadvantaged')]"),"Econ. Disadvantaged");
			
			//Assert the labels:-Title1 
			Assert.assertEquals(getText("//label[contains(text(),'Title1')]"),"Title1");
			
			//Assert the labels:-Title3 
			Assert.assertEquals(getText("//label[contains(text(),'Title3')]"),"Title3");
			
			//Assert the labels:-Medical Issue
			Assert.assertEquals(getText("//label[contains(text(),'Medical Issue')]"),"Medical Issue");
			
			//Assert the labels:-Migrant
			Assert.assertEquals(getText("//label[contains(text(),'Migrant')]"),"Migrant");
			
			//Assert the labels:-504 
			Assert.assertEquals(getText("//label[contains(text(),'504')]"),"504");
			
			//Assert the labels:-MTSS Tiered
			Assert.assertEquals(getText("//label[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");		
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED381303()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport page.
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the the  message "You must select a Testing Grade.
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblErrorMessages']"),"You must select a Testing Grade.");			
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void TCED381304()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport page.
			
			// select Testing PSSA Year   :  PSSA 2016-2017
			select("//select[@id='ctl00_MainContent_ddlTestingYear']","label=PSSA 2016-2017");
			
			Thread.sleep(2000);
			
			//select Testing Building/District  --All Buildings

			//select Testing Grade   --11
			select("//*[@id='ctl00_MainContent_ddlTestingGrade']","label=11");
			
			// select Run By    -- Reading
			select("//select[@id='ctl00_MainContent_ddlRunBy']","label=Reading");
			
			// selct Current Subgroup(s)  -- Gender 
			click("//*[@id='ctl00_MainContent_ctl01_chkLstSubgroups_0']");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			// Assert the report header : PSSA Teacher Comparison
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Teacher Comparison");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED381305()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport page.
			
			//Assert the Labels:- Assessment : PSSA 2016-2017
			 String s=getText("//*[@id='ctl00_MainContent_litReportHeader']");
			Assert.assertEquals(s.substring(13,27),"PSSA 2016-2017");
			
			//Assert the Labels:- Current Building/District : Ashley High School,Belle Plaine Elementary School,Betterton Middle School,Bird-in-Hand Elementary School					
			 Assert.assertEquals(s.substring(28,160),"Current Building/District : Ashley High School,Belle Plaine Elementary School,Bet"+
			 "terton Middle School,Bird-in-Hand Elementary School");	

		    //Assert the Labels:- Testing Grade : 11
			 Assert.assertEquals(s.substring(161,179),"Testing Grade : 11");
			 
			//Assert the Labels:- Run By : Reading
			 Assert.assertEquals(s.substring(180,196),"Run By : Reading");
			 
			//Assert the Labels:- Current Subgroups : Male
			 System.out.println(s.length());
			 Assert.assertEquals(getText("//b[contains(text(),'Current Subgroups : Male')]"),"Current Subgroups : Male");
			 
			//Assert the Labels:- Teachers
			 Assert.assertEquals(getText("//a[contains(text(),'Teachers')]"),"Teachers");	
			 
			// Assert the Labels:- Total Students 
			 Assert.assertEquals(getText("//a[contains(text(),'Total Students')]"),"Total Students");
			 
			//Assert the Labels:- Adv
			 Assert.assertEquals(getText("//tr//th[3]//a[1]"),"Adv");
			 
			//Assert the Labels:- % Adv 
			 Assert.assertEquals(getText("//a[contains(text(),'% Adv')]"),"% Adv");
			 
			//Assert the Labels:- Pro 
			 Assert.assertEquals(getText("//tr//th[5]//a[1]"),"Pro");
			 
			// Assert the Labels:- % Pro 
			 Assert.assertEquals(getText("//a[contains(text(),'% Pro')]"),"% Pro");
			 
			//Assert the Labels:- Bas 
			 Assert.assertEquals(getText("//tr//th[7]//a[1]"),"Bas");
			 
			//Assert the Labels:- % Bas 
			 Assert.assertEquals(getText("//a[contains(text(),'% Bas')]"),"% Bas");
			 
			//Assert the Labels:- Bel 
			 Assert.assertEquals(getText("//tr//th[9]//a[1]"),"Bel");
			 
			//Assert the Labels:- % Bel 
			 Assert.assertEquals(getText("//a[contains(text(),'% Bel')]"),"% Bel");
			 
			//Assert the Labels:- Reading Total 
			 Assert.assertEquals(getText("//a[contains(text(),'Reading Total')]"),"Reading Total");
			 
			//Assert the Labels:- Min % 
			 Assert.assertEquals(getText("//a[contains(text(),'Min %')]"),"Min %");
			 
			//Assert the Labels:- Max %		
			 Assert.assertEquals(getText("//a[contains(text(),'Max %')]"),"Max %");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED381306()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport   page
			
			FileDelete();
			
			//Click on Print to PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
             Thread.sleep(6000);	
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED381307()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport   page			
			FileDelete();
			
			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
             Thread.sleep(6000);	
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED381308()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport   page
			
			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
			
			// Assert the report header : PSSA Teacher Comparison
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Teacher Comparison");	
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED381309()
	{
		try
		{
			//Application should be in the PSSA Teacher ComparisonReport   page			
						
			//* Assert the Teacher column data get sorted correctly.
			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgTeacherComparison_ctl00__"+i+"']/td[1]"))
			{
				sort_java.add(find("//*[@id='ctl00_MainContent_rgTeacherComparison_ctl00__"+i+"']/td[1]").getText());
				++i;			
			}
			System.out.println(sort_java);
			Collections.sort(sort_java);
			
			//Verify the the sort up/down icon element present
			click("//a[contains(text(),'Teachers')]");			
			Assert.assertTrue(isElementPresent("//a[contains(text(),'Teachers')]//following::span[1]"),"Sort up icon element not present");

			//Assert the Teacher column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgTeacherComparison_ctl00__"+j+"']/td[1]"))
			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_rgTeacherComparison_ctl00__"+j+"']/td[1]").getText());
				++j;			
			}			
			Assert.assertTrue(sort_java.equals(sort_direct),"sorting failed");
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void TCED381310()
	{
		try
		{		
			//*On Exported CSV,  Assert the total count of columns under Teachers					
			int grid_columnCount=0;
			System.out.println(Csv_column_count(downloadPath));
			
			Assert.assertEquals(grid_columnCount,Csv_column_count(downloadPath),"helloooooooooooooooo");
			
			//Compare and Assert the value of  student count & Total count from CSV are EQUAL
			int grid_total=Integer.parseInt(getText("//*[@id='ctl00_MainContent_rgTeacherComparison_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));
			Assert.assertEquals(grid_total,csv_row_count()-1,"akhil");
			
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
