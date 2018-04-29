
package BussinessScripts;

import org.testng.annotations.Test;

import BaseDriver.browserPrac;
import logs.log4j;
import pageObjects.paytmsignin;

public class Paytmlogin {
	
	@Test
	public  void patymExec() {
		try {
			
		
		browserPrac.startBrowser("chrome","https://www.paytm.com/");
		//log4j.infologs("Entered the URL");
		/*String path="E:\\Sudheer\\frameWork\\src\\TestData\\paytm.xlsx";
		paytmsignin sign=new paytmsignin(path, "paytm");
		sign.signin();
		log4j.infologs("signin valdiation completed");*/
		
		}catch(Exception e)
		{
			log4j.errorlogs(e);
		}
		
	

	}
	
}
