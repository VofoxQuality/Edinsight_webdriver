package Report;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;
import com.opencsv.CSVReader;

import Library.BaseClassOne;

public class PssaScienceAssessmentAnchors extends BaseClassOne
{
	@Test(priority=1)
	public void TCED40401()
	{	
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Science
			click("//a[contains(text(),'PSSA Science')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");
			
			//Assert the label PSSA Science Anchor Level  Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Science Anchor Level  Report");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED40402()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.				

			//Asert the labels:-Testing PSSA Year
			Assert.assertEquals(getText("//td[contains(text(),'Testing PSSA Year')]"),"Testing PSSA Year");
			
			//Asert the labels:-Run Report by Building
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_rdoBuildingGrade']"),"Run Report by Building");
			
			//Asert the labels:-Testing Building/District 
			Assert.assertEquals(getText("//td[contains(text(),'Testing Building/District')]"),"Testing Building/District");
			
			//Asert the labels:-Asert the labels:-Testing Grade Level
			Assert.assertEquals(getText("//td[contains(text(),'Testing Grade Level')]"),"Testing Grade Level");
			
			//Asert the labels:-Run Report by Student Group
			Assert.assertEquals(getText("//label[contains(text(),'Run Report by Student Group')]"),"Run Report by Student Group");
			
			//Asert the labels:- Student Group
			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void TCED40403()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.
			
		   //Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			String s=getText("//span[@id='ctl00_MainContent_lblErrorMessages']");

		   //You must select an assessment year.
		   Assert.assertEquals(s.substring(0,35),"You must select an assessment year.");
		   
		  //You must select a school/district.
		   Assert.assertEquals(s.substring(36,70),"You must select a school/district.");
		   
		  //You must select a grade level, or All Grades.
		   Assert.assertEquals(s.substring(71,116),"You must select a grade level, or All Grades.");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED40404()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Science 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=4");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void TCED40405()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.
			
			// Assert the Labels:- Assessment
			Assert.assertEquals(getText("//b[contains(text(),'Assessment:')]"),"Assessment:");
			
		    //Assert the Labels:- Testing School
			Assert.assertEquals(getText("//b[contains(text(),'Testing School:')]"),"Testing School:");
			
			// Assert the Labels:- Testing Grade: 
			Assert.assertEquals(getText("//b[contains(text(),'Testing Grade:')]"),"Testing Grade:");
			
		    // Assert the Labels:- (click on the average score to see a student list)
			Assert.assertEquals(getText("//td[contains(text(),'(click on the average score to see a student list)')]"),"(click on the average score to see a student list)");
			
		   // Assert the Labels:- Show Data in Graphical Form
			Assert.assertEquals(getText("//b[contains(text(),'Show Data in Graphical Form')]"),"Show Data in Graphical Form");
			
		    // Assert the Labels:-Anchor Code 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortAnchorCode']"),"Anchor Code");
			
			// Assert the Labels:-Anchor Desc
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortAnchorDesc']"),"Anchor Desc");
			
			// Assert the Labels:-Points Possible 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortPointsPossible']"),"Points Possible");
			
			// Assert the Labels:-Average Score 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortAverageScore']"),"Average Score");
			
			// Assert the Labels:-Average Points Missed 
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortAveragePointsMissed']"),"Average Points Missed");
			
			// Assert the Labels:-Performance
			Assert.assertEquals(getText("//a[@id='ctl00_MainContent_control1_lnkSortAveragePercentCorrect']"),"Performance");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED40407()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			
			FileDelete();
			
			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_control1_btnExportToPDf']");
			
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
	@Test(priority=8)
	public void TCED40408()
	{
		try
		{
            //Application should be in the PSSA Assessment Anchors   page.			
			FileDelete();
			
			//Click on Export to csv
			click("//input[@id='ctl00_MainContent_control1_btnExportToCSV']");
			
			waitFor_downloadfile();			
            Thread.sleep(500);	
			
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void TCED40409()
	{
		try
		{
            //Application should be in the PSSA Assessment Anchors   page.
			
			//* Click on Add report to favorite button
			click("//input[@id='ctl00_MainContent_control1_btnAddToFavorite']");
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED40411()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.		
			Thread.sleep(2000);
			String parent_window=driver.getWindowHandle();
			
			//Click on Anchor Code- Click on S4.A 
			click("//*[@id='content']/tbody/tr[3]/td[1]/a");
			//click("//td[contains(text(),'The Nature of Science')]')]//preceding::a[1]");
			Thread.sleep(2000);
			
			for(String child:driver.getWindowHandles())
			{
				if(!parent_window.equals(child))
				{
					driver.switchTo().window(child);
					
					//Assert the header "Teaching Aids for Standard Code "
					Assert.assertEquals(getText("//*[@id='ctl00_MainContent_StateStandardDisplay1_Label1']"),"Teaching Aids for Standard Code");	
					
					driver.close();
				}
			}
			driver.switchTo().window(parent_window);
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void TCED40412()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			
			//Under the Average Score- Click on 19.24
			click("//a[contains(text(),'19.24')]");			
            Thread.sleep(1000);

		    String s=getText("//td[@class='blueheading']");
					
			//Assert the header "Teaching Aids for Standard Code "
			Assert.assertEquals(s.substring(0,11),"Anchor Name");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void TCED40413()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   drill down page.
			
			//Assert the Labels:Assessment: PSSA  Science 2016-2017
			String S=getText("//b[contains(text(),'Assessment:')]");
			String S1=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S+" "+S1,"Assessment: PSSA Science 2016-2017");
			
			//Assert the Labels:Testing School:
			Assert.assertEquals(getText("//b[contains(text(),'Testing School:')]"),"Testing School:");
			
			//Assert the Labels:OnHand School District 
			Assert.assertEquals(getText("//td[contains(text(),'OnHand School District')]"),"OnHand School District");
			
			//Assert the Labels:Testing Grade:4 
			Assert.assertEquals(getText("//b[contains(text(),'Testing Grade:')]"),"Testing Grade:");

			//Assert the Labels:-Student ID 
			Assert.assertEquals(getText("//td[@class='blueheading']//following::a[1]"),"Student ID");
			
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
			Assert.assertEquals(getText("//a[contains(text(),'Percentage Correct')]"),"Percentage Correct");
			
			//Assert the Labels:-Performance Level 
			Assert.assertEquals(getText("//a[contains(text(),'Performance Level')]"),"Performance Level");
			
			//Assert the Labels:-Scaled Score
			Assert.assertEquals(getText("//a[contains(text(),'Scaled Score')]"),"Scaled Score");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void TCED40414()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//Click on Any grid value First name
			click("//a[contains(text(),'First Name')]");
			
			//* Assert the sort up/down icon element present
			Assert.assertTrue(isElementPresent("//span[@class='t-font-icon rgIcon rgSortAscIcon']"));
			
			//Assert the Header Assessment PSSA 2016-2017 
			String S=getText("//b[contains(text(),'Assessment:')]");
			String S1=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S+" "+S1,"Assessment: PSSA Science 2016-2017");			
			
			//Asseert the First name column data get sorted correctly.
			List<String> sort_firstname=new ArrayList<String>();
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"))
			{
				sort_firstname.add(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"));
				i++;
			}
			List<String> sort_firstname_java=new ArrayList<String>(sort_firstname);
			Collections.sort(sort_firstname_java);
			Assert.assertEquals(sort_firstname,sort_firstname_java);
			
			//Assert the Header Assessment PSSA 2016-2017 
			String S2=getText("//b[contains(text(),'Assessment:')]");
			String S3=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S2+" "+S3,"Assessment: PSSA Science 2016-2017");	
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public void TCED40415()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Science
			click("//a[contains(text(),'PSSA Science')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Science 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=4");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Under the Average Score- Click on 19.24
			click("//a[contains(text(),'19.24')]");			
            Thread.sleep(1000);
            
			FileDelete();
			
			//Click on Export to CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			
			waitFor_downloadfile();	
			
            //On Exported CSV,  Assert the total count of columns under First Name	
			int firstname_gridcount=378;
			Assert.assertEquals(firstname_gridcount,csv_row_count()-1);			

			//Compare and Assert the value of 369 items shown under pagination & Total count from CSV are EQUAL
			int grid_totalcount=Integer.parseInt(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));
			Assert.assertEquals(grid_totalcount,csv_row_count()-1);			    
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public void TCED404416()
	{
		try
		{
            //Application should be in the Assessment Student List   page 
			
			//Click on First Name filter add "ALBERT" and select 'EQUAL TO'  
			type("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl02_ctl02_FilterTextBox_ASIFirstName']","ALBERT");
			click("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl02_ctl02_Filter_ASIFirstName']/span");
			click("//*[@id='ctl00_MainContent_egAnchorPerformance_rfltMenu_detached']/ul/li[6]/span");
			
			//* Assert that the column values displayed under 'Math Scaled Score is equal  to ALBERT 
			int i=0;
			while(isElementPresent("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"))
			{
		     Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"),"ALBERT");
		     i++;
			}	
			
			//Assert the Header Assessment PSSA 2016-2017 
			String S2=getText("//b[contains(text(),'Assessment:')]");
			String S3=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S2+" "+S3,"Assessment: PSSA Science 2016-2017");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	public void TCED404417()
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
	@Test(priority=18)
	public void TCED404418()
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
	@Test(priority=19)
	public void TCED404419()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
            //Select Some Student 
			click("//input[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
            // Click on  Add Selected Student to Group button 
			click("//input[@value='Add Selected Students to Group']");
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//span[@title='Close']");
			//click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[2]");
			
			//Assert the label "PSSA 2016-2017  "
			String S1=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S1,"PSSA Science 2016-2017");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=20)
	public void TCED404420()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			Thread.sleep(3000);
			if(isSelected("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl04_chkSelectUserSelectCheckBox']")==false)
			{ 			
            //Select Some Student 
			click("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			}
			
            //Click on  Add All Student to Group button	 
			click("//input[@id='ctl00_MainContent_btnCheckAll']");
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//span[@title='Close']");
			//click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[2]");
			
			//Assert the label "PSSA 2016-2017  "
			String S1=getText("//td[contains(text(),'PSSA Science 2016-2017')]");			
			Assert.assertEquals(S1,"PSSA Science 2016-2017");	
	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=21)
	public void TCED404421()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			Thread.sleep(2000);
			
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Science
			click("//a[contains(text(),'PSSA Science')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA Science 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=4");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Click on Show Data in Graphical Form
			click("//b[contains(text(),'Show Data in Graphical Form')]");
			Thread.sleep(3000);
			
			//Assert that PSSA Assessment anchors & score distribution charts are visible
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_TelerikBarChart']"),"PSSA Assessment anchors chart not present");
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_rhcLineChart']"),"score distribution charts  chart not present");
			
			//* Select any other Anchors: S4.B.2 from Anchors dropdown menu
			click("//*[@id='ctl00_MainContent_rcmbAnchors_Arrow']");
			click("//*[@id='ctl00_MainContent_rcmbAnchors_DropDown']/div/ul/li[7]");
			Thread.sleep(2000);
			
			// For Anchor S4.B.2, Assert that the score distribution charts are visible
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_rhcLineChart']"),"For Anchor S4.B.2, score distribution charts  chart not present");
			
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
