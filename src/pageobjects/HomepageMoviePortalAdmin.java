package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class HomepageMoviePortalAdmin extends HomepageMoviePortal{

	
	
	WebDriver driver = Base.getDriver();
	String pagetitle ;
	
	
	
	
	public HomepageMoviePortalAdmin()
	{
		super();
		
	
	}
	
	
	@FindBy(xpath="//*[@id=\"main\"]/span/div/div/ul/div/li/a")
	WebElement addMovie;
	


	public void addMovie()
	{	
		addMovie.click();
		
	}
	public String getpageTitle()
	{
		return pagetitle;
	}
	
	
	
}
