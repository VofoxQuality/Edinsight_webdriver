package Functions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class DeleteorUnlinkQustions extends BaseClassOne {
	
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	objectData obj=new objectData();
	addStandard standard=new addStandard();
	String AsseName=obj.readData("DeleteOrUnlink");
	//**********************************************Delete one Question from the  Assessment************
	@Test(priority=1)
	public void Delete_One_Qustions()
	{
		try
		{
			
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		//To fill the assessment Name
		Assessment.New_AssESSMENT(AsseName,"Test");
		Assessment.QT_Essay();
		
		//standard.FindAssessmentName();
		Thread.sleep(4000);
				 
		//Back to Assessment
		click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");	  
		 
		//To select the question(Check box)
		click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
		
		//To read Qustion Name
		String QustionID=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions']/tbody/tr/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[3]/span[1]");
		System.out.println(QustionID);
		
		//To delete all selected Qustions
		DeleteOrUnlinkQustions("Delete");
		
        //To verify whether the deleted element is found or not in the page
        Thread.sleep(1000);
        Assert.assertTrue(!driver.getPageSource().contains(QustionID));
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
	//************************To Delete multiple Questions from the assessment******************
	@Test(priority=2)
	public void Delete_Multiple_Qustions()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			//Assessment.New_AssESSMENT(AsseName);
			FindoutAssessment("DeleteOrUnlink");
			
			
			//To click crate new Question from dash board
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(.,'Add New Question')]")).click();
			
			Assessment.QT_Pick_Two();
			Assessment.QT_Extended_Response_Full_Rubic();
			Assessment.QT_Multiple_Choice();
			
			//standard.FindAssessmentName();
			Thread.sleep(4000);
					 
			//Back to Assessment
			click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			
			//Check all 
			click("//*[@id='ctl00_MainContent_FullTestView1_chkAll']");
			
			//To delete all selected Qustions
			DeleteOrUnlinkQustions("Delete");
			
			Thread.sleep(1000);
			Assert.assertEquals(true,driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_Label1']")).size() < 1);
			
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
	//************************To Unlink all Questions from the assessment******************
		@Test(priority=3)
		public void Unlink_All_Qustions()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				//Assessment.New_AssESSMENT(AsseName);
				FindoutAssessment("DeleteOrUnlink");
				
				
				//To click crate new Question from dash board
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[contains(.,'Add New Question')]")).click();
				
				Assessment.QT_Pick_Two();
				Assessment.QT_Extended_Response_Full_Rubic();
				Assessment.QT_Multiple_Choice();
				
				//standard.FindAssessmentName();
				Thread.sleep(4000);
						 
				//Back to Assessment
				click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				
				
				//Check all 
				click("//*[@id='ctl00_MainContent_FullTestView1_chkAll']");
				
				//To delete all selected Qustions
				DeleteOrUnlinkQustions("Unlink");
				
				Thread.sleep(1000);
				Assert.assertEquals(true,driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_Label1']")).size() < 1);
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
		
		//************************To Unlink one Questions from the assessment******************
		@Test(priority=4)
		public void Unlink_one_Qustions()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				//Assessment.New_AssESSMENT(AsseName);
				FindoutAssessment("DeleteOrUnlink");
				
				//To click crate new Question from dash board
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[contains(.,'Add New Question')]")).click();
				
				Assessment.QT_Pick_Two();
				
				//standard.FindAssessmentName();
				Thread.sleep(4000);
						 
				//Back to Assessment
				click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				
				
				//To select the question from assessment(Check box)
				click("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_chkQuestion']");
				
				String QustionID=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions']/tbody/tr/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[3]/span[1]");
				System.out.println(QustionID);
				
				//To delete all selected Qustions
				DeleteOrUnlinkQustions("Unlink");
				
				Thread.sleep(1000);
				Assert.assertTrue(!driver.getPageSource().contains(QustionID));
				
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
		//****To Delete all selected Questions*******
		public void DeleteOrUnlinkQustions(String option)
		{
			try
			
			{
				//To click Delete Assessment
				click("//*[@id='ctl00_MainContent_FullTestView1_btnDeleteQuestions']");
				
				if(option.contentEquals("Delete"))
				{
					Thread.sleep(1000);
					//To click Delete Button from the pop up
					click("//*[@id='ctl00_MainContent_FullTestView1_imgBtnDeleteMultiDelete']");
					WebDriverWait wait = new WebDriverWait(driver, 2);
			        wait.until(ExpectedConditions.alertIsPresent());
			        Alert alert = driver.switchTo().alert();
			        alert.accept();
					
			    }
				else if(option.equals("Unlink"))
				{
					Thread.sleep(1000);
					//To click Unlink Assessment
					click("//*[@id='ctl00_MainContent_FullTestView1_imgUnLinkMultiDelete']");
					WebDriverWait wait = new WebDriverWait(driver, 2);
			        wait.until(ExpectedConditions.alertIsPresent());
			        Alert alert = driver.switchTo().alert();
			        alert.accept();
			        Thread.sleep(1000);
			        Alert alert1 = driver.switchTo().alert();
			        alert1.accept();
				    
				}
				else
				{
					System.out.println("Invlaid Delete Process");
				}
				
			}
					
			catch (Exception e)
			{
				System.out.println(e);
		    }
		}
		

		//To find a Assessment in the List
	    public void FindoutAssessment(String AssessmentName)
	    {
	    	try
	    	{
	    		
	    	objectData obj=new objectData();
	    	String AsseName1=obj.readData(AssessmentName);
	    		
	    	//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click Manage assessment
			Thread.sleep(1000);
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
			
			//Fill Test name contains
			Thread.sleep(1000);
			type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']",AsseName1);
			
			//To search the assessment
			click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
			
			Thread.sleep(1000);
			
			//To click edit assessment
			driver.findElement(By.id("ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment")).click();
			
	    	}
	    	 catch (Exception e)
			{
				
				System.out.println(e);	
				
			}
	    }
		
		
}
