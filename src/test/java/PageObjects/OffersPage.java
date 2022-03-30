package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OffersPage {
		
	WebDriver driver;
	By bySearchFeld= By.xpath("//input[@type='search']");
	By byofferText= By.cssSelector("tr td:nth-child(1)");
	
	public OffersPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void searchItem(String keys)
	{
		WebElement searchFeld= driver.findElement(bySearchFeld);
		searchFeld.sendKeys(keys);
	}
	
	public String getProductNameFromOffer()
	{
		return driver.findElement(byofferText).getText();
	}

}
