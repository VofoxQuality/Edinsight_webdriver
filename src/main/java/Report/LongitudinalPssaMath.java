package Report;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class LongitudinalPssaMath extends BaseClassOne
{
	@Test(priority=1)
	public void TCED381901()
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
			
			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");
			
			//Click Single Year PSSA Math
			click("//a[contains(text(),'Longitudinal PSSA Math')]");
			
			//Assert the the Header Name as Longitudinal PSSA Reading Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Longitudinal PSSA Math Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED381902()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report

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
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/div[6]/div"),"STUDENT DEMOGRAPHICS");
			
			//Assert the labels:-All Students
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[6]/tbody/tr[1]/td/span/label"),"All Students");			
			
			Scroll_DowntoEnd();
			
			//Assert the labels:-Gender
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[6]/tbody/tr[2]/td"),"Gender");
			
			//Assert the labels:-Male 
			Assert.assertEquals(getText("//label[contains(text(),'Male')]"),"Male");
			
			//Assert the labels:-Female
			Assert.assertEquals(getText("//label[contains(text(),'Female')]"),"Female");
			
			//Assert the labels:-Ethnicity
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[6]/tbody/tr[4]/td"),"Ethnicity");
			
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
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[6]/tbody/tr[6]/td"),"Other");
			
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
	public void TCED381903()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");
			Thread.sleep(2000);			
			Scroll_DowntoEnd();			
			
			Thread.sleep(3000);
			
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
	public void TCED381904()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report			
			ScrollTo_xy_position(0,0);
			Thread.sleep(2000);
			
			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ClassroomReportFilterParams1_rcmbTeacher_Arrow']");
			click("//li[contains(text(),'Ableton, A - 18')]");
			Thread.sleep(2000);
			
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
			
			Scroll_DowntoEnd();
			Thread.sleep(2000);
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");
			
			//Assert the the Header Name as Longitudinal PSSA Reading Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Longitudinal PSSA Math Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED381905()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report

			// Assert the Labels:-Teacher View : Ableton, A - 18
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTeacherName']"),"Ableton, A - 18");	
			
			//Assert the Labels:-Student Population: Currently Enrolled
			String s=getText("//td[@colspan='2']");			
			Assert.assertEquals(s.substring(0,38),"Student Population: Currently Enrolled");	
			
			//Assert the Labels:-Courses: All Courses
			Assert.assertEquals(getText("//li[contains(text(),'All Courses')]"),"All Courses");	
			
			//Assert the Labels:-Current Grade Levels: All Grades
			Assert.assertEquals(getText("//li[contains(text(),'All Grades')]"),"All Grades");
			
			//Assert the Labels:-Student Demographics: All Students
			Assert.assertEquals(getText("//li[contains(text(),'All Students')]"),"All Students");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED381906()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");
			
			//Click Single Year PSSA Reading
			click("//a[contains(text(),'Longitudinal PSSA Math')]");
			
			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ClassroomReportFilterParams1_rcmbTeacher_Arrow']");
			click("//li[contains(text(),'Ableton, A - 18')]");
			
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
						
			FileDelete();

			//Click on Print to PDF
			//click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
            Thread.sleep(6000);	
			
			//Assert the downloaded csv file
			//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED381907()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report
			
			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
			
			//Assert the the Header Name as Longitudinal PSSA Reading Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Longitudinal PSSA Math Analysis");
			
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
