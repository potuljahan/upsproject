package bdd.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPSshipmentPakegLocators {
	

	@FindBy(xpath="//select[@id='origincountry']")
	public WebElement Country;
	
	@FindBy(xpath="//input[@id='originname']")
	public WebElement Name;
	
	@FindBy(xpath="//input[@id='origincontactName']")
	public WebElement ContactName;
	
	@FindBy(xpath="//input[@id='originaddress1']")
	public WebElement Addressline1;
	
	@FindBy(xpath="//input[@id='originaddress2']")
	public WebElement Addressline2;
	
	@FindBy(xpath="//input[@id='originaddress3']")
	public WebElement Addressline3;
	
	@FindBy(xpath="//input[@id='originpostal']")
	public WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='origincity']")
	public WebElement City;
	
	@FindBy(xpath="//select[@id='originstate']")
	public WebElement State;
	
	@FindBy(xpath="//input[@id='originemail']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='originphone']")
	public WebElement Phone;
	
	@FindBy(xpath="//input[@id='originextension']")
	public WebElement Extension;
	
	@FindBy(xpath="//button[@id='nbsBackForwardNavigationContinueButton']")
	public WebElement Continue;

}
