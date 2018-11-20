package com.generalMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Library.BaseClassOne;

public class Navigation_for_analyze_byTag extends BaseClassOne
{
    //navigate to analyze score param page after login
    public void navigate_to_analyze_tag_param_page()
    {
    	
		 try
		    {
				//Hover over main menu local Assignment.			
				Actions actions = new Actions(driver);
				WebElement mouseHover =find("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
				actions.moveToElement(mouseHover).build().perform();					
				
				//To click on the analyze by Score
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[8]/div/a");
				
				//To click on the Beta Summary reports(Analyze By Tag New)
				click("//*[@id='ctl00_MainContent_hlnkAnalyzeByTagNew']");
			} 
		 catch (Exception e)
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	    	
    }

}
