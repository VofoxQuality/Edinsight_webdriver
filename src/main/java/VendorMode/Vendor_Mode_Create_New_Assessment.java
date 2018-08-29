package VendorMode;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CheckList.Create_New_Assessment;
import Functions.CreateANew_Assessment;
import Library.BaseClassOne;

public class Vendor_Mode_Create_New_Assessment extends BaseClassOne
{
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	Create_New_Assessment Checklist_Assessment=new Create_New_Assessment();
	String Startongid;
	@Test(priority=1)
	public void One_Mandatory_Fields_in_vendor_test()
	{
		try
		{ 
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		//Click on main menu local Assignment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		Thread.sleep(1000);
		//Click on create a new assessment
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
		
		Thread.sleep(1000);
		// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
		click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
		
		// To Save the Assessment
		click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
		
		//To Verify the validations.
		Thread.sleep(2000);
		String expected=getText("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rfvTestType']");
		System.out.println(expected);
		Assert.assertEquals("You must select a test type", expected);
		
		String expected1=getText("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rfvTestEdition']");
		System.out.println(expected1);
		Assert.assertEquals("You must select test edition", expected1);
		
		String expected2=getText("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rfvTestingGrade']");
		System.out.println(expected2);
		Assert.assertEquals("You must select a testing grade", expected2);
		
		String expected3=getText("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rfvTestingPeriod']");
		System.out.println(expected3);
		Assert.assertEquals("You must select a testing period", expected3);
		
		Logout();
		
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	//***********************************************************************************************
	@Test(priority=2)
	public void Two_Mandatory_Fields_Vendor_Test_Type_Number_of_Questions_And_Starting_Question_ID()
	{
		try
		{ 
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		
		//Click on main menu local Assignment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		Thread.sleep(1000);
		//Click on create a new assessment
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
		
		// To Save the Assessment
		click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
		
		//To Verify the validations.
		String expected=getText("//*[@id='ctl00_MainContent_rfvVendorTestType']");
		System.out.println(expected);
		Assert.assertEquals("Please select a vendor test type", expected);
		
		String expected1=getText("//*[@id='ctl00_MainContent_rfvNumberofQuestions']");
		System.out.println(expected1);
		Assert.assertEquals("You must provide number of questions", expected1);
		
		String expected2=getText("//*[@id='ctl00_MainContent_rfvQuestionStartingId']");
		System.out.println(expected2);
		Assert.assertEquals("You must provide question starting Id", expected2);
		
		}
		catch (Exception e)
		{
			System.out.println("One_Tittle Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	
	//********************************************************************************************
	@Test(priority=3)
	public void Three_Vendor_test_type_drop_down_has_data()
	{
		try
		{ 
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			//To select the drop down
			new Select(driver.findElement(By.id("ctl00_MainContent_ddlVendorTestType"))).selectByIndex(1);;
			
			//Read the data from the drop down
			Thread.sleep(1000);
			String selectedOption = new Select(driver.findElement(By.id("ctl00_MainContent_ddlVendorTestType"))).getFirstSelectedOption().getText();
			
			//Assert value 
			System.out.println(selectedOption);
			Assert.assertTrue(selectedOption.length()!=0);
		}
		catch (Exception e)
		{
			System.out.println("One_Tittle Failed!!!"+e);
			Assert.assertTrue(false);
		}
	}
	
	//***********************************************************************************************************
	@Test(priority=4)
	public void Four_Character_input_limit_in_vendor_mode()
	{
		try
		{ 
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To Call Create new Assessment 
			Assessment.New_AssESSMENT(generateRandomData(),"Test");
			
			venderInputData("0");
			
			// to Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//To verify the validations
			String expected=getText("//*[@id='ctl00_MainContent_rvNumberOfQuestions']");
			System.out.println(expected);
			Assert.assertEquals("Only numeric and between 1 to 999 are allowed", expected);
			
			venderInputData("24584521454");
			
			// to Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//To click back to assessment
			 Thread.sleep(3000); 
			 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			
			//To Read assessment name
			String Name=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			Checklist_Assessment.SearchAssessment(Name);
			
			Thread.sleep(3000); 
			//To click edit assessment
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_hlnkEditTest']");
			
			//To Assert Number of Questions
			Thread.sleep(3000);
			String Qustionnumber=getValue("#ctl00_MainContent_txtNumberOfQuestions");
			int Number = Integer.parseInt(Qustionnumber);
			System.out.println("Number of Questions :"+Number);
			Assert.assertTrue(Number<= 999);
			
			//To Question Starting ID 
			String Qustionid=getValue("#ctl00_MainContent_txtQuestionStartingId");
			int id_count = Qustionid.length();
			System.out.println("Id count is "+id_count);
			Assert.assertTrue(id_count<= 10);	
		}
		
	catch (Exception e)
		{
			System.out.println("One_Tittle Failed!!!"+e);
			Assert.assertTrue(false);
		}
	
	}
	
	//******************************************Vender Input Data****************************
	public void venderInputData(String NoQuestions)
	{
	  try
	  {
	
		  //To select the drop down
		  new Select(driver.findElement(By.id("ctl00_MainContent_ddlVendorTestType"))).selectByIndex(1);;
		
		  //To fill Number of Questions
		  type("//*[@id='ctl00_MainContent_txtNumberOfQuestions']",NoQuestions);
		  
		  //To fill more values in the Question id text box
		  String Startongid="1000"+generateRandomNumber();
		  
		  //To fill the starting id
		  type("//*[@id='ctl00_MainContent_txtQuestionStartingId']",Startongid);
	  }
	  catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			
		}
	}
}	
