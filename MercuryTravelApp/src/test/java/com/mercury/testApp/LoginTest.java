package com.mercury.testApp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.base.TestBase;
import com.mercury.uipackage.FlightFinder;
import com.mercury.uipackage.LoginPage;

public class LoginTest extends TestBase {
	
	public LoginPage loginPage;
	public FlightFinder flightfinder;
	public LoginTest()
	{
		super();
	}
	
@BeforeMethod
public void setup()
{
	initialization();
	loginPage = new LoginPage();
	flightfinder = new FlightFinder();
}

@Test
public void loginTest()
{
	flightfinder = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@AfterMethod
public void tearDown(){
	driver.quit();
}
}
