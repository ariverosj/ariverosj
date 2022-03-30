package PageObjects;

import org.openqa.selenium.WebDriver;

public class FactoryPageObject {

	WebDriver webDriver;
	public FactoryPageObject(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	LandingPage landingPage;
	OffersPage offersPage;
	CartPage cartPage;
	
	public LandingPage getLandingPage()
	{
		landingPage= new LandingPage(webDriver);
		return landingPage;
	}
	
	public OffersPage getOffersPage()
	{
		offersPage= new OffersPage(webDriver);
		return offersPage;
	}
	
	public CartPage getCartPage()
	{
		cartPage= new CartPage(webDriver);
		return cartPage;
	}

}
