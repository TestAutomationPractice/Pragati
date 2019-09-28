package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class HomepageMoviePortal {

	
	
	WebDriver driver = Base.getDriver();
	String pagetitle ;
	
	
	public HomepageMoviePortal(String url)
	{
		driver.get(url);
		pagetitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Login")
	WebElement LoginLink;
	
	@FindBy(partialLinkText="Cancel")
	WebElement CancelLink;
	
	
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="cancel")
	WebElement Button;
	
	public void usernameFill(String username)
	{	
		Username.click();
		Username.clear();
		Username.sendKeys(username);
	}
	public void passwordFill(String password)
	{	
		Password.click();
		Password.clear();
		Password.sendKeys(password);
	}
	public void loginclickbutton()
	{	
		Button.click();
		
	}
	public void loginclickloginlink()
	{	
		LoginLink.click();
		
	}
	public void cancelclickloginlink()
	{	
		CancelLink.click();
		
	}
	public String getpageTitle()
	{
		return pagetitle;
	}
	
	
	
}
