package com.mercury.uipackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.base.TestBase;

public class LoginPage  extends TestBase{
	
	@FindBy(xpath = "//input[@name ='userName']")
	@CacheLookup
	WebElement userName;
	
	@FindBy(xpath ="//input[@name ='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//input[@name ='login']")
	@CacheLookup
	WebElement SignIn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public FlightFinder login(String username,String passwd)
	{
		userName.clear();
		userName.sendKeys(username);
		password.clear();
		password.sendKeys(passwd);
		SignIn.click();
		return new FlightFinder();
	}

}
