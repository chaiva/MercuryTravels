package com.mercury.util;

import java.util.ArrayList;



public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 30;
	/*public static String TESTDATA_SHEET_PATH = "C:\\chaithra\\SeleniumWS\\MercuryTravelApp\\src\\main\\java\\com\\mercury\\data\\mercuryApp.xlsx";

	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}*/
	
static XLs_Reader reader;
	
	public static ArrayList<Object[]> getdatafromExcelforFindFlights()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		XLs_Reader reader =new XLs_Reader("C:\\chaithra\\SeleniumWS\\MercuryTravelApp\\src\\main\\java\\com\\mercury\\data\\mercuryApp.xlsx");
		int rowcount = reader.getRowCount("findFlights");
		
		for(int row = 2;row <=rowcount;row++)
		{
			String triptype = reader.getCellData("findFlights", "tripType", row);
			System.out.println(triptype);
			
			String no_of_pass =reader.getCellData("findFlights", "no_of_pass", row);
			System.out.println(no_of_pass);
			
			String departureCity = reader.getCellData("findFlights", "departureCity", row);
			System.out.println(departureCity);
			
			String frmmonth = reader.getCellData("findFlights", "from_month", row);
			System.out.println(frmmonth);
			
			String frmDay = reader.getCellData("findFlights", "from_day", row);
			System.out.println(frmDay);
			
			String arrivalCity = reader.getCellData("findFlights", "arrival_city", row);
			System.out.println(departureCity);
			
			String toMonth = reader.getCellData("findFlights", "to_month", row);
			System.out.println(toMonth);
			
			String toDay = reader.getCellData("findFlights", "to_day", row);
			System.out.println(toDay);
			
			String services = reader.getCellData("findFlights", "service", row);
			System.out.println(services);
			
			String Airlines = reader.getCellData("findFlights", "AirLine", row);
			System.out.println(Airlines);
			
			
			Object[] ob = new Object[] {triptype,no_of_pass,departureCity,frmmonth,frmDay,arrivalCity,toMonth,toDay,services,Airlines};
			mydata.add(ob);
		}
		return mydata;
	}
	public static ArrayList<Object[]> getdatafromExcelforBookFlights()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		XLs_Reader reader =new XLs_Reader("C:\\chaithra\\SeleniumWS\\MercuryTravelApp\\src\\main\\java\\com\\mercury\\data\\mercuryApp.xlsx");
		int rowcount = reader.getRowCount("bookFlights");
		
		for(int row = 2;row <=rowcount;row++)
		{
			String pass_fname = reader.getCellData("bookFlights", "pass_first_name", row);
			System.out.println(pass_fname);
			
			String pass_lname =reader.getCellData("bookFlights", "pass_last_name", row);
			System.out.println(pass_lname);
			
			String MealPref = reader.getCellData("bookFlights", "Meal_Preference", row);
			System.out.println(MealPref);
			
			String Credit_CardType = reader.getCellData("bookFlights", "CreditCardType", row);
			System.out.println(Credit_CardType);
			
			String Credit_num = reader.getCellData("bookFlights", "CreditNumber", row);
			System.out.println(Credit_num);
			
			String exp_mnth = reader.getCellData("bookFlights", "Expirationmonth", row);
			System.out.println(exp_mnth);
			
			String exp_year = reader.getCellData("bookFlights", "Expirationyear", row);
			System.out.println(exp_year);
			
			String CreditFname = reader.getCellData("bookFlights", "CC_fname", row);
			System.out.println(CreditFname);
			
			String CreditMname = reader.getCellData("bookFlights", "CC_mname", row);
			System.out.println(CreditMname);
			
			String Creditlname = reader.getCellData("bookFlights", "CC_lname", row);
			System.out.println(Creditlname);
			
			String bill_addrs = reader.getCellData("bookFlights", "BillAddress1", row);
			System.out.println(bill_addrs);
			
			String address = reader.getCellData("bookFlights", "Address2", row);
			System.out.println(address);
			
			String bill_city = reader.getCellData("bookFlights", "BillCity", row);
			System.out.println(bill_city);
			
			String bill_State = reader.getCellData("bookFlights", "BillState", row);
			System.out.println(bill_State);
			
			String bill_postalCode = reader.getCellData("bookFlights", "BillPostalCode", row);
			System.out.println(bill_postalCode);
			
			String bill_country = reader.getCellData("bookFlights", "BillCountry", row);
			System.out.println(bill_country);
			
			String del_addrs = reader.getCellData("bookFlights", "DelAddress1", row);
			System.out.println(del_addrs);
			
			String daddress = reader.getCellData("bookFlights", "DelAddress2", row);
			System.out.println(daddress);
			
			String del_city = reader.getCellData("bookFlights", "DelCity", row);
			System.out.println(del_city);
			
			String del_State = reader.getCellData("bookFlights", "DelState", row);
			System.out.println(del_State);
			
			String del_postalCode = reader.getCellData("bookFlights", "DelPostalCode", row);
			System.out.println(del_postalCode);
			
			String del_country = reader.getCellData("bookFlights", "DelCountry", row);
			System.out.println(del_country);
			
			
			Object[] ob1 = new Object[] {pass_fname,pass_lname,MealPref,Credit_CardType,Credit_num,exp_mnth,exp_year,CreditFname,CreditMname,Creditlname,bill_addrs,address,
					bill_city,bill_State,bill_postalCode,bill_country,del_addrs,daddress,del_city,del_State,del_postalCode,del_country};
			mydata.add(ob1);
		}
		return mydata;
	}
	

}
