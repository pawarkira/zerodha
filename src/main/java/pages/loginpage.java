package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class loginpage extends Testbase {
     //PAGE FACTORY
	
	@FindBy(xpath="//input[@id='userid']")
	static WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	static WebElement password;
	 
	@FindBy(xpath="//button[@type='submit']")
	static WebElement submit;
	
	@FindBy(xpath="//img[@alt='Kite']")
	static WebElement logo;
	 
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods 
	public String validateTITTLE()
	{
		return driver.getTitle();
	}
	public boolean ValidateLOGO()
	{
		 return logo.isDisplayed();
	}
	
	 
	public  pin validateLOGIN(String ua,String pwd)
	{
		userid.sendKeys(ua);
		password.sendKeys(pwd);
		submit.click();
		
		return new pin();
	}
	
	
	
	
}
