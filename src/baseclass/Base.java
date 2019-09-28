package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	static WebDriver driver;
	
	public static void initiate()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Windows\\chromedriver.exe");
	driver = new ChromeDriver();
	
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	
	}
	public static WebDriver getDriver() {
		
		 return driver;
	}
	public static void clear()
	{
	driver.close();
	}
	
}
