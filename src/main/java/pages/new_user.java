package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Testbase;

public class new_user extends Testbase {

	@FindBy(xpath="//body/div[@id='outer-app']//input[1]")
	WebElement userid;
	
	@FindBy(xpath="//body/div[@id='outer-app']//div[2]//input[1]")
	WebElement PAN;
	
	@FindBy (xpath="//label[contains (text(),'SMS')]")
	WebElement SMS;
	
	@FindBy(xpath="//body/div[@id='outer-app']/div//form//div[4]//input[1]")
	WebElement Email;
	
	@FindBy(xpath="//button[contains(text(),'Reset')]")
	WebElement reset;
	
	
	
}
