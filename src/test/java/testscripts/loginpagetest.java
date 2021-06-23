package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Testbase;
import pages.loginpage;
import pages.pin;

public class loginpagetest extends Testbase {
	
	
	loginpage L;
	public pin p;
	
	
	
	public loginpagetest(){    //step 1. get properties 
		super();
	}
	
     @BeforeMethod
	    public void setup() {     // step 2.initalizes broswer
		     init();
		     L=new loginpage();
	      }
  
     @Test
         public void check_page_tittle() {
	     String tittle= L.validateTITTLE(); 
	     Assert.assertEquals(tittle, "Kite - Zerodha's fast and elegant flagship trading platform");
	  
        }
  
     @Test
        public void check_page_logo() {
	    boolean flag=L.ValidateLOGO();
	    Assert.assertTrue(flag);
       } 
     
     @Test
         public void check_page_login_corretely() {
     
    	  p=L.validateLOGIN(prop.getProperty("username"), prop.getProperty("password"));
        }
  
     
     
     @AfterMethod
       public void terdown() {
	    driver.quit();
	  
  }
	
	
}

