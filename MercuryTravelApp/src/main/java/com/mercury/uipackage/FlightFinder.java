package com.mercury.uipackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercury.base.TestBase;

public class FlightFinder extends TestBase {

	
	@FindBy(xpath ="//input[@name ='tripType']")
	List<WebElement> tripType;
	
	/*@FindBy(xpath = "//select[@name ='passCount']")
	WebElement no_of_passengers;*/
	
	@FindBy(name = "passCount")
	WebElement no_of_passengers;
	
	@FindBy(xpath = "//select[@name ='fromPort']")
	WebElement depart;
	
	@FindBy(xpath = "//select[@name ='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(xpath = "//select[@name ='fromDay']")
	WebElement fromDay;
	
	@FindBy(xpath = "//select[@name ='toPort']")
	WebElement Arrival;
	
	@FindBy(xpath = "//select[@name ='toMonth']")
	WebElement toMonth;
	
	@FindBy(xpath = "//select[@name ='toDay']")
	WebElement toDay;
	
	@FindBy(xpath = "//input[@name ='servClass']")
	List<WebElement> serviceClass;
	
	@FindBy(xpath = "//select[@name ='airline']")
	WebElement airline;
	
	@FindBy(xpath = "//input[@name ='findFlights']")
	WebElement findFlightsbutn;
	
	public FlightFinder()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SelectFlight findFlights(String triptype,String noofpass,String departCity,String frmmonth,String frmday,String arrivalCity,String tomonth,String today,String service,String Airline)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WaitListElement(driver,tripType,20);
		int cnt = tripType.size();
		for(int i =0;i<cnt ;i++)
		{
			String txt = tripType.get(i).getAttribute("value");
			System.out.println(txt);
			if(txt.equalsIgnoreCase(triptype))
			{
     				tripType.get(i).click();
            				break;
			}
		}
		WaitElement(driver, no_of_passengers, 15);
	Select passengers = new Select(no_of_passengers);
	passengers.selectByVisibleText(noofpass);
	
	WaitElement(driver, depart, 15);
	Select departcity = new Select(depart);
	departcity.selectByVisibleText(departCity);
	
	WaitElement(driver, fromMonth, 15);
	Select from_month = new Select(fromMonth);
	from_month.selectByVisibleText(frmmonth);
	
	WaitElement(driver, fromDay, 15);
	Select from_day = new Select(fromDay);
	from_day.selectByVisibleText(frmday);
	
	WaitElement(driver, Arrival, 15);
	Select arrivalcity = new Select(Arrival);
	arrivalcity.selectByVisibleText(arrivalCity);
	
	WaitElement(driver, toMonth, 15);
	Select to_Month = new Select(toMonth);
	to_Month.selectByVisibleText(tomonth);
	
	WaitElement(driver, toDay, 15);
	Select to_day = new Select(toDay);
	to_day.selectByVisibleText(today);
	
	WaitListElement(driver,serviceClass,20);
	int count =serviceClass.size();
	for(int i =0;i<count ;i++)
	{
		String txt = serviceClass.get(i).getAttribute("value");
		System.out.println(txt);
		if(txt.equalsIgnoreCase(service))
		{
			serviceClass.get(i).click();
        	break;
		}
	}
	
	WaitElement(driver, airline, 15);
	Select Air_line = new Select(airline);
	Air_line.selectByVisibleText(Airline);
	//findFlightsbutn.click();
	clickOn(driver,findFlightsbutn,15);
	return new SelectFlight();
	
	}
	
	
	public static void WaitElement(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void WaitListElement(WebDriver driver,List<WebElement> elements,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
