package Functions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class CreateANew_Assessment extends BaseClassOne
{
	//To test assessment with Qustions
	@Test(priority=1)
	public void Assessment()
	{
		try
		{
		//Supertent Login
		 login(Supertent_Login_id,Supertent_Login_Password);
		 
		// To fill the assessment Name
		 objectData obj=new objectData();
		 String AsseName=obj.readData("Assessment_Name");
		 New_AssESSMENT(AsseName,"Test");
		 QT_Short_Response();
	     QT_Pick_Two();
		 QT_Extended_Response_Full_Rubic();
		 QT_Multiple_Choice();
		 QT_True_or_False();
		 QT_Check_All_That_Apply();
		 QT_Essay();
		 QT_Check_All_That_True();
		 
		 //To click back to assessment
		 Thread.sleep(3000); 
		 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
		 String actual="8";
		 String expected=driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl10_Label1")).getText();
		 Assert.assertEquals(actual, expected);
		//Supertent Logout
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
	//*********************************Create a New a Assessment*********************
	
	public void New_AssESSMENT(String AsseName,String Category)
	{	
		try
		{
		
		
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			Thread.sleep(1000);
			// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
			click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
			
			//To fill the Test collection.
			type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']","Ajith or Maneesh");
			
			//To fill the Test Edition/Category 
			type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']","AJ- edition");
		   
			//To select (Drop down) Testing Grade 
		    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingGrade"))).selectByVisibleText("Fifth Grade");
		    
		    //To select (Drop down)Testing Period 
		    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingPeriod"))).selectByVisibleText("Testing Period 5");
		    
		    
			type("//*[@id='ctl00_MainContent_txtAssessmentName']",AsseName);
			
			//To select Measure Type
			if(Category.equals("Survey"))
			{	
			
				//To select Measure Type "Survey"
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlMeasureType"))).selectByVisibleText("Survey");
			}
			else if(Category.equals("Assessment Rubric"))
			{	
				//To select Measure Type "Survey" 
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlMeasureType"))).selectByVisibleText("Assessment Rubric");
			}
			else if(Category.equals("Test"))
			{	
				//To select Measure Type "Survey" 
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlMeasureType"))).selectByVisibleText("Test");
			}
			
			else
			{
				System.out.println("Invlid Measure Type");
			}
				
			//To select Subject.
			new Select(driver.findElement(By.id("ctl00_MainContent_ddlCategory"))).selectByIndex(1);
			
			//To fil Assessment Desc 
			type("//*[@id='ctl00_MainContent_txtAssessmentDesc']","Lorem Ipsum is simply "
					+ "dummy text of the printing and typesetting industry");
			
			 //To fill the Default Library Name 
		    type("//*[@id='ctl00_MainContent_rcbLibraryName_Input']","4Sight");
		  		
		  	//To fill the Default Sub-Library Name 
		  	type("//*[@id='ctl00_MainContent_rcbSubLibraryName_Input']","4Sight");  
		  	Thread.sleep(1000);
			
			//To select Default Number of Choices:
			new Select(driver.findElement(By.id("ctl00_MainContent_ddlDefaultChoices"))).selectByIndex(2);
			
			//To check Share with District (viewable by other users inside district)
			check("//*[@id='ctl00_MainContent_chkViewInside']");  
			
			//To check Make this as restricted test (Its enable only for the restricted super user )
			//check("//*[@id='ctl00_MainContent_chkRestrictedTest']");
			
			// to Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			Thread.sleep(3000);
			
		
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
	}
	//*****************************************************Fill in the Blank*********************************************
		public void QT_Fill_in_the_Blank()
		{
			try
			{
			Thread.sleep(5000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Fill in the Blank");
			
			//Question
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
			
			//Blank space
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextTop']/div/ul[3]/li[3]/a")).click();
			
			
			//Right click on the blank space.
			WebElement frameElement = driver.findElement(By.id("ctl00_MainContent_txtQuestionText_contentIframe"));
			driver.switchTo().frame(frameElement);
			
			Thread.sleep(5000);
			driver.findElement(By.className("ohsfitb")).click();
			WebElement tb=driver.findElement(By.className("ohsfitb"));
			Actions action = new Actions(driver).contextClick(tb);
		    action.build().perform();
		    WebElement tb1=driver.findElement(By.className("ohsfitb"));
			Actions action1 = new Actions(driver).contextClick(tb1);
		    action1.build().perform();
		
		
		     
				
			}
			catch (Exception e)
			{
				System.out.println("Error"+e);
			}
		}	
		
	//*********************************************************True or False*****************************************************
	public void QT_True_or_False()
	{
		try
		{
	
	Thread.sleep(5000);
	new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("True or False");
	
	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
	
	// To slect True.
	click("//*[@id='ctl00_MainContent_rdoTrue']");
  	Thread.sleep(1000);
  	
  	// To Save the Question
  	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSaveQuestion']")).click();
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
	Thread.sleep(4000);
	
	//To click next Questions.
	click("//*[@id='ctl00_MainContent_btnNextQuestion']");
	//To click next Questions.
		click("//*[@id='ctl00_MainContent_btnNextQuestion']");
			 }
			  catch (Exception e)
			   {
				System.out.println("Error"+e);
			   }
		}	
		
	//******************************************************Short Response********************************************************
	public void QT_Short_Response()
	{
		try
		{
	
	Thread.sleep(5000);
	new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Short Response");
	
	//to select Full Rubic
	new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlRubricType']"))).selectByVisibleText("Full");
	
	driver.findElement(By.xpath("//input[contains(@id,'btnScoring')]")).click();
	Thread.sleep(2000);
	// Select Rubic
	// Subject.
	
	WebElement frameElement = driver.findElement(By.name("rwFullRubrics"));
	driver.switchTo().frame(frameElement);
	
	new Select(driver.findElement(By.id("ddlSubjectFilter"))).selectByIndex(1);
	Thread.sleep(1000);
	//To Click Select Rubic
	driver.findElement(By.xpath("//input[@id='btnSelectRubric']")).click();
	
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
  	Thread.sleep(1000);
  	
  	// To Save the Question
  	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSaveQuestion']")).click();
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
	Thread.sleep(4000);
	
	//To click next Questions.
	click("//*[@id='ctl00_MainContent_btnNextQuestion']");
		 }
		  catch (Exception e)
		   {
			System.out.println("Error"+e);
		   }
	}	
	//*****************************************************Pick Two*****************************************************
	public void QT_Pick_Two()
	{
		try
		{
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Question 1");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
		Thread.sleep(500);
		//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).clear();
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
		//driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
		//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
	    //driver.switchTo().defaultContent();
		Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
	   // driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
	    //driver.switchTo().defaultContent();
		Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
	    //driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
	    //driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl05_chkCorrectAnswer']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl04_chkCorrectAnswer']")).click(); 
		
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
		System.out.println("Error"+e);
	   }
	}	
	//*****************************************************Multiple Choice**********************************************
	public void QT_Multiple_Choice()
	{
		try
		{
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Question 1");
		driver.switchTo().defaultContent();
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
	    driver.findElement(By.xpath("//*[@id='ctl00_MainContent_grdAnswers_ctl05_rdoCorrectAnswer']")).click(); 
	    
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
			System.out.println("Error"+e);
		}
	}
	
		
	//*****************************************************To Extended Response Questions*********************************
	
	public void QT_Extended_Response_Full_Rubic()
	{
		try
		{
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Extended Response");
		
		//to select Full Rubic
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlRubricType']"))).selectByVisibleText("Full");
		
		driver.findElement(By.xpath("//input[contains(@id,'btnScoring')]")).click();
		Thread.sleep(2000);
		// Select Rubic
		
		WebElement frameElement = driver.findElement(By.name("rwFullRubrics"));
		driver.switchTo().frame(frameElement);
		
		new Select(driver.findElement(By.id("ddlSubjectFilter"))).selectByIndex(1);
		Thread.sleep(1000);
		//To Click Select Rubic
		driver.findElement(By.xpath("//input[@id='btnSelectRubric']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
		
	  	Thread.sleep(1000);
	  	
	  	// To Save the Question
	  	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSaveQuestion']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
		Thread.sleep(4000);
		
		//To click next Questions.
		click("//*[@id='ctl00_MainContent_btnNextQuestion']");
		
		
		
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	
	//*****************************************************To create Essay Questions********************************* 
	public void QT_Essay()
	{
		try
		{
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Essay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'btnScoring')]")).click();
		Thread.sleep(2000);
		type("//*[@id='txtScoreRubic_0']","1");
		type("//*[@id='txtScoreRubic_1']","2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
		
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
			System.out.println("Error"+e);
		}
		
	}  
	
	public void QT_Check_All_That_Apply()
	{
		try
		{
		//*[@id='ctl00_MainContent_ddlQuestionType']
			
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Question 1");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
		Thread.sleep(500);
		//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).clear();
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
		//driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
		//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
	    //driver.switchTo().defaultContent();
		Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
	   // driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
	    //driver.switchTo().defaultContent();
		Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
	    //driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).clear();
	    Thread.sleep(500);
	    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
	    //driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl05_chkCorrectAnswer']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl04_chkCorrectAnswer']")).click();
		
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
			System.out.println("Error"+e);
		}
	
	}
	
	
	public void QT_Check_All_That_True()
	{
		try
		{
		
			Thread.sleep(5000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Are True");
			
		/*	WebElement fr = driver.findElement(By.id("ctl00_MainContent_txtQuestionText_contentIframe"));
	        driver.switchTo().frame(fr);  */
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
			driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Question 1");
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).click();
			Thread.sleep(500);
			//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).clear();
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl02_txtAnswerCenter")).sendKeys("Answer 1");
			//driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).click();
			//driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl03_txtAnswerCenter")).sendKeys("Answer 2");
		    //driver.switchTo().defaultContent();
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).click();
		   // driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).clear();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl04_txtAnswerCenter")).sendKeys("Answer 3");
		    //driver.switchTo().defaultContent();
			Thread.sleep(1000);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).click();
		    //driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).clear();
		    Thread.sleep(500);
		    driver.findElement(By.id("ctl00_MainContent_grdAnswers_ctl05_txtAnswerCenter")).sendKeys("Answer 4");
		    //driver.switchTo().defaultContent();
		    
		    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl05_chkCorrectAnswer']")).click();
		    
		    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_grdAnswers_ctl04_chkCorrectAnswer']")).click();
			
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
			System.out.println("Error"+e);
		}
	}	
	
	
	public void QT_Add_Standared_True_or_False()
	{
		try
		{
			Thread.sleep(5000);
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("True or False");
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).click();
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_txtQuestionTextCenter']")).sendKeys("Question 1");
			
			// To select True.
			click("//*[@id='ctl00_MainContent_rdoTrue']");
		  	
		  	// To Save the Question
		  	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSaveQuestion']")).click();
			
			
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	//*********************************************************************************************************
	public void Assessment_Type_Survay(String option)
	{
		try
		{
			login(Supertent_Login_id,Supertent_Login_Password);
			 
			String Name=generateRandomData();
			//To fill the assessment Name
			New_AssESSMENT(Name,"Survey");
			
			//To select the drop down
			new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText(option);
			
			Thread.sleep(2000);
			Assert.assertTrue(isDisplayed("//*[@id='ctl00_MainContent_txtQuestionText']"),"Question Text box is not displayed");
			
		   //To click on save button
		   click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
		    
		  
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}
