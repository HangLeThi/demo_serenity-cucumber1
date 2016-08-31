package buitech.uk.auto.steps.serenity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuitechScenarioSteps {
	@Steps
	UserSteps userSteps;
	@Given("^Buitech home page \"([^\"]*)\" is opened$")
	public void buitech_home_page_is_opened(String arg1) throws Throwable {
	    userSteps.open_browser(arg1);
	}

	@Given("^It is maximized$")
	public void it_is_maximized() throws Throwable {
	 userSteps.maximize_browser();
	}

	@When("^\"([^\"]*)\" is clicked$")
	public void is_clicked(String arg1) throws Throwable {
	    userSteps.click_on_link(arg1);
	}

	/*@When("^I Scroll down to verify the title$")
	public void i_Scroll_down_to_verify_the_title(int x) throws Throwable {
	  userSteps.scroll_down(x);
	}*/

	@When("^the \"([^\"]*)\" is displayed$")
	public void the_is_displayed(String arg1) throws Throwable {
	 
	}

	
/*	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String arg1) throws Throwable {
	 
	}

	@Given("^maximize the window$")
	public void maximize_the_window() throws Throwable {
	   
	}

	@When("^\"([^\"]*)\" element is clicked$")
	public void element_is_clicked(String arg1) throws Throwable {
	    
	}

	@When("^\"([^\"]*)\" is scrolled into view$")
	public void is_scrolled_into_view(String arg1) throws Throwable {
	   
	}

	@Then("^assert that the page title is \"([^\"]*)\"$")
	public void assert_that_the_page_title_is(String arg1) throws Throwable {
	    
	}

	@Then("^assert that the url is \"([^\"]*)\"$")
	public void assert_that_the_url_is(String arg1) throws Throwable {
	    
	}

	@Then("^assert that the text \"([^\"]*)\" element is \"([^\"]*)\"$")
	public void assert_that_the_text_element_is(String arg1, String arg2) throws Throwable {
	    
	}*/


	
	

	

}
