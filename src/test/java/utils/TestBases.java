package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBases {

	public WebDriver driver;
	
	public WebDriver getWebdriver() throws IOException
	{
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser= prop.getProperty("browser");
		
		if(driver== null)
		{
			
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			default:
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
		}
		return driver;
		
	}

}
