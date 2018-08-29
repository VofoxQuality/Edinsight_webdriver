package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class Create_New_Assessment_Survay extends BaseClassOne {
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	// To fill the assessment Name
	objectData obj=new objectData();
	String AsseName=obj.readData("Survay_Assessment_Name");
	@Test(priority=1)
	public void Survay_Assessment()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To call New Survay Assessment
			Assessment.New_AssESSMENT(AsseName,"Survey");
			
			Thread.sleep(2000);
			
			Survay_QT_Pick_Two();
			Survay_QT_Multiple_Choice();
			Survay_QT_Likert_Sacle();
			Survay_QT_Agree_OR_Disagree();
			Survay_Check_All_That_Apply();
			Survay_QT_True_Or_False();
			Survay_QT_Yes_Or_No();
			
			//To click back to assessment
			Thread.sleep(3000); 
			click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			Thread.sleep(2000); 
			String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			System.out.println(expected);
			//To validate the assessment names
			Assert.assertEquals(AsseName, expected);
			String expected1=driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl09_Label1")).getText();
			Assert.assertEquals("7", expected1);
		
		        
		}
	       
		catch (Exception e)
		{
				
			try {
				Logout();
			} catch (Exception e1) {
					// TODO Auto-generated catch block
			e1.printStackTrace();
			}
			   
			 	Assert.assertTrue(false);
		}
	}		
		
		//***************Questions Agree or Disagree*********************
	
		public void Survay_QT_Agree_OR_Disagree()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Agree or Disagree");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				Thread.sleep(1000);
				
				 //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
				
			  	// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveQuestion']");
				
				
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
		//*************************Check All That Apply*********************
		public void Survay_Check_All_That_Apply()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Check All That Apply");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
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
			    
			  //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
				
			  	// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveQuestion']");
				
				
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
		
		//*************************Likert Scale**************************
		public void Survay_QT_Likert_Sacle()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Likert Scale");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				Thread.sleep(1000);
				
				 //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
				
			  	// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveQuestion']");
				
				
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
		
		//*************************Yes or No**************************
		public void Survay_QT_Yes_Or_No()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Yes or No");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				Thread.sleep(1000);
				
				 //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
				
			  	// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveQuestion']");
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
				Thread.sleep(3000);
				//To click next Questions.
				click("//*[@id='ctl00_MainContent_btnNextQuestion']");
						
			}
			catch (Exception e)
			{
					
				System.out.println("Error"+e);
			}
		}
		
		//*************************Yes or No**************************
		public void Survay_QT_Multiple_Choice()
				{
					try
					{
						Thread.sleep(5000);
						new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Multiple Choice");
						
						Thread.sleep(1000);
						driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
						driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
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
					    
					    //To fill the Default Library Name 
					    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
					  		
					  	//To fill the Default Sub-Library Name 
					  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
						
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
		//*************************Yes or No**************************
		public void Survay_QT_Pick_Two()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("Pick Two");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
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
			    
			    //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
				
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
		
		//*************************Yes or No**************************
		public void Survay_QT_True_Or_False()
		{
			try
			{
				Thread.sleep(5000);
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText("True or False");
						
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
				driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
				Thread.sleep(1000);
						
				 //To fill the Default Library Name 
				type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
					  		
				//To fill the Default Sub-Library Name 
				type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
						
				// To Save the Question
				click("//*[@id='ctl00_MainContent_btnSaveQuestion']");
						
						
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
				Thread.sleep(3000);
				
				//To click next Questions.
				click("//*[@id='ctl00_MainContent_btnNextQuestion']");
								
			}
			catch (Exception e)
			{
		   System.out.println("Error"+e);
			}
		}
		//********************************************************************************************************
		public void Survay_Question_required_Fields(String QuestionType)
		{
			try
			{
				login(Supertent_Login_id,Supertent_Login_Password);
				 
				String Name=generateRandomData();
				//To fill the assessment Name
				Assessment.New_AssESSMENT(Name,"Assessment Rubric");
				
				//To select the drop down
				new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText(QuestionType);
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
				
				
			}
			catch (Exception e)
			{
		   System.out.println("Error"+e);
			}
		}		
}		
			
