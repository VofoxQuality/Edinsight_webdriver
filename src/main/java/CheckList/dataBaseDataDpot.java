package CheckList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Library.BaseClassOne;

public class dataBaseDataDpot extends BaseClassOne  {
	
	
	@Test(priority =1)	
	public void TCED39401()

	{
		try
		{
			
			//Supertent Login
			login(Supertent_Login_id,Supertent_Login_Password);

			//hover over report link			
			Actions act=new Actions(driver);					
			act.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();
			//act.moveToElement(find("//a[contains(text(),'Reports')]")).build().perform();

			// Click NWEA
			//click("//div[@class='left']//div//a[contains(text(),'NWEA')]");
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			Thread.sleep(2000);
			
			//click on enter Score
			click("//a[contains(text(),'Enter Scores')]");
			
			//Select Building/District
			select("//select[@id='ctl00_MainContent_ddlProvider']", "Ashley High School");
			
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']", "Twelfth Grade");
			
			select("//select[@id='ctl00_MainContent_ddlTestingPeriod']", "Spring");
			
			//Click on run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			//Click on the Student "BRIAN ANDERSON
			click("//a[contains(text(),'BRIAN ANDERSON')]");
			
			
			String StudentID=getText("//span[@id='ctl00_plcHeader_HeaderStudentTop1_lblDisplayStudentId']");
			
			//hover over report link	
			Actions act2=new Actions(driver);					
			act2.moveToElement(find("//a[contains(text(),'Data Analyst')]")).build().perform();
			
			Actions act1=new Actions(driver);					
			act1.moveToElement(find("//a[contains(text(),'Data Depot')]")).build().perform();
			//act.moveToElement(find("//a[contains(text(),'Reports')]")).build().perform();

			// Click NWEA
			//click("//div[@class='left']//div//a[contains(text(),'NWEA')]");
			click("//a[contains(text(),'For Automation - Do_Not_Edit_n_Delete')]");
			
			Thread.sleep(2000);
			
			//click on enter Score
			click("//a[contains(text(),'Enter Scores')]");
			
			//Select Building/District
			select("//select[@id='ctl00_MainContent_ddlProvider']", "Ashley High School");
			
			select("//select[@id='ctl00_MainContent_ddlGradeLevel']", "Twelfth Grade");
			
			select("//select[@id='ctl00_MainContent_ddlTestingPeriod']", "Spring");
			
			//Click on run report
			click("//input[@id='ctl00_MainContent_btnRunReport']");
			
			Thread.sleep(10000);
			type("xpath=(.//*[normalize-space(text()) and normalize-space(.)='BRIAN ANDERSON'])[1]/following::input[1]","178");
			
			
			//Click on save button
			click("//input[@id='ctl00_MainContent_btnSave']"); 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//String Url="jdbc:sqlserver://192.168.10.112\\SQL2016,201;DatabaseName=EdInsightAvonGrove";
			String Url="jdbc:sqlserver://192.168.10.112:2016;DataBaseName=EdInsightAvonGrove";
			
			Connection con = DriverManager.getConnection(Url,"sa","abc123*");


			Statement stmt = con.createStatement();	

			 System.out.println();
			 
			// ResultSet rs = stmt.executeQuery("select *  from RTIStudentInterventionTrackingFormDetails;");
			 
			 ResultSet rs = stmt.executeQuery("select StudentScore from InputAssessmentStudentScore INNER JOIN Student ON InputAssessmentStudentScore.StudentId=Student.StudentId where DisplayStudentId="+StudentID+" and TestingPeriodName='Spring'");
			 
			// ResultSet rs = statement.executeQuery();
			   ResultSetMetaData rsmd = rs.getMetaData();
			   //System.out.println("querying SELECT * FROM XXX");
			   int columnsNumber = rsmd.getColumnCount();
			   int columnsNumberg = rsmd.getColumnCount();
			  // String columnsNamer = rsmd.getColumnName(1);
			   	//rs.last();
			   rs.next();
			 /*  while (rs.next()) {
			       for (int i = 1; i <= columnsNumber; i++) {
			           if (i > 1) System.out.print(",  ");
			           //String columnsNamer = rsmd.getColumnName(i);
			           //String columnValue = rs.getString(i);
			           int s=rs.getRow();
			           System.out.print(rsmd.getColumnName(i) + ": " + rs.getString(i)+": "+ s+"("+i+")");    
			       } */
			   		//String text1
			       
			       Assert.assertEquals("178", rs.getString(1));
		        
			       
			 //  }    	
		
		} 
		
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}	

	}
}	
