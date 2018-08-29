package CheckList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Functions.CreateANew_Assessment;
import Functions.CreateRuberic;
import Functions.Create_New_Assessment_Survay;
import Functions.addExhibit;
import Functions.addStandard;
import Library.BaseClassOne;
import Library.objectData;


public class QuestionBuilder extends BaseClassOne{
	
	private static final double Infinity = 0;
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	Create_New_Assessment_Survay survayQuestion=new Create_New_Assessment_Survay();
	CreateRuberic ruberic=new CreateRuberic();
	addStandard standared=new addStandard();
	addExhibit Exibit=new addExhibit();
	@Test(priority=1)
	public void One_Tittle_QuestionBuilder()
	{
		try
		{
			double  first=1246056;
			double 	second=	2233240;
			double  PriorMonth = first - second;
             
                  PriorMonth = PriorMonth / second;
                  PriorMonth = PriorMonth * 100;
                  PriorMonth = (PriorMonth == Infinity) ? 0 : PriorMonth;
              
                  System.out.println(PriorMonth);
			
			
			
			
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			Assessment.New_AssESSMENT(generateRandomData(),"Test");
			
			String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[1]/td/span");
			System.out.println(expected);
			Assert.assertEquals("Question Builder", expected);
			Logout();	
		}
	catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}

	}
	//**************************************************************************************
	@Test(priority=2)
	public void Two_assessment_name_in_the_top_left_is_correct()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			String Name=generateRandomData();
			Assessment.New_AssESSMENT(Name,"Test");
			
			//To click back to assessment
			//Thread.sleep(4000); 
			click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			//To Read assessment name
			//Thread.sleep(2000);
			waitFor("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			String AssName=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			
			Assert.assertEquals(AssName, Name);
			Logout();	
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//***************************************************************************************
	@Test(priority=3)
	public void  Three_Required_fields_are_enforced()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			String Name=generateRandomData();
			
			Assessment.New_AssESSMENT(Name,"Test");
			
			//Thread.sleep(5000);
			waitFor("//*[@id='ctl00_MainContent_ddlQuestionType']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
			
			//To clear library Name
			driver.findElement(By.xpath("//input[@id='ctl00_MainContent_cbLibraryName_Input']")).clear();
			//Thread.sleep(500);
			click("//input[@id='ctl00_MainContent_cbLibraryName_Input']");
			
			//To clear sub library Name
			driver.findElement(By.xpath("//input[@id='ctl00_MainContent_cbSubLibraryName_Input']")).clear();
			//Thread.sleep(500);
			click("//input[@id='ctl00_MainContent_cbSubLibraryName_Input']");
			// To Save the Question
		  	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSaveOnEdit']")).click();
			
			String Validation1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
			Assert.assertEquals(Validation1, "Please select a library.");
			
			String Validation2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
			Assert.assertEquals(Validation2, "Please select a sublibrary.");
			
			String Validation3=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[3]");
			Assert.assertEquals(Validation3, "Please Enter a question.");
			
			Logout();
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//************************************************************************************
	@Test(priority=4)
	public void Four_Check_Data_availability_in_All_drop_downs()
	{
		try
		{
	
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		String Name=generateRandomData();
		Assessment.New_AssESSMENT(Name,"Test");
		
		String expected=getValue("//*[@id='ctl00_MainContent_cbLibraryName_Input']");
		System.out.println(expected);
		Assert.assertEquals("4Sight", expected);
		
		String expected1=getValue("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']");
		System.out.println(expected1);
		Assert.assertEquals("4Sight", expected1);
		
		//To select data from the drop down ("Library Type")
	    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlLibraryType']"))).selectByIndex(1);
		//Read the data from the drop down
		Thread.sleep(1000);
		String selectedOption = new Select(driver.findElement(By.id("ctl00_MainContent_ddlLibraryType"))).getFirstSelectedOption().getAttribute("value");
		//Assert value 
		System.out.println(selectedOption);
		Assert.assertTrue(selectedOption.length()!=0);
		
		//To select data from the drop down ("Status")
	    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlStatus']"))).selectByIndex(1);
		//Read the data from the drop down
		Thread.sleep(1000);
		String selectedOption1 = new Select(driver.findElement(By.id("ctl00_MainContent_ddlStatus"))).getFirstSelectedOption().getAttribute("value");
		//Assert value 
		System.out.println(selectedOption1);
		Assert.assertTrue(selectedOption1.length()!=0);
		
		Logout();	
	}
	catch (Exception e)
	{
		System.out.println(" Failed!!!"+e);
		Assert.assertTrue(false);
	}
		
 }
	//*****************************************************************************************
	@Test(priority=5)
	public void Five_Check_Character_limit_in_Combo_boxes()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			Assessment.New_AssESSMENT(Name,"Test");
			
			//To fill the Default Library Name 
			type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","The temple is "
		    		+ "considered among the greatest temples in Kerala and among the "
		    		+ "greatest temples in Kerala and");
			  		
			//To fill the Default Sub-Library Name 
			type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","The temple is considered "
		  			+ "among the greatest temples in Kerala and treat well in site ");
			
			//Thread.sleep(2000);
			waitFor("#ctl00_MainContent_cbLibraryName_Input");
			String LibraryName=getValue("#ctl00_MainContent_cbLibraryName_Input");
			System.out.println(LibraryName.length());
			String subLibraryName=getValue("#ctl00_MainContent_cbSubLibraryName_Input");
			System.out.println(subLibraryName.length());
			
			//To verify the Library Name
			Assert.assertEquals(LibraryName.length(),50);
			
			//To Verify sub Library Name
			Assert.assertEquals(subLibraryName.length(),50); 
			
			Logout();	
			
		}

		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//***********************************************************************************
	@Test(priority=6)
	public void Six_Copyright_Pop_up_of_Library_Name()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			
			//To click the image "i"
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_MainContent_lnkCopyrightInformation")).click();
			
			//To switch the frame
			Thread.sleep(2000);
			WebElement frameElement = driver.findElement(By.name("ViewCopyright"));
			driver.switchTo().frame(frameElement);
			
			//Verify whether the Pop Up is displayed or not
			Assert.assertTrue(driver.findElement(By.xpath("//input[@id='btnClose']")).isDisplayed());
			
			//To close the pop up
			click("//*[@id='btnClose']");
			
			driver.switchTo().defaultContent();
			
			Logout();
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//********************************************************************************************
	@Test(priority=7)
	public void Seven_All_data_is_retained_after_selection()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			
			// To Fill the questions.
			Thread.sleep(5000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("True or False");
			Thread.sleep(1000);
			
			//To check Value persist in the Drop down (Question Type)
			String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).getFirstSelectedOption().getText();
			Assert.assertEquals(selectedOption,"True or False");	
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//***********************************************************************************************
	@Test(priority=8)
	public void Eight_Duplicate_answer_choices()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			
			Thread.sleep(3000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
			Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 1");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
		   
		   //To click the answer 
		    driver.findElement(By.xpath("//*[@id='ctl00_MainContent_grdAnswers_ctl05_rdoCorrectAnswer']")).click();
		      
		  	// To Save the Question
			click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");	
			
			String Duplicate=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
			Assert.assertEquals(Duplicate,"Duplicate choices found.");	
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//************************************************************************************
	@Test(priority=9)
	public void Nine_Must_select_a_Correct_Answer ()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			Thread.sleep(3000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
			Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
		   
		  	// To Save the Question
			click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");	
			
			String Duplicate=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
			Assert.assertEquals(Duplicate,"Please select a correct answer.");
				
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	
	//**********************************************************************************************
	@Test(priority=10)
	public void Ten_assessment_name_in_the_top_left_is_correct()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			
			Thread.sleep(3000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
			
			//To delete first answer text box
			Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_grdAnswers_ctl02_imgDeleteImage']");
			
			//To delete second answer text box
			Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_grdAnswers_ctl02_imgDeleteImage']");
			
			//To delete Third answer text box
			Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_grdAnswers_ctl02_imgDeleteImage']");
			
			Thread.sleep(2000);
			String DeleteTextBox=getText("//*[@id='ctl00_MainContent_lblMsg']/span");
			Assert.assertEquals(DeleteTextBox,"There must be at least two choices for multiple choice questions");	
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//*************************************************************************************************
	@Test(priority=11)
	public void Elevan_Qn_saving_with_apostrophe()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			String Name=generateRandomData();
			//To create new assessment
			Assessment.New_AssESSMENT(Name,"Test");
			
			Thread.sleep(5000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("'Qustions 1'");
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
			Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("'Answer 1'");
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("'Answer 2'");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("'Answer 3'");
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("'Answer 4'");
		    //To select the answer
		    driver.findElement(By.xpath("//*[@id='ctl00_MainContent_grdAnswers_ctl05_rdoCorrectAnswer']")).click();
		    
		  	// To Save the Question
			click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
			Thread.sleep(5000);
			//To click next Questions.
			click("//*[@id='ctl00_MainContent_btnNextQuestionTop']");
			
			//To click back to assessment
			 Thread.sleep(3000); 
			 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			 
			 Thread.sleep(2000);
			 String DeleteTextBox=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_lblQuestionType']");
			 Assert.assertEquals(DeleteTextBox,"Multiple Choice");	
				
			 
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}	
		//*********************************************************************************************
		@Test(priority=12)
		public void Twalve_All_Qn_Types()
		{
			try
			{
				//Supertent Login
				 login(Supertent_Login_id,Supertent_Login_Password);
				 
				 String Name=generateRandomData();
				 //To create new assessment
				 Assessment.New_AssESSMENT(Name,"Test");
				 Assessment.QT_Short_Response();
				 Assessment.QT_Pick_Two();
				 Assessment.QT_Extended_Response_Full_Rubic();
				 Assessment.QT_Multiple_Choice();
				 Assessment.QT_True_or_False();
				 Assessment.QT_Check_All_That_Apply();
				 Assessment.QT_Essay();
				 Assessment.QT_Check_All_That_True();
				 
				 //To click back to assessment
				 Thread.sleep(3000); 
				 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				 
				 Thread.sleep(2000);
				 //To verify the question Short Response.
				 String Question1=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_lblQuestionType']");
				 Assert.assertEquals(Question1,"Short Response");	
				 
				//To verify the question  Pick Two .
				 String Question2=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl04_lblQuestionType']");
				 Assert.assertEquals(Question2,"Pick Two");
				 
				//To verify the question  Extended Response
				 String Question3=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl05_lblQuestionType']");
				 Assert.assertEquals(Question3,"Extended Response");
				 
				//To verify the question Multiple Choice.
				String Question4=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl06_lblQuestionType']");
				Assert.assertEquals(Question4,"Multiple Choice");
				
				//To verify the question True or False.
				 String Question5=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl07_lblQuestionType']");
				 Assert.assertEquals(Question5,"True or False");
				 
				//To verify the question Check All That Apply.
				 String Question6=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl08_lblQuestionType']");
				 Assert.assertEquals(Question6,"Check All That Apply");	
				 
				//To verify the question  Essay.
				 String Question7=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl09_lblQuestionType']");
				 Assert.assertEquals(Question7,"Essay");	
				 
				//To verify the question Check All That Are True.
				 String Question8=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl10_lblQuestionType']");
				 Assert.assertEquals(Question8,"Check All That Are True");	
				
				 //To validate total count
				 String expected=driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl10_Label1")).getText();
				 Assert.assertEquals("8", expected);
				//Supertent Logout
				 Logout();
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//*************************************ERROR*******************************************************
		@Test(priority=13)
		public void Thirteen_Qn_Saving_with_image()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To create new assessment
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[contains(@id,'btnScoring')]")).click();
				Thread.sleep(2000);
				type("//*[@id='txtScoreRubic_0']","1");
				type("//*[@id='txtScoreRubic_1']","2");
				Thread.sleep(1000);
				//To click image button
				click("//*[@id='ctl00_MainContent_txtQuestionTextTop']/div/ul[2]/li[4]/a");
				
				SwitchFrameName("Window");
				
				 
				
				//Click on upload button.
				click("//*[@id='RadFileExplorer1_toolbar']/ul/li[7]/span/span[2]");
				
				//To click select button
				Thread.sleep(2000);
				  WebElement UploadImg = driver.findElement(By.cssSelector("#RadFileExplorer1_asyncUpload1file0"));
				  UploadImg.click();
				  WebElement frame =driver.switchTo().activeElement();
				  frame.sendKeys("C:\\TCIG3.PNG");
				  
				//driver.findElement(By.cssSelector("#RadFileExplorer1_asyncUpload1file0")).click();
				
				//driver.findElement(By.xpath("//input[contains(@id,'asyncUpload1file3')]")).click();
				//click("//*[@id='RadFileExplorer1_asyncUpload1file3']");
				
			/*	StringSelection ss = new StringSelection("C:\\TCIG3.PNG");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			    //imitate mouse events like ENTER, CTRL+C, CTRL+V
			    Robot robot = new Robot();
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_ENTER);
			    robot.keyRelease(KeyEvent.VK_ENTER);  */
				
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Qustions 1");
				
				driver.findElement(By.xpath("//input[contains(@id,'btnSaveQuestion')]")).click();
				Thread.sleep(5000); 
				 
				// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
				Thread.sleep(5000);
				//To click next Questions.
				click("//*[@id='ctl00_MainContent_btnNextQuestionTop']");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//********************************************************************************************
		@Test(priority=14)
		public void fourteen_Clicks_on_The_Search_Item_Bank_button()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To create new assessment
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To click search item bank
				Thread.sleep(4000);
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionBankQuestions']");
				
				//To validate total count
				 Thread.sleep(5000);
				 String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[1]/td/span");
				 Assert.assertEquals("Question Bank Search", expected);
				 
				//Supertent Logout
				 Logout();
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
	
		//***************************************************************************
		@Test(priority=15)
		public void Fifteen_Check_Answer_Key_Print()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To create new assessment
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(4000);
				//To click Student Test
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkPriviewAssesment']");
				
				//To verify the Print OE to Word
				Thread.sleep(1000);
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkOeWord']")).isEnabled());
				
				//To verify the Print OE to PDF
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkOePdf']")).isEnabled());
				
				//To verify the Print word
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkWord']")).isEnabled());
				
				//To verify the Print PDF
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkPdf']")).isEnabled());
				
				//Supertent Logout
				 Logout();
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}	
		//******************************************************************************************
		@Test(priority=17)
		public void Seventeen_Check_Qn_Printing()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To create new assessment
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(4000);
				//To click answer key
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkAnswerKey']");
				
				//To verify the Print Condensed Word
				Thread.sleep(1000);
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkCondensedWord']")).isEnabled());
				
				//To verify the Print Condensed PDF
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkCondensedPDF']")).isEnabled());
				
				//To verify the Print word
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkWord']")).isEnabled());
				
				//To verify the Print PDF
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_linkPdf']")).isEnabled());
				
				//Supertent Logout
				Logout();
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//*********************************************************************************************
		@Test(priority=18)
		public void Eighteen_Preview_Online_Test()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				Assessment.QT_Essay();
				
				//To validate Text Exibit Pop up
				Thread.sleep(3000);
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkOnlinePreview']");
				 
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));
				Thread.sleep(1000);
				driver.navigate().refresh();
				String title=driver.getTitle();
				System.out.println(title);
				Assert.assertEquals("Online Test", driver.getTitle());
				driver.close();
			    driver.switchTo().window(tabs2.get(0));	
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//*********************************************************************************************
		@Test(priority=19)
		public void Nineteen_Text_Exhibit_Popup_Window()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To create new assessment
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(4000);
				//To click Test Exibits
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkAddExhibit']");
				
				//To switch the frame
				SwitchFrameName("TestExhibits");
				
				//To validate Text Exibit Pop up
				 Thread.sleep(3000);
				 String expected=getText("//*[@id='divShowTestExhibits']/table/tbody/tr[1]/td");
				 System.out.println(expected);
				 Assert.assertEquals("Test Exhibits", expected);
				 
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//***************************************************************************************
		@Test(priority=20)
		public void twenty_Text_Exhibit_Popup_Window()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				Assessment.QT_Essay();
				//standard.FindAssessmentName();
				Thread.sleep(4000);
				
				//Back to Assessment
				 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	  
				 
				 //To select the question(Check box)
				 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
				 
				 //To set size of the browser is 90%
				 Robot robot = new Robot();
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_MINUS);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyRelease(KeyEvent.VK_MINUS);
				
				 //To call create exhibit
				 String ExibitName=generateRandomData();
				 Exibit.create_Exhibit(ExibitName);
				 
				 //To call Test exhibits
				 click("//*[@id='ctl00_MainContent_lnkAddExhibit']");
				 
				 //To switch the frame
				 SwitchFrameName("TestExhibits");
				 
				 //To validate he drop down
				 String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ddlSearchResult']"))).getFirstSelectedOption().getText();
				
				 Assert.assertEquals(selectedOption,ExibitName); 
				 //To validate the content
				 Thread.sleep(3000);
				 String expected=getText("//*[@id='cnrExhibit']/div");
				 Assert.assertTrue(expected.length()!=0);	
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				String Str=e.getMessage();
				Assert.assertTrue(false);
	
			}
		}
		//*************************************************************************************
		@Test(priority=21)
		public void Twentyone_electing_a_different_exhibit()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				Assessment.QT_Essay();
				//standard.FindAssessmentName();
				Thread.sleep(4000);
				
				//Back to Assessment
				 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	  
				 
				 //To select the question(Check box)
				 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
				 
				 //To set size of the browser is 90%
				 Robot robot = new Robot();
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_MINUS);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyRelease(KeyEvent.VK_MINUS);
				
				 //To call create exhibit
				 String ExibitName=generateRandomData();
				 Exibit.create_Exhibit(ExibitName);
  

				 //To select the question(Check box)
				 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
				 
				 String ExibitName1=generateRandomData();
				 Exibit.create_Exhibit(ExibitName1);
				 
				 //To call Test exhibits
				 click("//*[@id='ctl00_MainContent_lnkAddExhibit']");
				 
				 //To switch the frame
				 SwitchFrameName("TestExhibits");
				 
				 //To validate he drop down
				 new Select(driver.findElement(By.xpath("//*[@id='ddlSearchResult']"))).selectByIndex(0);;
	 
				 //To validate the content
				 Thread.sleep(2000);
				 String expected=getText("//*[@id='cnrExhibit']/div");
				 Assert.assertTrue(expected.length()!=0);
				 
				 //To validate he drop down
				 new Select(driver.findElement(By.xpath("//*[@id='ddlSearchResult']"))).selectByIndex(1);;
	 
				 //To validate the content
				 Thread.sleep(2000);
				 String expected1=getText("//*[@id='cnrExhibit']/div");
				 Assert.assertTrue(expected1.length()!=0);
				 
				 
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//*************************************************************************************************
		@Test(priority=22)
		public void Twentytwo_Finalize_Assessment()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				Assessment.QT_Essay();
				
				//standard.FindAssessmentName();
				Thread.sleep(4000);
						 
				//Back to Assessment
				click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				
				//To select the question(Check box)
				click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
				
				//To select Finalize Assessment
				Thread.sleep(2000);
				click("//*[@id='ctl00_MainContent_lnkFinalize']");
				
				//To check the validation message and Visibility of the edit button
		        Thread.sleep(2000);
		        Assert.assertTrue(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']")).isEmpty());
		        
		        Assert.assertTrue(driver.getPageSource().contains("You have successfully finalized the assessment"));
		        
		        //Logout();
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}

		}
		@Test(priority=23)
		public void TwentyThree_Button_functional_after_Save_Qn()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To verify Question Standards is disabled
				Assert.assertFalse(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']")).isEnabled());
				
				//To verify Question Attributes is disabled
				Assert.assertFalse(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']")).isEnabled());
				
				//To verify Link Exhibit is disabled
				Assert.assertFalse(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ucSubmenu_lnkLinkExhibit']")).isEnabled());
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		
//****************************************************************Question Standards************************************************
		@Test(priority=24)
		public void TwentyFour_Question_Standards()
		{
			try
			{
				//Supertent Login
				 login(Supertent_Login_id,Supertent_Login_Password);
				 
				 String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				
				//To Saved Favorites: 
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_ddlFavorites")).isDisplayed());
				
				//To verify Standard Type
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType")).isDisplayed());
				
				
				//To verify Subject:
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject")).isDisplayed());
				
				//To verify Sub-Category:
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard")).isDisplayed());
				
				//To verify Organizer: 
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer")).isDisplayed());
				
				
				// To verify Grade:
				Assert.assertTrue(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade")).isDisplayed());
				
				 
				//To verify Standard Contains: 
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_txtStandardContains']")).isDisplayed());
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		
		//************************************************************************************************************
		@Test(priority=25)
		public void Twentyfive_Standards_Type_drop_down_menu()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				
				//To select Standard Type
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).selectByValue("1022");
				 
				//To Read the selected Value
				String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).getFirstSelectedOption().getText();
				
				System.out.println("Data is "+selectedOption);
				//To verify the value is exists in drop down
				Assert.assertTrue(selectedOption.length()!=0);
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//**********************************************************************************************************************
		@Test(priority=26)
		public void TwentySix_Subject_drop_down_menu_contains_data ()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				
				//To select Standard Type
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).selectByValue("1022");
				 
				//To select Subject:
				Thread.sleep(500);
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).selectByIndex(1);
				
				//To Read the selected Value
				String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).getFirstSelectedOption().getText();
				
				//To verify the value is exists in drop down
				System.out.println("Data is "+selectedOption);
				Assert.assertTrue(selectedOption.length()!=0);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false);
			}
		}
		//***************************************************27******************************************************************
		@Test(priority=27)
		public void TwentySeven_Sub_Category_Organizer_and_Grade_do_not_contain_data()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
			
				//To verify the value is exists in drop down
				Thread.sleep(2000);
				List<WebElement> elements = driver.findElements(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard"));
				System.out.println(elements.get(0)+"  "+elements.size());
				Assert.assertTrue(elements.size() <= 1, "Sub-Category Failed");
				
				//To verify the value is exists in drop down
				Thread.sleep(2000);
				List<WebElement> elements1 = driver.findElements(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer"));
				System.out.println(elements1.get(0)+"  "+elements1.size());
				Assert.assertTrue(elements1.size() <= 1, "Organizer Failed");
				
				//To verify the value is exists in drop down
				Thread.sleep(2000);
				List<WebElement> elements2 = driver.findElements(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade"));
				System.out.println(elements2.get(0)+"  "+elements2.size());
				Assert.assertTrue(elements2.size() <= 1, "Grade Failed");
				 
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//************************************************28************************************************************
		@Test(priority=28)
		public void TwentyEight_Standard_Contains_field_has_a_character_limit_of_100()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");	
				
				//To select Standard Contains: 
				 type("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_txtStandardContains']","Historically, letters have existed "
				 															+ "from the time of ancient India, ancient Egypt and Sumer,"
				 															+ " through Rome, Greece and China, up to the present day. "
				 															+ "During the seventeenth and eighteenth century, letters were"
				 															+ " used to self-educate.seban test text");
				 Thread.sleep(1000); 
				 
				 String Standard=getValue("#ctl00_PlcPageCategory_ucQuestionStandards_txtStandardContains");
				 System.out.println(Standard.length());
				 Assert.assertTrue(Standard.length()<=100,"Size limit is exceeded");
				 
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//********************************************************29****************************************************************
		@Test(priority=29)
		public void TwentyNine_Options_Drop_Down_Menus()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(4000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				
				//To select the option
				Thread.sleep(2000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				
				//To verify the Search option
				Thread.sleep(1000); 
				String  expected=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[1]/span");
				Assert.assertEquals("Search", expected,"Search option is not found");
				
				//To verify the New Question
				String  expected1=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[2]/span");
				Assert.assertEquals("New Question", expected1,"New Question is not found");
				
				//To verify the Make this filter a favorite
				String  expected2=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[3]/span");
				Assert.assertEquals("Make this filter a favorite", expected2,"Make this filter a favorite is not found");
				
				//To verify the Browse standards tree
				String  expected3=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[5]/span");
				Assert.assertEquals("Browse standards tree", expected3,"Browse standards tree is not found");
				
				//To verify the Add checked search standards
				String  expected4=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[7]/span");
				Assert.assertEquals("Add checked search standards", expected4,"Add checked search standards is not found");
				
				//To verify the Remove checked selected standards
				String  expected5=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[8]/span");
				Assert.assertEquals("Remove checked selected standards", expected5,"Remove checked selected standards is not found");		
				
			}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}	
		//***********************************************************30*********************************************************
		@Test(priority=30)
		public void Thirty_search_filters_in_the_Search_Result_grid()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[1]/span");
               
				Thread.sleep(3000);
				String expected=getText("//*[@id='contextContainer']/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/span");
				Assert.assertEquals("Search Result", expected);
					
				Assert.assertTrue(isDisplayed("//*[@id='contextContainer']/tbody/tr[3]/td[1]"),"Grid is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']"),"Check box is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgStandards_ctl00_ctl04_btnGridSelect']"),"Add button is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgStandards_ctl00__0']/td[4]/a")," grid code is not displayed");
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***************************************************32*******************************************************************
		@Test(priority=32)
		public void ThirtyTwo_Make_this_filter_a_favorite()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[3]/span");
				
				Thread.sleep(1000);
			
				//To Verify the Text box
				Assert.assertTrue(isEnabled(".rwPromptInput.radPreventDecorate"),"Text box is not Avialable");
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//****************************************33***************************************************************
		@Test(priority=33)
		public void ThirtyTree_character_limit_of_200()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[3]/span");
				
				Thread.sleep(1000);
				//To input the content (the favorite name) into the Textbox.
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".rwPromptInput.radPreventDecorate")).sendKeys("Would love for the feedback to be on a separate page"
																									+ " so it doesn't have to load all comments when you open the site."
																									+ "Other than that it fills my daily use pretty much perfectly (Y) Love"
																									+ " the clean gui.Would love for the feedback to be on a separate page so");
				//To read the values(Count) from the text box.
				String Standard=getValue("input.rwPromptInput.radPreventDecorate");
				System.out.println(Standard.length());
				Assert.assertTrue(Standard.length()<=200,"Size limit is exceeded");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//************************************************************34***********************************************************
		@Test(priority=34)
		public void Thirtyfour_saves_the_correct_search_filters()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[3]/span");
				
			
				//To input the content (the favorite name) into the Textbox.
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".rwPromptInput.radPreventDecorate")).sendKeys("Would love for");
				//To click on ok Button																						
				driver.findElement(By.cssSelector(".rwOkBtn")).click();
				
				Thread.sleep(3000);
				
				String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).getFirstSelectedOption().getText(); 
				Assert.assertEquals("STATE: PA Common Core Standards (2012)", selectedOption);
				
				Thread.sleep(1000);
				String selectedOption1 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).getFirstSelectedOption().getText(); 
				Assert.assertEquals("Academic Standards for English Language Arts", selectedOption1);
				
				String selectedOption2 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard"))).getFirstSelectedOption().getText(); 
				Assert.assertEquals("Foundational Skills - Students gain a working knowledge of concepts of print, alphabetic principle, and other basic conventions.", selectedOption2);
				
				String selectedOption3 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer"))).getFirstSelectedOption().getText(); 
				Assert.assertEquals("Book Handling", selectedOption3);
				
				String selectedOption4 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade"))).getFirstSelectedOption().getText(); 
				Assert.assertEquals("Preschool", selectedOption4);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*************************************************35****************************************************************
		@Test(priority=35)
		public void Thirtyfive_Browse_standards_tree()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[5]/span");
				
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
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		
		//****************************************************36**********************************************************
		@Test(priority=36)
		public void ThirtySix_Standards_Type_contains_data()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000); 
				//To select Standard Type
				Thread.sleep(3000);
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).selectByValue("1022");
				Thread.sleep(2000);
				String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).getFirstSelectedOption().getText();
				System.out.println(selectedOption);
				Assert.assertNotNull(selectedOption, "Standard Type Failed");		
			}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//********************************************************37********************************************************
		@Test(priority=37)
		public void ThirtySeven_standards_type_is_selected_then_List_of_drop_downs_have_data()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				standared.Find_Standard_Through_Question_Builder();
				 
				 //To select Standard Type
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).selectByValue("1022");
				 String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandardsType"))).getFirstSelectedOption().getText();
				 System.out.println(selectedOption);
				 Assert.assertNotNull(selectedOption, "Standard Type Failed");	
				 
				 //To select Subject:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).selectByIndex(1);
				 String selectedOption1 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlSubject"))).getFirstSelectedOption().getText();
				 System.out.println(selectedOption1);
				 Assert.assertNotNull(selectedOption1, "Subject Failed");	
				 
				 //To select Sub-Category:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard"))).selectByIndex(1);
				 String selectedOption2 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlStandard"))).getFirstSelectedOption().getText();
				 System.out.println(selectedOption2);
				 Assert.assertNotNull(selectedOption2, "Sub-Category Failed");	
				 
				 //To select Organizer: 
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer"))).selectByIndex(1);
				 String selectedOption3 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlOrganizer"))).getFirstSelectedOption().getText();
				 System.out.println(selectedOption3);
				 Assert.assertNotNull(selectedOption3, "Organizer Failed");	
				 
				 // To select Grade:
				 Thread.sleep(500);
				 new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade"))).selectByIndex(1);
				 String selectedOption4 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionStandards_cbddlGrade"))).getFirstSelectedOption().getText();
				 System.out.println(selectedOption4);
				 Assert.assertNotNull(selectedOption4, "Organizer Grade");	
				 
			}
			
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//********************************************************38****************************************************
		@Test(priority=38)
		public void ThirtyEight_Add_checked_search_standards_and_Remove_checked_standards()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				  
				//To click on Apply Standards
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAlign']");
				Thread.sleep(2000);
				
				//To select one standard.
				check("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[7]/span");
				
				Thread.sleep(2000);
				//To verify selected standard is available in the Added Standards 
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgSelectedStandards_ctl00__0']/td[4]/a"), "Add checked search standards is not qworking");
				String expected=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_lblStandardMsg']");
				//To verify the message
				Assert.assertEquals("Assigned selected standards to the question", expected);
				
				//To check the standard
				check("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgSelectedStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
				
				//To check the standard from Added Standards(Purpose Remove)
				Thread.sleep(2000);
				check("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgSelectedStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_SplitButton']");
				Thread.sleep(1000); 
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_RadContextMenu1_detached']/ul/li[8]/span");
				
				Thread.sleep(4000);
				//To verify standard is removed or not.
				
				String expected1=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_lblStandardMsg']");
				//To verify the message
				Assert.assertEquals("Selected standards removed successfully.", expected1);
		
				String expected2=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionStandards_rgSelectedStandards_ctl00']/tbody/tr/td/div");
				//To verify the message
				Assert.assertEquals("No standards found to display.", expected2);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//**********************************************39********************************************************
		@Test(priority=39)
		public void ThirtyNine_New_Question_button_functions_correctly()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
				Thread.sleep(5000);
				
				//To validate the "Next Question" button
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_btnNextQuestionTop']"), "Next Button is Not Displayed");
				
				//To click next Questions.
				click("//*[@id='ctl00_MainContent_btnNextQuestionTop']");
				
				 //To click back to assessment
				 Thread.sleep(3000); 
				 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				 
				 //To verify whether the Assessment created or not 
				 String expected=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_lblQuestionType']");
				 Assert.assertEquals("True or False", expected);	
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
//************************************************Question Attributes*************************************************************************************************************************	
		@Test(priority=40)
		public void forty_Edit_Attributes_Grades_and_Subject()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//To Click on Question Attributes
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				//To verify the drop down "Grade" Availability
				Thread.sleep(2000);
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades']/span"),"Grade is not avilable");
				
				//To verify the drop down "Subject" Availability
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects']/span"),"Subject is not avilable");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***********************************************************41************************************************************
		@Test(priority=41)
		public void FortyOne_check_all_option_a_reset_option_and_they_allow_multi_select()
		{
			try
			{
				forty_Edit_Attributes_Grades_and_Subject();
				//To click drop down "grade"
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades']/span/button");
				
				
				//To verify the option for check all 
				Thread.sleep(1000);
				Assert.assertTrue(isEnabled("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades_DropDown']/div/ul/li[2]/label/input"),"check All is not available");
				
				//To verify the option for Reset 
				Assert.assertTrue(isEnabled("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades_DropDown']/div/ul/li[1]/label/input"),"check All is not available");

				for(int i=4;i<=8;i++)
				{
				//To check the options from the drop down(1)
				check("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades_DropDown']/div/ul/li["+i+"]/label/input");
				
				}
				//To verify the option for multiple check box 
				String expected=getValue("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbGrades_Input']");
				System.out.println(expected);
				Assert.assertEquals("5 items checked",expected);
				
				//To click the drop down Subject
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects']/span/button");	
				
				//To verify the option for check all 
				Thread.sleep(2000);
				Assert.assertTrue(isEnabled("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects_DropDown']/div/ul/li[2]/label/input"),"check All (Subject) is not available");
				
				//To verify the option for Reset 
				Assert.assertTrue(isEnabled("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects_DropDown']/div/ul/li[1]/label/input"),"Reset(Subject) is not available");

				for(int i=4;i<=8;i++)
				{
				//To check the options from the drop down
				check("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects_DropDown']/div/ul/li["+i+"]/label/input");
				
				}
				//To verify the option for multiple check box 
				String expected1=getValue("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_rcbSubjects_Input']");
				System.out.println(expected1);
				Assert.assertEquals("5 items checked",expected1);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*******************************************************43***************************************************
		@Test(priority=43)
		public void FortyThree_Tag_with_the_buttons_Add_Tag_and_Clear_Tags()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//To Click on Question Attributes
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				//To verify the visibility of the Tag Text box
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_txtQuestionTag']"),"Tag Text box is not displayed");
				
				//To verify the visibility of the Add Tag button.
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_btnQuestionTageSave']"),"Add Tag button is not displayed");

				//To verify the visibility of the clear Tag button.
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_btnClearTag']"),"clear Tag button is not displayed");

			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
	//****************************************************44*************************************************************************
		@Test(priority=44)
		public void FortyFour_Tag_field_has_a_character_limit_of_200()
		{
			try
			{
				FortyThree_Tag_with_the_buttons_Add_Tag_and_Clear_Tags();
				
				//To fill the tag field
				type("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_txtQuestionTag']","akhiljithca@vofoxsolutionsA while back I needed to "
																							+ "count the amount of letters that a piece of text in an "
																							+ "email template had (to avoid passing any character limitsUnfortunately,"
																							+ " I could not think of a quick way to do so on ");
				//To read the values(Count) from the text box.
				String Standard=getValue("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_txtQuestionTag']");
				System.out.println(Standard.length());
				Assert.assertTrue(Standard.length()<=200,"Size limit is exceeded");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//*****************************************************45***************************************************************
		@Test(priority=45)
		public void FortyFive_Tag_field_has_a_character_limit_of_200()
		{
			try
			{
				FortyThree_Tag_with_the_buttons_Add_Tag_and_Clear_Tags();
				
				//To fill the tag field
				type("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_txtQuestionTag']","Qa Text");
				
				//To click on add tag button
				click ("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_btnQuestionTageSave']");
				Thread.sleep(2000);
				
				//To verify the add tag alert message
				String expected1=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_lblMessage']");
				System.out.println(expected1);
				Assert.assertEquals("The tag has been created and successfully assigned to the question(s)",expected1);
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_lstTags']"),"Tag is not displayed");
				Thread.sleep(2000);
				
				//To click on clear tag button
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_btnClearTag']");
				
				
				//To verify the add tag alert message
				Thread.sleep(2000);
				String expected2=getText("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_lblMessage']");
				System.out.println(expected2);
				Assert.assertEquals("The tag has been successfully removed from the question(s)",expected2);
				
				boolean exists = driver.findElements( By.xpath("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_lstTags']") ).size() == 0;
				Assert.assertTrue(exists,"Tag is not removed");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//**************************************************************46**************************************************************
		@Test(priority=46)
		public void FortySix_Other_Attributes_Webb_Cognitive_Bloom_and_Difficulty()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//To Click on Question Attributes
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				//To verify the visibility of the Drop down Webb's Cognitive
				Thread.sleep(2000);
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive']"),"Drop down Webb's Cognitive is not displayed");
				
				//To verify the visibility of the drop down Bloom's
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms']"),"drop down Bloom's is not displayed");

				//To verify the visibility of the drop down Difficulty
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_btnClearTag']"),"drop down Difficulty is not displayed");

				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		
		//*******************************************************************47****************************************************
		@Test(priority=47)
		public void FortySeven_menus_contain_data_and_have_a_reset_option()
		{
			try
			{
				FortySix_Other_Attributes_Webb_Cognitive_Bloom_and_Difficulty();
				
				//To validate options in Webb's Cognitive(Reset)
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive"))).selectByVisibleText("Reset");
				Thread.sleep(500);
				String selectedOption = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive"))).getFirstSelectedOption().getText();
				Assert.assertEquals("Reset",selectedOption);
				
				//Drop down must contain Data.
				Select Dropdown = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive")));
				List<WebElement>Dropdownsize = Dropdown.getOptions();
				Assert.assertNotNull(Dropdownsize,"Drop down has no value");
				

				//To validate options in  Bloom's(Reset)
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms"))).selectByVisibleText("Reset");
				Thread.sleep(500);
				String selectedOption1 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms"))).getFirstSelectedOption().getText();
				Assert.assertEquals("Reset",selectedOption1);
				
				//Drop down must contain Data.
				Select Dropdown1 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms")));
				List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
				Assert.assertNotNull(Dropdownsize1,"Drop down has no value");
				
				//To validate options in   Difficulty(Reset)
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty"))).selectByVisibleText("Reset");
				Thread.sleep(500);
				String selectedOption2 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty"))).getFirstSelectedOption().getText();
				Assert.assertEquals("Reset",selectedOption2);
				
				//Drop down must contain Data.
				Select Dropdown2 = new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty")));
				List<WebElement>Dropdownsize2 = Dropdown2.getOptions();
				Assert.assertNotNull(Dropdownsize2,"Drop down has no value");
				
				
		}
			
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}	
	}
	//***************************************************************************48***********************************************
		@Test(priority=47)
		public void FortyEight_menus_contain_data_and_have_a_reset_option()
		{
			try
			{	
				FortySix_Other_Attributes_Webb_Cognitive_Bloom_and_Difficulty();
				
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive"))).selectByIndex(3);
				
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms"))).selectByIndex(3);
				
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty"))).selectByIndex(3);
				
				//To click on options
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_SplitButton']/span[1]/span");
				Thread.sleep(500);
				//click on save Attribute
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[1]/span");
				
				//click on back to assessment
				Thread.sleep(2000);
				click("//*[@id='ctl00_PlcPageCategory_ucSubmenu_btnBack']");
				
				//To verify the Other Attributes: in edit assessment
				Assert.assertTrue(driver.getPageSource().contains("Moderate"),"Webb s: Moderate is not added");
				Assert.assertTrue(driver.getPageSource().contains("Understanding/Comprehension"),"Bloom's: Understanding/Comprehension is not added");
				Assert.assertTrue(driver.getPageSource().contains("Medium"),"Difficulty: Medium is not added");
				
				//To click on edit button
				click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']");
				
				// To click on Question Attributes.
				Thread.sleep(4000);
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				
				Thread.sleep(2000);
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive"))).selectByVisibleText("Reset");;
				
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms"))).selectByVisibleText("Reset");
				
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty"))).selectByVisibleText("Reset");
				
				
				//To click on options
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_SplitButton']/span[1]/span");
				Thread.sleep(500);
				//click on save Attribute
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[1]/span");
				
				//click on back to assessment
				Thread.sleep(3000);
				click("//*[@id='ctl00_PlcPageCategory_ucSubmenu_btnBack']");
				
				//To verify the Other Attributes: not in edit assessment
				Thread.sleep(2000);
				Assert.assertFalse(driver.getPageSource().contains("Moderate"),"Webb s: Moderate is not removed");
				Assert.assertFalse(driver.getPageSource().contains("Understanding/Comprehension"),"Bloom's: Understanding/Comprehension is not removed");
				Assert.assertFalse(driver.getPageSource().contains("Medium"),"Difficulty: Medium is not removed");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//*******************************************************49**************************************************************
		@Test(priority=49)
		public void FortyNine_Save_Attributes_and_New_Question()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//To Click on Question Attributes
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				//To verify the visibility of the Drop down Webb's Cognitive
				Thread.sleep(2000);
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_SplitButton']/span[1]");
				Thread.sleep(2000);
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[1]/span"),"Save Attributed is not diaplayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[2]/span"),"New Question is not diaplayed");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//***************************************************************50************************************************************
		@Test(priority=50)
		public void Fifty_Save_Attributes_and_New_Question()
		{
			try
			{
				FortySix_Other_Attributes_Webb_Cognitive_Bloom_and_Difficulty();
				
				//To select the drop down from Webb's Cognitive
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlWebbsCognitive"))).selectByIndex(3);
				
				//To select the drop down from   Bloom's
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlBlooms"))).selectByIndex(3);
				
				//To select the drop down from  Difficulty
				new Select(driver.findElement(By.id("ctl00_PlcPageCategory_ucQuestionAttributes_ddlDifficulty"))).selectByIndex(3);
				
				//To click on options
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_SplitButton']/span[1]/span");
				Thread.sleep(500);
				//click on save Attribute
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[1]/span");
				
				//click on back to assessment
				Thread.sleep(2000);
				click("//*[@id='ctl00_PlcPageCategory_ucSubmenu_btnBack']");
				
				//To verify the Other Attributes: in edit assessment
				Assert.assertTrue(driver.getPageSource().contains("Moderate"),"Webb s: Moderate is not added");
				Assert.assertTrue(driver.getPageSource().contains("Understanding/Comprehension"),"Bloom's: Understanding/Comprehension is not added");
				Assert.assertTrue(driver.getPageSource().contains("Medium"),"Difficulty: Medium is not added");
				
				//To click on edit button
				click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']");
				
				// To click on Question Attributes.
				Thread.sleep(4000);
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkQuestionAttributes']");
				
				//To click on options
				Thread.sleep(2000);
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_SplitButton']/span[1]");
				Thread.sleep(500);
				//click on save Attribute
				click("//*[@id='ctl00_PlcPageCategory_ucQuestionAttributes_RadContextMenu1_detached']/ul/li[2]/span");
				
				//To verify the Navigation is proper way(Question Builder)
				Thread.sleep(3000);
				String selectedOption =getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[1]/td/span");
				Assert.assertEquals("Question Builder",selectedOption);
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
//*******************************************Link Exhibit***************************************************************************************************
		//****************************************51*************************************************************
		@Test(priority=51)
		public void FiftyOne_Search_Exhibits_pop_up_menu()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//click on Exhibit button
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkLinkExhibit']");
				
				SwitchFrameName("SearchExhibit");
				
				//To Verify the pop up 
				Thread.sleep(3000);
				String Standard=getText("//*[@id='ctl00_MainContent_lblHeader']");
				Assert.assertEquals(Standard,"Question Link Mode");
				
				//To click on add new exhibit
				click("//*[@id='ctl00_MainContent_hplAddEditViewExhibit']");
				
				SwitchFrameName("AddExhibit");
				
				//To Verify the pop up 
				Thread.sleep(3000);
				String Standard2=getText("//*[@id='tblEditExhibit']/tbody/tr[1]/td/table/tbody/tr[1]/td");
				Assert.assertEquals(Standard2,"Add New Exhibit");				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
		//*********************************************52*********************************************************
		@Test(priority=52)
		public void FiftyTwo_Search_Elements()
		{
			try
			{
				FiftyOne_Search_Exhibits_pop_up_menu();
				
				//To verify Exhibit name Text box
				Assert.assertTrue(isDisplayed("//*[@id='txtExhibitName']"),"Exhibit name Text box is not displayed");
				
				//To verify Exhibit Behavior drop down
				Assert.assertTrue(isDisplayed("//*[@id='ddlExhibitBehaviour']"),"Exhibit Behavior drop down is not displayed");
				
				//To verify the Subject drop down 
				Assert.assertTrue(isDisplayed("//*[@id='ddlSubject']"),"Subject drop down is not displayed");
				
				//To verify the Library Type: 
				Assert.assertTrue(isDisplayed("//*[@id='ddlLibraryType']"),"Library Type: is not displayed");
				
				//To verify the Columns : 
				Assert.assertTrue(isDisplayed("//*[@id='ddColumns']"),"Columns  is not displayed");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//******************************************54*************************************************************
		@Test(priority=54)
		public void FiftyThree_drop_down_menus_contains_data()
		{
			try
			{	
				FiftyOne_Search_Exhibits_pop_up_menu();
				
				//To verify Exhibit Behavior drop down is not null
				Select Dropdown1 = new Select(driver.findElement(By.id("ddlExhibitBehaviour")));
				List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
				Assert.assertNotNull(Dropdownsize1,"Drop down Behavior has no values");
				
				//To verify Exhibit Subject drop down is not null
				Select Dropdown2 = new Select(driver.findElement(By.id("ddlSubject")));
				List<WebElement>Dropdownsize2 = Dropdown2.getOptions();
				Assert.assertNotNull(Dropdownsize2,"Drop down Subject has no values");
				
				//To verify Exhibit LibraryType drop down is not null
				Select Dropdown3 = new Select(driver.findElement(By.id("ddlLibraryType")));
				List<WebElement>Dropdownsize3 = Dropdown3.getOptions();
				Assert.assertNotNull(Dropdownsize3,"Drop down LibraryType has no values");
				
				//To verify Exhibit Columns drop down is not null
				Select Dropdown4 = new Select(driver.findElement(By.id("ddColumns")));
				List<WebElement>Dropdownsize4 = Dropdown4.getOptions();
				Assert.assertNotNull(Dropdownsize4,"Drop down Columns has no values");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
//**************************************************Create/Edit Exhibit:*************************************************
		//**********************************************61***************************************************************
		@Test(priority=61)
		public void SixtyOne_Add_Edit_Exhibit_pop_up_menu()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Assessment.QT_Add_Standared_True_or_False();
				Thread.sleep(3000);
				
				//click on Exhibit button
				click("//*[@id='ctl00_MainContent_ucSubmenu_lnkLinkExhibit']");
				
				SwitchFrameName("SearchExhibit");
				
				//To Verify the pop up 
				Thread.sleep(3000);
				String Standard=getText("//*[@id='ctl00_MainContent_lblHeader']");
				Assert.assertEquals(Standard,"Question Link Mode");
				
				//To click on add new exhibit
				click("//*[@id='ctl00_MainContent_hplAddEditViewExhibit']");
				
				SwitchFrameName("AddExhibit");
				
				//To Verify the pop up 
				Thread.sleep(3000);
				String Standard2=getText("//*[@id='tblEditExhibit']/tbody/tr[1]/td/table/tbody/tr[1]/td");
				Assert.assertEquals(Standard2,"Add New Exhibit");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
		//****************************************************62*********************************************************
		@Test(priority=62)
		public void SixtyTwo_Add_Edit_Exhibit_pop_up_menu()
		{
			try
			{
				SixtyOne_Add_Edit_Exhibit_pop_up_menu();
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
		//*****************************************************63*********************************************************
		@Test(priority=63)
		public void SixtyFour_Add_Edit_Exhibit_pop_up_menu()
		{
			try
			{
				SixtyOne_Add_Edit_Exhibit_pop_up_menu();
				
				//To verify Exhibit Behavior drop down
				Assert.assertTrue(isDisplayed("//*[@id='ddlExhibitBehaviour']"),"Exhibit Behavior drop down is not displayed");
				
				//To verify the Subject drop down 
				Assert.assertTrue(isDisplayed("//*[@id='ddlSubject']"),"Subject drop down is not displayed");
				
				//To verify the Library Type: 
				Assert.assertTrue(isDisplayed("//*[@id='ddlLibraryType']"),"Library Type is not displayed");
				
				//To verify the Columns : 
				Assert.assertTrue(isDisplayed("//*[@id='ddColumns']"),"Columns is not displayed");
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
		//*********************************************************64*******************************************************
		@Test(priority=64)
		public void SixtyFour_menus_contain_data()
		{
			try
			{
				SixtyOne_Add_Edit_Exhibit_pop_up_menu();
				
				//To verify Exhibit Behavior drop down is not null
				Select Dropdown1 = new Select(driver.findElement(By.id("ddlExhibitBehaviour")));
				List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
				Assert.assertNotNull(Dropdownsize1,"Drop down Behavior has no values");
				
				//To verify Exhibit Subject drop down is not null
				Select Dropdown2 = new Select(driver.findElement(By.id("ddlSubject")));
				List<WebElement>Dropdownsize2 = Dropdown2.getOptions();
				Assert.assertNotNull(Dropdownsize2,"Drop down Subject has no values");
				
				//To verify Exhibit LibraryType drop down is not null
				Select Dropdown3 = new Select(driver.findElement(By.id("ddlLibraryType")));
				List<WebElement>Dropdownsize3 = Dropdown3.getOptions();
				Assert.assertNotNull(Dropdownsize3,"Drop down LibraryType has no values");
				Assert.assertTrue(Dropdownsize3.size()>=1,"Library Type contain less than one value");
				
				//To verify Exhibit Columns drop down is not null
				Select Dropdown4 = new Select(driver.findElement(By.id("ddColumns")));
				List<WebElement>Dropdownsize4 = Dropdown4.getOptions();
				Assert.assertNotNull(Dropdownsize4,"Drop down Columns has no values");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//*************************************68***********************************************************
		@Test(priority=68)
		public void SixtyFive_Save_Exhibit_button_functions_correctly()
		{
			try
			{
				SixtyOne_Add_Edit_Exhibit_pop_up_menu();
				
				//To fill the exhibit Name
				 type("//*[@id='txtExhibitName']","Test Exibit");
				 
				 //To select Exhibit Behavior
				 new Select(driver.findElement(By.id("ddlExhibitBehaviour"))).selectByIndex(1);
				 
				 //To select Subject
				 new Select(driver.findElement(By.id("ddlSubject"))).selectByIndex(1);
				 
				 //To selectLibrary Type
				 new Select(driver.findElement(By.id("ddlLibraryType"))).selectByIndex(1);
				 
				 //To select Columns
				 new Select(driver.findElement(By.id("ddColumns"))).selectByIndex(0);
				 
				//To fill the rich text box
				driver.findElement(By.xpath("//*[@id='txtExhibitTextCenter']")).click();
				driver.findElement(By.xpath("//*[@id='txtExhibitTextCenter']")).sendKeys("Suppose if there are 100 frames in the page, and there is no "
					 		+ "ID available, in this case, we just don't know from "
					 		+ "which iframe required element is being loaded (It is the case when "
					 		+ "we do not know the index of the frame ");
					
				//To click save exhibit
				click("//*[@id='btnSaveExhibit']");
				
				//To verify the successful message.
				Thread.sleep(3000);
				String expected=getText("//*[@id='lblMsg']");
				Assert.assertEquals("Exhibit saved successfully", expected);
				 	
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}
		//**************************************************69**********************************************************
		@Test(priority=69)
		public void SixtyNine_Add_Next_Exhibit_button_brings_you_to_another_Add_Exhibit()
		{
			try
			{
				SixtyFive_Save_Exhibit_button_functions_correctly();
				
				//To click on next button.
				Assert.assertTrue(isEnabled("//*[@id='btnAddNextExhibit']"),"Next button is not enabled");
				click("//*[@id='btnAddNextExhibit']");
				
				//To verify the new exhibit option.
				Thread.sleep(3000);
				String selectedOption = getText("//*[@id='txtExhibitName']");
				if(selectedOption.isEmpty())
				Assert.assertTrue(true,"Add next exhibit is working");
				else
				Assert.assertTrue(false,"Add next exhibit is not working");	
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}	
		}	
		//******************************************************70*************************************************
		@Test(priority=71)
		public void Seventy_menu_will_be_on_the_Assigned_Exhibits_list()
		{
			try
			{
				SixtyFive_Save_Exhibit_button_functions_correctly();
				
				driver.switchTo().parentFrame();
				
				//To close the window
				driver.findElement(By.xpath("//span[contains(@title,'Close')]")).click();
				
				Thread.sleep(2000);
				//To verify the exhibit menu 
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_rgStudentList_ctl00__0']/td[5]"),"Exhibit is not displayed");
				
				//To verify the exhibit Name
				String expected=getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00__0']/td[5]");
				Assert.assertEquals("Test Exibit", expected);
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*************************************************************************************************************
		@Test(priority=72)
		public void SeventyOne_Add_Next_Exhibit_button_brings_you_to_another_Add_Exhibit()
		{
			try
			{
				SixtyFive_Save_Exhibit_button_functions_correctly();
				
				driver.switchTo().parentFrame();
				
				//To close the window
				driver.findElement(By.xpath("//span[contains(@title,'Close')]")).click();
				
				Thread.sleep(2000);
				
				//To verify the Link exhibit 
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_imgLink']"),"Link Exhibit is not displayed");
				click("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_imgLink']");
				
				String expected=getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00']/tbody/tr/td/div");
				Assert.assertEquals("No records to display.",expected);
	
				//to verify the Edit exhibit
				Thread.sleep(2000);
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_lnkEdit']"),"Edit Exhibit is not displayed");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
//**********************************************Creating CATA Questions**************************************************************
		//**************************************************83********************************************
		@Test(priority=83)
		public void EightyThree_multiple_choice_question_are_required()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				
				//To fill the Question 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
				
				//To fill the Answer Two
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
			    
				//To fill the Answer Three
				Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			    
			    //To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			   
			    //To verify the validations
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Please fill empty choices.",expected);
				
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Please select a correct answer.",expected1);
			   		  
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//******************************************84*******************************************************
		@Test(priority=84)
		public void EightyFour_text_library_name_and_sublibrary_name_are_all_required()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				
				//To clear library for the validation.
				driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_cbLibraryName_Input')]")).clear();
				
				//To verify the components
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_cbLibraryName_Input']"),"Library Name is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']"),"Sub Library is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_txtQuestionText']"),"Question is not dispalyed");

				//To click on save button
				Thread.sleep(2000);
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			    Thread.sleep(1000);
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To verify the 
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Please select a library.",expected1);
			   
			    
			    String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Please select a sublibrary.",expected2);
				
				String expected3=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[3]");
				Assert.assertEquals("Please Enter a question.",expected3);
				
			    
			}
			catch (Exception e)
				{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
				}
			}
		//***********************************************85**************************************************************
		@Test(priority=85)
		public void EightyFive_Duplicate_Not_allowed()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				
				//To fill the Question 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
				
				//To fill the Answer Two
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 1");
			    
				//To fill the Answer Three
				Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			    
			   //To fill the Answer Five
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
			    
			    
			    //To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			   
			    //To verify the validations
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Please select a correct answer.",expected);
				
				Thread.sleep(2000);
			    String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Duplicate choices found.",expected1);
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//************************************************86******************************************************	
		
		@Test(priority=86)
		public void Eightysix_cannot_be_less_than_2_answer_choices()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				
				for(int i=0;i<3;i++)
				{
					Thread.sleep(1000);
					click("//*[@id='ctl00_MainContent_grdAnswers_ctl02_imgDeleteImage']");
				}
				
				//To verify the validation
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[1]/td");
				Assert.assertEquals("There must be at least two choices for multiple choice questions",expected);
				
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*******************************************87**************************************************************	
		@Test(priority=87)
		public void Eightyseven_message_is_displayed()
		{
			try
			{
				Eightysix_cannot_be_less_than_2_answer_choices();
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//************************************************88*************************************************************
		@Test(priority=88)
		public void Eightyeight_Multiple_correct_answers_can_be_selected()
		{
			try
			{
				EightyFive_Duplicate_Not_allowed();
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1123456");
				
				//To multi check the correct answers
				Thread.sleep(1000);
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']");
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl03_chkCorrectAnswer']");
				
				//To verify whether the multiple selection is allowed or not 
				assertTrue(isSelected("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"check box is not selected");
				
				assertTrue(isSelected("//*[@id='ctl00_MainContent_grdAnswers_ctl03_chkCorrectAnswer']"),"check box is not selected");
				
				//To click on save button
				Thread.sleep(1000);
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			    
			    //To click back to assessment button. 
			    Thread.sleep(3000);
			    click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	
			    
			    //To verify the new page with multiple selection
				Thread.sleep(2000);
			    String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[1]/td/span");
				Assert.assertEquals("Edit Assessment",expected);
				 
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
//***********************************************Creating Pick 2 Questions***************************************************************
		//****************************************************89************************************************
		@Test(priority=89)
		public void EightyNine_multiple_choice_question_are_required()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				
				//To fill the Question 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
				
				//To fill the Answer Two
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
			    
				//To fill the Answer Three
				Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			    
			    //To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			   
			    //To verify the validations
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Two correct answers required for pick two question.",expected);
				
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Please fill empty choices.",expected1);
				
				String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[3]");
				Assert.assertEquals("Please select a correct answer.",expected2);
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*********************************************90********************************************************
		@Test(priority=90)
		public void Nintey_text_library_name_and_sublibrary_name_are_all_required()
		{
			try
			{

				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				
				//To clear library for the validation.
				driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_cbLibraryName_Input')]")).clear();
				
				//To verify the components
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_cbLibraryName_Input']"),"Library Name is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']"),"Sub Library is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_txtQuestionText']"),"Question is not dispalyed");

				//To click on save button
				Thread.sleep(2000);
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			    Thread.sleep(1000);
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To verify the 
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Please select a library.",expected1);
			   
			    
			    String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Please select a sublibrary.",expected2);
				
				String expected3=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[3]");
				Assert.assertEquals("Please Enter a question.",expected3);
						
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***********************************************91*********************************************************
		@Test(priority=91)
		public void NinteyOne_Duplicate_Not_allowed()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				
				//To fill the Question 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
				
				//To fill the Answer Two
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 1");
			    
				//To fill the Answer Three
				Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
			    
			   //To fill the Answer Five
			    Thread.sleep(1000);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
			    Thread.sleep(500);
			    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
			    
			    //To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
			   
			    //To verify the validations
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[1]");
				Assert.assertEquals("Two correct answers required for pick two question.",expected);
				
				Thread.sleep(2000);
			    String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[2]");
				Assert.assertEquals("Please select a correct answer.",expected1);
				
				Thread.sleep(2000);
			    String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li[3]");
				Assert.assertEquals("Duplicate choices found.",expected2);
				
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//**********************************************92*********************************************************
		@Test(priority=92)
		public void NinteyTwo_Duplicate_Not_allowed()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				
				for(int i=0;i<3;i++)
				{
					Thread.sleep(1000);
					click("//*[@id='ctl00_MainContent_grdAnswers_ctl02_imgDeleteImage']");
				}
				
				//To verify the validation
				Thread.sleep(2000);
			    String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[1]/td");
				Assert.assertEquals("There must be at least two choices for multiple choice questions",expected);
			}
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***********************************************93**********************************************************
		@Test(priority=93)
		public void NinteyThree_message_is_displayed()
		{
			try
			{
				NinteyTwo_Duplicate_Not_allowed();	
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		
		//************************************************94***********************************************************
		@Test(priority=94)
		public void Ninteyfour_answer_choices_can_be_marked_as_correct()
		{
			try
			{
				NinteyOne_Duplicate_Not_allowed();
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1123456");
				
				//To  check more than two correct answers
				Thread.sleep(1000);
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']");
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl03_chkCorrectAnswer']");
				
				//To verify the selected check boxes.
				Thread.sleep(1000);
				Assert.assertTrue(isSelected("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Check one is not selected");
				Assert.assertTrue(isSelected("//*[@id='ctl00_MainContent_grdAnswers_ctl03_chkCorrectAnswer']"),"Check two is not selected");
				
				//To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
			    //To click back to assessment button. 
			    Thread.sleep(3000);
			    click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	
			    
			    //To verify the new page with multiple selection
				Thread.sleep(2000);
			    String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[1]/td/span");
				Assert.assertEquals("Edit Assessment",expected);
			   	
			}
				
			catch (Exception e)
			{
					System.out.println(" Failed!!!"+e);
					Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*******************************************94***************************************************************
		@Test(priority=94)
		public void NinteyFour_message_is_displayed()
		{
			try
			{
				NinteyOne_Duplicate_Not_allowed();
				
				//To fill the Answer one
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1123456");
				
				//To  check more than two correct answers
				Thread.sleep(1000);
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']");
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl03_chkCorrectAnswer']");
				check("//*[@id='ctl00_MainContent_grdAnswers_ctl04_chkCorrectAnswer']");
				
				  //To click on save button
			    click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To verify the validation for selecting  more than two values.
				Thread.sleep(2000);
			    String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Two correct answers required for pick two question.",expected2);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		
//**************************************************Creating Survey Questions*******************************************************************************
		//**********************************************95*********************************************************
		@Test(priority=95)
		public void Ninteyfive_drop_down_menu_has_the_options()
		{
			try
			{
				int flag=0;
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Survey");
				
				//Compare with options in the drop down
				Thread.sleep(5000);
				String[] exp = {"Yes or No","Likert Scale","Agree or Disagree","Multiple Choice", "True or False"}; 
				WebElement dropdown = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"));
				        Select select = new Select(dropdown);  

				        List<WebElement> options = select.getOptions();  
				        for(WebElement we:options)  
				        {  
				         for (int i=0; i<exp.length; i++){
				             if (we.getText().equals(exp[i])){
				            Assert.assertEquals(we.getText(),exp[i]);
				            System.out.println("Matched"+we.getText());
				            flag++;
				            } 
				         }
				
				        } 
				        
				  //To verify the total count      
				Assert.assertEquals(5,flag,"Options are missing from the drop down");        
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//**********************************************96*******************************************************************
		@Test(priority=96)
		public void NinteySix_drop_down_menu_has_the_options()
		{
			try
			{
				//To select the option Agree or Disagree
				Assessment.Assessment_Type_Survay("Agree or Disagree");
				
				//To verify the validation for Empty questions.
				Thread.sleep(2000);
				String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.",expected);
				
				//To select the option True or False
				Assessment.Assessment_Type_Survay("True or False");
				//To verify the validation for Empty questions.
				Thread.sleep(2000);
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.",expected1);
			  
				//To select the option Yes or No
				Assessment.Assessment_Type_Survay("Yes or No");
				//To verify the validation for Empty questions.
				Thread.sleep(2000);
				String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.",expected2);
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*********************************************97***********************************************
		@Test(priority=97)
		public void NinteySeven_Likert_Scale_question_type_has_a_Likert_Name_dropdown_menu()
		{
			try
			{	
				int flag=0;
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Survey");
				
				//To select the drop down
				Thread.sleep(2000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Likert Scale");
				
				//Compare with options in the drop down
				Thread.sleep(2000);
				click("//*[@id='ctl00_MainContent_cbLikertName']/span/button");
				Thread.sleep(2000);
				List<WebElement> options = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_cbLikertName_DropDown']/div/ul/li"));
				System.out.println(options.size());
				String[] exp = {"FAVORABLE", "ACCURATE","AGREEMENT","FREQUENCY","IMPORTANCE","QUALITY","LIKELIHOOD"}; 
				  
				        for(WebElement we:options)  
				        {  
				         for (int i=0; i<exp.length; i++){
				             if (we.getText().equals(exp[i])){
				            
				             System.out.println("Matched"+we.getText());
				             flag++;
				             } 
				         }
				        } 
				Assert.assertEquals(7,flag,"Options are missing from the drop down");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//************************************98******************************************************
		@Test(priority=98)
		public void NinteyEight_survey_answer_options ()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Survey");
				
				//To select the drop down
				Thread.sleep(2000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Likert Scale");
				
				//To verify the answer options
				Thread.sleep(2000);
				String expected=getText("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td/div[3]/table/tbody/tr[1]/td");
				Assert.assertEquals("A : Strongly Unfavorable",expected);
				
				String expected1=getText("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td/div[3]/table/tbody/tr[2]/td");
				Assert.assertEquals("B : Somewhat Unfavorable",expected1);
				
				String expected2=getText("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td/div[3]/table/tbody/tr[3]/td");
				Assert.assertEquals("C : Undecided",expected2);
				
				String expected3=getText("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td/div[3]/table/tbody/tr[4]/td");
				Assert.assertEquals("D : Somewhat Favorable",expected3);
				
				String expected4=getText("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td/div[3]/table/tbody/tr[5]/td");
				Assert.assertEquals("E : Strongly Favorable",expected4);
				
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//************************************************************************************************
		@Test(priority=99)
		public void NinteyNine_survey_answer_options ()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Survey");
				
				//To select the drop down
				Thread.sleep(2000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				Thread.sleep(5000);
				//To verify the answer option is exists 
				//boolean exists = (driver.findElements( By.xpath("//[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']") ).size() == 0);
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Agree or Disagree ");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Check All That Apply ");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Are True");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Check All That True ");

				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Likert Scale");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Likert Scale");

				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Multiple Choice ");

				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Pick Two ");

				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("True or False");
				Thread.sleep(3000);
				//To verify the answer option is exists
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for True or False ");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Yes or No");
				Thread.sleep(3000);
				//To verify the answer option is exists 
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_grdAnswers_ctl02_chkCorrectAnswer']"),"Answer option is Dispalyed for Yes or No ");	
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
//********************************************************Creating Assessment Rubric Test-Type Questions******************************************************
		//****************************************************100********************************************************
		@Test(priority=100)
		public void Hundred_drop_down_menu_has_the_options ()
		{
			try
			{
				int flag=0;
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Assessment Rubric");
				
				String[] exp = {"Interview", "Journal","Observation","Portfolio","Presentation","Project/Task-Based"}; 
				WebElement dropdown = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"));
				        Select select = new Select(dropdown);  

				        List<WebElement> options = select.getOptions();  
				        for(WebElement we:options)  
				        {  
				         for (int i=0; i<exp.length; i++){
				             if (we.getText().equals(exp[i])){
				             System.out.println("Matched :"+we.getText());
				             flag++;
				             } 
				         }
				        } 
				Assert.assertEquals(6,flag,"Options are missing from the drop down");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//*********************************101***************************************************************
		@Test(priority=101)
		public void HundredAndTwo_Required_Fields ()
		{
			try
			{
				survayQuestion.Survay_Question_required_Fields("Interview");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected1);
				
				survayQuestion.Survay_Question_required_Fields("Journal");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected2=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected2);
				
				survayQuestion.Survay_Question_required_Fields("Observation");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected3=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected3);
				
				survayQuestion.Survay_Question_required_Fields("Presentation");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected4=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected4);
				
				survayQuestion.Survay_Question_required_Fields("Project/Task-Based");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected5=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected5);
							
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		
//***************************************************Creating Essay Questions************************************************************************		
		//**********************************************103***********************************************************
		@Test(priority=102)
		public void HundredAndTwo_drop_down_menu_has_the_options ()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To validate Decimal Increment
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_ddlDecimalPoints']"),"Decimal Increment is not displayed");
				Select Dropdown = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlDecimalPoints']")));
				List<WebElement>Dropdownsize = Dropdown.getOptions();
				Assert.assertNotNull(Dropdownsize,"Decimal Increment Drop down has no value");
				
				//To Validate the Answer Sheets/Lines
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_ddAnswerSheet']"),"Answer Sheets/Lines is not displayed");
				Select Dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddAnswerSheet']")));
				List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
				Assert.assertNotNull(Dropdownsize1,"Answer Sheets/Lines Drop down has no value");
				
				//To Validate the Rubric
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_ddlRubricType']"),"Rubric is not displayed");
				Select Dropdown2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlRubricType']")));
				List<WebElement>Dropdownsize2 = Dropdown2.getOptions();
				Assert.assertNotNull(Dropdownsize2,"Rubric Drop down has no value");

				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//************************************************************************************************************
		@Test(priority=103)
		public void HundredAndThree_drop_down_menus_labeled_Points_and_Decimal_Increment_invisible()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To click on create scoring ruberic.
				click("//*[@id='ctl00_MainContent_ddlRubricType']");
				
				//To verify the Decimal Increment button 
				Thread.sleep(2000);
				Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_ddlDecimalPoints']"),"Scoing ruberic is not displayed");	
				
				//To change to full ruberic.
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlRubricType']"))).selectByVisibleText("Full");
				
				//To click on create scoring ruberic.
				click("//*[@id='ctl00_MainContent_ddlRubricType']");
				
				Thread.sleep(2000);
				//To check whether Decimal Increment drop down displayed or not.
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_ddlDecimalPoints']"),"Scoing ruberic is visible displayed");	
				
				//To check whether Decimal Increment drop down displayed or not.
				Assert.assertFalse(isDisplayed("//*[@id='ctl00_MainContent_divEssay']"),"Points increment table is displayed");	

			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*******************************************105********************************************************************
		@Test(priority=105)
		public void HundredAndFive_drop_down_menu_is_on_one_page()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddAnswerSheet']"))).getFirstSelectedOption().getText();
				Assert.assertEquals("1 page", selectedOption);
						
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***********************************************106**********************************************************
		@Test(priority=106)
		public void HundredAndSix_drop_down_menu_is_on_five_lines_by_default()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down Extended Response
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Extended Response");
				Thread.sleep(3000);
				
				String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddAnswerSheet']"))).getFirstSelectedOption().getText();
				Assert.assertEquals("5 lines", selectedOption);
				
				//To select the drop down Extended Response
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Short Response");
				Thread.sleep(3000);
				
				String selectedOption1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddAnswerSheet']"))).getFirstSelectedOption().getText();
				Assert.assertEquals("5 lines", selectedOption1);
					
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//*******************************************107*******************************************************************
		@Test(priority=107)
		public void HundredAndSeven_grid_shows_the_correct_increments_between_points()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the Essay
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To select  Decimal Increment as 0.5
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlDecimalPoints']"))).selectByVisibleText(".5");
				Thread.sleep(2000);
				
				//To click on create scoring ruberic
				click("//*[@id='ctl00_MainContent_btnScoring']");
				
				//To verify the Scoring Rubric Fields (1)
				Thread.sleep(5000);
				String selectedOption =getText("//*[@id='ctl00_MainContent_divEssay']/div/table/tbody/tr[1]/td[1]");
				Assert.assertEquals("0 points", selectedOption);
				
				Assert.assertTrue(isDisplayed("//*[@id='txtScoreRubic_0']"),"Text box is not displayed for 0 points");
				
				//Field 2
				String selectedOption1 =getText("//*[@id='ctl00_MainContent_divEssay']/div/table/tbody/tr[2]/td[1]");
				Assert.assertEquals("0.5 points", selectedOption1);
				
				Assert.assertTrue(isDisplayed("//*[@id='txtScoreRubic_05']"),"Text box is not displayed for 0.5 points");
				
				//Field 3
				String selectedOption3 =getText("//*[@id='ctl00_MainContent_divEssay']/div/table/tbody/tr[3]/td[1]");
				Assert.assertEquals("1 points", selectedOption3);
				
				Assert.assertTrue(isDisplayed("//*[@id='txtScoreRubic_1']"),"Text box is not displayed for 1 points"); 
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//********************************************108******************************************************************
		@Test(priority=108)
		public void HundredAndEight_Pop_Up_for_full_ruberic()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the Essay
				waitFor("//*[@id='ctl00_MainContent_ddlQuestionType']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				//Thread.sleep(3000);
				
				
				//To select the Full ruberic
				waitFor("//*[@id='ctl00_MainContent_ddlRubricType']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlRubricType']"))).selectByVisibleText("Full");
				Thread.sleep(3000);
				
				//To Verify the button label change
				String selectedOption =getValue("//*[@id='ctl00_MainContent_btnScoring']");
				Assert.assertEquals("Select rubric", selectedOption);
				
				//To click on select ruberic button.
				click("//*[@id='ctl00_MainContent_btnScoring']");
				
				SwitchFrameName("rwFullRubrics");
				
				//To verify the pop up button.
				String selectedOption1 =getText("//*[@id='form1']/div[3]/div[1]/span");
				Assert.assertEquals("Select Rubric", selectedOption1);
				
				
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		//****************************************109**********************************************************
		@Test(priority=109)
		public void HundredAndNine_Validation_for_Question_Text_box()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the Essay
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To click on save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To verify the pop up button.
				Thread.sleep(2000);
				String expected =getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.", expected);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
		}	
		
		//*********************************************************************************************************
		@Test(priority=110)
		public void HundredAndTen_Validation_for_Empty_Ruberic()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To click to save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.",expected);
				
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Qustions 1");
				
				//To click on select rubric question.
				click("//*[@id='ctl00_MainContent_btnScoring']");
				
				//To click to save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please fill empty rubrics",expected1);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
			
		}
		//********************************111*************************************************************************
		@Test(priority=111)
		public void HundredAndEleven_Validation_for_Empty_Ruberic()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				//To click to save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Please Enter a question.",expected);
				
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Qustions 1");
				
				//To click on select rubric question.
				click("//*[@id='ctl00_MainContent_btnScoring']");
				
				//To fill the duplicate values in scoring rubric text boxes.
				type("//*[@id='txtScoreRubic_0']","QA123");
				
				type("//*[@id='txtScoreRubic_1']","QA123");
				
				//To click to save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				
				//To read the validation messages.
				Thread.sleep(3000);
				String expected1=getText("//*[@id='divEditAssessment']/table/tbody/tr[2]/td/div[2]/ul/li");
				Assert.assertEquals("Duplicate rubrics values found",expected1);
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
			
		}
		//*******************************************112******************************************************************	
		@Test(priority=112)
		public void HundredAndtwelve_Edit_Exemplar_Response()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(5000);
				
				//To click on Edit Exemplar Response button
				click("//*[@id='ctl00_MainContent_txtQuestionText']");
				
				//To verify the whether the button present or not.
				Thread.sleep(3000);
				if (isAlertPresents()) 
				 {
					Assert.assertTrue(true,"Edit Exemplar Response button is not working properly");
					driver.switchTo().alert().accept();
					driver.switchTo().defaultContent();	 
				 }    	
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				Assert.assertTrue(false,"Exception Occured"+e);
			}
			
		} 
		//******************************113***************************************************************
		@Test(priority=113)
		public void HundredAndthirteen_Edit_Exemplar_Response()
		{
			try
			{
				HundredAndtwelve_Edit_Exemplar_Response();
				
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//**************************************114***********************************************************
		@Test(priority=114)
		public void HundredAndfourteen_pop_up_window_titled ()
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Test");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
				driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Qustions 1");
				
				//To click on select rubric question.
				click("//*[@id='ctl00_MainContent_btnScoring']");
				
				//To fill the duplicate values in scoring rubric text boxes.
				type("//*[@id='txtScoreRubic_0']","QA12312");
				
				type("//*[@id='txtScoreRubic_1']","QA123");
				
				//To click to save button.
				click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
				
				//to click on edit exemplar response
				Thread.sleep(3000);
				click("//*[@id='ctl00_MainContent_lnkEditExplemplarResponse']");
				
				//To read the pop up Text box.
				Thread.sleep(2000);
				String expected1=getText("//*[@id='RadWindowWrapper_ctl00_MainContent_ExemplarResponse']/div[1]/div/h6");
				Assert.assertEquals("Exemplar Response Editor",expected1);
					
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//***********************************115**************************************************************************
		@Test(priority=115)
		public void HundredAndfifteen_pop_up_window_is_a_text_box_and_3_buttons()
		{
			try
			{
				HundredAndfourteen_pop_up_window_titled ();
				
				//To witch frame
				SwitchFrameName("ExemplarResponse");
				
				//To verify the components in the Pop up
				Assert.assertTrue(isDisplayed("//*[@id='txtExemplarResponse']"),"Text box is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='btnSaveAndContinue']"),"save and continue button is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='btnSaveAndClose']"),"save and close button is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='btnCancel']"),"canel button is not displayed");
				
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//******************************************116***********************************************************************
		@Test(priority=116)
		public void HundredAndSixteen_Save_and_Continue_Save_and_Close_and_Cancel()
		{
			try
			{
				HundredAndfourteen_pop_up_window_titled ();
				
				//To witch frame
				SwitchFrameName("ExemplarResponse");
				
				//To fill the rich text box.
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='txtExemplarResponseCenter']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='txtExemplarResponseCenter']")).sendKeys("Test Data value");
				
				//To click on save and continue button.
				click("//*[@id='btnSaveAndContinue']");
				
				SwitchFrame("txtExemplarResponse_contentIframe");
				
				//To verify the value is persist in the rich text box.
				Thread.sleep(4000);
				Assert.assertTrue(driver.getPageSource().contains("Test Data value"));
				
				driver.switchTo().defaultContent();
				
				//To close the pop up
				Thread.sleep(2000);
				click("//*[@id='RadWindowWrapper_ctl00_MainContent_ExemplarResponse']/div[1]/div/ul/li[2]/span");
				
		/*		//to click on edit exemplar response
				Thread.sleep(3000);
				click("//*[@id='ctl00_MainContent_lnkEditExplemplarResponse']");
				
				//To witch frame
				SwitchFrameName("ExemplarResponse");
				
				//To fill the rich text box.
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='txtExemplarResponseCenter']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='txtExemplarResponseCenter']")).sendKeys("Test Data value");
				
				//To click on save and close button.
				click("//*[@id='btnSaveAndClose']");
				
				SwitchFrame("txtExemplarResponse_contentIframe");
				
				//To verify the value is persist in the rich text box.
				Thread.sleep(4000);
				Assert.assertTrue(driver.getPageSource().contains("Test Data valueTest Data value"));
				*/

					
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
//************************************************************Select Rubric	***************************************
		//**********************************117*******************************************************
		@Test(priority=117)
		public void HundredAndseventeen_My_Rubrics_check_box()
		{
			try
			{
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To validate the components.
				Assert.assertTrue(isDisplayed("//*[@id='chkMyRubrics']"),"check box is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ddlSubjectFilter']"),"Subject Drop down is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='ddlRubrics']"),"Ruberic drop down is not displayed");
				
				Assert.assertTrue(isDisplayed("//*[@id='btnSelectRubric']"),"Select ruberic button is not displayed");
				
				
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//******************************************118*******************************************************************	
		@Test(priority=118)
		public void HundredAndeighteen_title_Add_Modify_Rubrics()
		{
			try
			{
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To verify the header
				Thread.sleep(1000);
				String expected=getText("//*[@id='form1']/div[3]/div[1]/span");
				Assert.assertEquals("Select Rubric",expected);
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
		}
		//*************************************119**************************************************************************
		@Test(priority=119)
		public void HundredAndnineteen_title_Add_Modify_Rubrics()
		{
			try
			{
				int flag = 0;
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To click on Add modify ruberics
				click ("//*[@id='hprlnkAddModifyRubrics']");
				
				//To switch to new tab
				Thread.sleep(3000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    
			    //To click to add button
			    Thread.sleep(2000);
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
			    
			    //To fill the Rubric Level Titles and Points
			    Thread.sleep(2000);
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']","TP1");
			   
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']","TP2");
			    
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']","TP3");
			 
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel4Title']","TP4");
			    
			    //To fill the ruberic name.
			    String rubricname=generateRandomData();
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",rubricname);
			    
			    //To select the subject
			    new Select(driver.findElement(By.id("ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects"))).selectByIndex(1);
			    
			    //To click on Save button.
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
			    
			    //To close tab
			    driver.close();
			    
			    //To switch to parent browser
			    driver.switchTo().window(tabs2.get(0));
			    
			    //To check my rubrics.
			    Thread.sleep(2000);
			    check("//*[@id='chkMyRubrics']");
			    
			    //To select the subject.
			    Thread.sleep(5000);
			    new Select(driver.findElement(By.xpath("//*[@id='ddlSubjectFilter']"))).selectByIndex(1);
			    
			    String[] exp = {rubricname}; 
			    Thread.sleep(2000);
				WebElement dropdown = driver.findElement(By.xpath("//*[@id='ddlRubrics']"));
				        Select select = new Select(dropdown);  

				        List<WebElement> options = select.getOptions();  
				        for(WebElement we:options)  
				        {  
				         for (int i=0; i<exp.length; i++){
				             if (we.getText().equals(exp[i])){
				            
				             System.out.println("Matched"+we.getText());
				             flag++;
				             } 
				         }
				        } 
				Assert.assertEquals(1,flag,"ruberic missing from the drop down");
			}
			catch (Exception e)
			{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
			}
	}
	//**************************************120**********************************************************************
	@Test(priority=120)
	public void HundredAndTwenty_Rubrics_drop_down_menu_contains_data()
	{
		try
		{
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//Drop down must contain Data.
			Select Dropdown = new Select(driver.findElement(By.xpath("//*[@id='ddlSubjectFilter']")));
			List<WebElement>Dropdownsize = Dropdown.getOptions();
			Assert.assertNotNull(Dropdownsize,"Subject Drop down has no value");
			
			//To select the subject;
			new Select(driver.findElement(By.xpath("//*[@id='ddlSubjectFilter']"))).selectByIndex(1);
		    
		    //Drop down must contain Data.
		    Thread.sleep(2000);
		    Select Dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='ddlRubrics']")));
			List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
			System.out.println("drop down data is "+Dropdownsize1.get(0).getText());
			Assert.assertNotNull(Dropdownsize1,"rubric Drop down has no value");    
		    
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//************************************121*************************************************************************	
	@Test(priority=121)
	public void HundredAndTwentyone_displaying_the_rubric_underneath_the_Select_Rubric_button()
	{
		try
		{
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To select the subject;
			new Select(driver.findElement(By.xpath("//*[@id='ddlSubjectFilter']"))).selectByIndex(1);
			
			//To select the ruberic 
			Thread.sleep(2000);
			new Select(driver.findElement(By.xpath("//*[@id='ddlRubrics']"))).selectByIndex(1);
			
			//To click on view button
			Thread.sleep(4000);
			click("//*[@id='hprlnkView']");
			
			
			//To validate rubric grid is displayed
			Thread.sleep(2000);
			Assert.assertTrue(isDisplayed("//*[@id='cnrRubricTable']"),"Rubric grid is not displayed");
			
			//To click on select rubric button
			click("//*[@id='btnSelectRubric']"); 
			
			//To validate rubric grid is displayed in the question builder page.
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_divQuestionsection']/table/tbody/tr[2]/td"),"rubric grid is not displayed in the Question builder page");
			
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//*************************************122***********************************************************************************
	@Test(priority=122)
	public void HundredAndTwentyTwo_Select_Rubric_button_functions_correctly()
	{
		try
		{
			HundredAndTwentyone_displaying_the_rubric_underneath_the_Select_Rubric_button();
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
//**************************************************Add/Modify Rubrics:*********************************************************
	//****************************************123*******************************************************************************
	@Test(priority=123)
	public void HundredAndTwentyThree_Select_Rubric_button_functions_correctly()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
			
		    //To verify the drop down and size.
		    Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"),"Drop down search filtering is not displayed");
		    
		    //Drop down must contain Data(Search Filtering:)
		    Select Dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']")));
			List<WebElement>Dropdownsize1 = Dropdown1.getOptions();
			System.out.println("drop down data is "+Dropdownsize1.get(0).getText());
			Assert.assertNotNull(Dropdownsize1,"rubric Drop down has no value");    
		    
			//To verify the drop down and size (Rubric Search:)
		    Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"),"Drop down uberic search is not displayed");
		    
		    //Drop down must contain Data.
		    Select Dropdown2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")));
			List<WebElement>Dropdownsize2 = Dropdown2.getOptions();
			System.out.println("drop down data is "+Dropdownsize2.get(0).getText());
			Assert.assertNotNull(Dropdownsize2,"rubric Drop down has no value"); 
			
			
		        
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//************************************124*********************************************************************************
	@Test(priority=124)
	public void HundredAndTwentyfour_Select_Rubric_button_functions_correctly()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //To select search filtering;
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Adult Education");
			
			//To select ruberic search
			Thread.sleep(2000);
			waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByValue("3752");
		    
		    //To validate the Rubric Level Titles and Points values.
			Thread.sleep(3000);
			waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']");
			String Expected=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']");
			Assert.assertNotNull(Expected, "Rubric Name has no values");
			//To validate the subject
			String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).getFirstSelectedOption().getText();
			Assert.assertNotNull(selectedOption, "Subject has no values");
			
			//To verify the Number of levels.
			String selectedOption1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']"))).getFirstSelectedOption().getText();
			Assert.assertNotNull(selectedOption1, "Number of levels has no values");
			
			//To verify the Title values.(Title 1)
			String selectedOption2 = getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertNotNull(selectedOption2, "Title1 has no values");
			
			//(Title 2)
			String selectedOption3 = getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertNotNull(selectedOption3, "Title2 has no values");
			
			//(Title 3)
			String selectedOption4 =getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertNotNull(selectedOption4, "Title3 has no values");
			
			
		}
		catch (Exception e)
		{
			
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//*******************************125****************************************************************************************
	@Test(priority=125)
	public void HundredAndTwentyfive_Validation_modify_this_rubric_a_message_similar()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //To select search filtering;
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText("Other User Rubric");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(2000);
			String Expected=getText("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_lblMessage']");
			Assert.assertEquals("You do not have permissions to edit this rubric", Expected);
			
			
		}
		catch (Exception e)
		{
			
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false,"Exception Occured"+e);
		}
	}
	//***********************************************126****************************************************************************************
	@Test(priority=126)
	public void HundredAndTwentySix_Nothing_can_be_edited()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //To select search filtering;
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText("Other User Rubric");
			
			//To validate buttons save and delete.
			boolean exists = driver.findElements( By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnDelete']") ).size() == 0;
			Assert.assertFalse(exists,"Delete button is present");
			
			boolean exists1 = driver.findElements( By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']") ).size() == 0;
			Assert.assertFalse(exists1,"Save button is present");
			
			//To verify the rubric name is enabled.
			boolean Expected=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']");
			Assert.assertTrue(Expected,"Rubric name  is not enabled");
			
			//To verify Number of Levels is disabled.
			boolean Expected1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']");
			Assert.assertFalse(Expected1,"Number of Levels  is enabled");
			
			//To verify Subject is disabled.
			boolean Expected2=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']");
			Assert.assertFalse(Expected2,"Subject is enabled");
			
			//Validate Rubric Level Titles and Points are disabled
			boolean Expected3=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertFalse(Expected3,"Title 1 is enabled");
			
			boolean Expected4=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertFalse(Expected4,"Title2 is enabled");
			
			boolean Expected5=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertFalse(Expected5,"Title3 is enabled");
			
			boolean Expected6=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel4Title']");
			Assert.assertFalse(Expected6,"Title4 is enabled");
			
			boolean Expected7=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel5Title']");
			Assert.assertFalse(Expected7,"Title5 is enabled");
			
			boolean Expected8=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel6Title']");
			Assert.assertFalse(Expected8,"Title6 is enabled");
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//**************************************************127*************************************************************************************
	@Test(priority=127)
	public void HundredAndTwentySeven_editing_a_rubric_are_correctly_enforced()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);	
			//To verify the rubric value
			//waitForvalue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			Thread.sleep(2000);
			String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).getFirstSelectedOption().getText();
			Assert.assertEquals(selectedOption,RubericName);
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//******************************************************************************128***********************************************************************************
	@Test(priority=128)
	public void HundredAndTwentyeight_rubric_can_edit()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To select search filtering;
		    Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//To verify the rubric name is enabled.
			Thread.sleep(2000);
			boolean Expected=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']");
			Assert.assertTrue(Expected,"Rubric name  is not enabled");
			
			//To verify Number of Levels is disabled.
			boolean Expected1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']");
			Assert.assertTrue(Expected1,"Number of Levels  is enabled");
			
			//To verify Subject is disabled.
			boolean Expected2=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']");
			Assert.assertTrue(Expected2,"Subject is enabled");
			
			//Validate Rubric Level Titles and Points are disabled
			boolean Expected3=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertTrue(Expected3,"Title 1 is enabled");
			
			boolean Expected4=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertTrue(Expected4,"Title2 is enabled");
			
			boolean Expected5=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertTrue(Expected5,"Title3 is enabled");
			
			boolean Expected6=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
			Assert.assertTrue(Expected6,"Save button is enabled");
			
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//***********************************************************************************************************************************************
	@Test(priority=131)
	public void HundredAndThirtyone_Delete_button()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To select search filtering;
		    Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//To click on delete button.
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnDelete']");	
		
			 if (isAlertPresents()) 
			 {
				 Assert.assertTrue(true);
				 driver.switchTo().alert().accept();
				 driver.switchTo().defaultContent();
				 
			 } 
			 else
			 {
				 Assert.assertTrue(false,"Allert Message is not Present");
			 }
			 	//To select search filtering;
			    Thread.sleep(2000);
			    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
				
				int flag=0;
				Thread.sleep(2000);
				String[] exp = {RubericName}; 
				WebElement dropdown = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"));
				        Select select = new Select(dropdown);  

				        List<WebElement> options = select.getOptions();  
				        for(WebElement we:options)  
				        {  
				         for (int i=0; i<exp.length; i++){
				             if (we.getText().equals(exp[i])){
				            
				             System.out.println("Matched :"+we.getText());
				             flag++;
				             } 
				         }
				        } 
				Assert.assertEquals(0,flag,RubericName+"is present in the drop down, hat means Ruberic is not deleted. ");
				
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//**********************************************************132**********************************************************************************************
	@Test(priority=132)
	public void HundredAndThirtyTwo_Add_button_is_pressed_drop_down_menus_become_inaccessible()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //Click on add button
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		    //To verify whether the first part is enabled or not
		    Thread.sleep(3000);
		    boolean Expected=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			Assert.assertFalse(Expected,"Search filtering is not disabled");
			
			boolean Expected1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			Assert.assertFalse(Expected1,"Ruberic Search is not disabled");  
		    
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//**********************************************************************133********************************************************************
	@Test(priority=133)
	public void HundredAndThirtyThree_editable_after_Add_has_been_clicked()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //Click on add button
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		  //To verify the rubric name is enabled.
			Thread.sleep(2000);
			boolean Expected=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']");
			Assert.assertTrue(Expected,"Rubric name  is not enabled");
			
			//To verify Number of Levels is disabled.
			boolean Expected1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']");
			Assert.assertTrue(Expected1,"Number of Levels  is enabled");
			
			//To verify Subject is disabled.
			boolean Expected2=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']");
			Assert.assertTrue(Expected2,"Subject is enabled");
			
			//Validate Rubric Level Titles and Points are disabled
			boolean Expected3=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertTrue(Expected3,"Title 1 is enabled");
			
			boolean Expected4=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertTrue(Expected4,"Title2 is enabled");
			
			boolean Expected5=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertTrue(Expected5,"Title3 is enabled");
			
			boolean Expected6=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
			Assert.assertTrue(Expected6,"Save button is enabled");
		    
		   }
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//********************************************************134********************************************************
	@Test(priority=134)
	public void HundredAndThirtyFour_text_field_has_a_character_limit_of_100()
	{
		try
		{
			
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //Click on add button
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		    //To fill Ruberic Name characther limit more than 100 
		    Thread.sleep(1000);
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']","Lorem Ipsum is simply dummy text of the printing "
						+ "and typesetting industry."
						+ " Lorem Ipsum has been the industry's standard"
						+ " dummy text ever since the 1500s, when an unknown");
		    //To read the contents from the rubric name
		    Thread.sleep(1000);
		    String  Desc=getValue("#ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName");
			System.out.println(Desc.length());
			//To Verify the TestCollection
			Assert.assertTrue(Desc.length()<=100,"TestCollection is failed");
			
		         
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//***************************************************************135**************************************************************************
	@Test(priority=135)
	public void HundredAndThirtyFive_haracter_limit_of_35()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //click on add button 
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		    //select the subject from drop down
		    Thread.sleep(2000);
		    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).selectByVisibleText("Mathematics");
		    
		    //To select the number of levels
		    Thread.sleep(2000);
		    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']"))).selectByValue("6"); 
		    
		    String RubericName=generateRandomData();
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		    

			//To fill the values in the title boxes
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
			
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
		
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel4Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel5Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel6Title']","The temple is "
		    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text.");
			 
			//To click on save button.
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
			
			 //To read the contents from the Titles and verify the values
		    Thread.sleep(2000);
		    String  Title1=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertTrue(Title1.length()<=35,"Title1 is failed");
			
			String  Title2=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertTrue(Title2.length()<=35,"Title2 is failed");
			
			String  Title3=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertTrue(Title3.length()<=35,"Title3 is failed");
			
			String  Title4=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel4Title']");
			Assert.assertTrue(Title4.length()<=35,"Title4 is failed");
			
			String  Title5=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel5Title']");
			Assert.assertTrue(Title5.length()<=35,"Title5 is failed");
			
			String  Title6=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel6Title']");
			Assert.assertTrue(Title6.length()<=35,"Title6 is failed");
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//****************************************************************136*****************************************************
	@Test(priority=136)
	public void HundredAndThirtySix_All_fields_are_required()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    //click on add button 
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		    //Click on save button.
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
		    
		    //To read and validate the alert message
		    Thread.sleep(2000);
		    String message=readAlertMessageText();
		    Assert.assertEquals(message, "The Rubric Name and Subject are required fields!");
		    
		    //To accept alert message
		    AcceptAlert();
		    
		    //To validate 
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']","Test data");
		    
		    //Click on save button.
		    Thread.sleep(2000);
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
		    
		  //To read and validate the alert message
		    Thread.sleep(2000);
		    String message1=readAlertMessageText();
		    Assert.assertEquals(message1, "The Rubric Name and Subject are required fields!");
		    
		    //To accept alert message
		    AcceptAlert();
		    
		    //To select the subject
		    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).selectByValue("Adult Education"); 
		    
		    //Click on save button.
		    Thread.sleep(2000);
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
		    
		    //To read and validate the alert message
		    Thread.sleep(2000);
		    String message2=readAlertMessageText();
		    Assert.assertEquals(message2, "The Rubric titles 1,2,3,4 are required fields!");
		    
		    //To accept alert message
		    AcceptAlert();
		    
		  
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//*************************************************137************************************************************************************************
	@Test(priority=137)
	public void HundredAndThirtySeven_Copy_button_functions_correctly()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName+"Copy Test");
		  
		  //To click on copy button.
		   click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		   //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName+"Copy Test");
		   
			//To validate the number if levels
			Thread.sleep(2000);
			String selectedOption = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']"))).getFirstSelectedOption().getText();
			Assert.assertEquals("3",selectedOption);
			
			//To validate the subject
			String selectedOption1 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).getFirstSelectedOption().getText();
			Assert.assertEquals("Mathematics",selectedOption1);
			
			//To validate Titles in the rubric
			String expected=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']");
			Assert.assertEquals("Test data 1",expected,"Tite one data is not copyed");
			
			String expected1=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']");
			Assert.assertEquals("Test data 2",expected1,"Tite two data is not copyed");
		    
			String expected2=getValue("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']");
			Assert.assertEquals("Test data 3",expected2,"Tite three data is not copyed");
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//************************************************************************138**********************************
	@Test(priority=138)
	public void HundredAndThirtyEighty_Subject_drop_down_menu_is_Displayed()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName+"Copy Test");
		  
		  //To click on copy button.
		   click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		   //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select ruberic search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName+"Copy Test");
			
			Thread.sleep(1000);
			boolean subject=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']");
			Assert.assertFalse(subject,"Subject Text box is enabled");
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			String message=e.getMessage();
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured"+message);
		}
	}
	//*****************************************************************139******************************************************************
	@Test(priority=139)
	public void HundredAndThirtynine_Subject_drop_down_menu_is_Displayed()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		  
		  //To click on copy button.
		   click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		   //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select rubric search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//Clear the Downloaded location
			//FileUtils.cleanDirectory(new File ("C:\\Users\\sebastian\\Downloads"));
				
			//Click on Print rubric button.
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnPrint']");
			
			//To click PDF Button
			Thread.sleep(1000);
			click("//*[@id='linkPdf']");
			
			//To switch to New Tab
			Thread.sleep(3000);
			ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs3.get(2));
			Thread.sleep(3000);
			
			//To click on Accept download option
			Handle_windows_Popup();
			
			//Close new tab and switch back.
			driver.close();
		    driver.switchTo().window(tabs3.get(1));
		    
		    //Click on Print rubric button.
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnPrint']");
			
			//To click PDF Button
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_linkWord']");
			
			//To switch to New Tab
			Thread.sleep(3000);
			ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs4.get(2));
			Thread.sleep(3000);
			
			//To click on Accept download option
			Handle_windows_Popup();
			
			//Close new tab and switch back.
			driver.close();
		    driver.switchTo().window(tabs3.get(1));
			
			//To verify the downloaded files.
		    Thread.sleep(10000);
			Assert.assertTrue(isFileDownloaded("pdf"), "Failed to download Expected document");
			
			//Thread.sleep(3000);
			//Assert.assertTrue(isFileDownloaded(DownloadLocation,".doc"), "Failed to download Expected document");
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//*****************************************************************139******************************************************************
		@Test(priority=140)
		public void HundredAndforty_Subject_drop_down_menu_is_Displayed()
		{
			try
			{
				CheckExtraTabs();
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To click on Add modify ruberics
				click ("//*[@id='hprlnkAddModifyRubrics']");
				
				//To switch to new tab
				Thread.sleep(3000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    
			    String RubericName=generateRandomData();
			    ruberic.CreateOneRuberic(RubericName);
			    
			    //To change the ruberic name
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
			  
			  //To click on copy button.
			   click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
			   
			   //To select search filtering;
			    //Thread.sleep(2000);
			    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
				
				//To select rubric search	
				Thread.sleep(2000);
				//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
				
				//Click on add new rubric dimension;
				waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				
				//To validate the elements.
			    boolean  Dimension=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']");
				Assert.assertTrue(Dimension,"Dimension is not enabled");
				
				//To verify the Weighting Multiplier
				boolean  We_Multiplier=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']");
				Assert.assertTrue(We_Multiplier,"Weighting Multiplier is not enabled");
				
				//To verify the test data 1
				boolean  Testdata1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1']");
				Assert.assertTrue(Testdata1,"Weighting Multiplier is not enabled");
				
				//To verify the test data 2
				boolean  Testdata2=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2']");
				Assert.assertTrue(Testdata2,"Weighting Multiplier is not enabled");
				
				//To verify the test data 3
				boolean  Testdata3=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3']");
				Assert.assertTrue(Testdata3,"Weighting Multiplier is not enabled");
				
				//To verify the save details
				boolean  Savedetails=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
				Assert.assertTrue(Savedetails,"Save Details is not enabled");
				
				//To verify the save details
				boolean  Cancel=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCancelDetail']");
				Assert.assertTrue(Cancel,"Cancel is not enabled");
				
			}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//**********************************************141*********************************************************************************************************************
		@Test(priority=141)
		public void HundredAndfortyOne_Dimension_character_limit_of_250()
		{
			try
			{

				CheckExtraTabs();
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To click on Add modify ruberics
				click ("//*[@id='hprlnkAddModifyRubrics']");
				
				//To switch to new tab
				Thread.sleep(3000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    
			    String RubericName=generateRandomData();
			    ruberic.CreateOneRuberic(RubericName);
			    
			    //To change the ruberic name
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
			  
			    //To click on copy button.
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
			   
			    //To select search filtering;
			    //Thread.sleep(2000);
			    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
				
				//To select rubric search	
				Thread.sleep(2000);
				//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
				
				//Click on add new rubric dimension;
				waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				
				//TO fill the dimension
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']","What is Lorem Ipsum? Lorem Ipsum is"
						+ " simply dummy text of the printing "
						+ "and typesetting industry. Lorem Ipsum "
						+ "has been the industry's standard dummy"
						+ " text ever since the 1500s, when an "
						+ "unknown printer took a galley of type and "
						+ "scrambled it to make a type specimen book."
						+ " It has survived not only five centuries");
				
				String Validationmessage=readAlertMessageText();
				Assert.assertEquals(Validationmessage,"Maximum characters allowed are 250");	
				//To click on Accept download option
				AcceptAlert();
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
		}
		
		//************************************************142*********************************************************************
		@Test(priority=142)
		public void HundredAndfortyTwo_only_accepts_numerical_inputs_up_to_2_decimal_places()
		{
			try
			{
				CheckExtraTabs();
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To click on Add modify ruberics
				click ("//*[@id='hprlnkAddModifyRubrics']");
				
				//To switch to new tab
				Thread.sleep(3000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    
			    String RubericName=generateRandomData();
			    ruberic.CreateOneRuberic(RubericName);
			    
			    //To change the ruberic name
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
			  
			    //To click on copy button.
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
			   
			    //To select search filtering;
			    //Thread.sleep(2000);
			    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
				
				//To select rubric search	
				Thread.sleep(2000);
				//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
				
				//Click on add new rubric dimension;
				waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				
				//To fill the Weighting Multiplier (More than permitted limit)
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","100");
				
				//To click on save button
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
				
				boolean actual=isDisplayed("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_RegularExpressionValidator1']");
				Assert.assertTrue(actual);
				
				//To fill the Weighting Multiplier (More than permitted limit)
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","-1");
				
				//To click on save button
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
				
				boolean actual1=isDisplayed("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_RegularExpressionValidator1']");
				Assert.assertTrue(actual1);
				
				//To fill the Weighting Multiplier (only permitted limit)
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","50");
				
				//To click on save button
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
				
				Thread.sleep(1000);
				if(isAlertPresents())
					Assert.assertTrue(true);
				else
					Assert.assertTrue(false,"Alert message is not working properly and Weighting Multiplier validation is not working");
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
	}
	//************************************************143*********************************************************************
	@Test(priority=143)
	public void HundredAndfortyThree_Save_Detail_and_Cancel_buttons_are_functioning_correctly()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		  
		    //To click on copy button.
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		    //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select rubric search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//Click on add new rubric dimension;
			waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			
			//To fill the dimension
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']","Dimention Value one");
			
			//To click on save button
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
			
			waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00__0']/td[3]");
			String Expected=getText("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00__0']/td[3]");
			Assert.assertEquals("Dimention Value one", Expected);
			
			//Click on add new rubric dimension;
			waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			
			//To click on cancel button
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCancelDetail']");
			
			Thread.sleep(1000);
			boolean actual1=isDisplayed("//*[@id='dimensionEdit']/table");
			Assert.assertFalse(actual1,"cancel button is not working properly");	
				
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}	

	//*******************************************144******************************************************************************
	@Test(priority=144)
	public void HundredAndfortyFour_Refresh_Grid_button_works_correctly()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		  
		    //To click on copy button.
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		    //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select rubric search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//Click on add new rubric dimension;
			waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			
			//TO fill the dimension
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']","What is Lorem Ipsum? Lorem Ipsum is");
			
			//To fill the Weighting Multiplier
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","3");
			
			//To click on save button
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
			
			//To click on Add/View button.
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00_ctl04_StandardsPopup']");
			
			Thread.sleep(1000);
			SwitchFrameName("StandardsDialog");
			//To check the available standards
			int i=0;
			for(i=10;i<27;i+=3)
			{
			 check("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_rgStandards_ctl00_ctl"+i+"_CheckboxSelectColumnSelectCheckBox']");	
			}
			
			//To click on select option
			click("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_SplitButton']/span[1]/span");
			
			//To select add checked search standards
			click("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_RadContextMenu1_detached']/ul/li[4]/span");
			
			driver.switchTo().defaultContent();
			
			//To click on close button.
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_CurriculumMapRubricDetail1_StandardsDialog']/div[1]/div/ul/li[2]/span");
			
			//To read default count of the standard.
			String defaultcount=getText("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00_ctl04_StandardsCount']");
			Assert.assertEquals("0",defaultcount,"Default count is not zero");
			
			//To click on refresh grid
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnRefresh']");
			
			//To read default count of the standard.
			Thread.sleep(1000);
			String Standardscount=getText("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00_ctl04_StandardsCount']");
			Assert.assertEquals("6",Standardscount,"Default count is not zero");
			
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//******************************************************145********************************************************************************************
	@Test(priority=145)
	public void HundredAndfortyFive_same_menu_as_Add_New_Rubric_Dimension()
	{
		try
		{
			CheckExtraTabs();
			HundredAndEight_Pop_Up_for_full_ruberic();
			
			//To click on Add modify ruberics
			click ("//*[@id='hprlnkAddModifyRubrics']");
			
			//To switch to new tab
			Thread.sleep(3000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    String RubericName=generateRandomData();
		    ruberic.CreateOneRuberic(RubericName);
		    
		    //To change the ruberic name
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		  
		    //To click on copy button.
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
		   
		    //To select search filtering;
		    //Thread.sleep(2000);
		    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
			
			//To select rubric search	
			Thread.sleep(2000);
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
			
			//Click on add new rubric dimension;
			waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			
			//TO fill the dimension
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']","What is Lorem Ipsum? Lorem Ipsum is");
			
			//To fill the Weighting Multiplier
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","3");
			
			//To click on save button
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
			
			//To click on edit button.
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00_ctl04_clbEditRow']");
			
			//To validate the elements.
			//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']");
			Thread.sleep(1000);
		    boolean  Dimension=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']");
			Assert.assertTrue(Dimension,"Dimension is not enabled");
			
			//To verify the Weighting Multiplier
			boolean  We_Multiplier=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']");
			Assert.assertTrue(We_Multiplier,"Weighting Multiplier is not enabled");
			
			//To verify the test data 1
			boolean  Testdata1=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1']");
			Assert.assertTrue(Testdata1,"Weighting Multiplier is not enabled");
			
			//To verify the test data 2
			boolean  Testdata2=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2']");
			Assert.assertTrue(Testdata2,"Weighting Multiplier is not enabled");
			
			//To verify the test data 3
			boolean  Testdata3=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3']");
			Assert.assertTrue(Testdata3,"Weighting Multiplier is not enabled");
			
			//To verify the save details
			boolean  Savedetails=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
			Assert.assertTrue(Savedetails,"Save Details is not enabled");
			
			//To verify the save details
			boolean  Cancel=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCancelDetail']");
			Assert.assertTrue(Cancel,"Cancel is not enabled");
			
			//To click cancel button
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCancelDetail']");
			
			//To validate Add new ruberic dimension.
			boolean data=isEnabled("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
			Assert.assertTrue(data,"Add new ruberic dimension in not displayed");
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false,"Exception Occured");
		}
	}
	//******************************************************146********************************************************************************************
		@Test(priority=146)
		public void HundredAndfortySix_Add_View_button_in_the_Standards()
		{
			try
			{
				CheckExtraTabs();
				HundredAndEight_Pop_Up_for_full_ruberic();
				
				//To click on Add modify ruberics
				click ("//*[@id='hprlnkAddModifyRubrics']");
				
				//To switch to new tab
				Thread.sleep(3000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    
			    String RubericName=generateRandomData();
			    ruberic.CreateOneRuberic(RubericName);
			    
			    //To change the ruberic name
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
			  
			    //To click on copy button.
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnCopy']");
			   
			    //To select search filtering;
			    //Thread.sleep(2000);
			    waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']");
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjectFilter']"))).selectByVisibleText("Mathematics");
				
				//To select rubric search	
				Thread.sleep(2000);
				//waitFor("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']")
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlRubrics']"))).selectByVisibleText(RubericName);
				
				//Click on add new rubric dimension;
				waitForEnable("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAddNewDetail']");
				
				//TO fill the dimension
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtDimension']","What is Lorem Ipsum? Lorem Ipsum is");
				
				//To fill the Weighting Multiplier
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtWeightingMultiplier']","3");
				
				//To click on save button
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSaveDetail']");
				
				//To click on Add/View button.
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_rgRubricDetail_ctl00_ctl04_StandardsPopup']");
				
				Thread.sleep(1000);
				SwitchFrameName("StandardsDialog");
				//To check the available standards
				
				//To validate Add new ruberic dimension.
				boolean data=isEnabled("//*[@id='ctl00_oBodyTag']/table[3]/tbody/tr/td/table/tbody/tr");
				Assert.assertTrue(data,"Pp up is noy displayed in not displayed");
				
				//To validate the pop up name.
				String popupName=getText("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_lblSectionTitle']");
				Assert.assertEquals("Rubric Standards",popupName);
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
		}	
			
		 //*********************147*******************************************************************
		@Test(priority=147)
		public void HundredAndfortySeven_left_of_this_window_is_Rubric_Standards()
		{
			try
			{
				HundredAndfortySix_Add_View_button_in_the_Standards();
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
		}		
		 //*********************148*******************************************************************
		@Test(priority=148)
		public void HundredAndfortyeight_2_tabs_Search_for_Standards_and_Edit_Selected_Standards()
		{
			try
			{
				HundredAndfortySix_Add_View_button_in_the_Standards();
				
				//To validate the Two tabs
				String actual=getText("//*[@id='Tab1']/span");
				Assert.assertEquals("Search for Standards",actual);
				

				//To validate the Two tabs
				String actual1=getText("//*[@id='Tab2']/span");
				Assert.assertEquals("Edit Selected Standards",actual1);
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
		}
		 //*********************149*******************************************************************
		@Test(priority=149)
		public void HundredAndfortynine_tabs_Search_for_Standards_and_Edit_Selected_Standards()
		{
			try
			{
				HundredAndfortySix_Add_View_button_in_the_Standards();
				
				//To validate Saved Favorites:(Label)
				String label1=getText("//*[@id='Table1']/tbody/tr[2]/td[1]");
				Assert.assertEquals("Saved Favorites:",label1);
				
				//To validate the drop down
				boolean actual=isEnabled("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_ddlFavorites']");
				Assert.assertTrue(actual,"Saved Favorites drop is not displayed");
				//***
				//To validate Standards Type:(Label)
				String label2=getText("//*[@id='Table1']/tbody/tr[4]/td[1]");
				Assert.assertEquals("Standards Type:",label2);
				
				//To validate the drop down
				boolean actual2=isEnabled("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_cbddlStandardsType']");
				Assert.assertTrue(actual2,"Saved Favorites is not displayed");
				//*****
				//To validate Subject:(Label)
				String label3=getText("//*[@id='Table1']/tbody/tr[5]/td[1]");
				Assert.assertEquals("Subject:",label3);
				
				//To validate the drop down
				boolean actual3=isEnabled("//*[@id='ctl00_ContentPlaceHolder1_StateStandardSearch1_cbddlSubject']");
				Assert.assertTrue(actual3," Subject is not displayed");
				//***
				//To Validate the sub category (Label)
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}
		}
		//***************************************150***************************************************************************
		
}
	






		
		



	



	
