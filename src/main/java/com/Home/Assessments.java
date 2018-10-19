package com.Home;
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Assessments extends BaseClassOne

{
	@Test(priority=0)	
	public void TCED34201()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			//Assert the label "Standardized Assessment Results"
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr/td/b").contains("Standardized Assessment Results"),"failed to assert text"+"  Standardized Assessment Results");
							
			//Assert the label "Student Data Depot"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rgInputAssessment_ctl00']/thead/tr/th").contains("Student Data Depot"),"failed to assert text"+"  Student Data Depot");
			
			//Assert the label "PVAAS Results"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_panPVAASHistory']/b").contains("PVAAS Results"),"failed to assert text"+"  PVAAS Results");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=1)	
	public void TCED34202()
	{
		
		try
		{
			//Assert the Label "Assessment"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[1]").contains("Assessment"),"failed to assert text"+"  Assessment");
			
			//Assert the Label "Gr"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[2]").contains("Gr"),"failed to assert text"+"  Gr");
			
			//Assert the Label "Math"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[3]").contains("Math"),"failed to assert text"+"  Math");
			
			//Assert the Label "Reading"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[4]").contains("Reading"),"failed to assert text"+"  Reading");
			
			//Assert the Label "Language"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[5]").contains("Language"),"failed to assert text"+"  Language");
			
			//Assert the Label "Writing"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[6]").contains("Writing"),"failed to assert text"+"  Writing");
			
			//Assert the Label "Science"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[7]").contains("Science"),"failed to assert text"+"  Science");
			
			//Assert the Label "Soc Studies"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[1]/td[8]").contains("Soc Studies"),"failed to assert text"+"  Soc Studies");
		}
       catch (Exception e)
		{
    	   Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=2)	
	public void TCED34203()
	{
		
		try
		{
			//Application should be in the assessment page
			
			//Click on "PSSA 2013-2014" link from the 1st grid
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptAssessments']/tbody/tr[2]/td[1]/a");
			
			//Assert the heading "PSSA 2013|2014 Assessment Data "
			Assert.assertTrue(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/div[1]/table/tbody/tr/td[2]").contains("PSSA 2013|2014 Assessment Data"),"failed to assert text"+"  PSSA 2013|2014 Assessment Data");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	@Test(priority=3)	
	public void TCED34204()
	{
		
		try {
			//Application should be in the PSSA 2013|2014 Assessment Data page
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,2000)");
			
			//Assert the Label "How did this student score on each reporting category?  (Hide)"
			Assert.assertEquals(getText("//*[@id='shcStateStatsUnavailableToggle']/a[1]"),"How did this student score on each reporting category?");
			
			//Assert the Label "Reporting Category"
			Assert.assertEquals(getText("//a[contains(text(),'Reporting Category')]"),"Reporting Category");
			
			//Assert the Label "Description"
			Assert.assertEquals(getText("//a[contains(text(),'Description')]"),"Description");
			
			//Assert the Label "Possible Score"
			Assert.assertEquals(getText("//td[contains(text(),'Possible Score')]"),"Possible Score");
			
			//Assert the Label "Student Score" 
			Assert.assertEquals(getText("//td[contains(text(),'Student Score')]"),"Student Score");
			
			//Assert the Label "Pct Correct" 
			Assert.assertEquals(getText("//td[contains(text(),'Pct Correct')]"),"Pct Correct");
			
			//Assert the Label "Last Years Strength"
			Assert.assertEquals(getText("//td[contains(text(),'Last Years Strength')]"),"Last Years Strength");
			
			js.executeScript("scroll(0,document.body.scrollHeight)");	
			
			//Assert the Label "Score Type"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl00_rgMathReadingScores_ctl00']/thead/tr/th[1]"),"Score Type");
			
			//Assert the Label "Score"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_ctl00_rgMathReadingScores_ctl00']/thead/tr/th[2]"),"Score");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}

	@Test(priority=4)	
	public void TCED34205()
	{
		
		try
		{
			//Application should be in the PSSA 2013|2014 Assessment Data page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			
			FileDelete();	
			
			//click on Print PDF		
			click("//*[@id='ctl00_MainContent_ctl00_btnPrintToPDF']");			
			
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}

	@Test(priority=5)	
	public void TCED34206()
	{
		try 
		 {
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,500)");
			
			//Click on Keystone Exams 2015-2016 Spring
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_rptKeystone']/tbody/tr[3]/td[1]/a");
			
			//Assert the heading "Keystone Exams 2015-2016 "
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_theReportDiv']/div[1]/table/tbody/tr/td[2]").contains("Keystone Exams 2015-2016"),"failed to assert text"+"  Keystone Exams 2015-2016");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=6)	
	public void TCED34207()
	{
		
		try {
			//Application should be in the Keystone Exams 2015-2016  page
			
			//Assert the Label "View All Subjects"
			Assert.assertEquals(getText("//b[contains(text(),'View All Subjects')]"),"View All Subjects");
			
			//Assert the Label "View Only Biology"
			Assert.assertEquals(getText("//b[contains(text(),'View Only Biology')]"),"View Only Biology");
			
			//Assert the Label "View Only Literature"
			Assert.assertEquals(getText("//b[contains(text(),'View Only Literature')]"),"View Only Literature");
			
			//Assert the Label "Suggested Areas of Focus"
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_theReportDiv']/div[4]").contains("Suggested Areas of Focus"),"failed to assert label-Suggested Areas of Focus");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,500)");	
			
			//Assert the Label "Anchor Description"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RdgKeyStoneExam_ctl00']/thead/tr[1]/th[2]"),"Anchor Description");
			
			//Assert the Label "Raw Score" 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RdgKeyStoneExam_ctl00']/thead/tr[1]/th[3]"),"Raw Score");
			
			//Assert the Label "Possible Points "
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RdgKeyStoneExam_ctl00']/thead/tr[1]/th[4]"),"Possible Points");
			
			//Assert the Label "Minimum Estimated Points to Pass"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RdgKeyStoneExam_ctl00']/thead/tr[1]/th[5]"),"Minimum Estimated Points to Pass");
			
			//Assert the Label "Percent Correct"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_RdgKeyStoneExam_ctl00']/thead/tr[1]/th[6]"),"Percent Correct");
				    
			js.executeScript("scroll(0,document.body.scrollHeight)");	
			
			//Assert the Label "Subject"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgMultipleChoice_ctl00']/thead/tr[1]/th[1]"),"Subject");
			
			//Assert the Label "Multiple Choice"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgMultipleChoice_ctl00']/thead/tr[1]/th[2]"),"Multiple Choice");
			
			//Assert the Label "Constructed Response"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rdgMultipleChoice_ctl00']/thead/tr[1]/th[3]/a"),"Constructed Response");
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)	
	public void TCED34208()
	{
		try
		{
			//Application should be in the Keystone Exams 2015-2016  page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			
			//Verify the "Percent Correct " graph is exists in the page.
			//Taking screenshot of the "Percent Correct " graph		    
			TakesScreenshot ts=	(TakesScreenshot)driver;
			File src= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src, new File("./Screenshots/Percent Correct.png"));
			
			//Verify the "Multiple Choice/Constructed Response" graph is exists in the page.
			//Taking screenshot of the "Multiple Choice/Constructed Response" graph
			js.executeScript("scroll(0,document.body.scrollHeight)");			
			File src1= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src1, new File("./Screenshots/Multiple Choice_Constructed Response.png"));
			
			//Click on View Only Biology link
			js.executeScript("scroll(0,0)");
			click("//*[@id='ctl00_MainContent_lnkFilterBiology']/b");
			//Taking screenshot of the "Percent Correct " graph exists against the Biology  
			File src2= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src2, new File("./Screenshots/Biology_Percent Correct.png"));
			
			//Verify the "Multiple Choice/Constructed Response" graph is exists against the Biology Subject in the page.
			js.executeScript("scroll(0,document.body.scrollHeight)");
			//Taking screenshot of the "Multiple Choice/Constructed Response" graph			
			File src3= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src3, new File("./Screenshots/Biology_Multiple Choice_Constructed Response.png"));
			
			//Click on View Only Literature
			js.executeScript("scroll(0,0)");
			click("//*[@id='ctl00_MainContent_lnkFilterLiterature']/b");
			//Taking screenshot of the "Percent Correct " graph exists against the literature 
			File src4= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src4, new File("./Screenshots/literature_Percent Correct.png"));
			
			//Verify the "Multiple Choice/Constructed Response" graph is exists against the Literature Subject in the page.
			js.executeScript("scroll(0,document.body.scrollHeight)");
			//Taking screenshot of the "Multiple Choice/Constructed Response" graph			
			File src5= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src5, new File("./Screenshots/literature_Multiple Choice_Constructed Response.png"));
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		} 
		
	}
	
	@Test(priority=8)	
	public void TCED34209()
	{
		try 
		{
			//Click on the Print to PDF
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			FileDelete();		
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");			
			
			//Assert the PDF generated 		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)	
	public void TCED34210()
	{
		try
		{
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,1000)");
			
			// Click on CDT 2015-2016
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_egCDT']/tbody/tr[8]/td[1]/a");
			
			//Assert the heading "CDT 2015-2016 Assessment Data"
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td"),"CDT 2015-2016 Assessment Data for JOHN ANDERSON");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=10)	
	public void TCED34211()
	{
		try
		{
			//Application should be in the CDT 2015-2016 Assessment Data page
			
			//CDT Scores Select Testing Subject as Biolgy
			Select sel=new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlNorms']")));
			sel.selectByIndex(0);
			
			//Assert the Label "CDT Scores"
			Assert.assertEquals(getText("//h4[@class='blueheading']"),"CDT Scores");
			
			//Assert the Label "Select Testing Subject"
			Assert.assertEquals(getText("//td[contains(text(),'Select Testing Subject:')]"),"Select Testing Subject:");
			
			//Assert the subject dropdown values as Biology and Reading/Lit grades 6-HS
			List<WebElement>sub=sel.getOptions();
			Assert.assertEquals(sub.get(0).getText(),"Biology");
			Assert.assertEquals(sub.get(1).getText(),"Reading/Lit Grades 6-HS");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,document.body.scrollHeight)");			
			
			//Assert the Label "TEST DATE"
			Assert.assertEquals(getText("//a[contains(text(),'TEST DATE')]"),"TEST DATE");
			
			//Assert the Label "TOTAL TEST" 
			Assert.assertEquals(getText("//tr[@class='GridHeaderStyle']//td[@align='left']"),"TOTAL TEST");
			
			//Assert the Label "BASIC BIOLOGICAL PRINCIPALS/CHEMICAL BASIS FOR LIFE"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egScores']/tbody/tr[1]/td[3]/a"),"BASIC BIOLOGICAL PRINCIPALS/CHEMICAL BASIS FOR LIFE");
			
			//Assert the Label "BIOENERGETIC/HOMEOSTASIS AND TRANSPORT" 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egScores']/tbody/tr[1]/td[4]/a"),"BIOENERGETIC/HOMEOSTASIS AND TRANSPORT");
			
			//Assert the Label "CELL GROWTH AND REPRODUCTION/GENETICS "
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egScores']/tbody/tr[1]/td[5]/a"),"CELL GROWTH AND REPRODUCTION/GENETICS");
			
			//Assert the Label "THEORY OF EVOLUTION/ECOLOGY"
			Assert.assertEquals(getText("//a[contains(text(),'THEORY OF EVOLUTION/ECOLOGY')]"),"THEORY OF EVOLUTION/ECOLOGY");		
						
			//Select Testing Subject as Reading/Lit grades 6-HS
			js.executeScript("scroll(0,0)");				
			sel.selectByIndex(1);
			js.executeScript("scroll(0,document.body.scrollHeight)");
			
			//Assert the Label "TEST DATE"
			Assert.assertEquals(getText("//a[contains(text(),'TEST DATE')]"),"TEST DATE");
			
			//Assert the Label "TOTAL TEST"
			Assert.assertEquals(getText("//tr[@class='GridHeaderStyle']//td[@align='left']"),"TOTAL TEST");
			
			//Assert the Label "KEY IDEAS AND DETAILS-LITERATURE TEXT"
			Assert.assertEquals(getText("//a[contains(text(),'KEY IDEAS AND DETAILS-LITERATURE TEXT')]"),"KEY IDEAS AND DETAILS-LITERATURE TEXT");
			
			//Assert the Label "KEY IDEAS AND DETAILS-INFORMATIONAL TEXT"
			Assert.assertEquals(getText("//a[contains(text(),'KEY IDEAS AND DETAILS-INFORMATIONAL TEXT')]"),"KEY IDEAS AND DETAILS-INFORMATIONAL TEXT");
			
			//Assert the Label "CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-LIT TEXT"
			Assert.assertEquals(getText("//a[contains(text(),'CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-LIT ')]"),"CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-LIT TEXT");
			
			//Assert the Label "CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-INFO TEXT"
			Assert.assertEquals(getText("//a[contains(text(),'CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-INFO')]"),"CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-INFO TEXT");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=11)	
	public void TCED34212()
	{
		try
		{
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,1000)");
			
			// Click on CDT 2015-2016
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_egCDT']/tbody/tr[8]/td[1]/a");
			
			//Select Testing Subject as Biolgy
			Select sel1=new Select(driver.findElement(By.cssSelector("#ctl00_MainContent_ddlNorms")));
			sel1.selectByVisibleText("Biology");			
			
			//Verify the "TOTAL TEST " graph is exists in the page.
			//Verify the "BASIC BIOLOGICAL PRINCIPALS/CHEMICAL BASIS FOR LIFE" graph is exists in the page.
			//Verify the "BIOENERGETIC/HOMEOSTASIS AND TRANSPORT" graph is exists in the page.
			//Verify the "CELL GROWTH AND REPRODUCTION/GENETICS " graph is exists in the page.
			//Verify the "THEORY OF EVOLUTION/ECOLOGY" graph is exists in the page.
			js.executeScript("scroll(0,50)");
	//		Takescreenshot("Biology_CDT_2015-16_graph");
			
			
			//Select Testing Subject as Reading/Lit grades 6-HS
			js.executeScript("scroll(0,0)");	
			sel1.selectByIndex(1);
			
			//Verify the "TOTAL TEST" graph is exists in the page.
			//Verify the "KEY IDEAS AND DETAILS-LITERATURE TEXT" graph is exists in the page.
			//Verify the "KEY IDEAS AND DETAILS-INFORMATIONAL TEXT " graph is exists in the page.
			//Verify the "CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-LIT TEXT" graph is exists in the page.
			//Verify the "CRAFT/STRUCT & INTEGRATION OF KNOWLEDGE/IDEAS-INFO TEXT" graph is exists in the page.
			//Verify the "VOCABULARY ACQUISITION AND USE" graph is exists in the page.
			js.executeScript("scroll(0,50)");			
				  
	//		Takescreenshot("Reading_Lit grades_6-HSCDT_CDT_2015-16_graph");				
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
		
	}
	@Test(priority=12)	
	public void TCED34213()
	{
		try
		{
			//Application should be in the CDT  2015-2016  page	
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,0)");
			FileDelete();
			
			//Click on the Print to PDF
			click("//*[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//Assert the PDF generated		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
		
	}
	
	@Test(priority=13)	
	public void TCED34214()
	{
		try 
		{
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			//Click on  Student Search menu
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/div/div[8]/div/a");			
					
			//type on Student ID 
			type("//*[@id='ctl00_MainContent_StudentSearchGrid1_txtStudentId']","104104");
			
			//Search student
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdBtnAction']");
			click("//*[@id='ctl00_MainContent_StudentSearchGrid1_rdContextSearch_detached']/ul/li[1]/span");			
					
			//click student Id
			click("//a[contains(text(),'104104')]");
			
			//Click on the assessments menu
			click("//*[@id='ctl00_plcLeftMenu_MenuStudentLeft1_pnlMenu']/ul/li[2]/a/span[1]");
			
			//Click on PVAAS Results: PVAAS 2015-2016
			click("//*[@id='ctl00_MainContent_StudentDisplayAssessments1_egPVAASHistory']/tbody/tr[2]/td/a");
			
			//Assert the heading "PVAAS 2015-2016 Assessment Data"
			Assert.assertEquals(getText("//td[contains(text(),'Assessment Data')]"),"PVAAS 2015-2016 Assessment Data");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=14)	
	public void TCED34215()
	{
		try
		{
			//Assert the label "PVAAS History 
			Assert.assertEquals(getText("//td[@class='subheading']"),"PVAAS History");
			
			//Assert the label "Subject" 
			Assert.assertEquals(getText("//td[contains(text(),'Subject')]"),"Subject");
			
			//Assert the label "Performance Level"
			Assert.assertEquals(getText("//td[contains(text(),'Performance Level')]"),"Performance Level");
			
			//Assert the label "Score" 
			Assert.assertEquals(getText("//td[contains(text(),'Score')]"),"Score");
			
			//Assert the label "Percentile" 
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_egPVAASHistory']/tbody/tr[1]/td[4]"),"Percentile");
			
			//Assert the label "Projection 1 Grade" 
			Assert.assertEquals(getText("//td[contains(text(),'Projection 1 Grade')]"),"Projection 1 Grade");
			
			//Assert the label "Projection 1 Percentile" 
			Assert.assertEquals(getText("//td[contains(text(),'Projection 1 Percentile')]"),"Projection 1 Percentile");
			
			//Assert the label "Projection 1 Prob Basic or Above"
			Assert.assertEquals(getText("//td[contains(text(),'Projection 1 Prob Basic or Above')]"),"Projection 1 Prob Basic or Above");
			
			//Assert the label "Projection 1 Prob Proficient or Above"
			Assert.assertEquals(getText("//td[contains(text(),'Projection 1 Prob Proficient or Above')]"),"Projection 1 Prob Proficient or Above");
			
			//Assert the label "Projection 1 Prob Advanced"
			Assert.assertEquals(getText("//td[contains(text(),'Projection 1 Prob Advanced')]"),"Projection 1 Prob Advanced");
			
			//Verify the "Performance Level" graph is exists in the page.
			TakesScreenshot ts=	(TakesScreenshot)driver;
			File src= ts.getScreenshotAs(OutputType.FILE);	  
			FileUtils.copyFile(src, new File("./Screenshots/PVAAS_Performance_Level_graph.png"));
			
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	@Test(priority=15)	
	public void TCED34216()
	{
		try
		{
			//Application should be in the PVAAS 2015-2016 Assessment Data page
			FileDelete();
			
			//Click on the Print to PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
			//Assert the PDF generated		
			Thread.sleep(6000);		
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			//click on Logout button		 
			click("//*[@id='ctl00_A3']/img");
			
			//Assert the page Header as "Edinsight Login"					
			Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));
		} 
		catch (InterruptedException e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
