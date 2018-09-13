package com.MTSS;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class TieredStudentsWithNoInterventionPlan extends BaseClassOne {
	
	@Test(priority=1)
	public void TCED221105() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Tiered Students With No Intervention Plan
			click("//a[contains(text(),'Tiered Students With No Intervention Plan')]"); 
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot CSV
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TCED221106() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	@Test(priority=3)
	public void TCED221111() 
	{
		try
		{

			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
