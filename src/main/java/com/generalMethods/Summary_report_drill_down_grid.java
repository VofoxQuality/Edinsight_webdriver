package com.generalMethods;

import org.testng.Assert;

import Library.BaseClassOne;

public class Summary_report_drill_down_grid extends BaseClassOne
{
	public void summary_report_studentlist_grid()
	{
		try
		{	
			
			//Assert the label student Id   
			Assert.assertEquals(getText("//a[contains(text(),'Student ID')]"),"Student ID");
			
			//Assert the label Last Name 
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the label First Name 
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the label Grade 
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");
			
			//Assert the label   School   
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'School')]"),"School");
			
			//Assert the label   Ethnicity    
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the label  IEP  
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
			
			//Assert the label  ELL  
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'ELL')]"),"ELL");
			
			//Assert the label  Ec. Disadvantaged 
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Ec. Disadvantaged')]"),"Ec. Disadvantaged");
		} 
		catch (Exception e)
		{			
			e.printStackTrace();
		}		
		
	}

}
