package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.FactoryPageObject;

public class TestContextSetup {
	public WebDriver driver;
	public String productName;
	public FactoryPageObject factoryPageObject;
	public TestBases testBases;
	public GenericUtilities genericUtilities;
	
	public TestContextSetup() throws IOException
	{
		testBases= new TestBases();
		driver= testBases.getWebdriver();
		factoryPageObject= new FactoryPageObject(driver);
		genericUtilities= new GenericUtilities(driver);
	}

}
