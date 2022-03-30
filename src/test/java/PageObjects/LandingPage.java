package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class LandingPage {
	
	WebDriver driver;
	By bySearchFeld= By.xpath("//input[@type='search']");
	By byProductName= By.cssSelector("h4.product-name");
	By byIncrementButton= By.cssSelector(".increment");
	By byAddToCart= By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public LandingPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void searchItem(String keys)
	{
		WebElement searchFeld= driver.findElement(bySearchFeld);
		searchFeld.sendKeys(keys);
	}
	
	public String getProductNameFromSearch()
	{
		return driver.findElement(byProductName).getText();
	}
	
	public void clicOnIncrement( int manyTimes)
	{
		for ( int i = 1; i< manyTimes + 1; i++)
		{
			driver.findElement(byIncrementButton).click();
		}
	}
	
	public void clickOnAddToCart()
	{
		driver.findElement(byAddToCart).click();
	}
	
}
