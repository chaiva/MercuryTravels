package com.mercury.testApp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.base.TestBase;
import com.mercury.uipackage.BookFlight;
import com.mercury.uipackage.FlightConfirmation;
import com.mercury.uipackage.FlightFinder;
import com.mercury.uipackage.LoginPage;
import com.mercury.uipackage.SelectFlight;

public class FlightConfirmationtest extends TestBase {
	
	public LoginPage loginPage;
	public FlightFinder flightFinder;
	public SelectFlight selectFlight;
	public BookFlight bookFlight;
	public FlightConfirmation flightConfirmation;
	
	public FlightConfirmationtest()
	{
		super();
	}
	
	@BeforeMethod
	public void init()
	{
		initialization();
		loginPage = new LoginPage();
		flightFinder = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
   @Test
   public void FlightConfirmTest()
   {
	   selectFlight = flightFinder.findFlights("RoundTrip", "3", "Seattle", "April", "9", "London", "April", "12", "Business", "Pangea Airlines");
		bookFlight = selectFlight.SelectAirlineForDepartureandArrival("Pangaea Airlines 362", "Pangea Airlines 632");
		flightConfirmation = bookFlight.bookFlight("Tom", "Crusie", "Vegetarian", "Visa", "345678", "06", "2005", "Tom", "Andy", "Crusie", "Eat Sreet", "Vernica avenue", "SunCity", "CA", "FC2345", "UNITED STATES", "Sun Street", "seven Hills", "New York", "BC", "B3V56", "UNITED STATES");
		flightConfirmation.Signoff();
		}
}
