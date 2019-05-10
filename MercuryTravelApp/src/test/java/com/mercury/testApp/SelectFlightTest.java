package com.mercury.testApp;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.base.TestBase;
import com.mercury.uipackage.FlightFinder;
import com.mercury.uipackage.LoginPage;
import com.mercury.uipackage.SelectFlight;
import com.mercury.util.TestUtil;

public class SelectFlightTest extends TestBase{
	
	
	public LoginPage loginPage;
	public FlightFinder flightfinder;
	public SelectFlight selectflight;
	public TestUtil testUtil;
	
	public SelectFlightTest()
	{
		super();
	}
	
	@BeforeMethod
	public void init()
	{
		initialization();
		loginPage = new LoginPage();
		flightfinder = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void selectFlightsTest()
	{
		selectflight = flightfinder.findFlights("RoundTrip", "3", "Seattle", "April", "9", "London", "April", "12", "Business", "Pangea Airlines");
	    selectflight.SelectAirlineForDepartureandArrival("Pangaea Airlines 362", "Pangea Airlines 632");
	}

}
