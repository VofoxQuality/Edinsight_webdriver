package com.generalMethods;

import org.testng.Assert;

import Library.BaseClassOne;

public class AssessmentPrint extends BaseClassOne
{
	
	public void AssessmentPrintReports(String xpath,String FrameName) throws InterruptedException
	
	{
		//To click here to see the test
		
		click(xpath);	

		//To select the frame
		SwitchFrameName(FrameName);

		//To delete all the files in the directory
		FileDelete();

		//To click print pdf
		Thread.sleep(1000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfQuestions']");
		Thread.sleep(10000);

		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		 
		//To click on the print word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkWordQuestion']");
		Thread.sleep(10000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
		
		//To delete all the files in the directory
		FileDelete();
			
		//To click on the Print OE to PDF
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkOePdfQuestions']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");

		 
		//To click on the OE to Word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkOeWordQuestions']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

		//*******Print answer Key**********************

		//To delete all the files in the directory
		FileDelete();
			
		//To click print pdf
		click("//*[@id='ctl00_ContentPlaceHolder1_linkPdfAnswer']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");
		 
		//To click on the print word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkWordAnswer']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");

		//To delete all the files in the directory
		FileDelete();

		//To click on the Print condensed PDF
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedPDF']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");


		//To click on the OE to Word
		Thread.sleep(3000);
		click("//*[@id='ctl00_ContentPlaceHolder1_linkCondensedWord']");
		Thread.sleep(6000);
		Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".doc"), "Failed to download document which has extension .DOC");
		
		
	}
}
