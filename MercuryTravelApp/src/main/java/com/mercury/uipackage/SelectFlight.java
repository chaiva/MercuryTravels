package com.mercury.uipackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercury.base.TestBase;

public class SelectFlight extends TestBase {
	
	@FindBy(xpath = "//table/tbody/tr[3]/td[@class ='frame_action_xrows']/input[@value ='Blue Skies Airlines$360$270$5:03']")
	WebElement 	BlueSkiesAirlines360;
	
	@FindBy(xpath = "//table/tbody/tr[5]/td[@class ='frame_action_xrows']/input[@value ='Blue Skies Airlines$361$271$7:10']")
	WebElement BlueSkiesAirlines361;
	
	@FindBy(xpath = "//table/tbody/tr[7]/td[@class ='frame_action_xrows']/input[@value ='Pangea Airlines$362$274$9:17']")
	WebElement PangaeaAirlines362;
	
	@FindBy(xpath = "//table/tbody/tr[9]/td[@class ='frame_action_xrows']/input[@value ='Unified Airlines$363$281$11:24']")
	WebElement UnifiedAirlines363;
	
	@FindBy(xpath = "//table/tbody/tr[3]/td[@class ='frame_action_xrows']/input[@value ='Blue Skies Airlines$630$270$12:23']")
	WebElement BlueSkiesAirlines630;
	
	@FindBy(xpath = "//table/tbody/tr[5]/td[@class ='frame_action_xrows']/input[@name = 'inFlight' and @value ='Blue Skies Airlines$631$273$14:30']")
	WebElement BlueSkiesAirlines631	;
	
	@FindBy(xpath = "//table/tbody/tr[7]/td[@class ='frame_action_xrows']/input[@name = 'inFlight' and @value ='Pangea Airlines$632$282$16:37']")
	WebElement PangeaAirlines632;
	
	@FindBy(xpath = "//table/tbody/tr[9]/td[@class ='frame_action_xrows']/input[@name = 'inFlight' and @value ='Unified Airlines$633$303$18:44']")
	WebElement UnifiedAirlines633;
	
	@FindBy(name = "reserveFlights")
	WebElement reserveFlights;
	
	
	public SelectFlight()
	{
		PageFactory.initElements(driver, this);
	}
	
	public BookFlight SelectAirlineForDepartureandArrival(String deptAirLine,String arrivalAirLine)
	{
/*		if(deptAirLine.equalsIgnoreCase("Blue Skies Airlines 360"))
		{
		clickOn(driver, BlueSkiesAirlines360, 15);
		}
		
		if(deptAirLine.equalsIgnoreCase("Blue Skies Airlines 361"))
		{
			clickOn(driver, BlueSkiesAirlines361, 15);
		}
		
		if(deptAirLine.equalsIgnoreCase("Pangaea Airlines 362"))
		{
			clickOn(driver, PangaeaAirlines362, 15);
		}
		
		if(deptAirLine.equalsIgnoreCase("Unified Airlines 363"))
		{
			clickOn(driver, UnifiedAirlines363, 15);
		}
		
		if(arrivalAirLine.equalsIgnoreCase("Blue Skies Airlines 630"))
		{
			clickOn(driver, BlueSkiesAirlines630, 15);
		
		}
		
		if(arrivalAirLine.equalsIgnoreCase("Blue Skies Airlines 631"))
		{
			clickOn(driver, BlueSkiesAirlines631, 15);	
		}
		
		if(arrivalAirLine.equalsIgnoreCase("Pangea Airlines 632"))
		{
			clickOn(driver, PangeaAirlines632, 15);	
		}
		
		if(arrivalAirLine.equalsIgnoreCase("Unified Airlines 633"))
		{
			clickOn(driver, UnifiedAirlines633, 15);	
		}*/
		reserveFlights.click();
		return new BookFlight();
		
	}
		
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}	
		
		
	}
	
/*public BookFlight SelectFlights(String deptname,String arrivalname)
{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//b[contains(text(),'"+ deptname +"')]/parent::font/parent::td[@class ='data_left']/preceding-sibling::td[@class ='frame_action_xrows']/input[@name ='outFlight']")).click();
	
	//driver.findElement(By.xpath("//b[text()='"+ deptname +"']/parent::font/parent::td[@class ='data_left']/preceding-sibling::td[@class ='frame_action_xrows']/input[@name ='outFlight']")).click();
	driver.findElement(By.xpath("//b[contains(text(),'"+ arrivalname +"')]/parent::font/parent::td[@class ='data_left']/preceding-sibling::td[@class ='frame_action_xrows']/input[@name ='outFlight']")).click();
	
	reserveFlights.click();
	return new BookFlight();
}*/


	
	
	
	


