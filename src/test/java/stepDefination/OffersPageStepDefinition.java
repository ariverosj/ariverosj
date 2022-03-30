package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.OffersPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import utils.TestContextSetup;

@RunWith(Cucumber.class)
public class OffersPageStepDefinition {
	public String offerProduct; 
	
	TestContextSetup testContextSetup;
	
	public OffersPageStepDefinition( TestContextSetup testContextSetup)
	{
		this.testContextSetup= testContextSetup;
	}
	
	
	 @Then("^User searched for same Shortname \"([^\"]*)\" in offers page to check if product exist$")
	    public void user_searched_for_same_shortname_something_in_offers_page_to_check_if_product_exist(String strArg1) throws Throwable {
	        
		 	switchPageTooffer();
	    	
		 	OffersPage offersPage = testContextSetup.factoryPageObject.getOffersPage();
		 	offersPage.searchItem(strArg1);
		 	
	    	Thread.sleep(2000);
	    	offerProduct= offersPage.getProductNameFromOffer();
	    	
	    }
	 
	 
	    
	    @And("^Validate product name in offers page match with landing page$")
	    public void validate_product_name_in_offers_page_match_with_landing_page() throws Throwable {
	        
	    	Assert.assertEquals(testContextSetup.productName, offerProduct);
	    }
	    
	    public void switchPageTooffer()
	    {
	    	testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
	    	testContextSetup.genericUtilities.switchToTabChild();
	    }
	    
	    @Then("^User searched for same Shortname (.+) from list in offers page to check if product exist$")
	    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String name) throws Throwable {
	    	
	    	switchPageTooffer();
	    	
		 	OffersPage offersPage = testContextSetup.factoryPageObject.getOffersPage();
		 	offersPage.searchItem(name);
		 	
	    	Thread.sleep(2000);
	    	offerProduct= offersPage.getProductNameFromOffer();
	    }
	
}
