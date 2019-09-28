package seleniumframework;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import baseclass.Base;
import pageobjects.Homepage;
import pageobjects.HomepageMoviePortal;

import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumframeworkstarterclass {

	
	@BeforeTest
	void setup()
	{
		Base.initiate();
	}
	
	@Test
	 void testMethod()
	 {
	    	
			
	    	HomepageMoviePortal hp = new HomepageMoviePortal("https://autothon-nagarro-frontend-w04.azurewebsites.net/");
	    	
	    	
	    	hp.loginclickloginlink();
	    	try {
	    	Thread.sleep(1000);
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    	hp.usernameFill("password");
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.passwordFill("admin");
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.loginclickbutton();
	    
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = hp.getpageTitle();
	        assertEquals(actualTitle, expectedTitle);


	       
	    }
	
	@AfterTest
	void clear()
	{
		Base.clear();
	}
	 
	 

	
}
