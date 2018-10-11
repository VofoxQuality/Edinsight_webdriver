package com.localassessment;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@Test(priority=4)
	public void TCED16205()
	{	
		
		try
		{	
			
			Thread.sleep(3000);
			//Application should be in the Apply Standard pop-up
			
			//Click on the Add link from the Standard search Grid
			click("#ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl04_btnGridSelect");	
						
			//Assert the close button displayed for the added standard
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl04_btnDelete']")).isDisplayed());
					
			//Store added Standard ID 
			String Add_std=getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00__0']/td[4]/a");
			
			System.out.println(Add_std);
			
			//Select a Standard 
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl06_CheckboxSelectColumnSelectCheckBox']");
			
			//Click on Option button 
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
			
			//Click on Add checked search standards
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[6]/span");
			
			//Assert the close button displayed for the added standard
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl06_btnDelete']")).isDisplayed());
			
			//Store added Standard ID 
			String Add_std1=getText("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00__1']/td[4]/a");
			
			System.out.println(Add_std1);
			
			//Click on Option Button 
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
			
			// Close and Update Search
			click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
			
			driver.switchTo().defaultContent();
			
			//Assert the assigned Standard ID's for the corresponding question
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_grdQuestion']/tbody/tr[2]/td[3]/table").contains(Add_std),"Assigned standard not found");			
			
			//Assert the assigned Standard ID's for the corresponding question
			Assert.assertTrue(getText("//*[@id='ctl00_MainContent_grdQuestion']/tbody/tr[2]/td[3]/table").contains(Add_std1),"Assigned standard not found");						

		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			Assert.fail(e.getMessage());		
		}
					
	}
	
	@Test(priority=5)	
	public void TCED16206()
	{
		
		//Application should be in the Question Search page.
		
		//Hover over main menu local Assignment.
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();			
		
		//click on Question bank link		
		click("//a[contains(text(),'Question Bank')]");
		
		//click search question		
		click("//a[@id='ctl00_MainContent_lnkSearchQuestions']");
		
		driver.navigate().refresh();
		
		//select a question
		click("//*[@id='ctl00_MainContent_grdQuestion_ctl03_chkQuestion']");
				
		//Click on Apply Standards button
		click("//*[@id='ctl00_MainContent_btnApplyStandards']");		
		
		//switch to frame to read standard id			
		driver.switchTo().frame("MassEditStandards");
		
		//Select a Standard
		click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl04_CheckboxSelectColumnSelectCheckBox']");
		
		//Click on Option button 
		click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
		
		//Click on Replace checked standards
		click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[7]/span");
		
		//Assert the close button displayed for the added standard		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl04_btnDelete']")).isDisplayed());
		
		//Click on Option Button 
		click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']");
		
		// Close and Update Search
		click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_RadContextMenu1_detached']/ul/li[9]/span");
		
	}
	
	@Test(priority=6)	
	public void TCED16207()
	
	{
		
		try
		{
			
//		//Hover over main menu local Assignment.
//		Actions act= new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a"))).build().perform();			
//			
//		//click on Question bank link		
//		click("//a[contains(text(),'Question Bank')]");
//			
//		//click search question		
//		click("//a[@id='ctl00_MainContent_lnkSearchQuestions']");
//			
		driver.navigate().refresh();			
//		
		Thread.sleep(3000);
		
		if(isAlertPresents())
		{			
		driver.switchTo().alert().dismiss();
		}
			
		//click standard edit icon		
		click("//input[@id='ctl00_MainContent_grdQuestion_ctl03_imgBTnStandardsEdit']");		
			   
		// switch to frame 
		driver.switchTo().frame("MassEditStandards");
	    
	    //Click on Option button 
	    click("//*[@id='ctl00_ContentPlaceHolder1_ucQuestionStandards_SplitButton']");
	    
	    //Click on Make this filter a Favorite
	    click("//span[contains(text(),'Make this filter a favorite')]");
	    
	    click("//div[@class='rwDialog rwPromptDialog']//button[@class='rwOkBtn'][contains(text(),'OK')]");
	  	    
	    //Assert the text "Please enter the favorite name"
	  //  Assert.assertEquals(getText("//*[@id='prompt1539249693433_message']"), "Please enter the favorite name","Message -Please enter the favorite name-not found");
	        
	    
	    //Enter a Text in the favorite name text box
	    String favourite=getSaltString();
	    type("input.rwPromptInput.radPreventDecorate",favourite) ; 
	    
	    Thread.sleep(3000);
	    
	    //Click OK button 
        		    
        click("//div[@class='rwDialog rwPromptDialog']//button[@class='rwOkBtn'][contains(text(),'OK')]"); 
	    
	    //Assert the saved favorite name from "Saved Favorites" drop-down
	    Select sel=new Select(driver.findElement(By.cssSelector("select#ctl00_ContentPlaceHolder1_ucQuestionStandards_ddlFavorites")));

	    List<WebElement> allOptions = sel.getOptions();	    
	    for(WebElement el : allOptions) 
	    
	      {
	        // So you can get the text like:-
	        String text = el.getText();	    	        
	        
	         if(text.equals(favourite)) 
	        
	        {
	    	  Assert.assertTrue(true,"favourite not created");
	    	  
	    	  driver.switchTo().defaultContent();
	    	  break;
	         
	        }
	     	        
	      } 
	    
	    
	    //click close button
	    click("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_rgStandards_ctl00_ctl04_btnDelete']");
	 
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
			driver.navigate().refresh();
			Thread.sleep(3000);
			if(isAlertPresents())
			{			
			driver.switchTo().alert().dismiss();
			}
			
			//select a questions
			click("//*[@id='ctl00_MainContent_grdQuestion_ctl03_chkQuestion']");			
			
			//Click on Apply Standards button
			click("//*[@id='ctl00_MainContent_btnApplyStandards']");
			
//			WebDriverWait wt=new WebDriverWait(driver, 60);
//			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_QuestionBankStandards1_SplitButton']"))));
			
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
						Thread.sleep(2000);
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
