package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Testbase;

public class homepage extends Testbase {

	@FindBy(xpath="//span[text()='PM']")
	WebElement userid;
	
	@FindBy(xpath="//span[text()='Orders']")
	WebElement orders;
	
	@FindBy(xpath="//span[text()='Holdings']")
	WebElement holdings;
	
	@FindBy(xpath="//span[text()='Positions']")
	WebElement postions;
	
	@FindBy(xpath="//span[text()='Funds']")
	WebElement funds;
	
	@FindBy(xpath="//span[text()='Apps']")
	WebElement apps; 
	
	@FindBy(xpath="//span[text()='PM']")
	WebElement menu;
	
	@FindBy(xpath="//a[@href='https://console.zerodha.com/funds/statement?segment=equity']//span[contains(text(),'View statement')]")
	WebElement view_stmt;
	
	@FindBy(xpath="//input[@id='search-input']")
	WebElement serchbar;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	  public void  link() {
		    view_stmt.click();
		   
	  }   
	    
	 
    public Orders validate_orders() {
	   
	    orders.click();
	   return new Orders();
	   
    }
    
    public Holdings validate_holdings() {
 	   
	    holdings.click();
	   return new Holdings();
	  
      }
	
    public Positions validate_postions() {
  	   
	    postions.click();
	   return new Positions();
	  
      }
    public Funds validate_funds() {
   	   
	    funds.click();
	   return new Funds();
	  
      }
    public Apps validate_apps() {
    	   
	    apps.click();
	   return new Apps();
	  
      }
    public menu validate_menu() {
 	   
	    menu.click();
	   return new menu();
	  
      }
    
    
	
	
}
