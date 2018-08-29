package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class applayAttributes extends BaseClassOne
{
	 CreateANew_Assessment Assessment=new CreateANew_Assessment();
	@Test(priority=1)
	public void Add_Atribute()
	{
		try
		{
		//Supertent Login
		 login(Supertent_Login_id,Supertent_Login_Password);
		 
		// To fill the assessment Name
		 objectData obj=new objectData();
		 String AsseName=obj.readData("Attribute_Assessment");
		 Assessment.New_AssESSMENT(AsseName,"Test");
		 Assessment.QT_Essay();
		 //Back to Assessment
		 Thread.sleep(3000);
		 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
		 
		 //To select the question(Check box)
		 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
		 
		 //Apply Attributes
		 click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyAttribues']");
		 
		 // SwitchFrame()
		 WebElement frameElement = driver.findElement(By.name("MassEditAttributes"));
		 driver.switchTo().frame(frameElement);
		 
		//To select the Subject	
		click("//*[@id='QuestionBankAttributes1_rcbSubjects']/span/button");
		Thread.sleep(500);
		click("//*[@id='QuestionBankAttributes1_rcbSubjects_DropDown']/div/ul/li[3]/label/input");
			
			
		//Select Grade
		driver.findElement(By.cssSelector("button.rcbActionButton")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='QuestionBankAttributes1_rcbGrades_DropDown']/div/ul/li[4]/label/input")).click();
		//driver.findElement(By.xpath("//*[@id='QuestionBankAttributes1_rcbGrades_DropDown']/div/ul/li[4]/label/input")).click();
			
		//To select Webb's Cognitive
		new Select(driver.findElement(By.id("QuestionBankAttributes1_ddlWebbsCognitive"))).selectByIndex(2);
		//To select Bloom's
	    new Select(driver.findElement(By.id("QuestionBankAttributes1_ddlBlooms"))).selectByIndex(2);
	    //To select Difficulty:
	    new Select(driver.findElement(By.id("QuestionBankAttributes1_ddlDifficulty"))).selectByIndex(3);
	    
	    Thread.sleep(4000);
	    // To Select options 
		click("//*[@id='QuestionBankAttributes1_SplitButton']/span[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_RadContextMenu1_detached']/ul/li[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_SplitButton']/span[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_RadContextMenu1_detached']/ul/li[2]/span");
		
		//Back to default frame.
		driver.switchTo().defaultContent();
		
		//**************************** To Select only for tag name because of web browser issue.
		 Thread.sleep(3000);
		 //To select the question(Check box)
		 click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
		//Apply Attributes
		 click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyAttribues']");
		 
		 // SwitchFrame()
		 WebElement frameElement1 = driver.findElement(By.name("MassEditAttributes"));
		 driver.switchTo().frame(frameElement1);
			
		//To add Tag
		//*[@id='QuestionBankAttributes1_txtQuestionTag']
		type("//*[@id='QuestionBankAttributes1_txtQuestionTag']","Tax value");
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#QuestionBankAttributes1_btnQuestionTageSave")).click();
		
		Thread.sleep(3000);    
	    // To Select options 
		click("//*[@id='QuestionBankAttributes1_SplitButton']/span[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_RadContextMenu1_detached']/ul/li[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_SplitButton']/span[1]/span");
		Thread.sleep(1000);
		click("//*[@id='QuestionBankAttributes1_RadContextMenu1_detached']/ul/li[2]/span");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		String expected= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdSubjects_ctl02_lblSubjects']")).getText();
		Assert.assertEquals("Adult Education", expected);
		
		
		String expected1= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdSubjects_ctl02_lblSubjects']")).getText();
		Assert.assertEquals("Adult Education", expected1);
		
		String expected2= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdGradeLevels_ctl02_lblGradeCode']")).getText();
		Assert.assertEquals("01 - First Grade", expected2);
		
		
		String expected3= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_grdTags_ctl02_lblTag']")).getText();
		Assert.assertEquals("Tax value", expected3);
		
		 Assert.assertTrue(driver.getPageSource().contains("Low"));
		 Assert.assertTrue(driver.getPageSource().contains("Remembering/Knowledge"));
		 Assert.assertTrue(driver.getPageSource().contains("Medium"));
		 
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

  }

