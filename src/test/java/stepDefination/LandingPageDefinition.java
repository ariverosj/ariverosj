package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import utils.TestContextSetup;

@RunWith(Cucumber.class)
public class LandingPageDefinition {
	
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup= testContextSetup;
		this.landingPage = testContextSetup.factoryPageObject.getLandingPage();
	}
	
	@Given("^User is on Greencart website$")
    public void user_is_on_greencart_website() throws Throwable {
		
		testContextSetup.genericUtilities.getHomePage();
		
    }

	 @When("^User searched with shortname \"([^\"]*)\" and extracted actual name of product$")
    public void user_searched_with_shortname_something_and_extracted_actual_name_of_product(String strArg1) throws Throwable {
        
    	LandingPage landingPage= testContextSetup.factoryPageObject.getLandingPage();
    	
    	landingPage.searchItem(strArg1);
    	
    	Thread.sleep(2000);
    	testContextSetup.productName=landingPage.getProductNameFromSearch().split("-")[0].trim();
    	
    	System.out.println(testContextSetup.productName+ " was extracted");
    }
    
    @When("^User searched with shortname (.+) from list and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name) throws Throwable {
     
    	
    	landingPage.searchItem(name);
    	
    	Thread.sleep(2000);
    	testContextSetup.productName=landingPage.getProductNameFromSearch().split("-")[0].trim();
    	
    	System.out.println(testContextSetup.productName+ " was extracted");
    
    }
    
    @And("^User add one more the product \"([^\"]*)\"$")
    public void user_add_one_more_the_product_something(String strArg1) throws Throwable {
    	landingPage.clicOnIncrement(1);
    	Thread.sleep(2000);
    }
    
    @And("^User click on to Add to cart from the product \"([^\"]*)\"$")
    public void user_click_on_to_add_to_cart_from_the_product_something(String strArg1) throws Throwable {
        
    	landingPage.clickOnAddToCart();
    	Thread.sleep(2000);
    }

}
