package com.mercury.testApp;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.base.TestBase;
import com.mercury.uipackage.BookFlight;
import com.mercury.uipackage.FlightFinder;
import com.mercury.uipackage.LoginPage;
import com.mercury.uipackage.SelectFlight;
import com.mercury.util.TestUtil;

public class BookFlightTest extends TestBase {
	public LoginPage loginPage;
	public FlightFinder flightfinder;
	public SelectFlight selectflight;
	public BookFlight bookFlight;
	public BookFlightTest()
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
	
	@Test(dataProvider ="getTestData") 
	public void book_Flight_Test(String passfname,String passlname,String mealPref,String CCard,  String CNumber, String Expmonth, String Expyear, String fname, String mname, String lname, String b_add1, String b_add2, String bCity, String bState, String bZipCode, String bCountry, String delAddress1, String delAddress2, String dCity, String dState, String dZipCode, String dCntry)
	{
		selectflight = flightfinder.findFlights("RoundTrip", "3", "Seattle", "April", "9", "London", "April", "12", "Business", "Pangea Airlines");
		bookFlight = selectflight.SelectAirlineForDepartureandArrival("Pangaea Airlines 362", "Pangea Airlines 632");
		bookFlight.bookFlight(passfname, passlname, mealPref, CCard, CNumber, Expmonth, Expyear, fname, mname, lname, b_add1, b_add2, bCity, bState, bZipCode, bCountry, delAddress1, delAddress2, dCity, dState, dZipCode, dCntry);


	}
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = TestUtil.getdatafromExcelforBookFlights();
		return testData.iterator();
		
	}
}
