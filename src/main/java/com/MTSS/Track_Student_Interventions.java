package com.MTSS;
import org.testng.Assert;
import org.testng.annotations.Test;
import Library.BaseClassOne;
public class Track_Student_Interventions extends BaseClassOne
{
	
	@Test(priority=0)
	public void TCED19601()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//click MTTS link			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");
			
			//click Tier/Intervention link
			click("//a[contains(text(),'Tier / Intervention')]");
			
			//Click on Track Student Interventions
			click("//a[contains(text(),'Track Student Interventions')]");
			
			//Assert the Label "Track Student Interventions "
			Assert.assertEquals(getText("//td[@class='subheading']"),"Track Student Interventions");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}		
	}
	@Test(priority=1)
	public void TCED19602()
	{
		try {
			//Application should be in the Track Student Interventions page
			
			//Assert the Label "Tier"
			Assert.assertEquals(getText("//td[contains(text(),'Tier')]"),"Tier");
			
			//Assert the Label "Area of Need"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblAreaOfNeed']"),"Area of Need");
			
			//Assert the Label "School Type"
			Assert.assertEquals(getText("//td[contains(text(),'School Type')]"),"School Type");
			
			//Assert the Label "Curriculum/Materials"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblCurrMaterials']"),"Curriculum/Materials");
			
			//Assert the Label "Educational Provider" 
			Assert.assertEquals(getText("//td[contains(text(),'Educational Provider')]"),"Educational Provider");
			
			//Assert the Label "Measurement/Assessment Method"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblMeasAssmnt']"),"Measurement/Assessment Method");
			
			//Assert the Label "Current Grade Level"
			Assert.assertEquals(getText("//td[contains(text(),'Current Grade Level')]"),"Current Grade Level");
			
			//Assert the Label "Facilitator" 
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblFacilitator']"),"Facilitator");
			
			//Assert the Label "Student Group"
			Assert.assertEquals(getText("//td[contains(text(),'Student Group')]"),"Student Group");
			
			//Assert the Label "Person Responsible"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblPersonResponsible']"),"Person Responsible");
			
			//Assert the Label "Teacher"
			Assert.assertEquals(getText("//td[contains(text(),'Teacher')]"),"Teacher");
			
		    //Assert the Label "Enter Scores For"  
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblTrackingDate']"),"Enter Scores For:");
			
		    //Assert the Label "Default Student Goal/Grade Level Expectation" 
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblStuGoal']"),"Default Student Goal/Grade Level Expectation");
			
		    //Assert the Label "Default Intervention Group Average"
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblGpAvg']"),"Default Intervention Group Average");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void TCED19603()
	{
		try
		{
			//Click on the Search button
			click("//input[@id='ctl00_MainContent_btnSearch']");
			
			//Assert the Label "Student Id"
			Assert.assertEquals(getText("//a[contains(text(),'Student Id')]"),"Student Id");
			
			//Assert the Label "Last Name"
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the Label "First Name"
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the Label "Special Demogr."
			Assert.assertEquals(getText("//a[contains(text(),'Special Demogr.')]"),"Special Demogr.");
			
			//Assert the Label "Grade"
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");
			
			//Assert the Label "Current School"
			Assert.assertEquals(getText("//a[contains(text(),'Current School')]"),"Current School");
			
			//Assert the Label "Curriculum Materials
			Assert.assertEquals(getText("//a[contains(text(),'Curriculum Materials')]"),"Curriculum Materials");
			
			//Assert the Label "Measurement/Assessment"
			Assert.assertEquals(getText("//a[contains(text(),'Measurement/Assessment')]"),"Measurement/Assessment");
			
			//Assert the Label "Person(s) Responsible"
			Assert.assertEquals(getText("//a[contains(text(),'Person(s) Responsible')]"),"Person(s) Responsible");
			
			//Assert the Label "Student Score"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[22]"),"Student Score");
			
			//Assert the Label "Student Goal/Grade Level Expectation"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[23]"),"Student Goal/Grade Level Expectation");
			
			//Assert the Label "Intervention Group Average"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_rgSearch_ctl00']/thead/tr[1]/th[24]"),"Intervention Group Average");
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)
	public void TCED19604()
	{ 
		try
		{
			//Application should be in the Track Student Interventions page			
			
			//Enter Student Goal/Grade Level Expectation = 25
			type("input#ctl00_MainContent_txtStuGoal","25");
			
			//Enter Intervention Group Average = 45
			type("//input[@id='ctl00_MainContent_txtGpAvg']","45");
			
			//Click on Save Scores button
			click("//input[@id='ctl00_MainContent_btnSave']");
			
			//Assert the message "Data saved successfully"
			String alt_msg=driver.switchTo().alert().getText();
			Assert.assertEquals(alt_msg,"Data saved successfully!");
			driver.switchTo().alert().accept();
			
			//Assert the Label "Track Student Interventions "
			Assert.assertEquals(getText("//td[@class='subheading']"),"Track Student Interventions");
			
   			//click on Logout button			 
			click("//*[@id='ctl00_A3']/img");
			
			//Assert the page Header as "Edinsight Login"						
			Assert.assertTrue(driver.getTitle().contains("EdInsight Login"));			
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	

}
