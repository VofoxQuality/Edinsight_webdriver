package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;
 
import Library.BaseClassOne;

public class SingleYearPssaMath extends BaseClassOne
{
	@Test(priority=1)
	public void TCED381501()
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
			click("//a[contains(text(),'Single Year PSSA Math')]");
			
			//Assert the the Header Name as Longitudinal PSSA Reading Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year PSSA Math Anchor Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED381502()
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
	public void TCED381503()
	{
		try
		{
			//Application should be in the  Single Year PSSA Math Report
			
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
	public void TCED381504()
	{
		try
		{
			//Application should be in the  Single Year PSSA Math Report
			
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
			
			Thread.sleep(6000);
			
			ScrollTo_Location("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span");
			
			//Assert the the Header Name as Single Year PSSA Math Anchor Analysis
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year PSSA Math Anchor Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED381505()
	{
		try
		{
			//Application should be in the  Single Year PSSA Math Report
			
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
			
			//Assert the Labels:-Math Scaled Score 
			Assert.assertEquals(getText("//a[contains(text(),'Math Scaled Score')]"),"Math Scaled Score");
			
			//Assert the Labels:-Math Performance Level 
			Assert.assertEquals(getText("//a[contains(text(),'Math Performance Level')]"),"Math Performance Level");
			
			//Assert the Labels:-Alternative Test
			Assert.assertEquals(getText("//a[contains(text(),'Alternative Test')]"),"Alternative Test");

			// Assert the Labels:-M.A-N - The Number System
			//Assert.assertEquals(getText("//td[@class='InputGeneral']//span[2]"),"M.A-N - The Number System");
			
			// Assert the Labels:-M.A-N.1 - Demonstrate an understanding of rational and irrational numbers.
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[3]"),"M.A-N.1 - Demonstrate an understanding of rational and irrational numbers.");
			
			//Assert the Labels:-M.B-E - Expressions and Equations
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[4]"),"M.B-E - Expressions and Equations");
			
			//Assert the Labels:-M.B-E.1 - Demonstrate an understanding of expressions and equations with radicals and integer exponents.
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[5]"),"M.B-E.1 - Demonstrate an understanding of expressions and equations with radicals and integer exponents.");
			
			// Assert the Labels:-M.B-E.2 - Understand the connections between proportional relationships, lines, and linear equations.
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[6]"),"M.B-E.2 - Understand the connections between proportional relationships, lines, and linear equations.");
			
			// Assert the Labels:-M.B-E.3 - Analyze and solve linear equations and pairs of simultaneous linear equations
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[7]"),"M.B-E.3 - Analyze and solve linear equations and pairs of simultaneous linear equations.");
			
			// Assert the Labels:-M.B-F - Functions
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[8]"),"M.B-F - Functions");
			
			// Assert the Labels:-M.B-F.1 - Analyze and interpret functions
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[9]"),"M.B-F.1 - Analyze and interpret functions.");
			
			//Assert the Labels:-M.B-F.2 - Use functions to model relationships between quantities.
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[10]"),"M.B-F.2 - Use functions to model relationships between quantities.");
						
			// Assert the Labels:-M.C-G - Geometry
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[11]"),"M.C-G - Geometry");
			
			// Assert the Labels:-M.C-G.1 - Demonstrate an understanding of geometric transformations.
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[12]"),"M.C-G.1 - Demonstrate an understanding of geometric transformations.");
			
			// Assert the Labels:-M.C-G.2 - Understand and apply the Pythagorean theorem
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[13]"),"M.C-G.2 - Understand and apply the Pythagorean theorem.");
			
			// Assert the Labels:-M.C-G.3 - Solve real-world and mathematical problems involving volume
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[14]"),"M.C-G.3 - Solve real-world and mathematical problems involving volume.");
			
			//M.D-S - Statistics and Probability
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[15]"),"M.D-S - Statistics and Probability");
			
			//M.D-S.1 - Investigate patterns of association in bivariate data
			Assert.assertEquals(getText("//td[@class='InputGeneral']//span[16]"),"M.D-S.1 - Investigate patterns of association in bivariate data.");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void TCED381506()
	{
		try
		{
			//Application should be in the  Single Year PSSA Math Report
			
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
	@Test(priority=7)
	public void TCED381507()
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
			
			//Click Single Year PSSA Math
			click("//a[contains(text(),'Single Year PSSA Math')]");			
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
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");			
						
			FileDelete();

			//Click on Print to PDF
			//click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//waitFor_downloadfile();	
			Thread.sleep(2000);
			
			//Assert the downloaded pdf file
			//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED381508()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
			
			//Assert the the Header Name as Single Year PSSA Math Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Math Anchor Analysis");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED381509()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Math Performance Level 
			click("//a[contains(text(),'Math Performance Level')]");
			Thread.sleep(2000);
			
			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"),"sort up icon element present");
			
			//Click on Math Performance Level 
			click("//a[contains(text(),'Math Performance Level')]");
			Thread.sleep(2000);
			
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortDescIcon']"),"sort down icon element present");
			
			//Assert the the Header Name as Single Year PSSA Math Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Math Anchor Analysis");	
			
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
	@Test(priority=10)
	public void TCED381510()
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
		     ++i;
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
	@Test(priority=11)
	public void TCED381511()
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
	@Test(priority=12)
	public void TCED381512()
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
	@Test(priority=13)
	public void TCED381513()
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
	@Test(priority=14)
	public void TCED381514()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(3000);
			
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
	@Test(priority=15)
	public void TCED381515()
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
			
			Thread.sleep(500);
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
