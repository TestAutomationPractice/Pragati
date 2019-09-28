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
	    	try {
	    	Thread.sleep(1000);
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    	hp.usernameFill("admin");
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.passwordFill("admin123");
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.loginclickbutton();
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.loginclickloginlink();
	    	try {
		    	Thread.sleep(1000);
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
	    	hp.cancelclickloginlink();
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
