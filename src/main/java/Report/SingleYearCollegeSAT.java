package Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class SingleYearCollegeSAT extends BaseClassOne{
	
	
	@Test(priority=1)
	public void TCED43501()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click College SAT
			Thread.sleep(3000);
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/div/div[11]/div/a");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");

			//Click Single Year College SAT
			click("//a[contains(text(),'Single Year College SAT')]");

			//Assert the the Header Name as Single Year College SAT Analysis
			Assert.assertEquals(getText("//td[@class='header-txt']"),"Single Year College SAT Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED43502()
	{
		try
		{
			//Application should be in the  Single Year College SAT Analysis

			//Assert the labels:-College SAT Testing Year:
			Assert.assertEquals(getText("//div[contains(text(),'SAT Testing Year:')]"),"SAT Testing Year:");

			//Assert the labels:-SELECT ACTIVE TEACHER
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_dvSelectTeacher']/div"),"SELECT ACTIVE TEACHER");	
			

			//Assert the labels:-School Type:
			Assert.assertEquals(getText("//div[contains(text(),'School Type:')]"),"School Type:");	

			//Assert the labels:-Building:
			Assert.assertEquals(getText("//div[contains(text(),'Building:')]"),"Building:");	

			//Assert the labels:-Teacher:
			Assert.assertEquals(getText("//div[contains(text(),'Teacher:')]"),"Teacher:");

			//Assert the labels:-Student Population:
			Assert.assertEquals(getText("//div[contains(text(),'Student Population:')]"),"Student Population:");
			
			//Assert the labels:-COURSES
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl02_divCourses']/div"),"COURSES");
			
			//*[@id="ctl00_MainContent_ctl02_divCourses"]/div

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

			//Assert the labels:-STUDENT CURRENT GRADE
			Assert.assertEquals(getText("//div[@id='ctl00_MainContent_ctl02_divStudentGrades']//div[@class='subhead-txt']"),"STUDENT CURRENT GRADE");

			//Assert the labels:-All Grades
			Assert.assertEquals(getText("//label[contains(text(),'All Grades')]"),"All Grades");

			
			//Assert the labels:-All Students
			Assert.assertEquals(getText("//label[contains(text(),'All Students')]"),"All Students");

			
			//Assert the labels:-Male 
			Assert.assertEquals(getText("//label[contains(text(),'Male')]"),"Male");

			//Assert the labels:-Female
			Assert.assertEquals(getText("//label[contains(text(),'Female')]"),"Female");

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
	public void TCED43503()
	{
		try
		{
			//Application should be in the  Single Year College SAT Report

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
	public void TCED43504()
	{
		try
		{
			//Application should be in the  Single Year College SAT Report			

			
			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ctl02_rcmbTeacher_Arrow']");
			
			Thread.sleep(2000);
			
			click("//li[contains(text(),'Ableton, A - 18')]");
			
			Thread.sleep(2000);
			//select College SAT Year: 2012-2013
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=Scholastic Aptitude Test 2012-2013");


			//Student Population: Currently Enrolled
			select("//select[@id='ctl00_MainContent_ctl02_ddlPopulation']","label=Currently Enrolled");

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

			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}


	@Test(priority=5)
	public void TCED43505()
	{
		try
		{
			//Application should be in the   Single Year College SAT Report	

			// Assert the Labels:-College SAT Year: 2016-2017
			Assert.assertEquals(getText("//tr[@valign='top']"),"College SAT Year: 2012-2013");	

			// Assert the Labels:-Teacher View : Ableton, A - 18
			Assert.assertEquals(getText("//tr[@id='ctl00_MainContent_trTeacherDetails']//b"),"Teacher View : Ableton, A - 18");	
			
			//*[@id="ctl00_tdContentCell"]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td

			//Assert the Labels:-Student Population: Currently Enrolled
			String s=getText("//b[contains(text(),'College SAT Year:')]//following::td[1]");			
			Assert.assertEquals(s.substring(0,38),"Student Population: Currently Enrolled");	

			//Assert the Labels:-Courses: All Courses
			Assert.assertEquals(getText("//li[contains(text(),'All Courses')]"),"All Courses");	

			//Assert the Labels:-Current Grade Levels: All Grades
			Assert.assertEquals(getText("//li[contains(text(),'All Grades')]"),"All Grades");

			//Assert the Labels:-Student Demographics: All Students
			Assert.assertEquals(getText("//li[contains(text(),'All Students')]"),"All Students");

			//Assert  ALL the Labels in headers shown:

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[4]"),"Student Id");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[5]"),"SAT Details");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[6]"),"Last name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[7]"),"First Name");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[8]"),"Test Date");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[11]"),"Math Score");
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[12]"),"Math Nat Pctl");
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[14]"),"Crit Rdg Score");	

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[15]"),"Crit Rdg Nat Pctl");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[16]"),"Writing Score");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[17]"),"Writing Nat Pctl");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[18]"),"R + M Score (Pre-2016)");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[19]"),"Total Composite Score (Pre-2016)");	
			
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[20]"),"Essay Score (Pre-2016)");		

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[21]"),"Writing MC Score (Pre-2016)");		

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=6)
	public void TCED43506()
	{
		try
		{
			//Application should be in the   Single Year College SAT Report	

			//Click on Student link Id- 107222
			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__0']/td[4]/a");
			
			Thread.sleep(2000);

			//* Assert the header: Student Information:Student ID:  107222 
			Assert.assertEquals(getText("//*[@id='ctl00_plcHeader_HeaderStudentTop1_lblDisplayStudentId']"),"107222");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED43507()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();

			// Click College SAT
			click("//a[contains(text(),'College SAT')]");

			//Click Teacher Classroom Reports 
			click("//a[contains(text(),'Teacher Classroom Reports')]");
			
			//Click Single Year College SAT
			click("//a[contains(text(),'Single Year College SAT')]");
			
			//Teacher View : Ableton, A - 18 
			click("//span[@id='ctl00_MainContent_ctl02_rcmbTeacher_Arrow']");
			click("//li[contains(text(),'Ableton, A - 18')]");
			
			//select College SAT Year: 2012-2013
			select("//*[@id='ctl00_MainContent_ddlAssessment']","label=Scholastic Aptitude Test 2012-2013");


			//Student Population: Currently Enrolled
			select("//select[@id='ctl00_MainContent_ctl02_ddlPopulation']","label=Currently Enrolled");

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
	public void TCED43508()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on Add reports to Favourites
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");

			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED43509()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[7]/a");
			
			
			Thread.sleep(2000);

		/*	//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//*[@name='ctl00$MainContent$rdgSATScores$ctl00$ctl02$ctl00$ctl04']"),"sort up icon element present");

			//Click on first name 
			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[7]/a");
			Thread.sleep(2000);

			Assert.assertTrue(isElementPresent("//input[@title='Sorted desc']"),"sort down icon element present");  */

			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");		
			
			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[7]/a");
			
			Thread.sleep(2000);
		
			List<String> sort_java=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+i+"']/td[7]"))

			{
				sort_java.add(find("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+i+"']/td[7]").getText());
				++i;			
			}
			Collections.sort(sort_java);

			//Click on First name column.
			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00']/thead/tr[1]/th[7]/a");
			
			//Assert the First name column data get sorted correctly.
			List<String> sort_direct=new ArrayList<String>();
			int j=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+j+"']/td[7]"))

			{
				sort_direct.add(find("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+j+"']/td[7]").getText());
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
	public void TCED43510()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Click on percentile filter text field add "550 " and select 'EQUAL TO' 
			
			type("//*[@id='ctl00_MainContent_rdgSATScores_ctl00_ctl02_ctl01_FilterTextBox_mathematicsscore']","550");

			click("//*[@id='ctl00_MainContent_rdgSATScores_ctl00_ctl02_ctl01_Filter_mathematicsscore']");
			
			Thread.sleep(2000);

			click("//span[contains(text(),'Contains')]");
			
			//* Assert that the column values displayed under 'percentile filter is equal  to 550
			
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+i+"']/td[11]"))
				

			{
				Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgSATScores_ctl00__"+i+"']/td[11]"), "550");
				++i;
			}			
			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED43511()
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
	@Test(priority=12)
	public void TCED43512()
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
	public void TCED43513()
	{
		try
		{
			//Application should be in the Assessment Student List   page 

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rdgSATScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");

			// Click on  Add Selected Student to Group button 
			click("//input[@id='ctl00_MainContent_btnSelectToGroup']");
			
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
			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED43514()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			Thread.sleep(3000);

			//Select Some Student 
			click("//input[@id='ctl00_MainContent_rdgSATScores_ctl00_ctl04_chkSelectUserSelectCheckBox']");

			Thread.sleep(2000);
			//Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnCheckAll']");

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
			Thread.sleep(2000);
			//Assert the the Header Name as  Single Year College SAT Report	
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3/span"),"Single Year College SAT Analysis");	
			
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
