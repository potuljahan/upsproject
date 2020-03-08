package bdd.stepDef;

import com.pageaction.UPSHomePageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSsingup {
	UPSHomePageAction homepageaction = new UPSHomePageAction ();

	@Given("^Browse to ups home page$")
	public void browse_to_ups_home_page() throws Throwable {
		homepageaction.launchUPSHomepage();
	}

	@When("^Navigate on sign up page$")
	public void navigate_on_sign_up_page() throws Throwable {


	}

	@When("^put name <Name>, email <Email>, user ID <User ID>, password <password>$")
	public void put_name_Name_email_Email_user_ID_User_ID_password_password() throws Throwable {


	}

	@Then("^check mark in agreement field$")
	public void check_mark_in_agreement_field() throws Throwable {


	}

	@Then("^Navigate on the signup button$")
	public void navigate_on_the_signup_button() throws Throwable {
	   
	}

	@Then("^landed on user Account pageFeature: user ability to create a shipment package & flight$")
	public void landed_on_user_Account_pageFeature_user_ability_to_create_a_shipment_package_flight() throws Throwable {
	   
	}
}


