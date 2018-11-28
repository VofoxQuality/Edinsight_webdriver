package com.Home;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Teacher_Course_Section_Curriculum_Maps extends BaseClassOne
{
	@Test(priority=1)
	public void TCED35701()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[1]/a"))).build().perform();	
			
			// Click on Teacher list 
			click("//a[contains(text(),'Teacher List')]");
			
			// Select Education Provider as Ashley High School 
			select("//*[@id='ctl00_MainContent_ddlEducationalProviders']","label=Ashley High School");
			
			//Click on Classes Link
			click("//*[@id='ctl00_MainContent_rgTeacherList_ctl00_ctl04_hlnkClasses']");
			
			Thread.sleep(2000);
			
			//Click on the any class (TEACHING ASST (S)) Link 
		    String parent_window=driver.getWindowHandle();
		    for(String child:driver.getWindowHandles())
		    {
		    	if(!parent_window.equals(child)) 
		    	{
		    		driver.switchTo().window(child);
		    		click("//*[@id='ctl00_MainContent_pnlScheduleNotSorted']/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td/span[1]/u/a");		    		
		    	}
		    }			
			//Click on the Curriculum Maps Tab
			click("//span[contains(text(),'Curriculum Maps')]");
			
			//Assert the label "Curriculum Maps"
			Assert.assertEquals(getText("//span[contains(text(),'Curriculum Maps')]"),"Curriculum Maps");
			
			//Assert the label "View Curriculum"
			Assert.assertEquals(getText("//h4[@class='CurriculumTitle']"),"View Curriculum");	
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=2)
	public void TCED35702()
	{
		try
		{
			//Application should be in the Curriculum Maps Tab
			
			//Assert the label "Maps Most Relevant To This Course
			Assert.assertEquals(getText("//h3[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionCurriculumMaps1_headingRelevantMaps']"),"Maps Most Relevant To This Course");
			
			//Assert the label "There are no maps with the same course name as this course."
			Assert.assertEquals(getText("//td[contains(text(),'There are no maps with the same course name as thi')]"),"There are no maps with the same course name as this course.");
			
			//Assert the label "All Maps"
			Assert.assertEquals(getText("//h3[contains(text(),'All Maps')]"),"All Maps");
			
			//Assert the label "Filter by Subject
			String[] str=getText("//table[@class='InputGeneral']//tbody//tr//td").split(" ");
			Assert.assertEquals(str[0]+" "+str[1]+" "+str[2],"Filter by Subject:");
			
			int n=str.length;			
			//Assert the label "(leave blank to see all maps)"
			Assert.assertEquals(str[n-6]+" "+str[n-5]+" "+str[n-4]+" "+str[n-3]+" "+str[n-2]+" "+str[n-1],"(leave blank to see all maps)");	
			
			//Assert the label "Course"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionCurriculumMaps1_egAllMaps']/tbody/tr[1]/td[2]/a"),"Course");
			
			//Assert the label "Map Title"
			Assert.assertEquals(getText("//a[contains(text(),'Map Title')]"),"Map Title");
			
			//Assert the label "View/Print"
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionCurriculumMaps1_egAllMaps']/tbody/tr[2]/td[1]/p/a"),"View/Print");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=3)
	public void TCED35703()
	{
		try
		{
			//Application should be in the Curriculum Maps Tab
			
			//Select Subject "Music" from drop-down
			select("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionCurriculumMaps1_ddlSubjectFilter']","label=Music");
			
			//Assert the selcted course is Music
			Select sel=new Select(find("//*[@id='ctl00_MainContent_CourseSectionDisplayControl1_CourseSectionCurriculumMaps1_ddlSubjectFilter']"));
			Assert.assertEquals(sel.getFirstSelectedOption().getText(),"Music");
			
			//Assert the Map name "For Automation [Do not Edit and Delete]"
			ScrollTo_xy_position(0, 200);
			Assert.assertEquals(getText("//td[contains(text(),'For Automation [Do not Edit and Delete]')]"), "For Automation [Do not Edit and Delete]");
			
			//Assert corresponding Couse as "Music K"
			Assert.assertEquals(getText("//td[contains(text(),'For Automation [Do not Edit and Delete]')]//preceding::td[1]"),"Music K");

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=4)
	public void TCED35704()
	{
		try
		{
			//Application should be in the Curriculum Maps Tab
			
			//Click on the "View/Print" link of  "For Automation [Do not Edit and Delete]" map
			click("//td[contains(text(),'For Automation [Do not Edit and Delete]')]//preceding::a[1]");
			
			//Assert the label "Curriculum Map View: For Automation [Do not Edit and Delete]"			
		    Set<String> all=driver.getWindowHandles();
		    ArrayList<String> all_tabs=new ArrayList<String>(all);
		    driver.switchTo().window(all_tabs.get(2));
		    Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_lblCurriculumMap']"),"Curriculum Map View: For Automation [Do not Edit and Delete]");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}
	@Test(priority=5)
	public void TCED35705()
	{
		try
		{
			//Application should be in the Curriculum Maps Tab
			
			  FileDelete();
			  
			 //Click on the Option button
			  click("//*[@id='ctl00_ContentPlaceHolder1_SplitButton']/span[1]/span");			  
			 
			 //Click on Print PDF
			  click("//span[contains(text(),'Print PDF')]");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}				
	}	@Test(priority=6)
	public void TCED35706()
	{
		try
		{
			//Application should be in the Curriculum Maps Tab
			
			 FileDelete();
			  
			 //Click on the Option button
			 click("//*[@id='ctl00_ContentPlaceHolder1_SplitButton']/span[1]/span");			  
			 
			 // Click on Print Word
			 click("//span[contains(text(),'Print Word')]");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".rtf"), "Failed to download document which has extension .RTF");
			 
			 Set<String> all=driver.getWindowHandles();
			 ArrayList<String> all_tabs=new ArrayList<String>(all);
			 driver.close();
			 driver.switchTo().window(all_tabs.get(1));
			 
			//Assert the label "View Curriculum"
			Assert.assertEquals(getText("//h4[@class='CurriculumTitle']"),"View Curriculum");
			
			 driver.close();
			 driver.switchTo().window(all_tabs.get(0));
			 
			//click on Logout button
			waitForEnable("//*[@id='ctl00_A3']/img");
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
