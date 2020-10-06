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

public class NWEASubTestGoalReportByTeacher extends BaseClassOne{


	@Test(priority=1)
	public void TCED44501()
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

			//Click on  NWEA  SubTest (Goal) Report By Teacher
			click("//tr[@id='ctl00_MainContent_ReportListSingleAssessment1_ctl00_trSubtestGoalReportByTeacher']//a[@class='header'][contains(text(),'NWEA')]");


			//Asert the the Header Name asNWEA | Subtest (Goal) Level Report By Teacher
			Assert.assertEquals(getText("//span[@class='subheading']"), "NWEA | Subtest (Goal) Level Report By Teacher");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void TCED44502()
	{
		try
		{
			//Asert all the valid fields on page

			Assert.assertEquals(getText("//td[contains(text(),'NWEA Testing Year')]"), "NWEA Testing Year");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Term')]"), "Testing Term");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Building/District')]"), "Testing Building/District");

			Assert.assertEquals(getText("//td[contains(text(),'Teacher')]"), "Teacher");

			Assert.assertEquals(getText("//td[contains(text(),'Testing Grade Level')]"), "Testing Grade Level");

			//Assert the labels:-All Courses
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbAllCourses']"),"All Courses");

			//Assert the labels:-ENG - CONTEMP LIT
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57902']"),"ENG - CONTEMP LIT");

			//Assert the labels:-Section 1
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57902Section-1!37931']"),"Section 1");

			//Assert the labels:-ENG - LITERATURE KEYSTONE REMEDIATION
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57896']"),"ENG - LITERATURE KEYSTONE REMEDIATION");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57896Section-6!37916']"),"Section 6");

			//Assert the labels:-Section 7
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57896Section-7!37917']"),"Section 7");

			//Assert the labels:-ENG-COLLEGE PREP ENG 11
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57899']"),"ENG-COLLEGE PREP ENG 11");

			//Assert the labels:-Section 1
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57899Section-1!37923']"),"Section 1");

			//Assert the labels:-Section 2
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57899Section-2!37926']"),"Section 2");

			//Assert the labels:-Section 3
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57899Section-3!37927']"),"Section 3");

			//Assert the labels:-ENG-COLLEGE PREP ENG 12
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57907']"),"ENG-COLLEGE PREP ENG 12");

			//Assert the labels:-Section 5
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57907Section-5!37947']"),"Section 5");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57907Section-6!37948']"),"Section 6");

			//Assert the labels:-HOMEROOM (ALPHA)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse58203']"),"HOMEROOM (ALPHA)");

			//Assert the labels:-Section 40
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection58203Section-40!38705']"),"Section 40");

			//Assert the labels:-IE O'BRIEN OFFICE HOURS
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse59131']"),"IE O'BRIEN OFFICE HOURS");

			//Assert the labels:-Section 11
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection59131Section-11!41479']"),"Section 11");

			//Assert the labels:-Section 21
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection59131Section-21!41481']"),"Section 21");

			//Assert the labels:-Section 31
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection59131Section-31!41480']"),"Section 31");

			//Assert the labels:-Section 41
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection59131Section-41!42012']"),"Section 41");

			//Assert the labels:-Section 51
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection59131Section-51!42013']"),"Section 51");

			//Assert the labels:-IE WALKING CLUB
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse58977']"),"IE WALKING CLUB");

			//Assert the labels:-Section 62
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_tblCourses']/tbody/tr[3]/td[3]/table/tbody/tr[2]/td[2]/span/label"),"Section 62");

			//Assert the labels:-TEACHING ASST (S)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57871']"),"TEACHING ASST (S)");

			//Assert the labels:-Section 21
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57871Section-21!40809']"),"Section 21");

			//Assert the labels:-Section 56
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57871Section-56!40928']"),"Section 56");

			//Assert the labels:-TEACHING ASST (YR)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbCourse57872']"),"TEACHING ASST (YR)");

			//Assert the labels:-Section 15
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57872Section-15!40838']"),"Section 15");

			//Assert the labels:-Section 24
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57872Section-24!40939']"),"Section 24");

			//Assert the labels:-Section 5
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57872Section-5!37871']"),"Section 5");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ctl02_cbSection57872Section-6!37872']"),"Section 6");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=3)

	public void TCED44503() throws InterruptedException

	{
		try 
		{
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			String s= getText("//span[@id='ctl00_MainContent_lblErrorMessages']");

			Assert.assertEquals (s.substring(0,24), "You must select a grade level.");

			Assert.assertEquals (s.substring(25,48), "You must select a Test Term.");


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED44504() throws InterruptedException

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

	@Test(priority =5)	
	public void TCED44505()

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
	public void TCED44506()
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
	public void TCED44507()
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
	public void TCED44508()
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
	public void TCED44509()
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
	public void TCED44510()
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
	public void TCED44511()
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
	public void TCED44512()
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
	public void TCED44513()
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
	public void TCED44514()
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
	public void TCED44515()
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
	public void TCED44516()
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
	public void TCED44517()
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
