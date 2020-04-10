package bdd.stepDef;

import com.pageaction.ShipingNavigetPgAction;
import com.pageaction.UPSHomePageAction;
import com.pageaction.UPSshipmentPakegAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UPSpackageflight {
	UPSHomePageAction homepageaction = new UPSHomePageAction ();
	ShipingNavigetPgAction shipingNavigetPgAction = new ShipingNavigetPgAction ();	
	UPSshipmentPakegAction upsshipmentPakegAction = new UPSshipmentPakegAction ();
	
			
	@Given("^user lands on ups homepage$")
	public void user_lands_on_ups_homepage() throws Throwable {
		homepageaction.launchUPSHomepage();
	}

	@When("^user sees shipping button also Navigate it$")
	public void user_sees_shipping_button() throws Throwable {
		shipingNavigetPgAction.shipingTOpackge();
	}

	@When("^Navigate shipment package & flight page$")
	public void navigate_shipment_package_flight_page() throws Throwable {
		shipingNavigetPgAction.packageflightpage();
	}

	@Then("^user fill up all required field$")
	public void user_fil_up_all_required_field() throws Throwable {
		upsshipmentPakegAction.UPSfillUPContactInfo();
		upsshipmentPakegAction.UPSfillUPAdressInfo();
		upsshipmentPakegAction.UPSfillUPContactInfo2();
	}

	@Then("^finish shipment with continue$")
	public void finish_shipment_with_continue() throws Throwable {
		upsshipmentPakegAction.ContinueForm();
	}
}