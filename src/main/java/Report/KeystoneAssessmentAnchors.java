package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class KeystoneAssessmentAnchors extends BaseClassOne {

	@Test(priority=1)
	public void TCED411801()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click Keystone
			click("//a[contains(text(),'Keystone')]");

			//Click Teacher Classroom Reports 
			click("//td[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[10]/td[3]/a");


			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Keystone Assessment Anchors')]");

			//Assert the the Header Name as Keystone Exam Assessment Anchors Reports 
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Keystone Exam Assessment Anchors Report");


		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void TCED411802()
	{
		try
		{
			//Application should be in the  Keystone Exam Assessment Anchors

			//Assert the labels:-Keystone Exam Testing Year
			Assert.assertEquals(getText("//div[contains(text(),'Keystone Exam Testing Year:')]"),"Keystone Exam Testing Year:");

			//Assert the labels:-SELECT ACTIVE TEACHER
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_dvSelectTeacher']/div"),"SELECT ACTIVE TEACHER");	

			//Assert the labels:-School Type:
			Assert.assertEquals(getText("//div[contains(text(),'School Type:')]"),"School Type:");	

			//Assert the labels:-Building:
			Assert.assertEquals(getText("//div[contains(text(),'Building:')]"),"Building:");	

			//Assert the labels:-Teacher:
			Assert.assertEquals(getText("//div[contains(text(),'Teacher:')]"),"Teacher:");

			//Assert the labels:-STUDENT POPULATION			

			//Assert the labels:-Student Population:

			//Assert the labels:-COURSES
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_divCourses']/div"),"COURSES");

			//Assert the labels:-All Courses
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbAllCourses']"),"All Courses");

			//Assert the labels:-ENG - CONTEMP LIT
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57902']"),"ENG - CONTEMP LIT");

			//Assert the labels:-Section 1
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57902Section-1!37931']"),"Section 1");

			//Assert the labels:-ENG - LITERATURE KEYSTONE REMEDIATION
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57896']"),"ENG - LITERATURE KEYSTONE REMEDIATION");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57896Section-6!37916']"),"Section 6");

			//Assert the labels:-Section 7
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57896Section-7!37917']"),"Section 7");

			//Assert the labels:-ENG-COLLEGE PREP ENG 11
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57899']"),"ENG-COLLEGE PREP ENG 11");

			//Assert the labels:-Section 1
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57899Section-1!37923']"),"Section 1");

			//Assert the labels:-Section 2
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57899Section-2!37926']"),"Section 2");

			//Assert the labels:-Section 3
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57899Section-3!37927']"),"Section 3");

			//Assert the labels:-ENG-COLLEGE PREP ENG 12
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57907']"),"ENG-COLLEGE PREP ENG 12");

			//Assert the labels:-Section 5
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57907Section-5!37947']"),"Section 5");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57907Section-6!37948']"),"Section 6");

			//Assert the labels:-HOMEROOM (ALPHA)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse58203']"),"HOMEROOM (ALPHA)");

			//Assert the labels:-Section 40
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection58203Section-40!38705']"),"Section 40");

			//Assert the labels:-IE O'BRIEN OFFICE HOURS
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse59131']"),"IE O'BRIEN OFFICE HOURS");

			//Assert the labels:-Section 11
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection59131Section-11!41479']"),"Section 11");

			//Assert the labels:-Section 21
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection59131Section-21!41481']"),"Section 21");

			//Assert the labels:-Section 31
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection59131Section-31!41480']"),"Section 31");

			//Assert the labels:-Section 41
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection59131Section-41!42012']"),"Section 41");

			//Assert the labels:-Section 51
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection59131Section-51!42013']"),"Section 51");

			//Assert the labels:-IE WALKING CLUB
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse58977']"),"IE WALKING CLUB");

			//Assert the labels:-Section 62
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection58977Section-62!41996']"),"Section 62");

			//Assert the labels:-TEACHING ASST (S)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57871']"),"TEACHING ASST (S)");

			//Assert the labels:-Section 21
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57871Section-21!40809']"),"Section 21");

			//Assert the labels:-Section 56
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57871Section-56!40928']"),"Section 56");

			//Assert the labels:-TEACHING ASST (YR)
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbCourse57872']"),"TEACHING ASST (YR)");

			//Assert the labels:-Section 15
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57872Section-15!40838']"),"Section 15");

			//Assert the labels:-Section 24
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57872Section-24!40939']"),"Section 24");

			//Assert the labels:-Section 5
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57872Section-5!37871']"),"Section 5");

			//Assert the labels:-Section 6
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_ClassroomReportFilterParams1_cbSection57872Section-6!37872']"),"Section 6");

			//Assert the labels:-STUDENT CURRENT GRADE
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ClassroomReportFilterParams1_divStudentGrades']//div[@class='subhead-txt']"),"STUDENT CURRENT GRADE");

			//Assert the labels:-All Grades
			Assert.assertEquals(getText("//label[contains(text(),'All Grades')]"),"All Grades");

			//Assert the labels:-STUDENT DEMOGRAPHICS
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/div[7]/div"),"STUDENT DEMOGRAPHICS");

			//Assert the labels:-All Students
			Assert.assertEquals(getText("//label[contains(text(),'All Students')]"),"All Students");

			//Assert the labels:-Gender
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[6]/tbody/tr[2]/td"),"Gender");

			//Assert the labels:-Male 
			Assert.assertEquals(getText("//label[contains(text(),'Male')]"),"Male");

			//Assert the labels:-Female
			Assert.assertEquals(getText("//label[contains(text(),'Female')]"),"Female");

			//Assert the labels:-Ethnicity
			Assert.assertEquals(getText("//table[@class='default-text']//tbody//tr[4]//td[1]"),"Ethnicity");

			//Assert the labels:-Unknown 
			Assert.assertEquals(getText("//label[contains(text(),'Unknown')]"),"Unknown");

			//Assert the labels:-White 
			Assert.assertEquals(getText("//label[contains(text(),'White')]"),"White");

			//Assert the labels:-Black
			Assert.assertEquals(getText("//label[contains(text(),'Black')]"),"Black");

			//Assert the labels:-Hispanic 
			Assert.assertEquals(getText("//label[contains(text(),'Hispanic')]"),"Hispanic");

			//Assert the labels:-Asian or Pacific Islander 
			Assert.assertEquals(getText("//label[contains(text(),'Asian or Pacific Islander')]"),"Asian or Pacific Islander");

			//Assert the labels:-American Indian
			Assert.assertEquals(getText("//label[contains(text(),'American Indian')]"),"American Indian");

			//Assert the labels:-Alaskan Native 
			Assert.assertEquals(getText("//label[contains(text(),'Alaskan Native')]"),"Alaskan Native");

			//Assert the labels:-Multi-Racial 
			Assert.assertEquals(getText("//label[contains(text(),'Multi-Racial')]"),"Multi-Racial");

			//Assert the labels:-Not Listed
			Assert.assertEquals(getText("//label[contains(text(),'Not Listed')]"),"Not Listed");

			//Assert the labels:-Other
			Assert.assertEquals(getText("//table[@class='default-text']//tbody//tr[6]//td[1]"),"Other");

			//Assert the labels:-Match Any  
			Assert.assertEquals(getText("//label[contains(text(),'Match Any')]"),"Match Any");

			//Assert the labels:-Match All
			Assert.assertEquals(getText("//label[contains(text(),'Match All')]"),"Match All");

			//Assert the labels:-IEP 
			Assert.assertEquals(getText("//label[contains(text(),'IEP')]"),"IEP");

			//Assert the labels:-Not IEP  
			Assert.assertEquals(getText("//label[contains(text(),'Not IEP')]"),"Not IEP");

			//Assert the labels:-ELL 
			Assert.assertEquals(getText("//label[contains(text(),'ELL')]"),"ELL");

			//Assert the labels:-Not ELL
			Assert.assertEquals(getText("//label[contains(text(),'Not ELL')]"),"Not ELL");

			//Assert the labels:-Gifted 
			Assert.assertEquals(getText("//label[contains(text(),'Gifted')]"),"Gifted");

			//Assert the labels:-Not Gifted 
			Assert.assertEquals(getText("//label[contains(text(),'Not Gifted')]"),"Not Gifted");

			//Assert the labels:-Ec. Disadvantaged
			Assert.assertEquals(getText("//label[contains(text(),'Ec. Disadvantaged')]"),"Ec. Disadvantaged");

			//Assert the labels:-Not Ec. Disadvantaged
			Assert.assertEquals(getText("//label[contains(text(),'Not Ec. Disadvantaged')]"),"Not Ec. Disadvantaged");

			//Assert the labels:-Title 1 
			Assert.assertEquals(getText("//label[contains(text(),'Title 1')]"),"Title 1");

			//Assert the labels:-Not Title 1
			Assert.assertEquals(getText("//label[contains(text(),'Not Title 1')]"),"Not Title 1");

			//Assert the labels:-Title 3 
			Assert.assertEquals(getText("//label[contains(text(),'Title 3')]"),"Title 3");

			//Assert the labels:-Not Title 3
			Assert.assertEquals(getText("//label[contains(text(),'Not Title 3')]"),"Not Title 3");

			//Assert the labels:-Medical Issue  
			Assert.assertEquals(getText("//label[contains(text(),'Medical Issue')]"),"Medical Issue");

			//Assert the labels:-Not Medical Issue 
			Assert.assertEquals(getText("//label[contains(text(),'Not Medical Issue')]"),"Not Medical Issue");

			//Assert the labels:-Migrant
			Assert.assertEquals(getText("//label[contains(text(),'Migrant')]"),"Migrant");

			//Assert the labels:-Not Migrant
			Assert.assertEquals(getText("//label[contains(text(),'Not Migrant')]"),"Not Migrant");

			//Assert the labels:-504
			Assert.assertEquals(getText("//label[contains(text(),'504')]"),"504");

			//Assert the labels:-Not 504
			Assert.assertEquals(getText("//label[contains(text(),'Not 504')]"),"Not 504");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED411803()
	{
		try
		{
			//Application should be in the  Keystone Exam Assessment Anchors Report

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");

			Thread.sleep(2000);

			//assert the validation message "You must select at least one course or group."
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblErrorMessages']"),"You must select at least one course or group.");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED411804()
	{
		try
		{
			//Application should be in the  Keystone Exam Assessment Anchors Report		

			//select Keystone Exam Testing Year: 2016-2017
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=Keystone Exams 2016-2017");

			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ClassroomReportFilterParams1_rcmbTeacher_Arrow']");
			click("//li[contains(text(),'Ableton, A - 18')]");

			//Student Population: Currently Enrolled
			Thread.sleep(5000);
			
			//select("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_ddlPopulation']","value='1'");
			
			

			//Courses: All Courses
			click("//label[contains(text(),'All Courses')]//preceding::input[1]");

			//Current Grade Levels: All Grades
			if(find("//label[contains(text(),'All Grades')]//preceding::input[1]").isSelected()==false)
			{
				click("//label[contains(text(),'All Grades')]//preceding::input[1]");
			}

			//Student Demographics: All Students
			if(find("//label[contains(text(),'All Students')]//preceding::input[1]").isSelected()==false)
			{
				click("//label[contains(text(),'All Students')]//preceding::input[1]");
			}

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");

			Thread.sleep(6000);

			//	ScrollTo_Location("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span");

			//Assert the the Header Name as  Keystone Exam Anchors
			Assert.assertEquals(getText("//span[@class='subheading']"),"Keystone Exam Anchors");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=5)
	public void TCED411805()
	{
		try
		{
			//Application should be in the   Keystone Exam Anchors Report	

			// Assert the Labels:-Keystone Exams 2016-2017
			Assert.assertEquals(getText("//tr[@valign='top']"),"Keystone Exam Year: 2016-2017");	

			//Assert the Labels:-Student Population: Currently Enrolled
			String s=getText("//td[text()='Currently Enrolled']");			
			Assert.assertEquals(s.substring(0,38),"Student Population: Currently Enrolled");	

			//Assert the Labels:-Courses: All Courses
			Assert.assertEquals(getText("//li[contains(text(),'All Courses')]"),"All Courses");	

			//Assert the Labels:-Current Grade Levels: All Grades
			Assert.assertEquals(getText("//li[contains(text(),'All Grades')]"),"All Grades");

			//Assert the Labels:-Student Demographics: All Students
			Assert.assertEquals(getText("//li[contains(text(),'All Students')]"),"All Students");

			// Assert the Labels:- View All Subjects  
			Assert.assertEquals(getText("//b[contains(text(),'View All Subjects')]"),"View All Subjects");

			// Assert the Labels:- View Only Math 
			Assert.assertEquals(getText("//b[contains(text(),'View Only Algebra 1')]"),"View Only Algebra 1");

			// Assert the Labels:- View Only Reading
			Assert.assertEquals(getText("//b[contains(text(),'View Only Biology')]"),"View Only Biology");

			// Assert the Labels:- View Only Literature
			Assert.assertEquals(getText("//b[contains(text(),'View Only Literature')]"),"View Only Literature");

			// Assert the Labels:- Show Data in Graphical Form
			Assert.assertEquals(getText("//b[contains(text(),'Show Data in Graphical Form')]"),"Show Data in Graphical Form");

			// Assert the Labels:-Anchor Code 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortAnchorCode']"),"Anchor Code");

			// Assert the Labels:-Anchor Desc
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortAnchorDesc']"),"Anchor Desc");

			// Assert the Labels:-Points Possible 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortPointsPossible']"),"Points Possible");

			// Assert the Labels:-Average Score 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortAverageScore']"),"Average Score");

			// Assert the Labels:-Average Points Missed 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortAveragePointsMissed']"),"Average Points Missed");

			// Assert the Labels:-Performance
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_lnkSortAveragePercentCorrect']"),"Performance");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=6)
	public void TCED411806()
	{
		try
		{

			//Click on View All Subjects
			click("//b[contains(text(),'View All Subjects')]");

			//* Asset the report header : Keystone exam  Anchors
			Assert.assertEquals(getText("//span[@class='subheading']"),"Keystone Exam Anchors");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	//@Test(priority =7)	
	
	// Feature not Available
	public void TCED411807()

	{
		try
		{ 

			//Application should be in the Assessment Student List   page 

			FileDelete();

			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
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

	@Test(priority =8)	
	public void TCED411808()

	{
		try
		{ 	// To click on AddToFavorite
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the label Keystone Exam Anchors Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"Keystone Exam Anchors");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	public void TCED411809()
	{
		try
		{

			//Click on View All Subjects
			click("//b[contains(text(),'View Only Algebra 1')]");

			//* Asset the labels
			Assert.assertEquals(getText("//body[@class='bodybg']//tr//tr//tr//tr[3]//td[1]//b[1]//a[1]"),"A1");	

			Assert.assertEquals(getText("//td[contains(text(),'Algebra 1 (April 2014)')]"),"Algebra 1 (April 2014)");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=10)
	public void TCED411810()
	{
		try
		{
			
			//Click A1
			click("//body[@class='bodybg']//tr//tr//tr//tr[3]//td[1]//b[1]//a[1]");
			Thread.sleep(1000);

			//* Assert the header "Teaching Aids for Standard Code "
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_Label1']"),"Teaching Aids for Standard Code");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=11)
	public void TCED411811()
	{
		try
		{
			driver.navigate().back();
			Thread.sleep(3000);
			//Click on 42.25
			click("//a[contains(text(),'42.25')]");

			String S=getText("//span[@id='ctl00_MainContent_lblX']");
			String S1=getText("//span[@id='ctl00_MainContent_lblAnchorName']");			
			Assert.assertEquals(S+" "+S1,"Anchor Name: A1 Algebra 1 (April 2014)");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=12)
	public void TCED411812()
	{
		try
		{

			//Assert the Labels:-Student ID 
			Assert.assertEquals(getText("//th[contains(text(),'Student ID')]"),"Student ID");
			
			//Assert the Labels:-State Student ID
			Assert.assertEquals(getText("//a[contains(text(),'State Student ID')]"),"State Student ID");
			
			//Assert the Labels:-Last Name 
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");

			//Assert the Labels:-First Name 
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");

			//Assert the Labels:-Points Possible
			Assert.assertEquals(getText("//a[contains(text(),'Points Possible')]"),"Points Possible");

			//Assert the Labels:-Group Average
			Assert.assertEquals(getText("//a[contains(text(),'Group Average')]"),"Group Average");

			//Assert the Labels:-Student Score
			Assert.assertEquals(getText("//a[contains(text(),'Student Score')]"),"Student Score");

			//Assert the Labels:-Percentage Correct 
			Assert.assertEquals(getText("//a[contains(text(),'Passed Subject')]"),"Passed Subject");

			//Assert the Labels:-Performance Level 
			Assert.assertEquals(getText("//a[contains(text(),'Best Scaled Score')]"),"Best Scaled Score");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=13)
	public void TCED411813()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Any grid value First name
			click("//a[contains(text(),'First Name')]");

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"));

			//Assert the the Header Name		
			String A= getText("//table[@class='border3']//tr[1]//td[1]");
			Assert.assertEquals(A,"Keystone Exam Year: 2016-2017");		

			//Asseert the First name column data get sorted correctly.
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

			//Assert the the Header Name		
			String A2= getText("//table[@class='border3']//tr[1]//td[1]");
			Assert.assertEquals(A2,"Keystone Exam Year: 2016-2017");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED411814()
	{
		try
		{
			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");

			waitFor_downloadfile();	

			//On Exported CSV,  Assert the total count of columns under First Name	
			int firstname_gridcount=16;
			Assert.assertEquals(firstname_gridcount,csv_row_count()-1);			

			//Compare and Assert the value of 16 items shown under pagination & Total count from CSV are EQUAL
			int grid_totalcount=Integer.parseInt(getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));


			Assert.assertEquals(grid_totalcount,csv_row_count()-1);			    
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}




	@Test(priority=15)
	public void TCED411815()
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
	@Test(priority=16)
	public void TCED411816()
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
	@Test(priority=17)
	public void TCED411817()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			click("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");		

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

			//Assert the the Header Name		
			String A4= getText("//table[@class='border3']//tr[1]//td[1]");
			Assert.assertEquals(A4,"Keystone Exam Year: 2016-2017");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=18)
	public void TCED411818()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			Thread.sleep(3000);
			if(isSelected("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']")==false)
			{ 			
				//Select Some Student 
				click("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");
			}

			//Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnAllToGroup']");

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Thread.sleep(1000);

			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@class='rwCommandButton rwCloseButton']");

			//Assert the the Header Name		
			String A5= getText("//table[@class='border3']//tr[1]//td[1]");
			Assert.assertEquals(A5,"Keystone Exam Year: 2016-2017");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=19)
	public void TCED411819()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act2=new Actions(driver);					
			act2.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click Keystone
			click("//a[contains(text(),'Keystone')]");

			//Click Teacher Classroom Reports 
			click("//td[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[10]/td[3]/a");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Keystone Assessment Anchors')]");

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");

			//select Keystone Exam Testing Year: 2016-2017
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=Keystone Exams 2016-2017");

			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ClassroomReportFilterParams1_rcmbTeacher_Arrow']");
			click("//li[contains(text(),'Ableton, A - 18')]");

			//Student Population: Currently Enrolled
			select("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_ddlPopulation']","label=Currently Enrolled");

			//Courses: All Courses
			click("//label[contains(text(),'All Courses')]//preceding::input[1]");

			//Current Grade Levels: All Grades
			if(find("//label[contains(text(),'All Grades')]//preceding::input[1]").isSelected()==false)
			{
				click("//label[contains(text(),'All Grades')]//preceding::input[1]");
			}

			//Student Demographics: All Students
			if(find("//label[contains(text(),'All Students')]//preceding::input[1]").isSelected()==false)
			{
				click("//label[contains(text(),'All Students')]//preceding::input[1]");
			}

			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");

			// click on View Only Biology
			click("//b[contains(text(),'View Only Biology')]");

			//* Assert the labels
			Assert.assertEquals(getText("//body[@class='bodybg']//tr//tr//tr//tr[3]//td[1]//b[1]//a[1]"),"BIO");	

			Assert.assertEquals(getText("//td[contains(text(),'Biology (April 2014)')]"),"Biology (April 2014)");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=20)
	public void TCED411820()
	{
		try
		{

			// click on View Only Literature
			click("//b[contains(text(),'View Only Literature')]");

			//* Assert the labels
			Assert.assertEquals(getText("//body[@class='bodybg']//tr//tr//tr//tr[3]//td[1]//b[1]//a[1]"),"L.");	

			Assert.assertEquals(getText("//td[contains(text(),'Literature (April 2014)')]"),"Literature (April 2014)");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}









}
