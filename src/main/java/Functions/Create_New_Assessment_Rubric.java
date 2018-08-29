package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class Create_New_Assessment_Rubric extends BaseClassOne
{
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	objectData obj=new objectData();
	String AsseName=obj.readData("Rubric_Assessment");

	@Test(priority=1)
	public void _Assessment()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To call New Ruberic Assessment
			Assessment.New_AssESSMENT(AsseName,"Assessment Rubric");
			
			//
			Ruberic_Qustions("Interview");
			Ruberic_Qustions("Journal");
			Ruberic_Qustions("Observation");
			Ruberic_Qustions("Portfolio");
			Ruberic_Qustions("Presentation");
			Ruberic_Qustions("Project/Task-Based");
			
			//To click back to assessment
			 Thread.sleep(3000); 
			 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			System.out.println(expected);
			//To validate the assessment names
			Assert.assertEquals(AsseName, expected);
			String expected1=driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl08_Label1")).getText();
			Assert.assertEquals("6", expected1);
			Assert.assertTrue(driver.getPageSource().contains("Interview"));
			Assert.assertTrue(driver.getPageSource().contains("Journal"));
			Assert.assertTrue(driver.getPageSource().contains("Observation"));
			Assert.assertTrue(driver.getPageSource().contains("Portfolio"));
			Assert.assertTrue(driver.getPageSource().contains("Presentation"));
			Assert.assertTrue(driver.getPageSource().contains("Project/Task-Based"));
			
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
	
	//*************************Ruberic Qustions**************************
	
		public void Ruberic_Qustions(String type)
			{
				try
				{
					Thread.sleep(3000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_ddlQuestionType']"))).selectByVisibleText(type);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[contains(@id,'btnScoring')]")).click();
					Thread.sleep(2000);
					type("//*[@id='txtScoreRubic_0']","1");
					type("//*[@id='txtScoreRubic_1']","2");
							
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).click();
					driver.findElement(By.xpath("//div[contains(@id,'txtQuestionTextCenter')]")).sendKeys("Qustions 1");
					
					
					Thread.sleep(1000);
							
					 //To fill the Default Library Name 
					type("//*[@id='ctl00_MainContent_cbLibraryName_Input']","4Sight");
						  		
					//To fill the Default Sub-Library Name 
					type("//*[@id='ctl00_MainContent_cbSubLibraryName_Input']","4Sight");  
						
					Thread.sleep(1000);
					// To Save the Question
					//click("//*[@id='ctl00_MainContent_btnSaveOnEdit']");
					driver.findElement(By.xpath("//input[contains(@id,'btnSaveQuestion')]")).click();
					
					WebDriverWait wait1 = new WebDriverWait(driver,20);
					wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='ctl00_MainContent_btnNextQuestionTop']"))); 
					Thread.sleep(3000);
					
					//To click next Questions.
					click("//*[@id='ctl00_MainContent_btnNextQuestionTop']");
									
				}
				catch (Exception e)
				{
			   System.out.println("Error"+e);
				}
			}
}	
