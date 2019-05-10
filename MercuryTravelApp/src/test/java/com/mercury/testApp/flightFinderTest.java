package com.mercury.testApp;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.base.TestBase;
import com.mercury.uipackage.FlightFinder;
import com.mercury.uipackage.LoginPage;
import com.mercury.util.TestUtil;

public class flightFinderTest extends TestBase {

		public LoginPage loginPage;
		public FlightFinder flightfinder;
		public TestUtil testUtil;
		String sheetName = "findFlights";

		public flightFinderTest() {
			super();
		}

		
		@BeforeMethod
		public void setup() {
			initialization();
			loginPage = new LoginPage();
			flightfinder = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		/*@Test
		 public void findFlightsTest()
		 { 
			flightfinder.findFlights("RoundTrip","4","London","January","12","Sydney","January","20","Economy Class","Blue Skies Airlines");
			 
		 }*/
		
		
		@Test(dataProvider ="getTestData") 
		 public void findFlightsTest(String ttype,String no_of_pass,String departure_City,String from_month,String from_day,String arrival_City,String to_month,String to_day,String services,String Airlines)
		 { 
			 flightfinder.findFlights(ttype, no_of_pass, departure_City, from_month, from_day, arrival_City, to_month, to_day,services, Airlines);
			 
		 }

		@DataProvider
		public Iterator<Object[]> getTestData()
		{
			ArrayList<Object[]> testData = TestUtil.getdatafromExcelforFindFlights();
			return testData.iterator();
			
		}
		//flightfinder.findFlights("RoundTrip","4","London","January","12","Sydney","January","20","Economy Class","Blue Skies Airlines");
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}


