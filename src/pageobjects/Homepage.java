package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class Homepage {

	
	
	WebDriver driver = Base.getDriver();
	String pagetitle ;
	
	
	public Homepage(String url)
	{
		driver.get(url);
		pagetitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement Username;
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement Password;
	
	public void usernameFill(String message)
	{	
		Username.click();
		Username.clear();
		Username.sendKeys(message);
	}
	
	public String getpageTitle()
	{
		return pagetitle;
	}
	
	
	
}
