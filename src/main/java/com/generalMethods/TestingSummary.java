package com.generalMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class TestingSummary extends BaseClassOne{
	
	@Test(priority=1)
	public void TestingSummarypopup(String xpath) throws InterruptedException 
	{
	
	//To click on the Testing Summary			
	
	click(xpath);	
		
	Thread.sleep(2000);
	// To switch to frame
	driver.switchTo().frame("rwTestSummery");

	Thread.sleep(2000);
	//To Assert the Grid labels
	Assert.assertEquals(getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='##LOC[Cancel]##'])[2]/following::span[1]"),"Testing Summary");

	Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblSchoolHCompletionRate']").contains("School with the highest completion rate"),"failed to assert text"+"School with the highest completion rate");

	Assert.assertTrue(getText("//*[@id='ctl00_ContentPlaceHolder1_lblSchoolLCompletetionRate']").contains("School with the lowest completion rate"),"failed to assert text"+"School with the lowest completion rate");

	Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[1]/a"),"School/Building");

	Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[5]/a"),"Scheduled Students");

	Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[6]/a"),"Completed");

	Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_rgTestingSummeryReportr_ctl00']/thead/tr/th[7]/a"),"Not Completed");


	//To click on the options button
	click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");

	//To delete all the files in the directory
	FileDelete();


	//To click on the print PDF to button
	click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[1]/span");

	Thread.sleep(3000);

	Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

	//To click on the options button
	click("//*[@id='ctl00_ContentPlaceHolder1_RadButton1']");

	//To click on the print PDF to button
	click("//*[@id='ctl00_ContentPlaceHolder1_RadContextMenu2_detached']/ul/li[2]/span");
	Thread.sleep(3000);

	Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");
	Thread.sleep(3000);
	// To switch to parent 
	driver.switchTo().parentFrame();

	// To close the page
	click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Session Timeout'])[1]/preceding::span[3]");
	Thread.sleep(3000);

}

}
