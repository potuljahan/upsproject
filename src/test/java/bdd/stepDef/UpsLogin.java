package bdd.stepDef;

import com.pageaction.UPSHomePageAction;
import com.pageaction.UpsLoginInfoAction;
import com.pageaction.UpsLoginPageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsLogin {
	UpsLoginPageAction upsLoginPageAction = new UpsLoginPageAction();
	UpsLoginInfoAction upsLoginInfoAction = new UpsLoginInfoAction();
	
	@Given("^Browse to ups homepage$")
	public void browse_to_ups_homepage() throws Throwable {
		upsLoginPageAction.launchUPSHomepage();
	}

	@When("^Navigate to Sign in page$")
	public void navigate_to_Sign_in_page() throws Throwable {
		upsLoginPageAction.NavigateToLoginpage();
	}

	@When("^Put valid username in \"([^\"]*)\"$")
	public void put_valid_username_in(String arg1) throws Throwable {
	
	}

	@When("^valid password in \"([^\"]*)\"$")
	public void valid_password_in(String arg1) throws Throwable {
	    
	}

	@Then("^Navigate login button$")
	public void navigate_login_button() throws Throwable {
	 
	}

	@Then("^redirected to  account$")
	public void redirected_to_account() throws Throwable {

	}
}
