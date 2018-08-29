package Functions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class addStandard  extends BaseClassOne
{
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	objectData obj=new objectData();
	String AsseName=obj.readData("Standard_Assessment");
	
	@Test(priority=1)
	public void Add_Atribute()
	{
		try
		{
			
			//Supertent Login
			 login(Supertent_Login_id,Supertent_Login_Password);
			 
			 // To fill the assessment Name
			 Assessment.New_AssESSMENT(AsseName,"Test");
			 Assessment.QT_Essay();
			 Thread.sleep(3000);
			 
			//Back to Assessment
			 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	 
			 
			 //To select the question(Check box)
			 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
			 
			 //To call find Standard
			 Find_Standard("Part1"); 
			 
			 //To select the option
			 click("//*[@id='QuestionBankStandards1_SplitButton']");
			 Thread.sleep(500);
			 click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[1]/span");
			 
		     //To check the standard 
			 click("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
			 Thread.sleep(500);
			//To add the standard
			 click("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl04_btnGridSelect']");
			 
			//To select the Close
			 Thread.sleep(2000);
			 click("//*[@id='QuestionBankStandards1_SplitButton']");
			 Thread.sleep(500);
			 click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
			 
			 driver.switchTo().defaultContent();
			 
			Thread.sleep(3000);
			String expected= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdStandards_ctl02_lnkStandardCode']")).getText();
			Assert.assertEquals("CC.1.1.PK.A", expected);
			Logout();
		}
				
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
				Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Assert.assertTrue(false);
		}
	}
	//*************************************************Close and Update Test***********************
	@Test(priority=2)
	public void Close_and_Update_Test()
	{
		try
		{
		
			//Supertent Login
			 login(Supertent_Login_id,Supertent_Login_Password);	
			
			 //To find one assessment
			 FindAssessmentName("Standard_Assessment");
			 
			//To call Find_Standard() 
			Find_Standard("Part1");
			 
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
			
			driver.switchTo().defaultContent();
			
			Assert.assertTrue(driver.getPageSource().contains(AsseName));
			
			Logout();
			
		}
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
				Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Assert.assertTrue(false);
		}
	}	
		
	//*************************************************To Set a add favorite***********************
	
	//@Test(priority=3)
	public void Add_Favorite()
	{
		try
		{	
			//To select the option
			Thread.sleep(2000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[2]/span")).click();
			//To enter Favorite Name
			Thread.sleep(200);
			driver.findElement(By.cssSelector("input.rwPromptInput.radPreventDecorate")).sendKeys("Seban123");
			
			driver.findElement(By.cssSelector("button.rwOkBtn")).click();
			
			Thread.sleep(1000);
			String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_cbddlStandardsType']"))).getFirstSelectedOption().getText(); 
			Assert.assertEquals("STATE: PA Common Core Standards (2012)", selectedOption);
			
			Thread.sleep(1000);
			String selectedOption1 = new Select(driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_cbddlSubject']"))).getFirstSelectedOption().getText(); 
			Assert.assertEquals("Academic Standards for English Language Arts", selectedOption1);
			
			String selectedOption2 = new Select(driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_cbddlStandard']"))).getFirstSelectedOption().getText(); 
			Assert.assertEquals("Foundational Skills - Students gain a working knowledge of concepts of print, alphabetic principle, and other basic conventions.", selectedOption2);
			
			String selectedOption3 = new Select(driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_cbddlOrganizer']"))).getFirstSelectedOption().getText(); 
			Assert.assertEquals("Book Handling", selectedOption3);
			
			String selectedOption4 = new Select(driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_cbddlGrade']"))).getFirstSelectedOption().getText(); 
			Assert.assertEquals("Preschool", selectedOption4);
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span")).click();
		    Thread.sleep(500);
			driver.switchTo().defaultContent();
			
		}
		
			catch (Exception e)
			{
				
				System.out.println(e);
				try {
					Logout();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Assert.assertTrue(false);
			}
	}
	//******************************************Browse Standard Free**************************************
	//@Test(priority=4)
	public void Browse_Standard_Tree()
	{
	
		try
		{
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[4]/span")).click();
			
			
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    Thread.sleep(1000);
		    driver.navigate().refresh();
		    String title=driver.getTitle();
		    System.out.println(title);
		    Assert.assertEquals("Standards ''View-Only'' Browse", driver.getTitle());
		    driver.close();
	        driver.switchTo().window(tabs2.get(0));
			
		}
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
				Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Assert.assertTrue(false);
		}
	}
	
	//*******************************Add and search free*******************************************
	@Test(priority=5)
	public void Add_Checked_Search_Standards()
	{
	
		try
		{
			//Supertent Login
			 login(Supertent_Login_id,Supertent_Login_Password);	
		
			//To find one assessment
			 FindAssessmentName("Standard_Assessment");
			 
			//To call Find_Standard() 
			Find_Standard("Part2");
			
			check("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
			
			check("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl06_CheckboxSelectColumnSelectCheckBox']");
			
			check("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl08_CheckboxSelectColumnSelectCheckBox']");
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[6]/span");
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
			
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			
			String expected= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdStandards_ctl02_lnkStandardCode']")).getText();
			Assert.assertEquals("CC.1.1.PK.A", expected);
			
			String expected1= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdStandards_ctl03_lnkStandardCode']")).getText();
			Assert.assertEquals("CC.1.1.PK.B", expected1);
			
			String expected2= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdStandards_ctl04_lnkStandardCode']")).getText();
			Assert.assertEquals("CC.1.1.PK.C", expected2);
			
			Logout();
			}
		catch (Exception e)
		{
				
			System.out.println(e);
			try {
				Logout();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Assert.assertTrue(false);
		}
	}
	//*************************************Replace checked standards*************************** 
	@Test(priority=6)
	public void Replace_Checked_Standards()
		{
		try
		 {
			//Supertent Login
			 login(Supertent_Login_id,Supertent_Login_Password);	
			
			//To find one assessment
			 FindAssessmentName("Standard_Assessment");
			 
			//To call Find_Standard() 
			Find_Standard("Part2");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='QuestionBankStandards1_rgStandards_ctl00_ctl10_CheckboxSelectColumnSelectCheckBox']")).click();
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[7]/span");
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='QuestionBankStandards1_SplitButton']");
			Thread.sleep(500);
			click("//*[@id='QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
			
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			
			String expected= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdStandards_ctl02_lnkStandardCode']")).getText();
			Assert.assertEquals("CC.1.1.PK.D", expected);
			
			Logout();   
		 }
		catch (Exception e)
		{
				
			System.out.println(e);
			try {
				Logout();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Assert.assertTrue(false);
		}
	}
			
	//To find the standards 	
	public void Find_Standard(String Part) 
	{
		
	    try
	    {
	    if(Part.equals("Part1"))
	    {
		     //To click on Apply Standards
			 click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyStandards']");
			 Thread.sleep(2000);
			 // SwitchFrame()
			 WebElement frameElement1 = driver.findElement(By.name("MassEditStandards"));
			 driver.switchTo().frame(frameElement1);
			 
			 //To select Standard Type
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlStandardsType"))).selectByValue("1022");
			 
			 //To select Subject:
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlSubject"))).selectByIndex(1);
			 
			 //To select Sub-Category:
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlStandard"))).selectByIndex(1);
			 
			 //To select Organizer: 
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlOrganizer"))).selectByIndex(1);
			 
			 // To select Grade:
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlGrade"))).selectByIndex(1);
			 
			 //To select Standard Contains: 
			 type("//*[@id='QuestionBankStandards1_txtStandardContains']","CC.1.1.PK.A");
	    }
	    else
	    {
	    	//To click on Apply Standards
	    	click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyStandards']");
			Thread.sleep(2000);
			 // SwitchFrame()
			 WebElement frameElement1 = driver.findElement(By.name("MassEditStandards"));
			 driver.switchTo().frame(frameElement1);
			 
			 //To select Standard Type
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlStandardsType"))).selectByValue("1022");
			 
			 //To select Subject:
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlSubject"))).selectByIndex(1);
			 
			 //To select Sub-Category:
			 Thread.sleep(500);
			 new Select(driver.findElement(By.id("QuestionBankStandards1_cbddlStandard"))).selectByIndex(1);	
	    }
	    }
	    catch (Exception e)
		{
			
			System.out.println(e);	
			
		}
	}
		//To find a Assessment in the List
	    public void FindAssessmentName(String AssessmentName)
	    {
	    	try
	    	{
	    			
	    	//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click Manage assessment
			Thread.sleep(1000);
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
			
			//Fill Test name contains
			Thread.sleep(1000);
			type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']",AssessmentName);
			
			//To search the assessment
			click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
			
			Thread.sleep(1000);
			
			//To click edit assessment
			driver.findElement(By.id("ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment")).click();
			
			Thread.sleep(1000);
			if(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_Label1']")).size()>0)
			//To select the question(Check box)
			 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
	    	}
	    	 catch (Exception e)
			{
				
				System.out.println(e);	
				
			}
	    }
	    //**************************************************************************
	    public void Find_Standard_Through_Question_Builder() 
		{
			
		    try
		    {
				 
				 //To select Standard Type
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).selectByValue("1022");
				 
				 //To select Subject:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).selectByIndex(1);
				 
				 //To select Sub-Category:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard"))).selectByIndex(1);
				 
				 //To select Organizer: 
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer"))).selectByIndex(1);
				 
				 // To select Grade:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade"))).selectByIndex(1);
				 
		    }
		    catch (Exception e)
			{
				
				System.out.println(e);	
				
			}
		}
	}
