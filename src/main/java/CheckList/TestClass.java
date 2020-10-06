package CheckList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.Collator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Library.BaseClassOne;
public class TestClass  {
	
	public static void main(String... args)
	{
	    List<String> items = Arrays.asList("111", "A.V.I.D.", "Academic Assistance","Accounting", "ad1","admin1","admin11","admin2","African-American Studies","Advanced Accounting","Agriculture Business","Agriculture");
	    Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
	    System.out.println(items);
	}
	
	
}
