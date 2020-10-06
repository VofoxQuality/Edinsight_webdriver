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

public class PSSA_Writing_PSSACourseGradeComparisonReport extends BaseClassOne

{
	@Test(priority =1)	
	public void TCED39401()

	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//Hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Writing')]");

			//Click  PSSA/Course Grade Comparison Report
			click("//a[contains(text(),'PSSA/Course Grade Comparison Report')]");

			//Assert the label PSSA/Course Grade Comparison Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"Course Grade to PSSA Writing Score Comparison Report");	


		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
	}

	@Test(priority =2)	
	public void TCED39402()

	{
		try
		{
			//Assert all the labels

			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblAssessmentName']"), "PSSA Writing Testing Year");

			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"), "School Type");

			Assert.assertEquals(getText("//td[contains(text(),'Building')]"), "Building");

			Assert.assertEquals(getText("//td[contains(text(),'Course Subject')]"), "Course Subject");

			Assert.assertEquals(getText("//td[contains(text(),'Course(s)')]"), "Course(s)");

			Assert.assertEquals(getText("//td[contains(text(),'Grading Period')]"), "Grading Period");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}

	}

	@Test(priority =3)	
	public void TCED39403()

	{
		try
		{
			// Click on Run Report			
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			// Assert the Validation
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblErrorMessages']"), "You must select Course.");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}

	}

	@Test(priority =4)	
	public void TCED39404()

	{
		try
		{
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Writing 2013-2014");

			//select School type
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");

			//select building
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=Betterton Middle School");

			//select course subject
			select("//select[@id='ctl00_MainContent_ddlCourseSubject']","label=Music");

			// select courses
			click("//span[@id='ctl00_MainContent_rcmbCourse_Arrow']");
			Thread.sleep(500);
			// Click and select values from dropdown
			click("//ul[@class='rcbList']//li[1]//label[1]//input[1]");
			click("//ul[@class='rcbList']//li[4]//label[1]//input[1]");
			click("//ul[@class='rcbList']//li[5]//label[1]//input[1]");
			click("//ul[@class='rcbList']//li[7]//label[1]//input[1]");
			click("//span[@id='ctl00_MainContent_rcmbCourse_Arrow']");

			Thread.sleep(1500);
			// select grading period
			select("//select[@id='ctl00_MainContent_ddlGradingPeriod']","label=Period 2 Grade");

			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");

			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"Course Grade to PSSA Score Comparison Report");				
		} 

		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}

	}

	@Test(priority =5)	
	public void TCED39405()

	{
		try
		{ 
			// To Assert all the heading parameters of Course Grade to PSSA Score Comparison Report

			String s= getText("//table[@id='ctl00_MainContent_tblBuildingHeader']");

			Assert.assertTrue(s.contains("School Type"),"failed to assert text"+"School Type");

			Assert.assertTrue(s.contains("All Schools"),"failed to assert text"+"All Schools");

			Assert.assertTrue(s.contains("Current Building/District "),"failed to assert text"+"Current Building/District ");

			Assert.assertTrue(s.contains("Betterton Middle School"),"failed to assert text"+"Betterton Middle School");

			Assert.assertTrue(s.contains("Testing Year "),"failed to assert text"+"Testing Year ");

			Assert.assertTrue(s.contains("PSSA Writing 2013-2014"),"failed to assert text"+"PSSA Writing 2013-2014");

			Assert.assertTrue(s.contains("Course Subject "),"failed to assert text"+"Course Subject ");

			Assert.assertTrue(s.contains("Music"),"failed to assert text"+"Music");

			Assert.assertTrue(s.contains("Grading Period "),"failed to assert text"+"Grading Period ");

			Assert.assertTrue(s.contains("Period 2 Grade"),"failed to assert text"+"Period 2 Grade");

			Assert.assertTrue(s.contains("Grading Period "),"failed to assert text"+"Grading Period ");

			// To Assert all the heading parameters of Course Grade to PSSA Score Comparison Report

			String a = getText("//table[@id='ctl00_MainContent_tblbuildinCourseHeaser']");

			Assert.assertTrue(a.contains("Course "),"failed to assert text"+"Course ");

			Assert.assertTrue(a.contains("7 Choir (22CHO70), 7 Orchestra (22ORC70), 7 Red Band (22RBA70), 8 Gold Band (22GBA80)"),"failed to assert text"+"7 Choir (22CHO70), 7 Orchestra (22ORC70), 7 Red Band (22RBA70), 8 Gold Band (22GBA80)");

			// To Assert other main labels on page

			//Assert.assertEquals(getText("//*[@id='ctl00_MainContent_lblTitle']"),"PSSA Writing 2013-2014");				

			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_gvMainGrid_ctl02_lblSelectedTeacher']"),"Teacher : All Teachers");				

			// To Assert all the Grid parameters of Course Grade to PSSA Score Comparison Report

			String q= getText("//table[@id='ctl00_MainContent_gvMainGrid_ctl02_rgTeacherDetails_ctl00']//thead//tr");

			Assert.assertTrue(q.contains("Performance Level"),"failed to assert text"+"Performance Level");

			Assert.assertTrue(q.contains("A"),"failed to assert text"+"A");

			Assert.assertTrue(q.contains("A+"),"failed to assert text"+"A+");

			Assert.assertTrue(q.contains("A-"),"failed to assert text"+"A-");

			Assert.assertTrue(q.contains("B+"),"failed to assert text"+"B+");

			Assert.assertTrue(q.contains("B"),"failed to assert text"+"B");

			Assert.assertTrue(q.contains("Total"),"failed to assert text"+"Total");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}

	}
	@Test(priority =6)	
	public void TCED39406()

	{
		try
		{ 

			//Application should be in the Assessment Student List   page 

			FileDelete();

			//Click on Export to PDF
			//click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(5000);

			//Assert the downloaded pdf file
			//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =7)	
	public void TCED39407()

	{
		try
		{ 	// To click on AddToFavorite
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the label PSSA/Course Grade Comparison Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"Course Grade to PSSA Score Comparison Report");	
				

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =8)	
	public void TCED39408()

	{
		try
		{ 	
			click("//*[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the label PSSA/Course Grade Comparison Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"Course Grade to PSSA Score Comparison Report");						
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =9)	
	public void TCED39409()

	{
		try
		{ 	
			//String s1=getText("//tr[@id='ctl00_MainContent_trReportHeader']");
			
			Thread.sleep(2000);
			
			Assert.assertTrue(driver.getPageSource().contains("School Type "));
			
			Assert.assertTrue(driver.getPageSource().contains(" All Schools"));
			
			Assert.assertTrue(driver.getPageSource().contains("Testing Year "));
			
			Assert.assertTrue(driver.getPageSource().contains(" PSSA Writing 2013-2014"));
			
			Assert.assertTrue(driver.getPageSource().contains("Grading Period "));
			
			Assert.assertTrue(driver.getPageSource().contains(" Period 2 Grade"));
			
			Assert.assertTrue(driver.getPageSource().contains("Current Building/District "));
			
			Assert.assertTrue(driver.getPageSource().contains("Betterton Middle School"));
			
		

			/*//Assert all  the labels
			Assert.assertEquals(s1.substring(0,51),"Current Building/District : Betterton Middle School");		

			Assert.assertEquals(s1.substring(52,83),"Grading Period : Period 2 Grade");				   

			String s2= getText("//span[@id='ctl00_MainContent_lblFilter']");

			//Assert all  the labels
			Assert.assertEquals(s2.substring(0,16),"Subject: Writing");		

			Assert.assertEquals(s2.substring(17,46),"Performance Level: Proficient");	

			Assert.assertEquals(s2.substring(47,67),"Current Subgroup(s):");  */		   
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority =10)	
	public void TCED39410()

	{
		try
		{
			
			Thread.sleep(2000);
			ScrollTo_xy_position(0, 600);
			
			Thread.sleep(2000);
			
			click("xpath=(//a[contains(text(),'9')])[2]");
			
			//Assert all the grid headers
			
			Thread.sleep(2000);
			Assert.assertEquals(getText("xpath=(//a[contains(text(),'Student ID')])[3]"),"Student ID");			

			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");			

			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");

			Assert.assertEquals(getText("//tr//th[8]//a[1]"),"Assessment");

			Assert.assertEquals(getText("//a[contains(text(),'Tested Grade')]"),"Tested Grade");

			Assert.assertEquals(getText("//a[contains(text(),'Current Grade')]"),"Current Grade");

			Assert.assertEquals(getText("//a[contains(text(),'Gender')]"),"Gender");

			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");

			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");

			Assert.assertEquals(getText("//a[contains(text(),'ELL')]"),"ELL");

			Assert.assertEquals(getText("//a[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");

			Assert.assertEquals(getText("//a[contains(text(),'Tested School')]"),"Tested School");

			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Teacher')]"),"Teacher");

			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Course')]"),"Course");

			Assert.assertEquals(getText("//tr//th[20]//a[1]"),"Grade");

			Assert.assertEquals(getText("//a[contains(text(),'Performance Level')]"),"Performance Level");

			Assert.assertEquals(getText("//a[contains(text(),'Scaled Score')]"),"Scaled Score");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =11)	
	public void TCED39411()

	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on First name column.
			click("//a[contains(text(),'First Name')]");
			Thread.sleep(2000);

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"),"sort up icon element present");

			//Click on First name column.
			click("//a[contains(text(),'First Name')]");
			Thread.sleep(3000);

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortDescIcon']"),"sort Down icon element present");


			//Assert the label PSSA Writing 2013-2014
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTitle']"),"PSSA Writing 2013-2014");	

			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[7]"))

			{
				sort_java.add(find("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[7]").getText());
				++i;			
			}
			// To Sort the array data using java.util.Collections
			Collections.sort(sort_java);
			Thread.sleep(2000);

			//Click on First name column.
			click("//a[contains(text(),'First Name')]");
			Thread.sleep(2000);
			// To sort in the ascending order
			click("//a[contains(text(),'First Name')]");
			Thread.sleep(2000);

			//Assert the First name column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+j+"']/td[7]"))
			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+j+"']/td[7]").getText());
				++j;			
			}			

			// To Assert the grida data with collection java data
			Assert.assertTrue(sort_java.equals(sort_direct),"sorting failed");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =12)	
	public void TCED39412()

	{
		try
		{
			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			FileDelete();
			//Click on Export to CSV
			click("//span[contains(text(),'Export to CSV')]");
			Thread.sleep(4000);
			
			waitFor_downloadfile();
			
			Thread.sleep(4000);
			//*On Exported CSV,  Assert the total count of columns under Teachers					
			int grid_columnCount=17;			
			Assert.assertEquals(grid_columnCount,Csv_column_count(downloadPath));

			//Compare and Assert the value of  student count & Total count from CSV are EQUAL
			String a1= getText("//span[@id='ctl00_MainContent_lblStudentCount']");

			int grid_total = Integer.parseInt(a1.substring(15));
			// Assert the the value of  student count & Total count from CSV are EQUAL
			Assert.assertEquals(grid_total,csv_row_count()-2);
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	//@Test(priority =13)	  
	public void TCED39413()

	{
		try
		{

			//Application should be in the Assessment Student List   page 
			//Click on Current grade Name filter On filter text field add "12 " and select 'EQUAL TO' 
			Thread.sleep(4000);
			
			// To Run the common method given ath the End
			RunReport();
			// To click on Drill down
			JavaScriptclick("//area[@title='A- - Proficient - 10 student(s)']");
			Thread.sleep(4000);
			//waitFor_downloadfile();
			// To click on Grade filter
			click("//button[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl02_Filter_CurrentGradeLevelId']");
			// To click on NO filter
			click("//span[contains(text(),'NoFilter')]");

			Thread.sleep(3000);
			// To Enter value 12 to textbox
			type("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl02_RNTBF_CurrentGradeLevelId']","12");
			// To click on Grade filter
			click("//button[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl02_Filter_CurrentGradeLevelId']");
			Thread.sleep(4000);
			// To click & select 'EQUAL TO'
			click("//span[contains(text(),'EqualTo')]");
			// To wait for page to load
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
			Thread.sleep(6000);

			// Assert that the column values displayed under 'Current grade' is equal  to 12 .
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[10]"))

			{
				Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00__"+i+"']/td[10]"), "12");
				++i;
			}			
			//Assert the label PSSA Writing 2013-2014
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTitle']"),"PSSA Writing 2013-2014");	
		} 

		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority =14)	
	public void TCED39414()
	{
		try
		{
			//Application should be in the Assessment Student List   page 			
			FileDelete();

			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			//Click on Export to CSV
			click("//span[contains(text(),'Export to CSV')]");
			// To wait for file to download
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


	@Test(priority =15)	
	public void TCED39415()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			FileDelete();

			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			//Click on Export to PDF
			click("//span[contains(text(),'Export to PDF')]");
			// To wait for file to download
			waitFor_downloadfile();

			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}



	@Test(priority =16)	
	public void TCED39416()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			Thread.sleep(2000);
			click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			Thread.sleep(2000);
			
			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			// Click on  Add Selected Student to Group button 
			click("//span[contains(text(),'Add Selected Students to Group')]");
			Thread.sleep(3000);
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");

			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			Thread.sleep(2000);
			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@title='Close']");

			//Assert the label PSSA Writing 2013-2014
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTitle']"),"PSSA Writing 2013-2014");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority =17)	
	public void TCED39417()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			//Thread.sleep(4000);

			//Select Some Student 
			Thread.sleep(2000);
			click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			Thread.sleep(2000);
			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			//Click on  Add All Student to Group button	 
			click("//span[contains(text(),'Add All Students to Group')]");
			Thread.sleep(2000);

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			Thread.sleep(2000);
			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@title='Close']");

			//Assert the label PSSA Writing 2013-2014
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTitle']"),"PSSA Writing 2013-2014");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority =18)	
	public void TCED39418()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			FileDelete();
			Thread.sleep(2000);
			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");

			// Click on context button
			click("//span[@class='rbIcon p-icon rbSplitIcon p-i-arrow-down']");
			Thread.sleep(2000);

			//Click on Print selected students
			click("//span[contains(text(),'Print Selected Students')]");

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

	@Test(priority =19)	
	public void TCED39419()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			FileDelete();
			Thread.sleep(2000);

			click("//input[@id='ctl00_MainContent_btnPrintToPDF1']");
			Thread.sleep(5000);
			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority =20)	
	public void TCED39420()
	{
		try
		{
			// To Run the common method given ath the End
			RunReport();
			// To Scroll to particular Location
			ScrollTo_Location("//span[@id='ctl00_MainContent_gvMainGrid_ctl02_lblSelectedTeacher']");
			Thread.sleep(3000);
			// To get the count of drill down data
			int totalvalue= Integer.parseInt(getText("//*[@id='ctl00_MainContent_gvMainGrid_ctl02_rgTeacherDetails_ctl00']/tfoot/tr/td[7]/a"));

			click("//*[@id='ctl00_MainContent_gvMainGrid_ctl02_rgTeacherDetails_ctl00']/tfoot/tr/td[7]/a");

			String Studenttotal= getText("//span[@id='ctl00_MainContent_lblStudentCount']");
			// To get the page Student count
			int StdCount = Integer.parseInt(Studenttotal.substring(15));
			// To Assert the Values are equal
			Assert.assertEquals(totalvalue, StdCount);
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	//******************** Common methods**************


	public void RunReport() throws InterruptedException

	{

		//click on Logout button		 
		click("//*[@id='ctl00_A3']");

		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		MouseOver overmenuItem=new MouseOver();
		overmenuItem. MouseOver_DataAnalyst();

		//Hover over report link			
		Actions act=new Actions(driver);					
		act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

		//Click PSSA Math/Reading
		click("//a[contains(text(),'PSSA Writing')]");

		//Click  PSSA/Course Grade Comparison Report
		click("//a[contains(text(),'PSSA/Course Grade Comparison Report')]");

		//select Testing PSSA Year
		select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Writing 2013-2014");

		//select School type
		select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");

		//select building
		select("//select[@id='ctl00_MainContent_ddlProvider']","label=Betterton Middle School");
		Thread.sleep(500);
		//select course subject
		select("//select[@id='ctl00_MainContent_ddlCourseSubject']","label=Music");

		// select courses
		click("//span[@id='ctl00_MainContent_rcmbCourse_Arrow']");
		Thread.sleep(500);
		// Click and select values from dropdown
		click("//ul[@class='rcbList']//li[1]//label[1]//input[1]");
		click("//ul[@class='rcbList']//li[4]//label[1]//input[1]");
		click("//ul[@class='rcbList']//li[5]//label[1]//input[1]");
		click("//ul[@class='rcbList']//li[7]//label[1]//input[1]");
		click("//span[@id='ctl00_MainContent_rcmbCourse_Arrow']");
		Thread.sleep(1500);

		// select grading period
		select("//select[@id='ctl00_MainContent_ddlGradingPeriod']","label=Period 2 Grade");

		//Click on Run report
		click("//input[@id='ctl00_MainContent_btnRunReport']");

	}










}
