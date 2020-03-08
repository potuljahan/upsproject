package com.pageaction;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;

import bdd.pageElements.UPSshipingLocators;
import bdd.utilities.SetupDrivers;

public class ShipingNavigetPgAction {

	UPSshipingLocators UPSshipingLocatorsobj ;

 public ShipingNavigetPgAction(){ 
	 
	 UPSshipingLocatorsobj = new UPSshipingLocators ();
	 PageFactory.initElements(SetupDrivers.driver, UPSshipingLocatorsobj);
 }
 public void launcShipmentPageAction(){
		
	    SetupDrivers.driver.get("https://www.ups.com/us/en/Home.page?");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void shipingTOpackge () throws Exception{
		Thread.sleep(5000);
		UPSshipingLocatorsobj.NavigateToShipmentpage.click();
		UPSshipingLocatorsobj.NavigateTopackageflightpage.click();
	}
 
 }