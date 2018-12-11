package Report;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class Mann_Early_Warning extends BaseClassOne
{
	@Test(priority=1)
	public void TCED37101()
	{
		try
		{
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//Asert the the Header Name as Early Warning Alerts  
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Alerts");					
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=2)
	public void TCED37102()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//Asert the the Header Name as Early Warning Alerts  
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Alerts");
			
//			Asert the labels:-Alert Type 
//			Asert the labels:-Run Report by Building  
//			Asert the labels:-School Type 
//			Asert the labels:-Current Building/District 
//			Asert the labels:-Current Grade 
//			Asert the labels:-Current Subgroup(s) 
//			Asert the labels:-Gender
//			Asert the labels:-Ethnicity 
//			Asert the labels:-ELL
//			Asert the labels:-IEP 
//			Asert the labels:-Gifted 
//			Asert the labels:-Econ. Disadvantaged
//			Asert the labels:-Title1 
//			Asert the labels:-Title3 
//			Asert the labels:-Medical Issue
//			Asert the labels:-Migrant 
//			Asert the labels:-504 
//			Asert the labels:-MTSS Tiered 
//			Asert the labels:-Run Report by Student Group  
//			Asert the labels:-Student Group 
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=3)
	public void TCED37103()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			Thread.sleep(2000);
			
			//Assert the Validation message "You must select an alert type.
			Assert.assertEquals(getText("//span[@id='ctl00_MainContent_lblErrorMessages']"),"You must select an alert type.");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void TCED37104()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//select alert type: Attendance
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Attendance");
			
			//Select any School Type 
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");
			
			//select Current Subgroup(s) : GENDER
			click("//*[@id='ctl00_MainContent_ctl06_chkLstSubgroups_0']");
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Asset the report header : Early Warning Attendance
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");		
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=5)
	public void TCED37105()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//* Assert the Labels:- Current Building/District
//			* Assert the Labels:- Grade
//			* Assert the Labels:- Current Subgroups 
//			* Assert the label:- Student Count
//			
//			* Assert the Heading:-Student Id 
//			* Assert the Heading:-Last Name 
//			* Assert the Heading:-First Name 
//			* Assert the Heading:-Grade 
//			* Assert the Heading:-School 
//			* Assert the Heading:-Ethnicity 
//			* Assert the Heading:-IEP 
//			* Assert the Heading:-MTSS Tiered 
//			* Assert the Heading:-Total Attendance Count 
//			* Assert the Heading:-Total Full Day Absences 
//			* Assert the Heading:-Excused 
//			* Assert the Heading:-Unexcused 
//			* Assert the Heading:-Total Half Day Absences 
//			* Assert the Heading:-Half Day Excused 
//			* Assert the Heading:-Half Day Unexcused 
//			* Assert the Heading:-Total Tardies
//			* Assert the Heading:-Tardy Excused 
//			* Assert the Heading:-Tardy Unexcused 
//			* Assert the Heading:-Other
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=6)
	public void TCED37106()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			
			//Click on all other Grids (Except Student id)
			//verify_sort_ascending("//a[contains(text(),'Last Name')]");			
			
			int page_size=Integer.parseInt(getValue("//*[@id='ctl00_MainContent_rgStudentData_ctl00_ctl03_ctl01_PageSizeComboBox_Input']"));
			String[]ar=new String[page_size];
			
			String[]sorted_webdriver=new String[page_size];
			//int j=2;
			int m=0;
			
			for(int i=0; i<page_size;++i)	
			
			{
				if(isElementPresent("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]")==false)
				{
					break;
				}

				ScrollTo_Location("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]");	
				

				if(m<page_size)
				{
				ar[m]=find("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]").getText();
				++m;
				}
				

//				if(i==49)
//				
//				{
//					if(j<5)
//					{
//
//					click("//*[@id='ctl00_MainContent_rgStudentData_ctl00']/tfoot/tr[2]/td/div/div[2]/a["+j+"]");
//					++j;
//
////					click("//button[@title='Next Page']");
//					Thread.sleep(3000);
//					i=0;
//					}
//
//				}
				
			}
			System.out.println("yes"+ar.length);
			
			System.out.println("hiiiii");
			
		    List<String> list = new ArrayList<String>();

		    for(String s : ar) {
		       if(s != null && s.length() > 0) {
		          list.add(s);
		       }
		    }

		    ar = list.toArray(new String[list.size()]);			
			
			Arrays.sort(ar);
			//Collections.sort(Arrays.asList(ar));
			for(int k=0; k<list.size();++k)
			{
				
			System.out.println(ar[k]);
			}
			
			click("//*[@id='ctl00_MainContent_rgStudentData_ctl00']/tfoot/tr[2]/td/div/div[2]/a[1]");
			
			Thread.sleep(3000);

			click("//a[contains(text(),'Last Name')]");	
			Thread.sleep(2000);
			for(int y=0; y<page_size;++y)
			{
				if(isElementPresent("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+y+"']/td[5]")==false)
				{
					break;
				}
				ScrollTo_Location("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+y+"']/td[5]");	
				
				sorted_webdriver[y]=find("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+y+"']/td[5]").getText();
				Assert.assertEquals(sorted_webdriver[y], ar[y]);								
			}
			
		} 
		catch (Exception e)
		{
			//Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void TCED37107()
	{
		try
		{
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//select alert type: Attendance
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Attendance");
			
			//Select any School Type 
			select("//select[@id='ctl00_MainContent_ddlSchoolType']","label=All Schools");
			
			//select Current Subgroup(s) : GENDER
			click("//*[@id='ctl00_MainContent_ctl06_chkLstSubgroups_0']");
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");			

			 FileDelete(); 	 			 			 
			 
			 //Click on Export to CSV
			 click("//input[@id='ctl00_MainContent_btnExportCSV']");
			 
			 Thread.sleep(6000);
			 
			 File folder = new File(downloadPath);
			 for (final File fileEntry : folder.listFiles())
			 {				
			   if(fileEntry.getName().contains(".csv"))
				 { 				   
					 BufferedReader bufferedReader = new BufferedReader(new FileReader(fileEntry));
				     String input;
				     int count = 0;				     
				     while((input = bufferedReader.readLine()) != null)
				     {
				         count++;
				     } 				     
				     System.out.println(count);	
				     
					 String[]std_count=getText("//span[@id='ctl00_MainContent_lblStudentsCount']").split(" ");
					 Assert.assertEquals(Integer.parseInt(std_count[2]), count-2);
				  }
			 }		 
			 
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	

	}
//	@Test(priority=8)
	public void TCED37108()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//input[@id='ctl00_MainContent_btnExportCSV']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");	
			 
			 File folder = new File(downloadPath);
			 for (final File fileEntry : folder.listFiles())
			  {
				 System.out.println(fileEntry.getName());
				 if(fileEntry.getName().contains(".4csv"))
				 {           
			   
	
			 BufferedReader bufferedReader = new BufferedReader(new FileReader(fileEntry));
		     String input;
		     int count = 0;
		     while((input = bufferedReader.readLine()) != null)
		     {
		         count++;
		     }

		     System.out.println("Count : "+count);
			  }
				 
				 else
				 {
					 
					 System.out.println("akhil");
				 }
			  }
			 

		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=9)
	public void TCED37109()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//input[@id='ctl00_MainContent_btnExportpdf']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=10)
	public void TCED37110()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 				
			
			//Select a student 
			click("//input[@id='ctl00_MainContent_rgStudentData_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on add selected students to group button 
			click("//*[@id='ctl00_MainContent_btnSelectToGroup']");
			
			//Assert the label "Add Students to Group"
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			driver.switchTo().parentFrame();
			
			Thread.sleep(3000);			
			click("//span[@title='Close']");	
			
			//Assert the label "Early Warning Alerts 
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=11)
	public void TCED37111()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 				
			
			//Select a student 
			click("//input[@id='ctl00_MainContent_rgStudentData_ctl00_ctl04_chkSelectUserSelectCheckBox']");
			
			//Click on add All to group button 
			click("//input[@id='ctl00_MainContent_btnCheckAll']");
			
			//Assert the label "Add Students to Group"
			driver.switchTo().frame("StudentGroupWindowUniqueNameToAvoidErrorsIHope2");
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label1']"),"Add Students to Group:");
			
			//Assert the label  Create New Group
			Assert.assertEquals(getText("//*[@id='ctl00_ContentPlaceHolder1_Label3']"),"Create New Group:");

			driver.switchTo().parentFrame();
			
			Thread.sleep(3000);			
			click("//span[@title='Close']");
			
			//Assert the label "Early Warning Alerts 
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=12)
	public void TCED37112()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 				
			
			//Click on Add report to favorite button
			click("//input[@id='ctl00_MainContent_btnAddToFavorite']");
			
			//Assert the label "Early Warning Alerts 
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=13)
	public void TCED37113()
	{
		try
		{
			//Application should be in the Early Warning alert  page 				
			
			//Click on Total Attendance Count filter
			
			//On filter text field add "30" and select 'EQUAL TO' 
			type("//*[@id='ctl00_MainContent_rgStudentData_ctl00_ctl02_ctl02_RNTBF_totalabsencecount']","30");
			
			click("//*[@id='ctl00_MainContent_rgStudentData_ctl00_ctl02_ctl02_Filter_totalabsencecount']/span");
			
			click("//span[starts-with(text(),'EqualTo')]");
			Thread.sleep(2000);
			
			//* Assert that the column values displayed under 'Total Attendance Count' is equal  to 30.
			String s=find("//*[@id='ctl00_MainContent_rgStudentData_ctl00_ctl03_ctl01_PageSizeComboBox_Input']").getAttribute("value");
			int limit=Integer.parseInt(s);
			for(int i=0;i<limit;i++)
			{
				if(isElementPresent("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[14]"))
				{
			     Assert.assertEquals(find("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[14]").getText(),"30");				
				}
				else
				{
					break;
				}				
			}
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=14)
	public void TCED37114()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 				
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//select alert type: Attendance
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Attendance");
			
			//Click on Run Report by Student Group option & Select Group :-  00 123 MR
			click("//input[@id='ctl00_MainContent_rdoStudentGroup']");
			select("//*[@id='ctl00_MainContent_ddlStudentGroup']","label=00 123 MR");			
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Assert the label "Early Warning Alerts 
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Attendance");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=15)
	public void TCED37115()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to CSV
			 click("//input[@id='ctl00_MainContent_btnExportCSV']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".csv"), "Failed to download document which has extension .CSV");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=16)
	public void TCED37116()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Export to PDF
			 click("//input[@id='ctl00_MainContent_btnExportpdf']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=17)
	public void TCED37117()
	{
		try
		{
			//Application should be in the Early Warning Attendance   page 
			 FileDelete();
			 
			 //Click on Print to PDF
			 click("//input[@id='ctl00_MainContent_btnPrintToPDF']");
			 
			 Thread.sleep(6000);	
			 
			 //Assert the extension of the downloaded file
			 Assert.assertTrue(isFileDownloaded_Ext(downloadPath, ".pdf"), "Failed to download document which has extension .PDF");		
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=18)
	public void TCED37118()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//select alert type: Misconduct
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Misconduct");
			
			//select Current Subgroup(s) : GENDER
			click("//*[@id='ctl00_MainContent_ctl06_chkLstSubgroups_0']");
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Asset the report header : Early Warning Attendance
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning Misconduct");		
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=19)
	public void TCED37119()
	{
		try
		{
			//Application should be in the Early Warning Misconduct  page 		
			
		    // Assert the header:-Student Id 
			Assert.assertEquals(getText("//th[contains(text(),'Student Id')]"),"Student Id");
			
			//Assert the header:-Last Name 
			Assert.assertEquals(getText("//a[contains(text(),'Last Name')]"),"Last Name");
			
			//Assert the header:-First Name 
			Assert.assertEquals(getText("//a[contains(text(),'First Name')]"),"First Name");
			
			//Assert the header:-Grade
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'Grade')]"),"Grade");
			
			//Assert the header:-School 
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'School')]"),"School");
			
			//Assert the header:-Ethnicity
			Assert.assertEquals(getText("//a[contains(text(),'Ethnicity')]"),"Ethnicity");
			
			//Assert the header:-IEP 
			Assert.assertEquals(getText("//a[@title='Click here to sort'][contains(text(),'IEP')]"),"IEP");
			
			//Assert the header:-MTSS Tiered 
			Assert.assertEquals(getText("//a[contains(text(),'MTSS Tiered')]"),"MTSS Tiered");
			
			// Assert the header:-Misconduct Count
			Assert.assertEquals(getText("//a[contains(text(),'Misconduct Count')]"),"Misconduct Count");
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=20)
	public void TCED37120()
	{
		try
		{
			//Application should be in the Early Warning Alerts   page.
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//select alert type: Misconduct
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Risk Score");
			
			//select Current Subgroup(s) : GENDER
			click("//*[@id='ctl00_MainContent_ctl06_chkLstSubgroups_0']");
			
			//* Assert the Label "Gender"
			Assert.assertEquals(getText("//td[contains(text(),'Gender')]"),"Gender");
			
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Asset the report header : Early Warning Attendance
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning At Risk Score");				
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=21)
	public void TCED37121()
	{
		try
		{
			//Application should be in the Early Warning Risk score  page.
			
		    //* Click on ' How are risk scores calculated? '
			click("//a[@onclick='return OpenWindow()']");
			
			Thread.sleep(3000);
			
			//* Assert the header "Risk Score Configuration Legend"
			Assert.assertEquals(getText("//h6[@class='rwTitle']"),"Risk Score Configuration Legend");	
			click("//span[@title='Close']");	
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=22)
	public void TCED37122()
	{
		try
		{
			//Application should be in the Early Warning Risk score  page.
			
			//hover over Home link			
			Actions act=new Actions(driver);					
			act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_tdMenuContainer']/ul/li[3]/a"))).build().perform();
			
			//Click Mann Early Warning
			click("//a[contains(text(),'Mann Early Warning')]");
			
			//select alert type: Risk Score
			select("//select[@id='ctl00_MainContent_ddlAlert']","label=Risk Score");
			
			//Include Students With Scores For :  Excused Absence, Unexcused Absence 
			click("//span[@id='ctl00_MainContent_rdcmbRiskCriteria_Arrow']");
			if(find("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/div/label/input").isSelected()==true)
			{
				click("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/div/label/input");
			}
			if(find("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/ul/li[1]/label/text()//preceding::input[1]").isSelected()==false)
			{
			click("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/ul/li[1]/label/text()//preceding::input[1]");
			}
			if(find("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/ul/li[1]/label/text()//following::input[1]").isSelected()==false)
			{
			click("//*[@id='ctl00_MainContent_rdcmbRiskCriteria_DropDown']/div/ul/li[1]/label/text()//following::input[1]");	
			}
			//Click on Run Report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Asset the report header : Early Warning Attendance
			Assert.assertEquals(getText("//span[@class='subheading']"),"Early Warning At Risk Score");				

			//Assert the selected header details  on report page: Excused Absence, Unexcused Absence
			String[]st=find("//tr[@id='ctl00_MainContent_trReportHeader']//span[@class='blueheading']").getText().split(" ");
//			System.out.println(st.length);
//			Assert.assertEquals(st[18]+st[19]+st[20],"Early Warning At Risk Score");	
			
			Assert.assertEquals(st[17]+st[18]+st[19]+st[20],"ExcusedAbsence,UnexcusedAbsence");

			//Assert the header:-Students with a higher risk score are at a higher risk of failing courses or dropping out. Click For More Details
		    Assert.assertEquals(getText("//span[contains(text(),'Students with a higher risk score are at a higher ')]"),"Students with a higher risk score are at a higher risk of failing courses or dropping out.");		

			//Asert the header:-How are these scores being calculated?
		    Assert.assertEquals(getText("//a[@onclick='return OpenWindow()']"),"How are these scores being calculated?");	
			
		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
//	@Test(priority=23)
	public void TCED37123()
	{
		try
		{


		} 
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void verify_column_sort_ascending(String column_name_locator,int page_size) 
	{
		
		String[]ar=new String[page_size];
		
		String[]sorted_webdriver=new String[page_size];
		
		int m=0;
		
		for(int i=0; i<page_size;++i)	
		
		{
			if(isElementPresent("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]")==false)
			{
				break;
			}

			ScrollTo_Location("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]");				

			if(m<page_size)
			{
			ar[m]=find("//*[@id='ctl00_MainContent_rgStudentData_ctl00__"+i+"']/td[5]").getText();
			++m;
			}
			
		}
		
	}
		

}
