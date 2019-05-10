package com.mercury.uipackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.base.TestBase;

public class FlightConfirmation extends TestBase {
	
	@FindBy(xpath = "//a[text()= 'Flights']")
	WebElement BacktoFlights;
	
	@FindBy(xpath = "//a[@href = 'mercurywelcome.php']")
	WebElement BacktoHome;
	
	@FindBy(xpath = "//a[@href = 'mercurysignoff.php']")
	WebElement logout;
	
	public FlightConfirmation()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Signoff()
	
	{
		logout.click();
	}

}
