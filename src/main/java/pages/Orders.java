package pages;

import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Orders extends Testbase {

	
	public Orders() {
		PageFactory.initElements(driver, this);
	}
	
}
