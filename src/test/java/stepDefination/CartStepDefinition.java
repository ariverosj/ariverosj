package stepDefination;

import org.junit.Assert;
import org.junit.runner.RunWith;

import PageObjects.CartPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import utils.TestContextSetup;

@RunWith(Cucumber.class)
public class CartStepDefinition {

	TestContextSetup testContextSetup;
	CartPage cartPage;
	
	public CartStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup= testContextSetup;
		this.cartPage= testContextSetup.factoryPageObject.getCartPage();
	}
	

	 @Then("^User verifie if buttons exist$")
    public void user_verifie_if_buttons_exist() throws Throwable {
    	
    	
    	cartPage.toCartPageFromHome();
    	Thread.sleep(2000);
    	
    	Assert.assertTrue(cartPage.applyButtonExist());
    	Assert.assertTrue(cartPage.PlaceOrderButtonExist());
    } 
    
	 @And("^User verifie if the products \"([^\"]*)\" are on the cartpage$")
    public void user_verifie_if_the_products_something_are_on_the_cartpage(String strArg1) throws Throwable {
        
    	Assert.assertEquals(strArg1, cartPage.getProductfromtable().split("-")[0].trim());
    	
    }
}
