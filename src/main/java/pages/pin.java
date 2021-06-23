package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class pin extends Testbase {

	@FindBy(xpath="//input[@id='pin']")
	WebElement pin;
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement contine;
	
	@FindBy(xpath="//a[text()='Forgot 2FA?']")
	WebElement forgotpassword;
	
	public pin(){
		PageFactory.initElements(driver, this );
	}
	
	public void Enter_pin(String p) {
		pin.sendKeys(p);
	  }
	
	public homepage countinue() {
		contine.click();
		return new homepage();
	}
	public new_user forgot_pass() {
		forgotpassword.click();
		return new new_user();
	}
	
	
}
