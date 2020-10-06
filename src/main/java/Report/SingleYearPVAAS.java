package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class SingleYearPVAAS extends BaseClassOne{



	@Test(priority=1)
	public void TCED42601()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click PVAAS
			click("//a[contains(text(),'PVAAS')]");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");

			//Click Single Year PSSA Math
			click("//a[contains(text(),'Single Year PVAAS')]");

			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year PVAAS Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED42602()
	{
		try
		{
			//Application should be in the  Single Year PVAAS Analysis

			//Assert the labels:-PVAAS Testing Year:
			Assert.assertEquals(getText("//div[contains(text(),'PVAAS Testing Year:')]"),"PVAAS Testing Year:");

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
	public void TCED42603()
	{
		try
		{
			//Application should be in the  Single Year PVAAS Report

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
	public void TCED42604()
	{
		try
		{
			//Application should be in the  Single Year PVAAS Report			

			//select PSSA Year: 2016-2017
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=PVAAS 2016-2017");

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

		//	ScrollTo_Location("//span[@class='administitle']");

			//Assert the the Header Name as  Single Year PVAAS Report	
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=5)
	public void TCED42605()
	{
		try
		{
			//Application should be in the   Single Year PVAAS Report	

			// Assert the Labels:-PVAAS Year: 2016-2017
			Assert.assertEquals(getText("//tr[@valign='top']"),"PVAAS Year: 2016-2017");	

			// Assert the Labels:-Teacher View : Ableton, A - 18
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trTeacherDetails']//b"),"Teacher View : Ableton, A - 18");	

			//Assert the Labels:-Student Population: Currently Enrolled
			String s=getText("//b[contains(text(),'PVAAS Year:')]//following::td[1]");			
			Assert.assertEquals(s.substring(0,38),"Student Population: Currently Enrolled");	

			//Assert the Labels:-Courses: All Courses
			Assert.assertEquals(getText("//li[contains(text(),'All Courses')]"),"All Courses");	

			//Assert the Labels:-Current Grade Levels: All Grades
			Assert.assertEquals(getText("//li[contains(text(),'All Grades')]"),"All Grades");

			//Assert the Labels:-Student Demographics: All Students
			Assert.assertEquals(getText("//li[contains(text(),'All Students')]"),"All Students");

			//Assert  ALL the Labels in headers shown:

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[2]/a"),"Student ID");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[5]/a"),"Last Name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[6]/a"),"First Name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[7]/a"),"Grade");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[8]/a"),"Assessment Year");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[9]/a"),"Performance Level");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[10]/a"),"Score");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[11]/a"),"Percentile");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[12]/a"),"State NCE Score");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[13]/a"),"Projection 1 Grade");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[14]/a"),"Projection 1 Percentile");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[15]/a"),"Projection 2 Grade");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[16]/a"),"Projection 2 Percentile");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void TCED42606()
	{
		try
		{
			//Application should be in the  Single Year PVAAS Report	

			//Click on Student link Id- 106889
			click("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__0']/td[2]/a");

			Thread.sleep(2000);

			//* Assert the header: Student Information:Student ID:  106889 
			Assert.assertEquals(getText("//*[@id='ctl00_plcHeader_HeaderStudentTop1_lblDisplayStudentId']"),"106889");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	//@Test(priority=7)
	
	// Feature Not Available Now
	public void TCED42607()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click PVAAS
			click("//a[contains(text(),'PVAAS')]");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");

			//Click Single Year PSSA Math
			click("//a[contains(text(),'Single Year PVAAS')]");	
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
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");

			waitFor_downloadfile();	
			Thread.sleep(2000);

			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED42608()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click PVAAS
			click("//a[contains(text(),'PVAAS')]");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");

			//Click Single Year PSSA Math
			click("//a[contains(text(),'Single Year PVAAS')]");	
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

			
			//Application should be in the Assessment Student List   page 

			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED42609()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[6]/a");
			Thread.sleep(4000);

			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"),"sort up icon element present");

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00']/thead/tr[1]/th[6]/a");
			Thread.sleep(2000);

			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortDescIcon']"),"sort down icon element present");

			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");		

			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+i+"']/td[6]"))

			{
				sort_java.add(find("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+i+"']/td[6]").getText());
				++i;			
			}
			Collections.sort(sort_java);

			//Click on First name column.
			click("//th[@class='rgHeader GridHeaderStyle rgSorted']//a[@title='Click here to sort'][contains(text(),'First Name')]");

			//Assert the First name column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+j+"']/td[6]"))

			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+j+"']/td[6]").getText());
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
	public void TCED42610()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on percentile filter text field add "22 " and select 'EQUAL TO' 
			
			type("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00_ctl02_ctl02_FilterTextBox_percentile']","22");

			click("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00_ctl02_ctl02_Filter_percentile']/span");

			click("//div[@id='ctl00_MainContent_rdgPVaasReading_rfltMenu_detached']//li[6]//span[1]");
			
			//* Assert that the column values displayed under 'percentile filter is equal  to 22 
			
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+i+"']/td[11]"))
				

			{
				Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgPVaasReading_ctl00__"+i+"']/td[11]"), "22");
				++i;
			}			
			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED42611()
	{
		try
		{
			//Application should be in the Assessment Student List   page 			
			FileDelete();

			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSVReading']");

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
	public void TCED42612()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			FileDelete();

			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf1']");

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
	public void TCED42613()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rdgPVaasReading_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");

			// Click on  Add Selected Student to Group button 
			click("//input[@id='ctl00_MainContent_btnSelectToGroup']");
			
			Thread.sleep(3000);

			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			driver.switchTo().parentFrame();
			
			Thread.sleep(3000);
			//Click on Close button
			click("//span[@title='Close']");

			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED42614()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(3000);

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rdgPVaasReading_ctl00_ctl02_ctl01_chkSelectUserSelectCheckBox']");

			//Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnCheckAll']");
			
			Thread.sleep(3000);


			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");

			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");

			Thread.sleep(3000);
			
			driver.switchTo().parentFrame();

			//Click on Close button
			click("//span[@title='Close']");
			Thread.sleep(2000);

			//Assert the the Header Name as Single Year PVAAS Analysis
			Assert.assertEquals(getText("//span[@class='administitle']"),"Single Year PVAAS Analysis");	
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']");
			Thread.sleep(2000);
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
