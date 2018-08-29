package Functions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;
import Library.objectData;

public class addExhibit extends BaseClassOne
{
	
	CreateANew_Assessment Assessment=new CreateANew_Assessment();
	objectData obj=new objectData();
	addStandard standard=new addStandard();
	String AsseName=generateRandomData();
	public void create_Exhibit(String ExibitName)
	{
		
		try
		{
			 
			 //To click Exhibits
			 click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyExhibits']");
			 
			 //To sWitch frame
			 WebElement frameElement = driver.findElement(By.name("ApplyExhibit"));
			 driver.switchTo().frame(frameElement);
			 
			 Thread.sleep(5000);

			 //To click add new exibit
			 click("//*[@id='ctl00_MainContent_hplAddEditViewExhibit']");
			 
			 //To sWitch frame
			 WebElement frameElement1 = driver.findElement(By.name("AddExhibit"));
			 driver.switchTo().frame(frameElement1);   
			 
			 //To fill the exhibit Name
			 type("//*[@id='txtExhibitName']",ExibitName);
			 
			 //To select Exhibit Behavior
			 new Select(driver.findElement(By.id("ddlExhibitBehaviour"))).selectByIndex(1);
			 
			 //To select Subject
			 new Select(driver.findElement(By.id("ddlSubject"))).selectByIndex(1);
			 
			 //To selectLibrary Type
			 new Select(driver.findElement(By.id("ddlLibraryType"))).selectByIndex(1);
			 
			 //To select Columns
			 new Select(driver.findElement(By.id("ddColumns"))).selectByIndex(0);
			
			 //To fill the rich text box
			driver.findElement(By.xpath("//*[@id='txtExhibitTextCenter']")).click();
			driver.findElement(By.xpath("//*[@id='txtExhibitTextCenter']")).sendKeys("Suppose if there are 100 frames in the page, and there is no "
			 		+ "ID available, in this case, we just don't know from "
			 		+ "which iframe required element is being loaded (It is the case when "
			 		+ "we do not know the index of the frame ");
			
			//To click save exhibit
			click("//*[@id='btnSaveExhibit']");
			
			driver.switchTo().parentFrame();
			
			//To close the window
			driver.findElement(By.xpath("//span[contains(@title,'Close')]")).click();
			
			Thread.sleep(2000);
		    String Text=getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00__0']/td[4]");
		    System.out.println(Text);
		    
		    driver.switchTo().defaultContent();
		   
		    //To close the window
		    Thread.sleep(2000);
		    driver.navigate().to(driver.getCurrentUrl());  
		    
		/*  //To Click on exhibits in the question
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnExhibit")).click();
			
			//To sWitch frame
			 WebElement frameElement3 = driver.findElement(By.name("ViewExhibit"));
			 driver.switchTo().frame(frameElement3);
			
			//*[@id='newsletterContent']/b
			Thread.sleep(2000);
		    String AssessID=getText("//*[@id='newsletterContent']/b");
		    
		    System.out.println(AssessID);
		    String AssessLastName = AssessID.substring(AssessID.lastIndexOf(" ")+1);
		    
			System.out.println(AssessLastName);
			System.out.println(Text);
			
			Assert.assertEquals(AssessLastName, Text);
			
			//To close the Value
			click("//*[@id='btnClose']");
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			Logout();  */
			
	 	}
		catch (Exception e)
		{
			
			System.out.println(e);
			try {
			Logout();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Assert.assertTrue(false);
		}

	}
	@Test(priority=2)
	public void Add_existing_Exibit() 
	{
	try
	{
		//Supertent Login
		login(Supertent_Login_id,Supertent_Login_Password);
		 
		standard.FindAssessmentName("Exibit_Assessment");
		 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_MINUS);
		 
		 //To click Exhibits
		 click("//*[@id='ctl00_MainContent_FullTestView1_btnApplyExhibits']");
		 
		 Thread.sleep(2000);
		 //To sWitch frame
		 WebElement frameElement = driver.findElement(By.name("ApplyExhibit"));
		 driver.switchTo().frame(frameElement);
		 
		
		 
		 //To SelectFilter Exhibits by
		 new Select(driver.findElement(By.id("ctl00_MainContent_ddlFilterExhibit"))).selectByIndex(1);
		 
		 
		 //To click on existing Exhibit****
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_rgStudentList_ctl00_ctl04_imgLink")));
		 Thread.sleep(2000);
		 
		click("//*[@id='ctl00_MainContent_rgStudentList_ctl00_ctl04_imgLink']");
		
		Thread.sleep(3000);
	    String Text=getText("//*[@id='ctl00_MainContent_rgStudentList_ctl00__0']/td[4]");
	    System.out.println(Text);
	    
	    
	   
	    //To close the window (Refresh the page)
	    Thread.sleep(2000);
	    driver.navigate().to(driver.getCurrentUrl());  
		
	    
	   //To Click on exhibits in the question
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ctl00_MainContent_FullTestView1_grdAssessmentQuestions_ctl03_imgBtnExhibit")).click();
		
		//To sWitch frame
		 WebElement frameElement3 = driver.findElement(By.name("ViewExhibit"));
		 driver.switchTo().frame(frameElement3);
		
		//*[@id='newsletterContent']/b
		Thread.sleep(2000);
	    String AssessID=getText("//*[@id='smapleView778']/span/div/b");
	    
	    System.out.println(AssessID);
	    String AssessLastName = AssessID.substring(AssessID.lastIndexOf(" ")+1);
	    
		System.out.println(AssessLastName);
		System.out.println(Text);
		
		Assert.assertEquals(AssessLastName, Text);
		
		//To close the Value
		click("//*[@id='btnClose']");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		Logout();	 
		 
	}
	catch (Exception e)
	{
		
		System.out.println(e);
		try {
		//	Logout();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Assert.assertTrue(false);
	}

}
	
}	
