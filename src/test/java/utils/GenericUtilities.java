package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilities {
	
	public WebDriver driver;
	public GenericUtilities(WebDriver driver) {
		this.driver= driver;
	}
	
	public void getHomePage() throws IOException
	{
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String homeUrl= prop.getProperty("HomeUrl");
		driver.get(homeUrl);
	}
	
	public void switchToTabChild()
	{
		Set<String> s1 = driver.getWindowHandles();
    	Iterator<String> i1= s1.iterator();
    	String parentwindow = i1.next();
    	String childwindow = i1.next();
    	driver.switchTo().window(childwindow);
	}

}
