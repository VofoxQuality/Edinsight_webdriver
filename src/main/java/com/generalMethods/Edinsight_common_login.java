package com.generalMethods;

import org.openqa.selenium.By;

import Library.BaseClassOne;

public class Edinsight_common_login extends BaseClassOne

{	
	public void edinsight_login(String url,String user_name,String password)
	{
		
		driver.get(url);
		
		//type user_name
		type("//*[@id='txtUserName']",user_name);

		//type password
		type("//*[@id='txtPassword']",password);
		
	    //click Login button
		click("input#Submit1.name");	
		
	}
}
