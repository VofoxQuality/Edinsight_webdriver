package com.localassessment;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Library.BaseClassOne;
public class apply_standard extends BaseClassOne
{
	
	@Test(priority=0)
	public void TCED16201()
	{
		try
		{
			//Superintent Login
			login(Supertent_Login_id,Supertent_Login_Password);	
			
			//Assert logout button is displayed in the dashboard page
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_A3']/img")).isDisplayed());
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=1)
	public void TCED16202()
	{
		try 
		{
			//Hover over main menu local Assignment.
			Actions act= new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();			
			
			//click on Question bank link		
			click("//a[contains(text(),'Question Bank')]");
			
			//click search question		
			click("//a[@id='ctl00_MainContent_lnkSearchQuestions']");
			
			driver.navigate().refresh();
			
			//select some questions
			click("//*[@id='ctl00_MainContent_grdQuestion_ctl03_chkQuestion']");
			click("//*[@id='ctl00_MainContent_grdQuestion_ctl04_chkQuestion']");
			
			//Click on Apply Standards button
			click("//*[@id='ctl00_MainContent_btnApplyStandards']");
			
			//A pop-up should open Assert the header "Align Standard to Multiple Questions"
			Assert.assertTrue(getText("//*[@id='RadWindowWrapper_ctl00_MainContent_MassEditStandards']/div[1]/div/h6").contains("Align Standards to Multiple Questions"),"failed to assert the Header"+"Align Standard to Multiple Questions");
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	
				
	}
	
	@Test(priority=2)
	public void TCED16203()
	{		
		
		try
		{
			//Assert the Label "Saved Favorites" 
			driver.switchTo().frame("MassEditStandards");
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[1]/td[1]").contains("Saved Favorites"),"failed to assert the label -Saved Favorites:");
			
			//Assert the Label "Standards Type"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[3]/td[1]").contains("Standards Type"),"failed to assert the label -Standards Type");
			
			//Assert the Label "Subject"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[4]/td[1]").contains("Subject"),"failed to assert the label -Subject");
			
			//Assert the Label "Sub-Category"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[5]/td[1]").contains("Sub-Category"),"failed to assert the label -Sub-Category");
			
			//Assert the Label "Organizer"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[6]/td[1]").contains("Organizer"),"failed to assert the label -Organizer");
			
			//Assert the Label "Grade"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[7]/td[1]").contains("Grade"),"failed to assert the label -Grade");
			
			//Assert the Label "Standard Contains"
			Assert.assertTrue(getText("//*[@id='Table1']/tbody/tr[8]/td[1]").contains("Standard Contains"),"failed to assert the label -Standard Contains");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=3)
	public void TCED16204()
	{	
		try
		{
			//Application should be in the Apply Standard pop-up
			
			//Select Subject Mathematics
			select("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_cbddlSubject']", "index=3");
			
			//Select Sub-Category Functions
			select("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_cbddlStandard']", "index=8");
			
			//Click on Option button 
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
			
			//click Search
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[1]/span");
			
			//Assert the Search result
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00__0']/td[4]/a").contains("M08.B-F.1.1.1"),"failed to assert the label -M08.B-F.1.1.1");
			
			//Assert the Label "Search Result"
			Assert.assertTrue(getText("//*[@id='contextContainer']/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/span").contains("Search Result"),"failed to assert the label -Search Result");
			
			//Assert the Label "Code"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00']/thead/tr/th[4]/a").contains("Code"),"failed to assert the label -Code");
			
			//Assert the Label "Type"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00']/thead/tr/th[5]/a").contains("Type"),"failed to assert the label -Type");
			
			//Assert the Label "Description"
			Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00']/thead/tr/th[6]").contains("Description"),"failed to assert the label -Description");
		} 
		
		catch (Exception e) 
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
//	@Test(priority=4)
	public void TCED16205()
	{		
		
		try
		{

			
			//select sub category dropdown		
			Select drop2=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_cbddlStandard']")));		
			drop2.selectByIndex(7);
			
			//click search button
			
			click("//a[@id='ctl00_MainContent_btnSearch']");
			
			//click standard edit icon		
			click("//input[@id='ctl00_MainContent_grdQuestion_ctl03_imgBTnStandardsEdit']");		
   
			// switch to frame to read standard id
			
			driver.switchTo().frame("MassEditStandards");
			
			// To get standard code for the assigned standards
			
			String std1=driver.findElement(By.xpath("//a[contains(., 'A1.2.2.1.1')]")).getText();
			
			String std2=driver.findElement(By.xpath("//a[contains(., 'M08.B-F.2.1.1')]")).getText();
			
			String std3=driver.findElement(By.xpath("//a[contains(., 'MA.HSF-IF.B.6')]")).getText();
			
			driver.switchTo().defaultContent();
			
			//click close button in the pop up
			
			click("//*[@id='RadWindowWrapper_ctl00_MainContent_MassEditStandards']/div[1]/div/ul/li[2]/span");
			
			Thread.sleep(2000);		
			
			// Assert assigned standard with the question bank editor
			
			Assert.assertEquals(driver.findElement(By.xpath("//a[@id='ctl00_MainContent_grdQuestion_ctl03_grdStandards_ctl02_lnkStandardCode']")).getText(),std1);
			Assert.assertEquals(driver.findElement(By.xpath("//a[@id='ctl00_MainContent_grdQuestion_ctl03_grdStandards_ctl03_lnkStandardCode']")).getText(),std2);
			Assert.assertEquals(driver.findElement(By.xpath("//a[@id='ctl00_MainContent_grdQuestion_ctl03_grdStandards_ctl04_lnkStandardCode']")).getText(),std3);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
			Assert.fail(e.getMessage());
		
		}
					
	}
	
//	@Test(priority=6)	
	public void TCED16207() throws Exception
	
	{
		
		try
		{
		//click standard edit icon		
		click("//input[@id='ctl00_MainContent_grdQuestion_ctl03_imgBTnStandardsEdit']");
			   
		// switch to frame to read standard id				
		driver.switchTo().frame("MassEditStandards");
		
	    
	    Select dr_std=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ucQuestionStandards_cbddlSubject']")));	    
	    dr_std.selectByIndex(1);
	    
	    Select dr_std1=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ucQuestionStandards_cbddlStandard']")));
	    dr_std1.selectByIndex(1);
	    
	    
	    click("//*[@id='ctl00_ContentPlaceHolder1_ucQuestionStandards_SplitButton']");
	    
	    click("//span[contains(text(),'Make this filter a favorite')]");
	    
	    click("//div[@class='rwDialog rwPromptDialog']//button[@class='rwOkBtn'][contains(text(),'OK')]");   
	    
	    String favourite=getSaltString();
	   	    
	    type("input.rwPromptInput.radPreventDecorate",favourite) ;  
	    
	    click("//div[@class='rwDialog rwPromptDialog']//button[@class='rwOkBtn'][contains(text(),'OK')]"); 
	    
	    
	    Select sel=new Select(driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder1_ucQuestionStandards_ddlFavorites")));

	    List<WebElement> allOptions = sel.getOptions();
	    
	    for(WebElement el : allOptions) 
	    
	      {
	        // So you can get the text like:-
	        String text = el.getText();	       	        
	        
	      if(text.equals(favourite)) 
	        
	        {
	    	  Assert.assertTrue(true,"favourite created");	    	  
	    	  break;
	         
	        }
	     	        
	      }             	     
	   
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	  	
			
	}
	
	@Test(priority=7)	
	public void TCED16208() throws Exception
	
	{
		
		try
		{
			//Application should be in the Apply Standard pop-up	
			
			//Click on Option button 
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
			
			//Click on Browse standard tree
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[4]/span");
			
			//The correspondin page should open in new tab of the browser	Assert the "Standards Type" label
			 String parent_window=driver.getWindowHandle();		 
			 Thread.sleep(1000);	 
			 
				for(String all_windows:driver.getWindowHandles())
					
				{
					if(!parent_window.equals(all_windows))
					{
						
						driver.switchTo().window(all_windows); 
						Assert.assertTrue(getText("//*[@id='aspnetForm']/table[2]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]").contains("Standards Type"),"failed to assert the label -Standards Type");
						driver.close();
					}
				}
				driver.switchTo().window("parent_window");
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());			
			e.printStackTrace();
		}
		
	}
	
	
	protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
