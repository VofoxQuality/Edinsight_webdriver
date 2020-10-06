package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class SingleYearPssaWriting extends BaseClassOne
{
	@Test(priority=1)
	public void TCED39601()
	{
	  try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Writing')]");
			
			//Click Teacher Classroom Reports 
			click("//a[@class='header'][contains(text(),'Teacher')]");
			
			//Click Single Year PSSA Writing
			click("//a[contains(text(),'Single Year PSSA Writing')]");
			
			//Assert the the Header Name as Single year PSSA Writing Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year PSSA Writing Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED39602()
	{
		try
		{
			//Application should be in the  Single Year PSSA Writing Analysis
			
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
			
			//Assert the labels:-STUDENT CURRENT GRADE
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ClassroomReportFilterParams1_divStudentGrades']//div[@class='subhead-txt']"),"STUDENT CURRENT GRADE");
			
			//Assert the labels:-All Grades
			Assert.assertEquals(getText("//label[contains(text(),'All Grades')]"),"All Grades");
			
			//Assert the labels:-STUDENT DEMOGRAPHICS
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/div[8]/div"),"STUDENT DEMOGRAPHICS");
			
			//Assert the labels:-All Students
			Assert.assertEquals(getText("//label[contains(text(),'All Students')]"),"All Students");
			
			//Assert the labels:-Gender
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[7]/tbody/tr[2]/td"),"Gender");
			
			//Assert the labels:-Male 
			Assert.assertEquals(getText("//label[contains(text(),'Male')]"),"Male");
			
			//Assert the labels:-Female
			Assert.assertEquals(getText("//label[contains(text(),'Female')]"),"Female");
			
			//Assert the labels:-Ethnicity
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[7]/tbody/tr[4]/td"),"Ethnicity");
			
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
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_pnlUpdatePanel']/div[1]/table[7]/tbody/tr[6]/td"),"Other");
			
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
	public void TCED381603()
	{
		try
		{
			//Application should be in the  Single Year PSSA Writing Report
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_ImageButton1']");			
			Thread.sleep(2000);
            Scroll_DowntoEnd();
            
            String s=getText("//span[@id='ctl00_MainContent_lblErrorMessages']");
			
			//Assert the message You must select an assessment year.					
			Assert.assertEquals(s.substring(0,35),"You must select an assessment year.");	
			
			//Assert the message  You must select at least one course or group.
			Assert.assertEquals(s.substring(36,81),"You must select at least one course or group.");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED381604()
	{
		try
		{
			//Application should be in the  Single Year PSSA Writing Report
			
			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ClassroomReportFilterParams1_rcmbTeacher_Arrow']");
			
			Thread.sleep(5000);
			click("//li[contains(text(),'Ableton, A - 18')]");			
			
			//select PSSA Writing 2013-2014
			Thread.sleep(5000);
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Writing 2013-2014");
			
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
			
			Thread.sleep(5000);
			
			//Assert the the Header Name as Single Year PSSA Writing Anchor Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Writing Analysis");				
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
			//Application should be in the  Single Year PSSA Writing Report
			
			//* Assert the Labels:-PSSA Year: 2013-2014
			Assert.assertEquals(getText("//tr[@valign='top']"),"PSSA Year: 2013-2014");		

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
			
			//Assert the Labels:-Multi-Choice Score
			Assert.assertEquals(getText("//a[contains(text(),'Multi-Choice Score')]"),"Multi-Choice Score");
			
			//Assert the Labels:-Composition Combined 
			Assert.assertEquals(getText("//a[contains(text(),'Composition Combined')]"),"Composition Combined");
			
			//Assert the Labels:-Edit Combined
			Assert.assertEquals(getText("//a[contains(text(),'Edit Combined')]"),"Edit Combined");

			// Assert the Labels:-Total Combined
			Assert.assertEquals(getText("//a[contains(text(),'Total Combined')]"),"Total Combined");
			
			// Assert the Labels:-M.A-N.1 - Demonstrate an understanding of rational and irrational numbers.
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']//a[@title='Click here to sort'][contains(text(),'Scaled Score')]"),"Scaled Score");
			
			//Assert the Labels:Performance Level
			Assert.assertEquals(getText("//a[contains(text(),'Performance Level')]"),"Performance Level");
			
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
			
			//Click on Student link Id- 107289
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__0']/td[3]/a");
			
			Thread.sleep(2000);
			
			//* Assert the header: Student Information:Student ID:  105280 
			Assert.assertEquals(getText("//*[@id='ctl00_plcHeader_HeaderStudentTop1_lblDisplayStudentId']"),"107289");
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
			
			//Click PSSA Writing
			click("//a[contains(text(),'PSSA Writing')]");
			
			//Click Teacher Classroom Reports 
			click("//a[@class='header'][contains(text(),'Teacher')]");
			
			//Click Single Year PSSA Writing
			click("//a[contains(text(),'Single Year PSSA Writing')]");
			
			//Courses: All Courses
			click("//label[contains(text(),'All Courses')]//preceding::input[1]");
			
			//select PSSA Writing 2013-2014
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Writing 2013-2014");
			
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
			Thread.sleep(500);
			
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
			click("//input[@value='Add Report to Favorites']");
			
			//Assert the the Header Name as Single year PSSA Writing Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Writing Analysis");	
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
			//Application should be in the Assessment Student List page 

			//Click on First Name
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00']/thead/tr[1]/th[5]/a");
			Thread.sleep(2000);
			
			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//*[@name='ctl00$MainContent$ctl02$rdgStudentScores$ctl00$ctl02$ctl00$ctl04']"),"sort up icon element present");
			
			//Assert the the Header Name as Single year PSSA Writing Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Writing Analysis");	
			
			List<String> sort_firstname=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[5]"))
			{
				sort_firstname.add(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[5]"));
				i++;
			}
			List<String> sort_firstname_java=new ArrayList<String>(sort_firstname);
			Collections.sort(sort_firstname_java);
			Assert.assertEquals(sort_firstname,sort_firstname_java);			
			
			//Click on First Name
			click("//a[contains(text(),'First Name')]");
			Thread.sleep(2000);
			
			Assert.assertTrue(isElementPresent("//*[@name='ctl00$MainContent$ctl02$rdgStudentScores$ctl00$ctl02$ctl00$ctl04']"),"sort down icon element present");
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
			
			//Click on Reading Scaled Score filter On filter text field add "897 " and select 'EQUAL TO' 
			type("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl02_ctl01_FilterTextBox_TestingGradeLevelId']","8");
			
			Thread.sleep(2000);
			
			click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl02_ctl01_Filter_TestingGradeLevelId']");
			Thread.sleep(1000);
			
			click("//span[contains(text(),'EqualTo')]");
			
			//* Assert that the column values displayed under 'Math Scaled Score is equal  to 5 
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[6]"))
			{
		     Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00__"+i+"']/td[6]"),"8");
		     i++;
			}
			//Assert the the Header Name as Single year PSSA Writing Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PSSA Writing Analysis");
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
			Thread.sleep(5000);
			FileDelete();
			
			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_ctl02_btnExportCSV']");
			
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
	@Test(priority=12)
	public void TCED381512()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(5000);
			FileDelete();
			
			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_ctl02_btnExportpdf']");
			
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
			
			//* Assert the Labels:-PSSA Year: 2013-2014
			Assert.assertEquals(getText("//tr[@valign='top']"),"PSSA Year: 2013-2014");					
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
			
			//* Assert the Labels:-PSSA Year: 2013-2014
			Assert.assertEquals(getText("//tr[@valign='top']"),"PSSA Year: 2013-2014");		
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
			Thread.sleep(3000);
			if(isSelected("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']")==false)
			{
				click("//*[@id='ctl00_MainContent_ctl02_rdgStudentScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			}
			FileDelete();
			
			//Click on Print selected students
			click("//*[@id='ctl00_MainContent_ctl02_btnPSSAPrintSelectedStudent']");
	
            waitFor_downloadfile();			
            Thread.sleep(1500);
            
			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
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

