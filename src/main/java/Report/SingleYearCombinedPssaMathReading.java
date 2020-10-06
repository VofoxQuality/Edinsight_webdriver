package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class SingleYearCombinedPssaMathReading extends BaseClassOne
{
	@Test(priority=1)
	public void TCED381701()
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
			
			//Click Single Year Combined PSSA Math/Reading
			click("//a[contains(text(),'Single Year Combined PSSA Math/Reading')]");
			
			//Single Year PSSA Math | Reading Combined Anchor Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year PSSA Math | Reading Combined Anchor Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED381702()
	{
		try
		{
			//Application should be in the  Longitudinal PSSA Reading Report
			
			//Assert the labels:-PSSA Testing Year:
			Assert.assertEquals(getText("//div[contains(text(),'PSSA Testing Year:')]"),"PSSA Testing Year:");

			//Assert the labels:-SELECT ACTIVE TEACHER
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_dvSelectTeacher']/div"),"SELECT ACTIVE TEACHER");	
			
			//Assert the labels:-School Type:
			Assert.assertEquals(getText("//div[contains(text(),'School Type:')]"),"School Type:");	
			
			//Assert the labels:-Building:
			Assert.assertEquals(getText("//div[contains(text(),'Building:')]"),"Building:");	
			
			//Assert the labels:-Teacher:
			Assert.assertEquals(getText("//div[contains(text(),'Teacher:')]"),"Teacher:");
			
			//Assert the labels:-STUDENT POPULATION			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ClassroomReportFilterParams1_divStudentPopulation']/div"),"STUDENT POPULATION");
			
			//Assert the labels:-Student Population:
			Assert.assertEquals(getText("//div[contains(text(),'Student Population:')]"),"Student Population:");
			
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

			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED381603()
	{
		try
		{
			//Application should be in the  Single Year PSSA Math Report
			
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
	@Test(priority=4)
	public void TCED381704()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
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
	@Test(priority=5)
	public void TCED381705()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
			//select PSSA Year: 2016-2017
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
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
			
			//Assert the the Header Name as Single Year PSSA Math | Reading Combined Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Math | Reading Combined Anchor Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED381706()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
			//* Assert the Labels:-PSSA Year: 2016-2017
			Assert.assertEquals(getText("//tr[@valign='top']"),"PSSA Year: 2016-2017");		

			// Assert the Labels:-Teacher View : Ableton, A - 18
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trTeacherDetails']//b"),"Teacher View : Ableton, A - 18");	
			
			//Assert the Labels:-Student Population: Currently Enrolled
			String s=getText("//b[contains(text(),'PSSA Year:')]//following::td[1]");			
			Assert.assertEquals(s.substring(0,38),"Student Population: Currently Enrolled");	
			
			//Assert the Labels:-Courses: All Courses
			Assert.assertEquals(getText("//li[contains(text(),'All Courses')]"),"All Courses");	
			
			//Assert the Labels:-Current Grade Levels: All Grades
			Assert.assertEquals(getText("//li[contains(text(),'All Grades')]"),"All Grades");
			
			//Assert the Labels:-Student Demographics: All Students
			Assert.assertEquals(getText("//li[contains(text(),'All Students')]"),"All Students");
			
			//Assert the Labels:-Student Id
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']/thead/tr[1]/th[3]/a"),"Student Id");
			
			//Assert the Labels:- Last Name
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']/thead/tr[1]/th[4]/a"),"Last Name");
			
			//Assert the Labels:- First Name
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']/thead/tr[1]/th[5]/a"),"First Name");
			
			//Assert the Labels:-Grade Tested
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']/thead/tr[1]/th[6]/a"),"Grade Tested");
			
			//Assert the Labels:-Assessment Year 
			Assert.assertEquals(getText("//th[contains(text(),'Assessment Year')]"),"Assessment Year");
			
			//Assert the Labels:-Reading Scaled Score 
			Assert.assertEquals(getText("//a[contains(text(),'Reading Scaled Score')]"),"Reading Scaled Score");
			
			//Assert the Labels:-Reading Performance Level 
			Assert.assertEquals(getText("//a[contains(text(),'Reading Performance Level')]"),"Reading Performance Level");
			
			//Assert the Labels:-Alternative Test
			Assert.assertEquals(getText("//a[contains(text(),'Alternative Test')]"),"Alternative Test");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED381707()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
			// Assert the Labels:-E.A - Literature Text
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[3]"),"E.A - Literature Text");
			
			// Assert the Labels:-M.A-N.1 - Demonstrate an understanding of rational and irrational numbers.
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[4]"),"E.A-C.2 - Craft and Structure");
			
			//Assert the Labels:-E.A-C.3 - Integration of Knowledge and Ideas
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[5]"),"E.A-C.3 - Integration of Knowledge and Ideas");
			
			//Assert the Labels:-E.A-K.1 - Key Ideas and Details
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[6]"),"E.A-K.1 - Key Ideas and Details");
			
			// Assert the Labels:-E.A-V.4 - Vocabulary Acquisition and use
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[7]"),"E.A-V.4 - Vocabulary Acquisition and use");
			
			// Assert the Labels:-E.B - Informational Text
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[8]"),"E.B - Informational Text");
			
			// Assert the Labels:E.B-C.2 - Craft and Structure
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[9]"),"E.B-C.2 - Craft and Structure");
			
			// Assert the Labels:-E.B-C.3 - Integration of Knowledge and Ideas
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[10]"),"E.B-C.3 - Integration of Knowledge and Ideas");
			
			//Assert the Labels:-B-K.1 - Key Ideas and Details
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[11]"),"E.B-K.1 - Key Ideas and Details");
						
			// Assert the Labels:-E.A-V.4 - Vocabulary Acquisition and use
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[12]"),"E.B-V.4 - Vocabulary Acquisition and Use");
			
			// Assert the Labels:-E.B - Informational Text
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[13]"),"E.C - Writing");
			
			// Assert the Labels:-E.C.2 - Text Types and Purposes
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[14]"),"E.C.1 - Text Types and Purposes");
			
			// Assert the Labels:-E.B-C.3 - Integration of Knowledge and Ideas
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[15]"),"E.D - Language");
			
			// Assert the Labels:E.D.1 - Conventions of Standard English
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[16]"),"E.D.1 - Conventions of Standard English");
			
			// Assert the Labels:E.D.2 - Knowledge of Language
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[17]"),"E.D.2 - Knowledge of Language");
			
			// Assert the Labels:E.D.2 -E.E - Text-Dependent Analysis
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[18]"),"E.E - Text-Dependent Analysis");
			
			// Assert the Labels:E.E.1 - Evidence-Based Analysis of Text
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[19]"),"E.E.1 - Evidence-Based Analysis of Text");
			
			// Assert the Labels:M.A-N - The Number System
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[20]"),"M.A-N - The Number System");
			
			// Assert the Labels:M.A-N.1 - Demonstrate an understanding of rational and irrational numbers
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[21]"),"M.A-N.1 - Demonstrate an understanding of rational and irrational numbers.");
		
			// Assert the Labels:M.B-E - Expressions and Equations
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[22]"),"M.B-E - Expressions and Equations");
			
			// Assert the Labels:M.B-E.1 - Demonstrate an understanding of expressions and equations with radicals and integer exponents
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[23]"),"M.B-E.1 - Demonstrate an "
					+ "understanding of expressions and equations with radicals and integer exponents.");
			
			// Assert the Labels:M.B-E.2 - Understand the connections between proportional relationships, lines, and linear equations
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/span[24]"),"M.B-E.2 - Understand the connections between"
					+ " proportional relationships, lines, and linear equations.");
		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED381708()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
			//Click on Student link Id- 105280
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__1']/td[3]/a");
			
			Thread.sleep(2000);
			
			//* Assert the header: Student Information:Student ID:  105280 
			Assert.assertEquals(getText("//*[@id='ctl00_plcHeader_HeaderStudentTop1_lblDisplayStudentId']"),"105280");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED381709()
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
			
			//Click Single Year Combined PSSA Math/Reading
			click("//a[contains(text(),'Single Year Combined PSSA Math/Reading')]");
			
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
			
			Thread.sleep(2000);

			//Click on Print to PDF
			//click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//waitFor_downloadfile();	
			
			//Assert the downloaded pdf file
			//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=10)
	public void TCED381710()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
			
			//Assert the the Header Name as Single Year PSSA Math | Reading Combined Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Math | Reading Combined Anchor Analysis");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED381711()
	{
		try
		{
			//Click on Reading Performance Level 
			click("//a[contains(text(),'Reading Performance Level')]");
			Thread.sleep(2000);
			
			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"),"sort up icon element present");
			
			//Click on Math Performance Level 
			click("//a[contains(text(),'Reading Performance Level')]");
			Thread.sleep(2000);
			
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortDescIcon']"),"sort down icon element present");
			
			//Assert the the Header Name as Single Year PSSA Math | Reading Combined Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Math | Reading Combined Anchor Analysis");	
			
			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[5]"))
			{
				sort_java.add(find("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[5]").getText());
				++i;			
			}
			Collections.sort(sort_java);
						
			//Click on First name column.
			click("//table[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']//a[@title='Click here to sort'][contains(text(),'First Name')]");

			//Assert the First name column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+j+"']/td[5]"))
			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+j+"']/td[5]").getText());
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
	@Test(priority=12)
	public void TCED381712()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//Click on Math Scaled Score filter On filter text field add "897 " and select 'EQUAL TO' 
			type("//input[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl02_ctl01_FilterTextBox_MathScaledScore']","897");
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl02_ctl01_Filter_MathScaledScore']/span");
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_rfltMenu_detached']/ul/li[6]/span");
			
			//* Assert that the column values displayed under 'Math Scaled Score is equal  to 897 
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[8]"))
			{
		     Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[8]"), "897");
		     i++;
			}
			
			//Assert the label "PSSA 2016-2017  "
			Assert.assertEquals(getText("//tr[@valign='top']//td[@colspan='2']"),"PSSA Year: 2016-2017");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void TCED381713()
	{
		try
		{
			//Application should be in the Assessment Student List   page 			
			FileDelete();
			
			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_ctl02_btnExportCSV']");
			
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
	@Test(priority=14)
	public void TCED381714()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			FileDelete();
			
			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_ctl02_btnExportpdf']");
			
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
	@Test(priority=15)
	public void TCED381715()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
            //Select Some Student 
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
            // Click on  Add Selected Student to Group button 
			click("//input[@id='ctl00_MainContent_ctl02_btnSelectToGroup']");
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//span[@title='Close']");
			
			//Assert the label "PSSA 2016-2017  "
			Assert.assertEquals(getText("//tr[@valign='top']//td[@colspan='2']"),"PSSA Year: 2016-2017");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public void TCED381716()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			Thread.sleep(2000);
			
            //Select Some Student 
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
            //Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_ctl02_btnCheckAll']");
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//span[@title='Close']");
			
			//Assert the label "PSSA 2016-2017  "
			Assert.assertEquals(getText("//tr[@valign='top']//td[@colspan='2']"),"PSSA Year: 2016-2017");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	public void TCED381717()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(2000);
			if(isSelected("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']")==false)
			{
				click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			}
			FileDelete();
			
			//Click on Print selected students
			click("//*[@id='ctl00_MainContent_ctl02_btnPSSAPrintSelectedStudent']");
			
			waitFor_downloadfile();
            	
			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']/img");
			
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
