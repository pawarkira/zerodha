package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class menu extends Testbase {

	
	@FindBy(xpath="//ul[@class='list-flat dropdown-nav-list']//a[@class='router-link-exact-active router-link-active']")
	WebElement dropdown; 
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logout;
	
	
	public menu() {
		PageFactory.initElements(driver, this);
	}
	public void validate_dropdown() {
		dropdown.click();
		Actions a=new Actions (driver);
		a.moveToElement(logout).click().build().perform();
	}
	
	
}
