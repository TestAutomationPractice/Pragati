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
	    	
			
	    	Homepage hp = new Homepage("http://demo.guru99.com/test/newtours/");
	    	hp.usernameFill("test");
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
