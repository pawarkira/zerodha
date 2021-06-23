package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilites.WebEventListener;



public class Testbase {
	 public static  EventFiringWebDriver e_driver;
	private static WebEventListener eventListener;
	public  static WebDriver driver;
	public static  Properties prop;
	
	public Testbase() { 
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\org.project.zerodha\\src\\main\\java\\configration\\config.properties");
		    prop.load(f);
		} 
		catch (FileNotFoundException e)
	      { 
			e.printStackTrace();
		   } 
		  catch (IOException e) 
		   {
			e.printStackTrace();
		    }
		}
	
		public static void init() {
			String browsername=prop.getProperty("browser");
			
			
			if (browsername.equals("chrome"))
			{
				

				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\kiran\\eclipse-workspace\\chromedriver.exe");
				 driver=new ChromeDriver();
				 
				// Initializing EventFiringWebDriver using Firefox WebDriver instance
					e_driver = new EventFiringWebDriver(driver);

					// Now create object of EventListerHandler to register it with EventFiringWebDriver
					eventListener = new WebEventListener();

					e_driver.register(eventListener);
					driver=e_driver;		
				
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				 
				 
				 driver.get(prop.getProperty("url"));
			}
		}
			
			
	
	}


