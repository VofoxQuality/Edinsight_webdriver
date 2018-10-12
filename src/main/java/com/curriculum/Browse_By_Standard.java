package com.curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
/**
 * 
 * @author sebastian
 *
 */

public class Browse_By_Standard extends BaseClassOne {
	
		@Test
		(priority=0)	
		public void TCED30104()
		{		

			try 
			
			 {
				//Superintent Login
				login(Supertent_Login_id,Supertent_Login_Password);	
				
				//hover over curriculum link
				
				Actions act=new Actions(driver);
						
				act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/a"))).build().perform();	
				
				//Click Reports Menu 
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[11]/div/div[11]/div/a");
				
				//Click on Browse by standard report
				click("//img[@src='../../Image/curric_browse.jpg']");
				
				//To click on the sub links
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/div/span");
				
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li/div/span");
				
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li/ul/li[3]/div/span");
				
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li/ul/li[3]/ul/li/div/span");
				
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li/ul/li[3]/ul/li/ul/li/div/span");
				
				click("//div[@id='ctl00_MainContent_CurriculumReportByStandards1_rdStandards']/ul/li/ul/li[2]/ul/li/ul/li[3]/ul/li/ul/li/ul/li/div/div/span");
				
				
				//To click on the add to print list
				click("//input[@id='ctl00_MainContent_CurriculumReportByStandards1_btnAddToPrint']");
				
				
				FileDelete();
				   
				//To click on the print selected list
				click("//input[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
				
				//To click on the add to print list
				click("//a[@id='ctl00_MainContent_CurriculumReportByStandards1_LinkButton2']");
				   
				Thread.sleep(4000);		
				Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
				
				 FileDelete();
				
				//To click on the print selected list
				click("//input[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintSelected']");
				
				//To click on the print CSV
				click("//a[@id='ctl00_MainContent_CurriculumReportByStandards1_btnPrintToPDF']");
				
				Thread.sleep(4000);		
				 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
					
			 } 
			
			catch (Exception e) 
			
			{
				Assert.fail(e.getMessage());
				e.printStackTrace();
			}		
					
		}
	}


