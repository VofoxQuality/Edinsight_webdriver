package com.generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Library.BaseClassOne;

public class MouseOver extends BaseClassOne {
	
	public void MouseOver_DataAnalyst()
	{
		try
		{	
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Data Analyst')]"))).build().perform();	
			
		} 
		catch (Exception e)
		{			
			e.printStackTrace();
		}		
		
	}

}
