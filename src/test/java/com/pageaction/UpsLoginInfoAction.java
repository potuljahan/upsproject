package com.pageaction;

import org.openqa.selenium.support.PageFactory;

import bdd.pageElements.UpsLoginInfoLocators;
import bdd.utilities.SetupDrivers;

     public class UpsLoginInfoAction {

	

	     UpsLoginInfoLocators UpsLoginPageLocatorsobj;
		
     public UpsLoginInfoAction (){
			UpsLoginPageLocatorsobj = new UpsLoginInfoLocators ();
		PageFactory.initElements(SetupDrivers.driver, UpsLoginPageLocatorsobj);
}

 
     public void UpsloginInfo() throws Exception {
    	Thread.sleep(5000); 
    	
    
    	UpsLoginPageLocatorsobj.userID.sendKeys("Ravinder24@gmail.com");
    	UpsLoginPageLocatorsobj.password.sendKeys("Ravi_0524");
    	UpsLoginPageLocatorsobj.LoginSubmitButton.click();
     }}
     