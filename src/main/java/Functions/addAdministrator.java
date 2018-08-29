package Functions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class addAdministrator  extends BaseClassOne
{
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	Assessment_Finalize finalize=new Assessment_Finalize();
	DeleteorUnlinkQustions findAssess=new DeleteorUnlinkQustions();
	objectData obj=new objectData();
	String AsseName=obj.readData("Add_Administration");
	String actual;
	
//*************************To Add administration into assessment****************************/
	@Test(priority=1)
	public void Add_Addministration_to_Assessment()
	{
		try
		{	
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
		
			//To fill the assessment Name
			Assessment.New_AssESSMENT(AsseName,"Test");
			Assessment.QT_Essay();
					 
			//Back to Assessment
			Thread.sleep(4000);
			click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To finalize Element
			finalize.FinalizeAssessment("Add_Administration");
			
			Thread.sleep(1000);
			save_Administration();
			
			//To read the Successful alert
			Thread.sleep(1000); 
			String expected=getText("//*[@id='ctl00_MainContent_lblMsg']");
			String strid = getText("//*[@id='ctl00_MainContent_pvProperties']/table/tbody/tr[4]/td[3]");
			System.out.println(strid);
			actual = strid.replaceFirst(".*?(\\d+).*", "$1");
			System.out.println(actual);
			Assert.assertEquals("Administration Saved Successfully",expected);	
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
	//********************************************To verify the Add administration in assessment******* 
	@Test(priority=2)
	public void Verify_Add_Addministration()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//find assessment
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
			
			//Click on administrations 
			Thread.sleep(2000);
			//click("/*[@id='ctl00_MainContent_grdMyAssessments_ctl02_grdAdministrations_ctl02_lnkAdministrations']");
			driver.findElement(By.xpath("//a[contains(@id,'ctl00_MainContent_grdMyAssessments_ctl02_grdAdministrations_ctl02_lnkAdministrations')]")).click();
			
			String strid = getText("//*[@id='ctl00_MainContent_pvProperties']/table/tbody/tr[4]/td[3]");
			System.out.println(strid);
			String expected = strid.replaceFirst(".*?(\\d+).*", "$1");
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
		}
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
				Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
		}
	}
	//*******************************To delete administration from assessment
	@Test(priority=3)
	public void Delete_Administration()
	{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				//find assessment
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
				
				//Click on administrations 
				Thread.sleep(2000);
				//click("/*[@id='ctl00_MainContent_grdMyAssessments_ctl02_grdAdministrations_ctl02_lnkAdministrations']");
				driver.findElement(By.xpath("//a[contains(@id,'ctl00_MainContent_grdMyAssessments_ctl02_grdAdministrations_ctl02_lnkAdministrations')]")).click();
				
				//To select the option
				Thread.sleep(1000); 
				click("//*[@id='ctl00_MainContent_rsbAssessmentEditOptions']");
				//To delete the administration
				Thread.sleep(500);
				click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li[2]/span");
				Thread.sleep(1000); 
				Alert alert = driver.switchTo().alert();
			    alert.accept();
			    Thread.sleep(1000);
			    Assert.assertEquals(true,driver.findElements(By.xpath("//a[contains(@id,'ctl00_MainContent_grdMyAssessments_ctl02_grdAdministrations_ctl02_lnkAdministrations')]")).size() == 0);
			    Logout();
		}
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
				Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void save_Administration()
	{
		try
		{
			//To click create a new administration
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_lnkCreate']");
			
			//To fill administrator name.
			type("//*[@id='ctl00_MainContent_txtAdministrationName']","Test Data");
			
			//To select the option
			Thread.sleep(1000); 
			click("//*[@id='ctl00_MainContent_rsbAssessmentEditOptions']");
			Thread.sleep(500);
			click("//*[@id='ctl00_MainContent_rcmAssessmentEditOptions_detached']/ul/li/span");	
		}
		 catch (Exception e)
		{
			
			System.out.println(e);	
			
		}
	}
	
}		
		
