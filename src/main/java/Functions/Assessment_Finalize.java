package Functions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class Assessment_Finalize  extends BaseClassOne {
	
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	addStandard standard=new addStandard();
	DeleteorUnlinkQustions findAssess=new DeleteorUnlinkQustions();
	objectData obj=new objectData();
	String AsseName=obj.readData("Finalize_Assessment");
	//****************************************************Finalize the assessment through Edit Assessment Page*********************
	@Test(priority=1)
	public void Finalize_Through_Edit_Assessment_Page()
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
			
			//To select Finalize Assessment
			Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_lnkFinalize']");
			
			//To check the validation message and Visibility of the edit button
	        Thread.sleep(2000);
	         
	        Assert.assertEquals(true,(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']")).size())==0);
	        
	        Assert.assertTrue(driver.getPageSource().contains("You have successfully finalized the assessment"));
	        
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
	//****************************************** Un-finalize the assessment through "Manage Assessment"****************
	@Test(priority=2)
	public void Unfinalize_Through_Manage_Assessment()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To Find The Assessment
		
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Click Manage assessment
			Thread.sleep(1000);
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
			
			//Fill Test name contains
			Thread.sleep(1000);
			type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']",AsseName);
			
			//To search the assessment
			
			click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
			
			//To Select unfinalize the assessment
			Thread.sleep(1000);
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkUnLockAssessment']");
			
			//To Handle Alerts
			Thread.sleep(1000);
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        Thread.sleep(1000);
	        Alert alert1 = driver.switchTo().alert();
	        alert1.accept();
	        
	        Thread.sleep(2000);
	      //To click edit assessment
		   driver.findElement(By.id("ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment")).click();
	       Thread.sleep(2000);
	        
	       // To check whether the Edit element is Available or not
	       Assert.assertEquals(true,(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']")).size())==1);
	        
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
	//****************************************** Finalize the assessment through "Manage Assessment"****************
	@Test(priority=3)
	public void Finalize_Through_Manage_Assessment()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To finalize Element
			FinalizeAssessment("Finalize_Assessment");
	      
	       //To click on edit assessment
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment")).click();
			
			//To validate the validation message and Visibility of the edit button
			Thread.sleep(2000);
	        Assert.assertEquals(true,(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnEdit']")).size())==0);
	        
	        Assert.assertTrue(driver.getPageSource().contains("You have successfully finalized the assessment"));		
			
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
	
	
	//**To finalize a assessment*****
	
	 public void FinalizeAssessment(String AssessmentName)
	    {
		    objectData obj1=new objectData();
			String AsseName1=obj1.readData(AssessmentName);
	    	try
	    	{
	    		
	    		//Click on main menu local Assignment.
	    		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
	
				//Click Manage assessment
				Thread.sleep(2000);
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
				
				
				//Fill Test name contains
				Thread.sleep(1000);
				type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']",AsseName1);
				
				//To search the assessment
				click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
				
				//To Select finalize the assessment
				Thread.sleep(1000);
				click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkLockAssessment']");
	    		
	    	}
	    	 catch (Exception e)
			{
				
				System.out.println(e);	
				
			}
	    }
}
