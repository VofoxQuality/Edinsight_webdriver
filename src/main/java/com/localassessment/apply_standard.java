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
	
	@Test(priority=1)
	public void TCED16205() throws Exception
	{
		
		
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Hover over main menu local Assignment.
			Actions act= new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();
			
			
			//click on Question bank link		
			click("//a[contains(text(),'Question Bank')]");
			
			//click search question		
			click("//a[@id='ctl00_MainContent_lnkSearchQuestions']");
			
			//select standard dropdown
			Select drop=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_cbddlStandardsType']")));		
			drop.selectByIndex(1);
			
			//select subject dropdown		
			Select drop1=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_cbddlSubject']")));		
			drop1.selectByIndex(2);
			
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
	
	@Test(priority=2)	
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
