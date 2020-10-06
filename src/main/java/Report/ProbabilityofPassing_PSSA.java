package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class ProbabilityofPassing_PSSA extends BaseClassOne{


	@Test(priority=1)
	public void TCED44301()
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

			//Click on  Probability of Passing PSSA
			Thread.sleep(2000);
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td[3]/a");

			//Assert the heading :  "NWEA | PSSA Pass Probability"
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | PSSA Pass Probability");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void TCED44302()
	{
		try
		{
			Assert.assertEquals(getText("//td[contains(text(),'NWEA Testing Year')]"), "NWEA Testing Year");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Term')]"), "Testing Term");

			Assert.assertEquals(getText("//label[contains(text(),'Run Report by Building/Grade')]"), "Run Report by Building/Grade");

			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"), "School Type");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Building/District')]"), "Testing Building/District");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Grade Level')]"), "Testing Grade Level");

			Assert.assertEquals(getText("//td[contains(text(),'Current Subgroup(s)')]"), "Current Subgroup(s)");

			Assert.assertEquals(getText("//label[contains(text(),'Gender')]"), "Gender");

			Assert.assertEquals(getText("//label[contains(text(),'Ethnicity')]"), "Ethnicity");

			Assert.assertEquals(getText("//label[contains(text(),'ELL')]"), "ELL");

			Assert.assertEquals(getText("//label[contains(text(),'IEP')]"), "IEP");

			Assert.assertEquals(getText("//label[contains(text(),'Gifted')]"), "Gifted");

			Assert.assertEquals(getText("//label[contains(text(),'Econ. Disadvantaged')]"), "Econ. Disadvantaged");

			Assert.assertEquals(getText("//label[contains(text(),'Title1')]"), "Title1");

			Assert.assertEquals(getText("//label[contains(text(),'Title3')]"), "Title3");

			Assert.assertEquals(getText("//label[contains(text(),'Medical Issue')]"), "Medical Issue");

			Assert.assertEquals(getText("//label[contains(text(),'Migrant')]"), "Migrant");

			Assert.assertEquals(getText("//label[contains(text(),'504')]"), "504");

			Assert.assertEquals(getText("//label[contains(text(),'MTSS Tiered')]"), "MTSS Tiered");

			Assert.assertEquals(getText("//label[contains(text(),'Run Report by Student Group')]"), "Run Report by Student Group");

			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"), "Student Group");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=3)

	public void TCED44303() throws InterruptedException

	{
		try 
		{
			// TO select the parameters
			select("//select[@id='ctl00_MainContent_ddlAssessment']","NWEA 2017-2018");

			select("//select[@id='ctl00_MainContent_ddlTerm']","Fall");

			select("//select[@id='ctl00_MainContent_ddlSchoolType']","All Schools");

			select("//select[@id='ctl00_MainContent_ddlProvider']","OnHand School District");

			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","All Grades");

			click("//input[@id='ctl00_MainContent_SubgroupFilterParamsPane1_chkLstSubgroups_0']");

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
			Thread.sleep(3000);

			// To Assert Header
			Assert.assertEquals(getText("//span[contains(text(),'NWEA |')]"), "NWEA | PSSA Pass Probability");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED44304() throws InterruptedException

	{
		try 
		{
			// Assert the header sections:
			Assert.assertEquals(getText("//table[@class='border3']//tr[1]//td[1]"), "NWEA Testing Year: 2017-2018");

			Assert.assertEquals(getText("//table[@id='tdHead']//tr//tr[1]//td[3]"), "Testing Term: Fall");

			Assert.assertEquals(getText("//body[@class='bodybg']//tr//tr//tr//tr[2]//td[1]"), "Testing Provider: OnHand School District");

			Assert.assertEquals(getText("//body[@class='bodybg']//tr//tr[2]//td[3]"), "Testing Grade Level: All Grades");

			Assert.assertEquals(getText("//span[contains(text(),'Mathematics')]"), "Mathematics");

			Assert.assertEquals(getText("//span[contains(text(),'Reading')]"), "Reading");		

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority =5)	
	public void TCED44305()

	{
		try
		{ 	// To click on AddToFavorite
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the heading :  "NWEA | PSSA Pass Probability"
			Assert.assertEquals(getText("//span[contains(text(),'NWEA |')]"), "NWEA | PSSA Pass Probability");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority =6)	
	public void TCED44306()

	{
		try
		{ 	// To Click on number of student tests in a range of 0-159

			ScrollTo_Location("//span[contains(text(),'Mathematics')]");
			Thread.sleep(3000);		
			
			click("//*[@fill='url(#kdef10)'][@d='M202.5 228.5 L 275.5 228.5 275.5 290.5 202.5 290.5Z']");	
			
						
			Thread.sleep(2000);	

			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =7)	
	public void TCED44307()

	{
		try
		{ 	
			//* Assert the followng Headers:

			String s1=getText("//table[@class='border3']");

			Assert.assertEquals(s1.substring(0,24),"Testing Year: 2017-2018 ");		

			Assert.assertEquals(s1.substring(24,42),"Testing Term: Fall");		

			Assert.assertEquals(s1.substring(43,83),"Testing Provider: OnHand School District");		

			Assert.assertEquals(s1.substring(84,115),"Testing Grade Level: All Grades");		

			Assert.assertEquals(s1.substring(116,136),"Subject: Mathematics");		

			Assert.assertEquals(s1.substring(137,164),"Pass Probability: 21% - 40%");		

			Assert.assertEquals(s1.substring(165,182),"Subgroup(s): Male");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =8)	
	public void TCED44308()

	{
		try
		{ 	
			//* Assert the followng Grid Headers:

			Assert.assertEquals(getText("//a[contains(text(),'Student ID')]"), "Student ID");

			Assert.assertEquals(getText("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'Test Details')]"), "Test Details");

			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"), "Last Name");

			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"), "First Name");
			Thread.sleep(500);
			Assert.assertEquals(getText("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'Grade')]"), "Grade");
			Thread.sleep(1000);

			Assert.assertEquals(getText("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'School')]"), "School");
			Thread.sleep(1000);
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"), "Ethnicity");

			Assert.assertEquals(getText("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'IEP')]"), "IEP");

			Assert.assertEquals(getText("//a[contains(text(),'Test Subject')]"), "Test Subject");

			Assert.assertEquals(getText("//a[contains(text(),'Test Name')]"), "Test Name");

			Assert.assertEquals(getText("//a[contains(text(),'Test Term')]"), "Test Term");

			Assert.assertEquals(getText("//a[contains(text(),'Test RIT Score')]"), "Test RIT Score");

			Assert.assertEquals(getText("//a[contains(text(),'Test Percentile')]"), "Test Percentile");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 1 Name')]"), "SubTest (Goal) 1 Name");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 1 RIT Score')]"), "SubTest (Goal) 1 RIT Score");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 1 Perf Lev')]"), "SubTest (Goal) 1 Perf Lev");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 2 Name')]"), "SubTest (Goal) 2 Name");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 2 RIT Score')]"), "SubTest (Goal) 2 RIT Score");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 2 Perf Lev')]"), "SubTest (Goal) 2 Perf Lev");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 3 Name')]"), "SubTest (Goal) 3 Name");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 3 RIT Score')]"), "SubTest (Goal) 3 RIT Score");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 3 Perf Lev')]"), "SubTest (Goal) 3 Perf Lev");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 4 Name')]"), "SubTest (Goal) 4 Name");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 4 RIT Score')]"), "SubTest (Goal) 4 RIT Score");

			Assert.assertEquals(getText("//a[contains(text(),'SubTest (Goal) 4 Perf Lev')]"), "SubTest (Goal) 4 Perf Lev");

			Assert.assertEquals(getText("//a[contains(text(),'Prob of Passing PSSA')]"), "Prob of Passing PSSA");

			Assert.assertEquals(getText("//a[contains(text(),'Percent Correct')]"), "Percent Correct");

			Assert.assertEquals(getText("//a[contains(text(),'Projected Proficiency')]"), "Projected Proficiency");

			Assert.assertEquals(getText("//a[contains(text(),'Lexile Score')]"), "Lexile Score");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	public void TCED44309()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");	

			Thread.sleep(2000);

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"),"sort up icon element present");

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");
			Thread.sleep(2000);

			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortDescIcon']"),"sort down icon element present");

			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");	

			Thread.sleep(2000);

			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");
			Thread.sleep(2000);
			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");
			Thread.sleep(2000);

			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+i+"']/td[7]"))

			{
				sort_java.add(find("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+i+"']/td[7]").getText());
				++i;			
			}
			Collections.sort(sort_java);


			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");

			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");

			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/thead/tr[1]/th[7]/a");

			//Assert the First name column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+j+"']/td[7]"))

			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+j+"']/td[7]").getText());
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
	public void TCED44310()
	{
		try
		{		


			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");

			waitFor_downloadfile();	

			//*On Exported CSV,  Assert the total count of columns under Teachers			

			int grid_columnCount=28;	
			Assert.assertEquals(grid_columnCount,Csv_column_count(downloadPath));

			//Compare and Assert the value of  student count & Total count from CSV are EQUAL
			int grid_total=Integer.parseInt(getText("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));		

			//	Thread.sleep(4000);
			Assert.assertEquals(grid_total,csv_row_count()-1);
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=11)
	public void TCED44311()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Ethinicity filter &  On filter text field add "White" and select 'EQUAL TO' 

			type("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00_ctl02_ctl02_FilterTextBox_RaceDesc']","White");

			click("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00_ctl02_ctl02_Filter_RaceDesc']/span");

			click("//*[@id='ctl00_MainContent_rgNWEAScores_rfltMenu_detached']/ul/li[6]/span");

			// * Assert that the column values displayed under 'Ethinicity' is equal  to White.

			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+i+"']/td[10]"))

			{
				Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgNWEAScores_ctl00__"+i+"']/td[10]"), "White");
				++i;
			}			
			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void TCED44312()
	{
		try
		{
			//Application should be in the Assessment Student List   page 			
			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");

			waitFor_downloadfile();

			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=13)
	public void TCED44313()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rgNWEAScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");

			
			// Click on  Add Selected Student to Group button
			Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_btnSelectToGroup']");

			
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@title='Close']");
			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED44314()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(3000);

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rgNWEAScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");

			//Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnCheckAll']");

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@title='Close']");
			Thread.sleep(2000);
			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=15)
	public void TCED44315()
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

			select("//select[@id='ctl00_MainContent_ddlAssessment']","NWEA 2017-2018");

			select("//select[@id='ctl00_MainContent_ddlTerm']","Fall");

			select("//select[@id='ctl00_MainContent_ddlSchoolType']","All Schools");

			select("//select[@id='ctl00_MainContent_ddlProvider']","OnHand School District");

			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","All Grades");

			click("//input[@id='ctl00_MainContent_SubgroupFilterParamsPane1_chkLstSubgroups_0']");

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			Thread.sleep(2000);
			ScrollTo_Location("//span[contains(text(),'Mathematics')]");
			Thread.sleep(2000);
			ScrollTo_Location("//span[contains(text(),'Reading')]");
			Scroll_DowntoEnd();
			Thread.sleep(3000);
			
			String locator="//*[@fill='url(#kdef12)']";
			By by = parseLocator(locator);
			List<WebElement> elements = driver.findElements(by);
			elements.get(4).click();
			// Assert the label:- NWEA | Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Student List");


		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=16)
	public void TCED44316()
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

			//Click on Run Report by Student Group option > Run Report
			click("//input[@id='ctl00_MainContent_rdoStudentGroup']");

			select("//select[@id='ctl00_MainContent_ddlStudentGroup']", "00 123 MR");


			click("//input[@id='ctl00_MainContent_btnRunReport']");

			Thread.sleep(3000);			
			// To Assert Header
			Assert.assertEquals(getText("//span[contains(text(),'NWEA |')]"), "NWEA | PSSA Pass Probability");


			//Assert the heading :  "Student Group: 00 123 MR"
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[2]/td"), "Student Group: 00 123 MR");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
