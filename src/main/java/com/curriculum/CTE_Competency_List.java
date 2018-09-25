package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class CTE_Competency_List extends BaseClassOne

{
	@Test(priority=0)
	
	public void TCED30701()
	{
		//Superintent Login
		login(Supertent_Login_id,Supertent_Login_Password);	
		
		//hover over curriculum link
		
		Actions act=new Actions(driver);
				
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
		
		//Click Reports Menu 
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
		
		//Click on CTE Competency List Menu
		click("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[2]/tbody/tr[6]/td[3]/div/a/img");
		
		String parent_wind=driver.getWindowHandle();
		driver.close();	
		for(String child:driver.getWindowHandles())
		{
			
			if(!parent_wind.equals(child))
			{
				driver.switchTo().window(child);
				
				//Assert the Heading "CTE Competency List"
				Assert.assertTrue(getText("//*[@id='ctl00_MainContent_ReportDisplayCtrl1_divReport']/table/tbody/tr[1]/td").contains("CTE Competency List"),"failed to assert text"+"CTE Competency List");
			}
		}
		
		
		
		
	}

}
