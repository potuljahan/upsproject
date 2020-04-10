package bdd.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginInfoLocators {
	                                                                                          
	
	
       	
    @FindBy(xpath="//input[@id='email']")
	public WebElement userID;
	
	@FindBy(xpath="//input[@id='pwd']")
	public WebElement password; 
	
	@FindBy(xpath="//button[@id='submitBtn']")
	public WebElement LoginSubmitButton; 
}
