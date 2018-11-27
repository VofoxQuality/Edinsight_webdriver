package com.Student_Data_Depot;

import org.testng.annotations.Test;

import com.generalMethods.Edinsight_common_login;

import Library.BaseClassOne;

public class Student_Data_Depot_Configure_Testing_Periods extends BaseClassOne
{
	//creating the object of Edinsight_common_login class under the general method
	Edinsight_common_login ob=new Edinsight_common_login();
	
	@Test(priority=1)
	public void TCED62201()
	{
		//Sysadmin Login
		ob.edinsight_login(baseUrl, "sysadmin", Supertent_Login_Password);
	}

}
