package com.pageaction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.pageElements.UPSshipmentPakegLocators;
import bdd.utilities.SetupDrivers;

public class UPSshipmentPakegAction {
	

   UPSshipmentPakegLocators UPSshipmentPakegLocatorsobj;
	
	public UPSshipmentPakegAction (){
	UPSshipmentPakegLocatorsobj = new UPSshipmentPakegLocators ();
	PageFactory.initElements(SetupDrivers.driver, UPSshipmentPakegLocatorsobj);
}
	
	public void UPSfillUPContactInfo() throws Exception{
		Thread.sleep(5000);
		
		Select mydrpdwn = new Select (UPSshipmentPakegLocatorsobj.Country);
		mydrpdwn.selectByVisibleText("United States");
		
		UPSshipmentPakegLocatorsobj.Name.sendKeys("Mithun");
		UPSshipmentPakegLocatorsobj.ContactName.sendKeys("Mithun Begum");}
		
	public void UPSfillUPAdressInfo() throws Exception{
		Thread.sleep(5000);
		
		UPSshipmentPakegLocatorsobj.Addressline1.sendKeys("84-28 av");
		UPSshipmentPakegLocatorsobj.Addressline2.sendKeys("house 1Fl");
		UPSshipmentPakegLocatorsobj.Addressline3.sendKeys("no deparment");
		UPSshipmentPakegLocatorsobj.ZipCode.sendKeys("11418");
		UPSshipmentPakegLocatorsobj.City.sendKeys("Ozone Park");
		
		Select mydrpdwn = new Select (UPSshipmentPakegLocatorsobj.State);
		mydrpdwn.selectByVisibleText("New York");
		
	}
	
	public void UPSfillUPContactInfo2() throws Exception{
		Thread.sleep(5000);
       UPSshipmentPakegLocatorsobj.Email.sendKeys("mithunbegum@gmail.com");
       UPSshipmentPakegLocatorsobj.Phone.sendKeys("5168084796");
       UPSshipmentPakegLocatorsobj.Extension.sendKeys("ABCD");
	}
	
	public void ContinueForm() throws Exception{
		Thread.sleep(5000);
		//UPSshipmentPakegLocatorsobj.Continue.click();
	}
	
	
		
	}

