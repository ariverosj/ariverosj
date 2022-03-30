package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitionTest {

	@Given("^User is on landing Page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("On Page");
    }

	@When("^User loging with user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_loging_with_user_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println("Log in with User " + strArg1 + " And Password " + strArg2);
    }

    @Then("^Home Page is poulated$")
    public void home_page_is_poulated() throws Throwable {
    	System.out.println("Populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("CARD DISPLAYED");
    }

    @When("^User loging with next dateils$")
    	    public void user_loging_with_next_dateils(DataTable data) throws Throwable{
    		
    		List<List<String>> obj = data.asLists(String.class); 
    		System.out.println("Name: " + obj.get(0).get(0) + "And Email: " + obj.get(0).get(2) );
    	    }
    
    @When("^User loging with users (.+) and passwords (.+)$")
    public void user_loging_with_user_and_password(String username, String password) throws Throwable {
    	System.out.println("Log in with User " + username + " And Password " + password);
    }
    
    @Given("^validate the Browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("validate the Browser");
    }

    @When("^Browser is open$")
    public void browser_is_open() throws Throwable {
    	System.out.println("Browser is open");
    }

    @Then("^Browser is displayed$")
    public void browser_is_displayed() throws Throwable {
    	System.out.println("Browser is displayed");
    }

}
