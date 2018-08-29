package CheckList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Functions.CreateANew_Assessment;
import Functions.DeleteorUnlinkQustions;
import Library.BaseClassOne;
import Library.objectData;

public class Create_New_Assessment extends BaseClassOne
{
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	DeleteorUnlinkQustions deleteunlink=new DeleteorUnlinkQustions();
	//objectData obj=new objectData();
	String AsseName=generateRandomData();
	
	// @Test(priority=1)
	public void One_Tittle_Create_New_Assessment()
	{
		try
		{ 
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			String expected=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/span");
			System.out.println(expected);
			Assert.assertEquals("Create New Assessment", expected);	
		}
		catch (Exception e)
		{
			System.out.println(" Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//********************************************************************************************
	//@Test(priority=2)
	public void Two_Mandatory_Fields_Assessment_Name_and_Subject()
	{
		try
		{ 
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			// To Save the Assessment
			//Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//To Verify the validations.
			Thread.sleep(3000);
			String expected=getText("//*[@id='ctl00_MainContent_rfvAssessmentName']");
			System.out.println(expected);
			Assert.assertEquals("You must provide an assessment name.", expected);
			
			String expected1=getText("//*[@id='ctl00_MainContent_rfvCategory']");
			System.out.println(expected);
			Assert.assertEquals("Please select a category", expected1);
				
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//*******************************************************************************************
	//@Test(priority=3)
	public void Three_Enter_the_Test_Collection_Edition_Grade_and_Testing_Period()
	{
		try
		{ 
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			//Thread.sleep(1000);
			// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
			click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
			
			//To fill the Test collection.
			type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']","Ajith or Maneesh");
			
			//To fill the Test Edition/Category 
			type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']","AJ- edition");
		   
			//To select (Drop down) Testing Grade 
		    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingGrade"))).selectByVisibleText("Fifth Grade");
		    
		    //To select (Drop down)Testing Period 
		    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingPeriod"))).selectByVisibleText("Testing Period 5");
		    
			//To Verify the validations.
		    
			Thread.sleep(1000);
			String expected=getText("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/div/ul/li/div/table/tbody/tr[1]/td[1]");
			System.out.println(expected);
			Assert.assertEquals("Test Collection", expected);
			
			String expected1=getText("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/div/ul/li/div/table/tbody/tr[2]/td[1]");
			System.out.println(expected1);
			Assert.assertEquals("Test Edition/Category", expected1);
			
			String expected2=getText("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/div/ul/li/div/table/tbody/tr[3]/td[1]");
			System.out.println(expected2);
			Assert.assertEquals("Testing Grade", expected2);
			
			String expected3=getText("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/div/ul/li/div/table/tbody/tr[4]/td[1]");
			System.out.println(expected3);
			Assert.assertEquals("Testing Period", expected3);
			
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}	
	//**********************************************************************************************
	//@Test(priority=4)
	public void Four_Check_Validation_message_for_the_Fields_Test_Collection_Edition_Gradeand_Testing_Period ()
	{
		try
		{ 
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			// To Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//Thread.sleep(1000);
			// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
			click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
			
			//To fill the Test collection.
			type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']","Ajith or Maneesh");
			
			// To Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//To Verify the validations.
			Thread.sleep(1000);
			String expected=getText("//span[@id='ctl00_MainContent_cvTestTypes']");
			System.out.println(expected);
			Assert.assertEquals("You should either select or unselect fields test type,test edition,grade and test period", expected);
			
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//*********************************************************************************************
	//@Test(priority=5)
	public void Five_Fill_Sub_Library_name_with_respect_to_Selected_Library  ()
	{
		try
		{ 
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			Assessment.New_AssESSMENT(AsseName,"Test");
			
			login(Supertent_Login_id,Supertent_Login_Password);
			
			SearchAssessment( AsseName);
			
			//To Click edit and Name Options
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_hlnkEditTest']");
			
			Thread.sleep(1000);
			String expected =getValue("#ctl00_MainContent_rcbLibraryName_Input");
			String expected1 =getValue("#ctl00_MainContent_rcbSubLibraryName_Input");
			//To Verify the validations.
			Thread.sleep(1000);
			System.out.println(expected);
			System.out.println(expected1);
			Assert.assertEquals(expected,"4Sight");
			Assert.assertEquals(expected1,"4Sight");
			
		}
		catch (Exception e)
		{
			System.out.println("One_Tittle Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//*********************************************************************************************
	//@Test(priority=6)
	public void Six_Editable_Library_Name__Sub_Library_Name_Test_Collection_Edition_Grade_and_Testing_Period ()
	{
		try
		{ 
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//Click on main menu local Assignment.
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
			
			//Thread.sleep(1000);
			//Click on create a new assessment
			click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
			
			//click on Enter the Test Collection/Edition/Grade and Testing Period button
			//Thread.sleep(2000);
			click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
			
			//To verify the combo-boxes allow data entry.
			Thread.sleep(2000);
			boolean Test_Collection=driver.findElement(By.xpath("//input[contains(@id,'ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input')]")).isEnabled();
			boolean Test_Edition_Category =driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']")).isEnabled();
			boolean Library_Name=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rcbLibraryName_Input']")).isEnabled();
			boolean Sub_Library_Name=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_rcbSubLibraryName_Input']")).isEnabled();
			Assert.assertTrue(Test_Collection,"Test Collection is not editable");
			Assert.assertTrue(Test_Edition_Category,"Test Edition/Category is not editable");
			Assert.assertTrue(Library_Name,"Library Name is not editable");
			Assert.assertTrue(Sub_Library_Name,"Sub Library Name is not editable");
			
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//*********************************************************************************************
	@Test(priority=7)
	public void Seven_Save_Assessment ()
	{
		try
		{ 
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			Assessment.New_AssESSMENT(AsseName+"Data increment1","Test");
			
			//To click back to assessment
			//Thread.sleep(3000); 
			click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
			Thread.sleep(1000);
			String actual=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			
			Thread.sleep(1000);
			Assert.assertEquals(actual,AsseName+"Data increment1" );
			
			Logout();
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}
	//*********************************************************************************************
		//@Test(priority=8)
		public void Eight_Character_input_Limits ()
		{
			try
			{ 
				String AssessmentName=generateRandomNumber();
				Thread.sleep(3000);	
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				//Click on main menu local Assignment.
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
				
				Thread.sleep(1000);
				//Click on create a new assessment
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
				
				Thread.sleep(1000);
				// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
				click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
				
				//To select (Drop down) Testing Grade 
			    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingGrade"))).selectByVisibleText("Fifth Grade");
			    
			    //To select (Drop down)Testing Period 
			    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingPeriod"))).selectByVisibleText("Testing Period 5");
			    
			    //To select Subject.
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlCategory"))).selectByIndex(1);
				
				   
				
				//To fill the Test collection.(character limit more than 50)
				type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']","Lorem Ipsum is simply dummy text of the"
						+ " printing and typesetting industry. "
						+ "Lorem Ipsum has been the industry's standard"
						+ " dummy text ever since the 1500s, when an unknown "
						+ "printer took a galley of type and scrambled it to make "
						+ "a type specimen book. It has survived not only five centuries,");
				
				//To fill the Test Edition/Category (character limit more than 100)
				type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']",
						"Lorem Ipsum is simply dummy text "
						+ "of the printing and typesetting industry."
						+ " Lorem Ipsum has been the industry's standard"
						+ " dummy text ever since the 1500s, when an unknown"
						+ " printer took a galley of type and scrambled it to"
						+ " make a type specimen book. It has survived not only"
						+ " five centuries for data purpose");
			   
				
				//To fill the Assessment Name (character limit more than 100)
				type("//*[@id='ctl00_MainContent_txtAssessmentName']",AssessmentName+"Lorem Ipsum is simply dummy text of the printing "
						+ "and typesetting industry."
						+ " Lorem Ipsum has been the industry's standard"
						+ " dummy text ever since the 1500s, when an unknown");
				
				 //To fill the Default Library Name  (Size more than 50)  
			    type("//*[@id='ctl00_MainContent_rcbLibraryName_Input']","The temple is "
			    		+ "Contrary to popular belief, Lorem Ipsum is not simply random text. ");
			  		
			  	//To fill the Default Sub-Library Name (Size more than 50)  
			  	type("//*[@id='ctl00_MainContent_rcbSubLibraryName_Input']","Contrary to popular"
			  			+ " belief, Lorem Ipsum is not simply random text. ");
			  	
			  //To fil Assessment Desc (Size more than 500) 
				type("//*[@id='ctl00_MainContent_txtAssessmentDesc']","The temple is"
						+ "There are many variations of passages"
						+ " of Lorem Ipsum available, but the majority"
						+ " have suffered alteration in some form, by "
						+ "injected humour, or randomised words which don't"
						+ " look even slightly believable. If you are going to"
						+ " use a passage of Lorem Ipsum, you need to be sure there"
						+ " isn't anything embarrassing hidden in the middle of text."
						+ " All the Lorem Ipsum generators on the Internet tend to"
						+ " repeat predefined chunks as necessary, making this the"
						+ " first true generator on the Internet. It uses a dictionary"
						+ " of over 200 Latin words, combined with a handful of model"
						+ " sentence structures, to generate Lorem Ipsum which looks reasonable.");
				
			//Thread.sleep(3000);	
			  	
			 // to Save the Assessment
			click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			SearchAssessment(AssessmentName+"Lorem Ipsum is simply dummy text of the printing "
					+ "and typesetting industry."
					+ " Lorem Ipsum has been the industry's standard"
					+ " dummy text ever since the 1500s, when an unknown"
					+ " printer took a galley of type and scrambled it to"
					+ " make a type specimen book. It has survived not only five centuries.");
			
			//To Edit Name and Options
			//Thread.sleep(3000);
			click("//*[@id='ctl00_MainContent_grdMyAssessments_ctl02_hlnkEditTest']");
			
			// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
			click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
			waitFor("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']");
			String TestCollection=getValue("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']");
			System.out.println(TestCollection.length());
			String TestEditionCategory=getValue("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']");
			System.out.println(TestEditionCategory.length());
			String  Desc=getValue("#ctl00_MainContent_txtAssessmentDesc");
			System.out.println(Desc.length());
			String LibraryName=getValue("#ctl00_MainContent_rcbLibraryName_Input");
			System.out.println(LibraryName.length());
			String subLibraryName=getValue("#ctl00_MainContent_rcbSubLibraryName_Input");
			System.out.println(subLibraryName.length());
			
			//To Verify the TestCollection
			Assert.assertTrue(TestCollection.length()<=50,"TestCollection is failed");
			
			//To Verify the TestEditionCategory
			Assert.assertTrue(TestEditionCategory.length()<=100,"TestEditionCategory is failed");
			
			//To Verify the  Desc
			Assert.assertTrue(Desc.length()<=500,"The  Desc is failed");
			
			//To verify the Library Name
			Assert.assertTrue(LibraryName.length()<=50,"Library Name is failed");
			
			//To Verify sub Library Name
			Assert.assertTrue(subLibraryName.length()<=50,"sub Library Name is failed"); 
			
			Logout();
				
			}
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false,"Exception Occured");
			}

		}
	//***********************************************************************
		//@Test(priority=9)
		public void Nine_Data_Entry_with_apostrophe_in_all_text_fields()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				//Click on main menu local Assignment.
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
				
				Thread.sleep(1000);
				//Click on create a new assessment
				click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[4]/div/a");
				
				Thread.sleep(1000);
				// Click on Enter the Test Collection/Edition/Grade and Testing Period (for creating district-wide assessments)
				click("//*[@id='ctl00_MainContent_rpbTestype']/ul/li/span/span[1]");
				
				//To fill the Test collection.
				type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestType_Input']","'Ajith or Maneesh'");
				
				//To fill the Test Edition/Category 
				type("//*[@id='ctl00_MainContent_rpbTestype_i0_i0_rcbTestEdition_Input']","'AJ- edition'");
			   
				//To select (Drop down) Testing Grade 
			    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingGrade"))).selectByVisibleText("Fifth Grade");
			    
			    //To select (Drop down)Testing Period 
			    new Select(driver.findElement(By.id("ctl00_MainContent_rpbTestype_i0_i0_ddlTestingPeriod"))).selectByVisibleText("Testing Period 5");
			    
			    //To select Subject.
				type("//*[@id='ctl00_MainContent_txtAssessmentName']",AsseName+"'Validate'");
					
				//To select Subject.
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlCategory"))).selectByIndex(1);
				
				//To fil Assessment Desc 
				type("//*[@id='ctl00_MainContent_txtAssessmentDesc']","'1492588179855	geckodriver	INFO'");
				
				 //To fill the Default Library Name 
			    type("//*[@id='ctl00_MainContent_rcbLibraryName_Input']","'4Sight'");
			  		
			  	//To fill the Default Sub-Library Name 
			  	type("//*[@id='ctl00_MainContent_rcbSubLibraryName_Input']","'Data Test'");  
			  	Thread.sleep(1000);
				
				//To select Default Number of Choices:
				new Select(driver.findElement(By.id("ctl00_MainContent_ddlDefaultChoices"))).selectByIndex(2);
				
				// to Save the Assessment
				click("//*[@id='ctl00_MainContent_btnSaveAssessment']");
				
				//To click back to assessment
				Thread.sleep(4000); 
				click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				Thread.sleep(4000);
				String actual=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
				
				//To Validate whether the Assessment is saved or not
				Thread.sleep(1000);
				Assert.assertEquals(actual,AsseName+"Validate"); 
				
				Logout();
			
		}
		catch (Exception e)
		{
			System.out.println("Failed!!!"+e);
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	//**********************************************************************
		//@Test(priority=10)
		public void Ten_Populate_Library_name_and_sub_library_name_in_Each_Questions()
		{
			try
			{
				//Supertent Login
				login(Supertent_Login_id,Supertent_Login_Password);
				
				//To call create assessment
				Assessment.New_AssESSMENT(AsseName+"Library","Test");
				
				//To Call Questions
				
				Assessment.QT_Short_Response();
				Assessment.QT_Pick_Two();
				Assessment.QT_Extended_Response_Full_Rubic();
				Assessment.QT_Multiple_Choice();
				Assessment.QT_True_or_False();
				Assessment.QT_Check_All_That_Apply();
				Assessment.QT_Essay();
				Assessment.QT_Check_All_That_True();
				
				
				 //To click back to assessment
				 Thread.sleep(3000); 
				 click("//*[@id='ctl00_MainContent_ucSubmenu_btnBack']");
				 
				 Thread.sleep(3000); 
				//To Verify The elements of Library and sub_Library for Short Response 
				String  Library=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_lbllibrarysublibraryname']");
				String[] ShortResponse = Library.split("/");
				Assert.assertEquals(ShortResponse[0],"4Sight ");
				Assert.assertEquals(ShortResponse[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for Pick Two 
				String  Library1=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl04_lbllibrarysublibraryname']");
				String[]  PickTwo = Library1.split("/");
				Assert.assertEquals( PickTwo[0],"4Sight ");
				Assert.assertEquals( PickTwo[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for Extended Response
				String  Library2=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl05_lbllibrarysublibraryname']");
				String[]  ExtendedResponse = Library2.split("/");
				Assert.assertEquals( ExtendedResponse[0],"4Sight ");
				Assert.assertEquals( ExtendedResponse[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for Multiple Choice
				String  Library3=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl06_lbllibrarysublibraryname']");
				String[]  MultipleChoice = Library3.split("/");
				Assert.assertEquals( MultipleChoice[0],"4Sight ");
				Assert.assertEquals( MultipleChoice[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for True or False
				String  Library4=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl07_lbllibrarysublibraryname']");
				String[]   TrueorFalse = Library4.split("/");
				Assert.assertEquals( TrueorFalse[0],"4Sight ");
				Assert.assertEquals( TrueorFalse[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for Check All That Apply
				String  Library5=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl08_lbllibrarysublibraryname']");
				String[]    CheckAllThatApply = Library5.split("/");
				Assert.assertEquals( CheckAllThatApply[0],"4Sight ");
				Assert.assertEquals( CheckAllThatApply[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for  Essay
				String  Library6=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl09_lbllibrarysublibraryname']");
				String[]  Essay = Library6.split("/");
				Assert.assertEquals( Essay[0],"4Sight ");
				Assert.assertEquals( Essay[1]," 4Sight");
				
				//To Verify The elements of Library and sub_Library for   Check All That Are True
				String  Library7=getText("//*[@id='ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl10_lbllibrarysublibraryname']");
				String[]   Check_All_That_Are_True = Library7.split("/");
				Assert.assertEquals( Check_All_That_Are_True[0],"4Sight ");
				Assert.assertEquals( Check_All_That_Are_True[1]," 4Sight");
				
				Logout();
				
			}
			
			catch (Exception e)
			{
				System.out.println(" Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false);
			}
		}                                      
		//******************************************************************************
		//@Test(priority=11)
		public void Elevan_Created_Test_urvey_and_Assessment_Rubric_Test_types()
		{
			try
			{
				//************** Assessment Test *****************************
			//Supertent Login
			String AssessmentName=generateRandomData();
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To create Assessment Test
			Assessment.New_AssESSMENT(AssessmentName,"Test");
			
			
			//To Verify the create Assessment Test
			login(Supertent_Login_id,Supertent_Login_Password);
			FindAssessment(AssessmentName,"Test");
			Thread.sleep(1000);
			String actual=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			Thread.sleep(1000);
			Assert.assertEquals(actual,AssessmentName,"Assessment Test Failed");  
			
			//************** Assessment Ruberic *****************************
			//Supertent Login
			String AssessmentName1=generateRandomData();
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To create Assessment Test
			Assessment.New_AssESSMENT(AssessmentName1,"Assessment Rubric");
			
			
			//To Verify the create Assessment Test
			login(Supertent_Login_id,Supertent_Login_Password);
			FindAssessment(AssessmentName1,"Assessment Rubric");
			Thread.sleep(1000);
			String actual1=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			Thread.sleep(1000);
			Assert.assertEquals(actual1,AssessmentName1,"Assessment Ruberic Failed");  
			
			//************** Assessment Survay *****************************
			//Supertent Login
			String AssessmentName2=generateRandomData();
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//To create Assessment Test
			Assessment.New_AssESSMENT(AssessmentName2,"Survey");
			
			
			//To Verify the create Assessment Test
			login(Supertent_Login_id,Supertent_Login_Password);
			FindAssessment(AssessmentName2,"Survey");
			Thread.sleep(1000);
			String actual2=getText("//*[@id='tdHead']/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/b[2]");
			Thread.sleep(1000);
			Assert.assertEquals(actual2,AssessmentName2," Survay Failed");  
			}
			catch (Exception e)
			{
				System.out.println("Failed!!!"+e);
				e.printStackTrace();
				Assert.assertTrue(false);
			}
		}	
		
		
	//**************To Search Element***************************************
	//To find a Assessment in the List
    public void SearchAssessment(String AssessmentName)
    {
    	try
    	{
    		
    	
    		
    	//Click on main menu local Assignment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		//Click Manage assessment
		Thread.sleep(1000);
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
		
		//Fill Test name contains
		Thread.sleep(1000);
		type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']",AssessmentName);
		
		//To search the assessment
		click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
		
		
    	}
    	catch (Exception e)
		{
			
			System.out.println(e);	
			
		}
    }
    
    //****************************************To find a Assessment in the List**************
    public void FindAssessment(String AssessmentName,String type)
    {
    	try
    	{
   	
    	//Click on main menu local Assignment.
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/a");
		
		//Click Manage assessment
		Thread.sleep(1000);
		click("//*[@id='ctl00_tdMenuContainer']/ul/li[5]/div/div[5]/div/a");
		
		//Fill Test name contains
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_ddlMeasureType"))).selectByVisibleText(type);
		type("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i0_i0_txtTestName']", AssessmentName);
		
		//To search the assessment
		click("//*[@id='ctl00_MainContent_rpbMyAssesmentFilter_i2_i0_btnTestIdSearch']");
		
		Thread.sleep(1000);
		
		//To click edit assessment
		driver.findElement(By.id("ctl00_MainContent_grdMyAssessments_ctl02_lnkEditAssessment")).click();
		
    	}
    	 catch (Exception e)
		{
			
			System.out.println(e);	
			
		}
    }    
	
    
}	



