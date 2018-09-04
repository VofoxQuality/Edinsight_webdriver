package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Library.BaseClassOne;

public class Configure_Settings extends BaseClassOne

{
	
	@Test(priority=0)
	
	public void TCED23101()
	{
	
		try 
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
					
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"))).build().perform();
			
			//Click Configure Settings
			
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/div/div[21]/div/a");
			
			//Assert the Heading "Configure MTSS"
					
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3")).getText().contains("Configure MTSS"));
		} 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@Test
(priority=1)
	
	public void TCED23102()
	
	{
	
	 try 
	 
	 {
		driver.navigate().refresh();
		 
		 //Assert the Labels "Required
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='maintbl']/tbody/tr[1]/td")).getText().contains("Required"),"label Required not found");
		 
		 //Assert the Labels "Measures"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trMeasures']/td/a")).getText().contains("Measures"));
		 
		 //Assert the Labels "Interventions"
		
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trInterventionLists']/td/a")).getText().contains("Interventions"));
		 
		 //Assert the Labels "Skills"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trSkills']/td/a")).getText().contains("Skills"));
		 
		 //Assert the Labels "Defaulted"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='maintbl']/tbody/tr[6]/td")).getText().contains("Defaulted"));
		 
		 //Assert the Labels "Screening Evaluation Criteria"  
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trScreeningEvaluationCriteria']/td/a")).getText().contains("Screening Evaluation Criteria"));
		
		 //Assert the Labels "Referral Reasons"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trReferralReasons']/td/a")).getText().contains("Referral Reasons"));
		 
		 //Assert the Labels "Team Decisions"  
		
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trTeamDecisions']/td/a")).getText().contains("Team Decisions"));
		 
		 //Assert the Labels "Notes Templates "
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trNotesTemplates']/td/a")).getText().contains("Notes Templates"));
		 
		 //Assert the Labels "Parent Notification Method "
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trParentNotificationMethod']/td/a")).getText().contains("Parent Notification Method"));
		
		 //Assert the Labels "Program Description"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trProgramDescription']/td/a")).getText().contains("Program Description"));
		 
		 //Assert the Labels "Student Response"
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_trStudentResponse']/td/a")).getText().contains("Student Response"));
		
	} 
	 
	 catch (Exception e) 
	 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		Assert.fail(e.getMessage());
	}
	 
	}

@Test
(priority=2)

    public void TCED23103()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on Measures
			 
			click("//*[@id='ctl00_MainContent_trMeasures']/td/a");
			
			//Assert the message "Maintain Measures"
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Measures"));

			
			//Assert the label " Multi-Tiered System of Supports"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));

			driver.navigate().back();
		} 
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
			
		}
    	
    }

@Test
(priority=3)

    public void TCED23104()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on Interventions
			 
			click("//*[@id='ctl00_MainContent_trInterventionLists']/td/a");
			
			//Assert the message "Maintain Intervention List"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Intervention List"));

			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));

			driver.navigate().back();
		} 
    	
    	catch (Exception e) 
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=4)

    public void TCED23105()

    {
	 
    	try {
			driver.navigate().refresh();
			
			// Click on Skills
			 
			click("//*[@id='ctl00_MainContent_trSkills']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));

			
			//Assert the message "Select Tiering Type"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td")).getText().contains("Select Tiering Type"));

			driver.navigate().back();
		} 
    	
    	catch (Exception e) 
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=5)

    public void TCED23106()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on  Screening Evaluation Criteria 
			 
			click("//*[@id='ctl00_MainContent_trScreeningEvaluationCriteria']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));

			
			//Assert the message "Maintain Screening Evaluation Criteria"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Screening Evaluation Criteria"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=6)

    public void TCED23107()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on  Referral Reasons 
			 
			click("//*[@id='ctl00_MainContent_trReferralReasons']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));

			
			//Assert the message Maintain RTI Referral Reasons
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain RTI Referral Reasons"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=7)

    public void TCED23108()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on  Team Decisions 
			 
			click("//*[@id='ctl00_MainContent_trTeamDecisions']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message Changing the text of a team decision will result in that change being applied to any intervention plans for which that decision was chosen
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblWarning']")).getText().contains("Changing the text of a team decision will result in that change being applied to any intervention plans for which that decision was chosen"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=8)

    public void TCED23109()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on Notes Templates  
			 
			click("//*[@id='ctl00_MainContent_trNotesTemplates']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message 	To add a new template, click the 'Add New Template' button. The template name and which pages the template is available for can be edited by using the pencil icon. 
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_lblInstructions']")).getText().contains("To add a new template, click the 'Add New Template' button. The template name and which pages the template is available for can be edited by using the pencil icon"));
			driver.navigate().back();
		}     	
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=9)

    public void TCED23110()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on Parent Notification Method 
			 
			click("//*[@id='ctl00_MainContent_trParentNotificationMethod']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message 	To add a new template, click the 'Add New Template' button. The template name and which pages the template is available for can be edited by using the pencil icon. 
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Parent Notification"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=10)

    public void TCED23111()

    {
	 
    	try {
			driver.navigate().refresh();
			
			//Click on Program Description 
			 
			click("//*[@id='ctl00_MainContent_trProgramDescription']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message "Maintain Program Description"    	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]")).getText().contains("Maintain Program Description"));
			    	
			//Assert the message "Maintain Program Description label"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Maintain Program Description Label')]")).getText().contains("Maintain Program Description Label"));
			driver.navigate().back();
		}
    	
    	catch (Exception e)
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=10)

    public void TCED23112()

    {
	 
    	try
    	{
			driver.navigate().refresh();
			
			// Click on  Meeting Purpose & Reason
			 
			click("//*[@id='ctl00_MainContent_trMeetingPurposeReason']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message "Maintain Meeting Purpose"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Meeting Purpose"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }

@Test
(priority=12)

    public void TCED23113()

    {
	 
    	try 
    	{
			driver.navigate().refresh();
			
			//Click on  Custom Field 
			 
			click("//*[@id='ctl00_MainContent_trCustomField']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message "Maintain Custom Field"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Custom Field"));
			driver.navigate().back();
		}
    	catch (Exception e) 
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }
@Test
(priority=13)

    public void TCED23114()

    {
	 
    	try 
    	
    	{
			driver.navigate().refresh();
			
			//Click on  Tiering Criteria 
			 
			click("//*[@id='ctl00_MainContent_trTieringTypes']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message "RTI View Configuration"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr/td")).getText().contains("RTI View Configuration"));
			driver.navigate().back();
		} 
    	
    	catch (Exception e) 
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }
@Test
(priority=14)

    public void TCED23115()

    {
	 
    	try 
    	{
			driver.navigate().refresh();
			
			//Click on Student Response 
			 
			click("//*[@id='ctl00_MainContent_trStudentResponse']/td/a");
			
			//Assert the label " Multi-Tiered System of Supports"
  	 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_PlcPageCategory_RTIPageCategorySysadmin1_lblRTIFull']")).getText().contains("Multi-Tiered System of Supports"));
			
			//Assert the message "Maintain Student Response"
			 
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td")).getText().contains("Maintain Student Response"));
			driver.navigate().back();
			
			click("//*[@id='ctl00_A3']/img");
		} 
    	
    	catch (Exception e) 
    	
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Assert.fail(e.getMessage());
		}
    }


}
