package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Library.BaseClassOne;

public class CreateRuberic extends BaseClassOne{
	
	public void CreateOneRuberic(String RubericName)
	{
		try
		{
			 //click on add button 
		    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
		    
		    //select the subject from drop down
		    Thread.sleep(2000);
		    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).selectByVisibleText("Mathematics");
		    
		    //To select the number of levels
		    Thread.sleep(2000);
		    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']"))).selectByValue("3"); 
		    
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
		    

			//To fill the values in the title boxes
		    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']","Test data 1");
			
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']","Test data 2");
		
			
			type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']","Test data 3");
			 
			//To click on save button.
			click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
			
			
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}	
		
		public void CreateOneRubericforcopyFunctionality(String RubericName)
		{
			try
			{
				 //click on add button 
			    click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnAdd']");
			    
			    //select the subject from drop down
			    Thread.sleep(2000);
			    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlSubjects']"))).selectByVisibleText("Mathematics");
			    
			    //To select the number of levels
			    Thread.sleep(2000);
			    new Select(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_ddlNumberOfLevels']"))).selectByValue("3"); 
			    
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtRubricName']",RubericName);
			    

				//To fill the values in the title boxes
			    type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel1Title']","Test data 1");
				
				
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel2Title']","Test data 2");
			
				
				type("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_txtLevel3Title']","Test data 3");
				 
				//To click on save button.
				click("//*[@id='ctl00_MainContent_CurriculumMapRubricDetail1_btnSave']");
				
				
			}
			catch (Exception e)
			{
				System.out.println("Error"+e);
			}
			
		}
		
		
		
	
}	
