package com.MTSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalMethods.MouseOver;

import Library.BaseClassOne;

public class MTSS_Tier_Intervention_Menu extends BaseClassOne {

	@Test(priority=1)

	public void TCED19101()
	{
		try {
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//click MTTS link	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");

			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");

			// To Assert Header
			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/h3"), "Manage Tiers & Interventions");

			// To Assert other labels on page
			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trTierStudentsPlanInterventions']/td[2]/a"), "Intervention Plans");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trTrackIntervention']/td[2]/a"), "Track Student Interventions");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trTutorial']/td[2]/a"), "T1 Interventions");

			Assert.assertEquals(getText("//*[@id='ctl00_MainContent_trFixDeleteIntervention']/td[2]/a"), "Fix & Delete Intervention Plans");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}


	@Test(priority=2)

	public void TCED19102()
	{
		try {

			// To click on Intervention Plans
			click("//*[@id='ctl00_MainContent_trTierStudentsPlanInterventions']/td[2]/a");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td"), "Intervention Plans");


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=3)

	public void TCED19103()
	{
		try {
			// To select container element
			WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();

			//click MTTS link	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");

			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");

			// TO click on Track Student Interventions
			click("//*[@id='ctl00_MainContent_trTrackIntervention']/td[2]/a");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td"), "Track Student Interventions");


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=4)

	public void TCED19104()
	{
		try {
			// To select container element
			WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();

			//click MTTS link	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");

			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");

			// TO click on T1 Interventions
			click("//*[@id='ctl00_MainContent_trTutorial']/td[2]/a");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Tier 1 Interventions");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

	@Test(priority=5)

	public void TCED19105()
	{
		try {
			// To select container element
			WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a"));
			
			MouseOver overmenuItem=new MouseOver();
			overmenuItem. MouseOver_DataAnalyst();
			
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();

			//click MTTS link	
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[7]/a");

			//click Tier / Intervention link		
			click("//a[contains(text(),'Tier / Intervention')]");

			// TO click on Fix & Delete Intervention Plans
			click("//*[@id='ctl00_MainContent_trFixDeleteIntervention']/td[2]/a");

			Assert.assertEquals(getText("//*[@id='ctl00_tdContentCell']/table/tbody/tr[3]/td/table/tbody/tr[1]/td"), "Fix/Delete Intervention Plans");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}        

	}

}
