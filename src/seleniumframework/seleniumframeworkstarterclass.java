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
import pageobjects.HomepageMoviePortalAdmin;

import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumframeworkstarterclass {

	
	@BeforeTest
	void setup()
	{
		Base.initiate();
	}
	
	@Test
	 void adminLogin()
	 {
	    	
			
	    	HomepageMoviePortal hp = new HomepageMoviePortal();
	    	
	    	hp.baseURL("https://autothon-nagarro-frontend-e07.azurewebsites.net/");
	    	
	    	
	    	hp.navClick();
	    	
	    	hp.loginclickloginlink();
	    	
	    	
	    	hp.usernameFill("admin");
	    	
	    	hp.passwordFill("password");
	    
	    	hp.loginclickbutton();
	    	
	    	
	    	HomepageMoviePortalAdmin hpa = new HomepageMoviePortalAdmin();
	    	
	    	hpa.addMovie();
	    	
	    	
	    try {
	     
	    	Thread.sleep(10000);
	    }
	    catch (Exception e) {
			// TODO: handle exception
		}

	       
	    }
	
	@AfterTest
	void clear()
	{
		Base.clear();
	}
	 
	 

	
}
