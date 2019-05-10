package com.mercury.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercury.base.TestBase;

public class BookFlight extends TestBase {
	
	@FindBy(name = "passFirst0")
	WebElement pass_fname;
	
	@FindBy(name = "passLast0")
    WebElement pass_lname;
	
	@FindBy(xpath = "//select[@name = 'pass.0.meal']")
	WebElement meal;
	
	@FindBy(xpath = "//select[@name = 'creditCard']")
	WebElement creditCard;
	
	@FindBy(name = "creditnumber")
	WebElement creditNumber;
	
	@FindBy(xpath = "//select[@name = 'cc_exp_dt_mn']")
	WebElement Expirationmonth;
	
	@FindBy(xpath = "//select[@name = 'cc_exp_dt_yr']")
	WebElement Expirationyear;
	
	@FindBy(name = "cc_frst_name")
	WebElement first_name;
	
	@FindBy(name = "cc_mid_name")
	WebElement midName;
	
	@FindBy(name = "cc_last_name")
	WebElement lastName;
	
	@FindBy(name = "billAddress1")
	WebElement billAddress1;
	
	@FindBy(name = "billAddress2")
	WebElement billAddress2;
	
	@FindBy(name = "billCity")
	WebElement billcity;
	
	@FindBy(name = "billState")
	WebElement billstate;
	
	@FindBy(name = "billZip")
	WebElement billzipCode;
	
	@FindBy(xpath = "//select[@name = 'billCountry']")
    WebElement billcountry;
	
	@FindBy(name = "ticketLess")
	WebElement deliveryAddress;
	
	@FindBy(name = "delAddress1")
	WebElement Address;
	
	@FindBy(name = "delAddress2")
	WebElement Address1;
	
	@FindBy(name = "delCity")
	WebElement delcity;
	
	@FindBy(name = "delState")
	WebElement delstate;
	
	@FindBy(name = "delZip")
	WebElement delzipCode;
	
	@FindBy(xpath = "//select[@name = 'delCountry']")
	WebElement delCountry;
	
	@FindBy(name = "buyFlights")
	WebElement buyflights;
	
	public BookFlight()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public FlightConfirmation bookFlight(String passfname,String passlname,String mealPref,String CCard,String CNumber,String Expmonth,String Expyear,String fname,String mname,String lname,String b_add1,String b_add2,String bCity,
			String bState, String bZipCode,String bCountry,String delAddress1,String delAddress2,String dCity,String dState,String dZipCode,String dCntry)
	{
		WaitElement(driver, pass_fname, 15);
		pass_fname.clear();
		pass_fname.sendKeys(passfname);
		
		WaitElement(driver, pass_lname, 15);
		pass_lname.clear();
		pass_lname.sendKeys(passfname);
		
		WaitElement(driver, meal, 15);
        Select pass_meal = new Select(meal);
        pass_meal.selectByVisibleText(mealPref);
		
		WaitElement(driver, creditCard, 15);
		Select crdtcrd = new Select(creditCard);
		crdtcrd.selectByVisibleText(CCard);
		
		WaitElement(driver, creditNumber, 15);
		creditNumber.sendKeys(CNumber);
		
		WaitElement(driver, Expirationmonth, 15);
		Select expMnth = new Select(Expirationmonth);
		expMnth.selectByVisibleText(Expmonth);
		
		WaitElement(driver, Expirationyear, 15);
		Select expYr = new Select(Expirationyear);
		expYr.selectByVisibleText(Expyear);
		
		WaitElement(driver, first_name, 15);
		first_name.clear();
		first_name.sendKeys(fname);
		
		WaitElement(driver, midName, 15);
		midName.clear();
		midName.sendKeys(mname);
		
		WaitElement(driver, lastName, 15);
		lastName.clear();
		lastName.sendKeys(lname);
		
		WaitElement(driver, billAddress1, 15);
		billAddress1.clear();
		billAddress1.sendKeys(b_add1);
		
		WaitElement(driver, billAddress2, 15);
		billAddress2.clear();
		billAddress2.sendKeys(b_add2);
		
		WaitElement(driver, billcity, 15);
		billcity.clear();
		billcity.sendKeys(bCity);
		
		WaitElement(driver, billstate, 15);
		billstate.clear();
		billstate.sendKeys(bState);
		
		WaitElement(driver, billzipCode, 15);
		billzipCode.clear();
		billzipCode.sendKeys(bZipCode);
		
		WaitElement(driver, billcountry, 15);
		Select bilCountry = new Select(billcountry);
		bilCountry.selectByVisibleText(bCountry);
		
		clickOn(driver, deliveryAddress, 15);
		
		WaitElement(driver, Address, 15);
		Address.clear();
		Address.sendKeys(delAddress1);
		
		WaitElement(driver, Address1, 15);
		Address.clear();
		Address.sendKeys(delAddress2);
		
		WaitElement(driver, delcity, 15);
		delcity.clear();
		delcity.sendKeys(dCity);
		
		WaitElement(driver, delstate, 15);
		delstate.clear();
		delstate.sendKeys(dState);
		
		WaitElement(driver, delzipCode, 15);
		delzipCode.clear();
		delzipCode.sendKeys(dZipCode);
		
		WaitElement(driver, delCountry, 15);
		Select dcountry = new Select(delCountry);
		dcountry.selectByVisibleText(dCntry);
		
		clickOn(driver, buyflights, 15);
		
		
		return new FlightConfirmation();
	}
	
	public static void WaitElement(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
