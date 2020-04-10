package com.pageaction;

import java.util.concurrent.TimeUnit;

import bdd.pageElements.UpsLoginPageLocatore;
import bdd.utilities.SetupDrivers;

public class UpsLoginPageAction {
	
	UpsLoginPageLocatore upsLoginPageLocatore = new UpsLoginPageLocatore();

	public void launchUPSHomepage(){
		
		  SetupDrivers.driver.get("https://www.ups.com/us/en/Home.page");
		  SetupDrivers.driver.manage().window().maximize();
		  SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
}
	public void  NavigateToLoginpage(){
		upsLoginPageLocatore.LoginButton.click();
	}
}