package Library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class objectData {
	
	public String readData(String str)
	{ 
		try
		{
	   System.out.println("test");
	   File src=new File("E:\\Quality\\trunk\\EdinsightAutomation\\objectRepository.property");
	   FileInputStream fis=new FileInputStream(src);
	   Properties pro=new Properties();
	   pro.load(fis);
	
	   String data=pro.getProperty(str);
	   System.out.println(" Data is  :"+data);
	   return data;
		}
		catch (Exception e)
		{
			
			System.out.println("Error data reading from property file"+e.getMessage());
			return null;
			
		}
	
	}
}
