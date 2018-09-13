package com.MTSS;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class FacilitatorPersonResponsibleList extends BaseClassOne{
	
	
	@Test(priority=1)
	public void TCED22906() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Facilitator/Person Responsible List
			click("//a[contains(text(),'Facilitator/Person Responsible List')]"); 
			
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print ot PDF
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
	public void TCED22907() 
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
	public void TCED22911() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Facilitator/Person Responsible List
			click("//a[contains(text(),'Facilitator/Person Responsible List')]"); 
			
			
			//To click radio button Report by Student Group
			click("//input[@id='ctl00_MainContent_rdoStudentGroup']");
			
			Thread.sleep(1000);
			
			//To click on the drop down student group
			click("//input[@id='ctl00_MainContent_rcbStudentGroup_Input']");
			
			Thread.sleep(1000);
			
			click("//li[@class='rcbHovered']");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print to PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=4)
	public void TCED22912() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			
			Thread.sleep(5000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=5)
	public void TCED22914() 
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on Mtss menu
			click("//a[contains(.,'MTSS')]");
			
			//To click on the Facilitator/Person Responsible List
			click("//a[contains(text(),'Facilitator/Person Responsible List')]"); 
			
			
			//To click on the Run Report by Person Responsible for Intervention
			click("//input[@id='ctl00_MainContent_rdoPersonResponsible']");
			
			//To click on the run report button
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print to PDF
			click("//input[@id='ctl00_MainContent_btnExportCSV']");
			Thread.sleep(4000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=6)
	public void TCED22915() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnExportpdf']");
			
			Thread.sleep(5000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(priority=7)
	public void TCED22916() 
	{
		try
		{
			//To delete all the files in the directory
			FileDelete();
			
			//To click on the Print  PDF
			click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			
			Thread.sleep(5000);
			
			Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
			
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
