package bdd.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginPageLocatore {

	@FindBy(xpath="//body[@class='ups-wems']")
	public WebElement LoginButton;
}
