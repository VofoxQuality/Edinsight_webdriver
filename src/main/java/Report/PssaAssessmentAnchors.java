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

public class PssaAssessmentAnchors extends BaseClassOne
{
	@Test(priority=1)
	public void TCED38801()
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
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/a");
			
			//Assert the label PSSA Math | Reading Anchor Level  Report
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Math | Reading Anchor Level  Report");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED38802()
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
	public void TCED38803()
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
		   
		  //You must select a grade level.
		   Assert.assertEquals(s.substring(71,101),"You must select a grade level.");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED38804()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors page.
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=3");
			
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
	public void TCED38805()
	{
		try
		{
			//Application should be in the  Single Year Combined PSSA Math/Reading  Report
			
			// Assert the Labels:- Assessment
			Assert.assertEquals(getText("//b[contains(text(),'Assessment:')]"),"Assessment:");
			
		    //Assert the Labels:- Testing School
			Assert.assertEquals(getText("//b[contains(text(),'Testing School:')]"),"Testing School:");
			
			// Assert the Labels:- Testing Grade: 
			Assert.assertEquals(getText("//b[contains(text(),'Testing Grade:')]"),"Testing Grade:");
			
		    // Assert the Labels:- (click on the average score to see a student list)
			Assert.assertEquals(getText("//td[contains(text(),'(click on the average score to see a student list)')]"),"(click on the average score to see a student list)");
			
			// Assert the Labels:- View All Subjects  
			Assert.assertEquals(getText("//b[contains(text(),'View All Subjects')]"),"View All Subjects");
			
			// Assert the Labels:- View Only Math 
			Assert.assertEquals(getText("//b[contains(text(),'View Only Math')]"),"View Only Math");
			
		   // Assert the Labels:- View Only Reading
			Assert.assertEquals(getText("//b[contains(text(),'View Only Reading')]"),"View Only Reading");
			
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
	@Test(priority=6)
	public void TCED38806()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			
			//Click on View All Subjects
			click("//b[contains(text(),'View All Subjects')]");
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED38807()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			
			FileDelete();
			
			//Click on Export to PDF
			click("//input[@id='ctl00_MainContent_control1_btnExportpdf1']");
			
			waitFor_downloadfile();			
            Thread.sleep(500);	
			
			//Assert the downloaded pdf file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void TCED38808()
	{
		try
		{
            //Application should be in the PSSA Assessment Anchors   page.			
			FileDelete();
			
			//Click on Export to csv
			click("//input[@id='ctl00_MainContent_control1_btnExportCSVMath']");
			
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
	@Test(priority=9)
	public void TCED38809()
	{
		try
		{
            //Application should be in the PSSA Assessment Anchors   page.
			
			//* Click on Add report to favorite button
			click("//input[@id='ctl00_MainContent_control1_btnAddToFavorite']");
			
			//Assert the header "PSSA 2016-2017 
			Assert.assertEquals(getText("//td[contains(text(),'PSSA 2016-2017')]"),"PSSA 2016-2017");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void TCED38810()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			
			//Click on View All Reading
			click("//b[contains(text(),'View Only Reading')]");
			
			//Assert the Anchor Code-  E03.A 
			Assert.assertEquals(getText("//td[contains(text(),'Literature Text')]//preceding::a[1]"),"E03.A");	
			
			//Assert the Anchor Desc-  Literature Text
			Assert.assertEquals(getText("//td[contains(text(),'Literature Text')]"),"Literature Text");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void TCED38811()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.		
			
			String parent_window=driver.getWindowHandle();
			
			//Click on Anchor Code- Click on E03.A 
			click("//td[contains(text(),'Literature Text')]//preceding::a[1]");
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
	public void TCED38812()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			
			//Average Score- Click on 11.79
			click("//td[contains(text(),'Literature Text')]//following::a[1]");			
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
	public void TCED38813()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   drill down page.
			
			//Assert the Labels:Assessment: PSSA 2016-2017
			String S=getText("//b[contains(text(),'Assessment:')]");
			String S1=getText("//td[contains(text(),'PSSA 2016-2017')]");			
			Assert.assertEquals(S+" "+S1,"Assessment: PSSA 2016-2017");
			
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
	public void TCED38814()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			//Click on Any grid value First name
			click("//a[contains(text(),'First Name')]");
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
			
			//Assert the header "PSSA 2016-2017 
			Assert.assertEquals(getText("//td[contains(text(),'PSSA 2016-2017')]"),"PSSA 2016-2017");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	public void TCED38815()
	{
		try
		{
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=3");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Click on View All Reading
			click("//b[contains(text(),'View Only Reading')]");
			
			//Average Score- Click on 11.79
			click("//td[contains(text(),'Literature Text')]//following::a[1]");			
            Thread.sleep(1000);
            
            FileDelete();
            
            //Click on Export to CSV
            click("//input[@id='ctl00_MainContent_btnExportCSV']");
            
            waitFor_downloadfile();
			
            //On Exported CSV,  Assert the total count of columns under First Name	
			int firstname_gridcount=Integer.parseInt(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));
			 
			//Get the grid count from the excel
			int CSV_count=csv_row_count();
			     
			//Assert.assertEquals(firstname_gridcount,CSV_count-1);                  
			
			//Compare and Assert the value of  student count & Total count from CSV are EQUAL
			int grid_totalcount=Integer.parseInt(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00']/tfoot/tr[2]/td/div/div[5]/strong[1]"));
			Assert.assertEquals(grid_totalcount,CSV_count-1);		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	public void TCED38816()
	{
		try
		{			
			//Application should be in the Assessment Student List   page 
			
			//Click on First Name filter
			//On filter text field add "ALBERT" and select 'EQUAL TO' 
			type("//input[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl02_ctl02_FilterTextBox_ASIFirstName']","ALBERT");
			click("//button[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl02_ctl02_Filter_ASIFirstName']//span[@class='t-font-icon rgIcon rgFilterIcon']");
			click("//*[@id='ctl00_MainContent_egAnchorPerformance_rfltMenu_detached']/ul/li[6]/span");
			
			int i=0;
			
			//* Assert that the column values displayed under 'First Name' is equal  to ALBERT.
			while(isElementPresent("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"))
			{
				Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00__"+i+"']/td[6]"),"ALBERT");
				i++;
			}
			//Assert the header "PSSA 2016-2017 
			Assert.assertEquals(getText("//td[contains(text(),'PSSA 2016-2017')]"),"PSSA 2016-2017");
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	public void TCED38817()
	{
		try
		{
            FileDelete();
            
            //Click on Export to CSV
            click("//input[@id='ctl00_MainContent_btnExportCSV']");
            
            waitFor_downloadfile();
            Thread.sleep(500);
            
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=18)
	public void TCED38818()
	{
		try
		{
            FileDelete();
            
            //Click on Export to PDf
            click("//input[@id='ctl00_MainContent_btnExportpdf']");
            
            waitFor_downloadfile();
            Thread.sleep(500);
            
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=19)
	public void TCED38819()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
            //Select Some Student 
			click("//*[@id='ctl00_MainContent_egAnchorPerformance_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
            // Click on  Add Selected Student to Group button 
			click("//input[@id='ctl00_MainContent_btnSelectToGroup']");
			
			//Assert the label  Add Students to Group	
			SwitchFrameName("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//span[contains(text(),'Add Students to Group:')]"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//span[contains(text(),'Create New Group:')]"),"Create New Group:");
			
			driver.switchTo().parentFrame();
			
			//Click on Close button
			click("//span[@title='Close']");
			
			//Assert the label "PSSA 2016-2017  "
			String S1=getText("//td[contains(text(),'PSSA 2016-2017')]");			
			Assert.assertEquals(S1,"PSSA 2016-2017");					
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=20)
	public void TCED38820()
	{
		try
		{
			//Application should be in the Assessment Student List   page 
			
			Thread.sleep(2000);
			
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
			
			//Assert the label "PSSA 2016-2017  "
			String S1=getText("//td[contains(text(),'PSSA 2016-2017')]");			
			Assert.assertEquals(S1,"PSSA 2016-2017");	

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=21)
	public void TCED38821()
	{
		try
		{
			
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			 
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			Thread.sleep(2000);
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=3");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Click on View Only Math
			click("//b[contains(text(),'View Only Math')]");
			
			//Click on Show Data in Graphical Form
			click("//b[contains(text(),'Show Data in Graphical Form')]");
			Thread.sleep(3000);
			
			//Assert that PSSA Assessment anchors & score distribution charts are visible
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_TelerikBarChart']"),"PSSA Assessment anchors chart not present");
			Assert.assertTrue(isElementPresent("//*[@id='ctl00_MainContent_rhcLineChart']"),"score distribution charts  chart not present");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=22)
	public void TCED38822()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			String parent_window=driver.getWindowHandle();
			
			//Click on Anchor Code- Click on E03.A 
			click("//td[contains(text(),'Number and Operations – Fractions')]//preceding::a[1]");
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
	@Test(priority=23)
	public void TCED38823()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			
			//Average Score- Click on 5.4
			click("//td[contains(text(),'Number and Operations – Fractions')]//following::a[1]");			
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
	@Test(priority=24)
	public void TCED38824()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			Thread.sleep(2000);
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
			//Click Run Report by Student Group
			click("//input[@value='rdoStudentGroup']");
			
			//Click on Student Grp  00 123 MR
			select("//select[@id='ctl00_MainContent_ddlStudentGroup']","label=00 123 MR");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			Thread.sleep(8000);
			
			// Asset the report header : PSSA Standard/Anchor Breakdown
			Assert.assertEquals(getText("//span[@class='subheading']"),"PSSA Standard/Anchor Breakdown");	
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=25)
	public void TCED38825()
	{
		try
		{
            //Application should be in the PSSA Assessment Anchors   page.
			
			//* Click on Add report to favorite button
			click("//input[@id='ctl00_MainContent_control2_btnAddToFavorite']");
			
			//Assert the header "PSSA 2016-2017 
			Assert.assertEquals(getText("//td[contains(text(),'PSSA 2016-2017')]"),"PSSA 2016-2017");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=26)
	public void TCED38826()
	{
		try
		{
            FileDelete();
            
            //Click on Export to CSV
            click("//input[@id='ctl00_MainContent_control2_btnExportCSVMath']");
            
            waitFor_downloadfile();
            Thread.sleep(500);
            
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=27)
	public void TCED38827()
	{
		try
		{
            FileDelete();
            
            //Click on Export to PDf
            click("//input[@id='ctl00_MainContent_control2_btnExportpdf1']");
            
            waitFor_downloadfile();
            Thread.sleep(500);
            
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=28)
	public void TCED38828()
	{
		try
		{
            FileDelete();
            Thread.sleep(2000);
            
            //Click on Print to PDf
            click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
            
            waitFor_downloadfile();
            Thread.sleep(5000);
            
			//Assert the downloaded csv file
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=29)
	public void TCED38829()
	{
		try
		{
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a")).build().perform();
			
			Thread.sleep(2000);
			//Click PSSA Math/Reading
			click("//a[contains(text(),'PSSA Math/Reading')]");
			
			//Click PSSA Assessment Anchors
			click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/a");
			
			//select Testing PSSA Year
			select("//select[@id='ctl00_MainContent_ddlAssessment']","label=PSSA 2016-2017");
			
			//select Testing Testing Building/District  Onhand  School
			select("//select[@id='ctl00_MainContent_ddlProvider']","label=OnHand School District");
			
			//select Testing Grade Level 3
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']","label=3");
			
			//Click on Run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Click on View Only Reading
			click("//b[contains(text(),'View Only Reading')]");
			
            String parent_window=driver.getWindowHandle();
			
			//Click on Anchor Code- Click on E03.A 
			click("//td[contains(text(),'Literature Text')]//preceding::a[1]");
			Thread.sleep(2000);
			
			for(String child:driver.getWindowHandles())
			{
				if(!parent_window.equals(child))
				{
					driver.switchTo().window(child);
					
					//Assert the header "Teaching Aids for Standard Code "
					Assert.assertEquals(getText("//*[@id='ctl00_MainContent_StateStandardDisplay1_Label1']"),"Teaching Aids for Standard Code");				}
			     }
		      } 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=30)
	public void TCED38830()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.
			
			//Click on Information on Standard
			click("//span[contains(text(),'Information on Standard')]");	
  			
			Thread.sleep(2000);
			
			//Assert the Labels:- Standard Code:  E.A - STATE: PA Core Anchors and Eligible Content (2014) (Reporting Category) 
			Assert.assertEquals(getText("//span[contains(text(),'E03.A - STATE: PA Core Anchors and Eligible Content (2014) (Grade)')]"),"E03.A - STATE: PA Core Anchors and Eligible Content (2014) (Grade)");
			
			//* Assert the Labels:- Grade Level: 
			Assert.assertEquals(getText("//td[contains(text(),'Grade Level:')]"),"Grade Level:");
			
			// Assert the Labels:- Organizer:   
			Assert.assertEquals(getText("//td[contains(text(),'Organizer:')]"),"Organizer:");
			
			// Assert the Labels:- Description:
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblStandardDesc']"),"Description:");
			
		    //Assert the Labels:- Additional Notes:
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblStandardText']"),"Additional Notes:");

			// Assert the Labels:- Standard Related Documents:
			Assert.assertTrue(getText("//td[contains(text(),'Standard Related Documents:')]").contains("Standard Related Documents:"),"Standard Related Documents:-text not found");				
			
			//Assert the Labels:- Description
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_StateStandardDisplay1_rgRelatedDocuments_ctl00']//th[@class='rgHeader GridHeaderStyle'][contains(text(),'Description')]"),"Description");
			
			// Assert the Labels:- Standard Crosslinks: 
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblCrossRefGrid']"),"Standard Crosslinks:");
			
			// Assert the Labels:- Standard 
			Assert.assertEquals(getText("//td//tr//div[@id='ctl00_MainContent_StateStandardDisplay1_rgCrossLinkGrid']//tr//th[4]"),"Standard");
			
			//Assert the Labels:- Standard Code 
			Assert.assertEquals(getText("//th[contains(text(),'Standard Code')]"),"Standard Code");
			
			//Assert the Labels:- Description
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_StateStandardDisplay1_rgCrossLinkGrid_ctl00']//th[@class='rgHeader GridHeaderStyle'][contains(text(),'Description')]"),"Description");

            String parent_window=driver.getWindowHandle();
			
			for(String child:driver.getWindowHandles())
			{
				if(!parent_window.equals(child))
				{
					driver.close();
					driver.switchTo().window(child);
				}
			}
		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=31)
	public void TCED38831()
	{
		try
		{	
			
            String parent_window=driver.getWindowHandle();
			
			//Click on Anchor Code- Click on E03.A 
			click("//td[contains(text(),'Literature Text')]//preceding::a[1]");
			Thread.sleep(2000);
			
			for(String child:driver.getWindowHandles())
			{
				if(!parent_window.equals(child))
				{
					driver.switchTo().window(child);
					
					//* Click on Aligned Curriculum  
	                click("//span[contains(text(),'Aligned Curriculum')]");
					
					//Assert the Labels:- Show curriculum with crosslinked standards:  
					Assert.assertEquals(getText("//label[@for='ctl00_MainContent_StateStandardDisplay1_chkShowCrosslinkedMaps']"),"Show curriculum with crosslinked standards:");	
					
				    //Assert the Labels:- Current Filter: None
					Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblFilter']"),"Current Filter: None");
					
				    //Assert the Labels:- Local Curriculum  
					Assert.assertEquals(getText("//label[@for='ctl00_MainContent_StateStandardDisplay1_rdoLocalCurr']"),"Local Curriculum");
					
					//Assert the Labels:- Global Curriculum 
					Assert.assertEquals(getText("//label[@for='ctl00_MainContent_StateStandardDisplay1_rdoGlobalCurr']"),"Global Curriculum");
					
					// Assert the Labels:- Level 
					Assert.assertEquals(getText("//th[contains(text(),'Level')]"),"Level");
					
					// Assert the Labels:- Course Map 
					Assert.assertEquals(getText("//th[contains(text(),'Course Map')]"),"Course Map");
					
					// Assert the Labels:- Unit 
					Assert.assertEquals(getText("//th[contains(text(),'Unit')]"),"Unit");
					
					// Assert the Labels:- Lesson Topic 
					Assert.assertEquals(getText("//th[contains(text(),'Topic')]"),"Lesson Topic");
					
					//Assert the Labels:- Standard Type 
					Assert.assertEquals(getText("//th[contains(text(),'Standard Type')]"),"Standard Type");
					
					//Assert the Labels:- Standard 
					Assert.assertEquals(getText("//div[@id='ctl00_MainContent_StateStandardDisplay1_pvCurriculum']//tr//tr//th[10]"),"Standard");
					
					//Assert the Labels:- Description
					Assert.assertEquals(getText("//table[@id='ctl00_MainContent_StateStandardDisplay1_rgCurriculum_ctl00']//th[@class='rgHeader GridHeaderStyle'][contains(text(),'Description')]"),"Description");									
				}
			}			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=32)
	public void TCED38832()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			
            String parent_window=driver.getWindowHandle();			
			
			//Click on UNIT
			click("//tr[@id='ctl00_MainContent_StateStandardDisplay1_rgCurriculum_ctl00__0']//a[contains(text(),'UNIT')]");	
			
			Thread.sleep(2000);
			
			Set<String>s=driver.getWindowHandles();
			ArrayList<String> s1=new ArrayList<String>(s);
			driver.switchTo().window(s1.get(2));
			String st=getText("//span[@id='ctl00_ContentPlaceHolder1_lblCurriculumMap']");
			
			//* Assert the  header label :-Curriculum Map View 
			Assert.assertEquals(st.substring(0, 19),"Curriculum Map View");	
			driver.close();
			driver.switchTo().window(s1.get(1));
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=34)
	public void TCED38834()
	{
		try
		{
			//Click on Aligned Resources   
			click("//span[contains(text(),'Aligned Resources')]");
			
			// Assert the Labels:- hSow resources with crosslinked standards: 
			Assert.assertEquals(getText("//label[@for='ctl00_MainContent_StateStandardDisplay1_chkShowCrosslinkedResources']"),"Show resources with crosslinked standards:");
			
			//Assert the Labels:- Current Filter
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblResourceFilter']"),"Current Filter: None");
			
			// Assert the Labels:- Resource 
			Assert.assertEquals(getText("//th[contains(text(),'Resource')]"),"Resource");
			
			// Assert the Labels:- Description 
			Assert.assertEquals(getText("//table[@id='ctl00_MainContent_StateStandardDisplay1_rgResources_ctl00']//th[@class='rgHeader GridHeaderStyle'][contains(text(),'Description')]"),"Description");
			
			//Assert the Labels:- Subject 
			Assert.assertEquals(getText("//th[contains(text(),'Subject')]"),"Subject");
			
			// Assert the Labels:- Media 
			Assert.assertEquals(getText("//th[contains(text(),'Media')]"),"Media");
			
			//	* Assert the Labels:- Standard 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_StateStandardDisplay1_rgResources_ctl00']/thead/tr[1]/th[8]"),"Standard");
			
			//	* Assert the Labels:- +
			Assert.assertEquals(getText("//th[contains(text(),'+')]"),"+");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=36)
	public void TCED38836()
	{
		try
		{
			//* Click on Aligned Assessment Questions 
			
			//Click on Aligned Assessment Questions
			click("//span[contains(text(),'Aligned Assessment Questions')]");	
			
			Thread.sleep(2000);

		    // Assert the Labels:-Show ALL
			Assert.assertEquals(find("//input[@id='ctl00_MainContent_StateStandardDisplay1_btnShowAllQuestions']").getAttribute("value"),"Show All");
			
			// Assert the Labels:-Show Flagged
			Assert.assertEquals(find("//input[@id='ctl00_MainContent_StateStandardDisplay1_btnShowFlagged']").getAttribute("value"),"Show Flagged (this Standard)");
			
			// Assert the Labels:-Clear Flagged
			Assert.assertEquals(find("//input[@id='ctl00_MainContent_StateStandardDisplay1_btnClearFlagged']").getAttribute("value"),"Clear Flagged");
			
			// Assert the Labels:-Print Questions 
			Assert.assertEquals(find("//input[@id='ctl00_MainContent_StateStandardDisplay1_btnPrint']").getAttribute("value"),"Print Questions");
			
			// Assert the Labels:-Current Filter: None
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_StateStandardDisplay1_lblQuestionFilter']"),"Current Filter: None");
			
			// Assert the Labels:-QuestionText 
			Assert.assertEquals(getText("//th[contains(text(),'QuestionText')]"),"QuestionText");
			
			// Assert the Labels:-Answers
			Assert.assertEquals(getText("//th[contains(text(),'Answers')]"),"Answers");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=37)
	public void TCED38837()
	{
		try
		{
			//Application should be in the PSSA Assessment Anchors   page.	
			
			FileDelete();
			
			Thread.sleep(5000);
			  
           //Click on Print Questions 
			click("//input[@id='ctl00_MainContent_StateStandardDisplay1_btnPrint']");
			
			waitFor_downloadfile();
			 Thread.sleep(6000);
			
			//Assert the downloaded pdf file
			//Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

}
