
package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.homepage;
import pages.loginpage;
import pages.pin;
import utilites.testUtil;

public class homepagetest extends Testbase {

	public loginpage L;
	public pin p;
	public homepage h;
	public testUtil t;
	
	public homepagetest(){    //step 1. get properties 
		super();
	}
	
     @BeforeMethod
	         public void setup() {     // step 2.initalizes broswer
		     init();
		     t= new testUtil();
		     L=new loginpage();
		   p=L.validateLOGIN(prop.getProperty("username"), prop.getProperty("password"));
		   p.Enter_pin(prop.getProperty("pin"));
		   h=p.countinue();
		     
	        }
    
     
      @Test
      public void check_view_stmt_link() {
    	  h.link();
    	  
      }
      
      @Test public void check_orders() {
    	  h.validate_orders();
      }
     
      
     
     @AfterMethod
        public void terdown() {
	     driver.quit();
	  
       }
}
