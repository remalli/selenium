package StreamsBS;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ActionDriver.UDF;
import BaseDriver.browserPrac;
import StreamsPG.AllLogins;
import logs.log4j;
import utilities.excelInput;

public class AllLoginsData {
	
	@Test
	public void AllLoginMethod() {
		try {
			AllLogins excel = new AllLogins("E:\\Sudheer\\frameWork\\src\\TestData\\StramsTestData.xlsx", "Sheet1");
			String admin5 = excel.urlMethod(1);
			log4j.infologs(admin5+" is triggered");
			browserPrac.startBrowser("chrome", admin5);
			excel.loginMethod(1, "admin5");
			log4j.infologs("admin5 is logged-in");
			
			//UDF.NewTab();
			
			String SB = excel.urlMethod(2);
			log4j.infologs(SB+" is triggered");
			browserPrac.startBrowser("chrome", SB);
			excel.loginMethod(2, "smartbox");
			log4j.infologs("Smartbox is logged-in");
			
			/*String streams = excel.urlMethod(3);
			log4j.infologs(streams+" is triggered");
			browserPrac.startBrowser("chrome", streams);
			excel.loginMethod(3, "streams");
			log4j.infologs("streams is logged-in");
			
			String web40 = excel.urlMethod(4);
			log4j.infologs(web40+" is triggered");
			browserPrac.startBrowser("chrome", web40);
			excel.loginMethod(4, "web40");
			log4j.infologs("web40 is logged-in");*/
			
		} catch (Exception e) {
			log4j.errorlogs(e);
		}

	}
}
