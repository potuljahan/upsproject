package bdd.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPSHomepageLocators {
	//UPSsingup button locator
	
	@FindBy(xpath="//body[@class='ups-wems']/div[@class='iw_viewport-wrapper']/div[@id='sectioniov5pt6f']/div[@id='rowiov5pt6g']/div[@id='coliov5pt6h']/div[@id='iw_comp1464681783542']/div[@id='ups-navContainer']/header[@id='ups-headerWrap']/div[@id='ups-header']/nav[@id='ups-navItems']/nav[@class='ups-utilities_menu']/ul[@class='ups-header_utils']/li[2]/a[1]")
	public WebElement UPSsingupButton;
}
