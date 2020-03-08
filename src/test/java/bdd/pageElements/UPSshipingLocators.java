package bdd.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UPSshipingLocators {
	//user lands on ups  shipping page
	//user lands on ups  packageflightpage page

	@FindBy(xpath="//a[@id='ups-menuLinks1']")
	public WebElement NavigateToShipmentpage;

	
	@FindBy(xpath="//em[contains(text(),'Package & Freight')]")
	public WebElement NavigateTopackageflightpage;
}
