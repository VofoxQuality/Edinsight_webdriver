package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Print_View_Multiple_Maps extends BaseClassOne {
	
	 String parent;
	
	@Test(priority=1)
	public void TCED30404() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over curriculum link
			Actions act=new Actions(driver);
					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
			
			//Click Reports Menu 
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
			
			
			//To click on the print view multiple maps
			click("//img[@src='../../Image/curric_Print.jpg']");
			
			 parent=driver.getWindowHandle(); //get parent(current) window name
			
			 for(String child :driver.getWindowHandles()) //iterating on child windows
			    {
				 
			    driver.switchTo().window(child);
			    System.out.println("Popup values: "+child);
			    // Perform any operations on child window
			    }
			 //To select the map filtering (for printing multiple maps)
			 select("//select[@id='ctl00_ContentPlaceHolder1_ddlSubjects']","Library Media");
			 
			 //To click on the options button
			 click("//span[@class='rbText']");

			//To delete all the files in the directory
			FileDelete();
			
			 //To click on the print PDF button
			 click("//span[contains(text(),'Print PDF')]");
			 Thread.sleep(4000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".zip"), "Failed to download document which has extension .ZIP");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED30405() 
	{
		try
		{
			//To click on the options button
			 click("//span[@class='rbText']");

			//To delete all the files in the directory
			FileDelete();
			
			 //To click on the print PDF button
			 click("//span[contains(text(),'Print Word')]");
			 Thread.sleep(4000);
			
			
			//To verify whether the download functionality is working or not
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".zip"), "Failed to download document which has extension .ZIP");
			
			//To cloce the windows
			driver.close();
			
			driver.switchTo().window(parent);
			
			//To click on the log out button
			click("//img[@src='../../Images/btnExit.png']");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
