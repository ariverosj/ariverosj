package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	
	By byCartButton = By.cssSelector("[alt='Cart']");
	By byProceedToCheckoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By byApplyButton= By.cssSelector(".promoBtn");
	By byPlaceOrderButton=By.xpath("//button[@innertext='Place Order']");
	By byProductNameOneProduct= By.cssSelector(".product-name");
		
	public CartPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void toCartPageFromHome() throws InterruptedException
	{
		driver.findElement(byCartButton).click();
		Thread.sleep(2000);
		driver.findElement(byProceedToCheckoutButton).click();
	}
	
	public boolean applyButtonExist()
	{
		return driver.findElement(byApplyButton).isDisplayed();
	}
	
	public boolean PlaceOrderButtonExist()
	{
		return driver.findElement(byApplyButton).isDisplayed();
	}
	
	public String getProductfromtable()
	{
		return driver.findElement(byProductNameOneProduct).getText();
	}

}
