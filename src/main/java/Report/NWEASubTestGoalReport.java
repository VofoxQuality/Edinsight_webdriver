package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class NWEASubTestGoalReport extends BaseClassOne{


	@Test(priority=1)
	public void TCED44401()
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

			//Click on  NWEA | Subtest (Goal) Level Report
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");


			//Asert the the Header Name asNWEA | Subtest (Goal) Level Report
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Subtest (Goal) Level Report");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void TCED44402()
	{
		try
		{	//Asert all the valid fields on page
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

	public void TCED44403() throws InterruptedException

	{
		try 
		{
			// TO select the parameters
			select("//select[@id='ctl00_MainContent_ddlAssessment']","NWEA 2017-2018");

			select("//select[@id='ctl00_MainContent_ddlTerm']","Fall");

			select("//select[@id='ctl00_MainContent_ddlSchoolType']","All Schools");

			select("//select[@id='ctl00_MainContent_ddlProvider']","OnHand School District");

			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","First Grade");

			click("//input[@id='ctl00_MainContent_SubgroupFilterParamsPane1_chkLstSubgroups_0']");

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
			Thread.sleep(3000);

			// To Assert Header
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest (Goal) Breakdown");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED44404() throws InterruptedException

	{
		try 
		{
			// Assert the header sections:

			String s=getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]");		

			Assert.assertEquals(s.substring(0,26),"Assessment: NWEA 2017-2018");

			Assert.assertEquals(s.substring(27,49).trim(),"Testing Term: Fall");

			Assert.assertEquals(getText("//table[@class='border3']//td[1]"), "Testing Provider: OnHand School District");

			Assert.assertEquals(getText("//table[@class='border3']//td[3]"), "Testing Grade Level: First Grade");

			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trFilterDisplay']//td"), "Subgroup(s): Male");

			Assert.assertEquals(getText("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'Subject')]"), "Subject");		

			Assert.assertEquals(getText("//a[contains(text(),'Test Name')]"), "Test Name");		

			Assert.assertEquals(getText("//a[contains(text(),'Subtest (Goal) Name')]"), "Subtest (Goal) Name");	

			Assert.assertEquals(getText("//a[contains(text(),'Average RIT Score')]"), "Average RIT Score");		



		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority =5)	
	public void TCED44405()

	{
		try
		{ 	// To click on AddToFavorite
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			// To Assert Header
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest (Goal) Breakdown");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void TCED44406()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Any grid value Subject
			click("//th[@class='rgHeader GridHeaderStyle']//a[contains(text(),'Subject')]");

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"));
			Thread.sleep(2000);

			// To Assert Header
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest (Goal) Breakdown");		

			//Asseert the First name column data get sorted correctly.
			List<String> sort_firstname=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgNWEAGoalReport_ctl00__"+i+"']/td[1]"))

			{
				sort_firstname.add(getText("//*[@id='ctl00_MainContent_rgNWEAGoalReport_ctl00__"+i+"']/td[1]"));
				i++;
			}
			List<String> sort_firstname_java=new ArrayList<String>(sort_firstname);
			Collections.sort(sort_firstname_java);

			Assert.assertEquals(sort_firstname,sort_firstname_java);

			// To Assert Header
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest (Goal) Breakdown");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	public void TCED44407()
	{
		try
		{

			//Click 37 student(s)
			click("//*[@id='ctl00_MainContent_rgNWEAGoalReport_ctl00__0']/td[5]/table/tbody/tr[1]/td[3]/b/a");	
			Thread.sleep(2000);		

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=8)
	public void TCED44408()
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

			//Click on  NWEA | Subtest (Goal) Level Report
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");

			// TO select the parameters
			select("//select[@id='ctl00_MainContent_ddlAssessment']","NWEA 2017-2018");

			select("//select[@id='ctl00_MainContent_ddlTerm']","Fall");

			select("//select[@id='ctl00_MainContent_ddlSchoolType']","All Schools");

			select("//select[@id='ctl00_MainContent_ddlProvider']","OnHand School District");

			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","First Grade");

			click("//input[@id='ctl00_MainContent_SubgroupFilterParamsPane1_chkLstSubgroups_0']");

			Thread.sleep(1000);
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS);
			Thread.sleep(3000);

			click("//a[@id='ctl00_MainContent_rgNWEAGoalReport_ctl00_ctl04_hlGoalStudentList']");

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	public void TCED44409()
	{
		try
		{
			//* Assert the followng Headers:

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[1]"), "Assessment: NWEA 2017-2018");	

			String d = getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]");

			Assert.assertEquals(d.substring(0,20).trim(),"Subject: Mathematics");

			Assert.assertEquals(d.substring(21,64).trim(),"Subtest (Goal) Name: Numbers & Operations");

			Assert.assertEquals(d.substring(65,82).trim(),"Test Term: Fall");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=10)
	public void TCED44410()
	{
		try
		{
			//* Assert the followng Headers:
			Assert.assertEquals(getText("//a[contains(text(),'Student ID')]"), "Student ID");	
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"), "Last Name");	
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"), "First Name");	
			Assert.assertEquals(getText("//a[contains(text(),'Total RIT Score')]"), "Total RIT Score");	
			Assert.assertEquals(getText("//a[contains(text(),'Percentile')]"), "Percentile");	
			Assert.assertEquals(getText("//a[contains(text(),'Subtest (Goal) RIT Score')]"), "Subtest (Goal) RIT Score");	
			Assert.assertEquals(getText("//a[contains(text(),'Subtest (Goal) Performance Level')]"), "Subtest (Goal) Performance Level");	
			Assert.assertEquals(getText("//a[contains(text(),'Lexile Score')]"), "Lexile Score");			

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}	

	@Test(priority=11)
	public void TCED44411()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Any grid value First name
			click("//a[contains(text(),'First Name')]");

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"));

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");			

			//Assert the First name column data get sorted correctly.
			List<String> sort_firstname=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[7]"))

			{
				sort_firstname.add(getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[7]"));
				i++;
			}
			List<String> sort_firstname_java=new ArrayList<String>(sort_firstname);
			Collections.sort(sort_firstname_java);
			Assert.assertEquals(sort_firstname,sort_firstname_java);

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void TCED44412()
	{
		try
		{
			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");

			waitFor_downloadfile();	

			//On Exported CSV,  Assert the total count of columns under First Name	
			int firstname_gridcount=152;
			Assert.assertEquals(firstname_gridcount,csv_row_count()-1);			

			//Compare and Assert the value of 152  items shown under pagination & Total count from CSV are EQUAL
			int grid_totalcount=Integer.parseInt(getText("//*[@id='ctl00_MainContent_rgNWEAGoalStudentList_ctl00']/tfoot/tr/td/div/div[5]/strong[1]"));

			Assert.assertEquals(grid_totalcount,csv_row_count()-1);			    
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}



	@Test(priority=13)
	public void TCED44413()
	{
		try
		{
			//Application should be in the Assessment Student List   page  			
			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");

			waitFor_downloadfile();
			Thread.sleep(500);

			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");					
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED44414()
	{
		try
		{
			//Application should be in the Assessment Student List   page  			
			FileDelete();

			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");

			waitFor_downloadfile();
			Thread.sleep(500);

			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");					
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public void TCED44415()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rgNWEAGoalStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");		

			// Click on  Add Selected Student to Group button 
			click("//input[@value='Add Selected Students to Group']");
			Thread.sleep(1500);

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Thread.sleep(1000);
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@class='rwCommandButton rwCloseButton']");

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public void TCED44416()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			Thread.sleep(3000);
			if(isSelected("//input[@id='ctl00_MainContent_rgNWEAGoalStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']")==false)
			{ 			
				//Select Some Student 
				click("//input[@id='ctl00_MainContent_rgNWEAGoalStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			}

			//Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnAddAllToGroup']");

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Thread.sleep(1000);

			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@class='rwCommandButton rwCloseButton']");

			//* Assert the heading: NWEA Subtest Breakdown Student List
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest Breakdown Student List");	


		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=17)
	public void TCED44417()
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

			//Click on  NWEA | Subtest (Goal) Level Report
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");

			//Click on Run Report by Student Group option > Run Report
			click("//input[@id='ctl00_MainContent_rdoStudentGroup']");

			select("//select[@id='ctl00_MainContent_ddlStudentGroup']", "00 123 MR");


			click("//input[@id='ctl00_MainContent_btnRunReport']");

			Thread.sleep(3000);			

			// To Assert Header
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA Subtest (Goal) Breakdown");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


}
