package com.pageaction;

import java.util.concurrent.TimeUnit;

import bdd.pageElements.UPSHomepageLocators;
import bdd.utilities.SetupDrivers;



public class UPSHomePageAction {

	UPSHomepageLocators UPSHomePagelocators = new UPSHomepageLocators ();
	
	public void launchUPSHomepage(){
		
		  SetupDrivers.driver.get("https://www.ups.com/us/en/Home.page");
		  SetupDrivers.driver.manage().window().maximize();
		  SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
}
	public void  NavigateToSingUPpage(){
		UPSHomePagelocators.UPSsingupButton.click();
		
	}
}