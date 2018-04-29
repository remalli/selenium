package PobytBusinessScripts;

import org.testng.annotations.Test;

import BaseDriver.browserPrac;
import PobytPageObjects.Login;
import logs.log4j;

public class PobytLogin {

	@Test
	public void LoginMethod() {
		try {
		browserPrac.startBrowser("chrome", "http://dashboard.pobyt.co/#!/login");
		log4j.infologs("URL hosted");
		String filename = "\\src\\TestData\\PobytData.xml";
		Login Pobj = new Login(filename);
		Pobj.Signin("UserName","Password", 0,"result");
		log4j.infologs("Empty data operation performed");
		Pobj.Signin("UserName","Password", 1,"result");
		log4j.infologs("Empty pwd operation performed");
		Pobj.Signin("UserName","Password", 2,"result");
		log4j.infologs("Empty username operation performed");
		Pobj.Signin("UserName","Password", 3,"result");
		log4j.infologs("Invalid data operation performed");
		Pobj.Signin("UserName","Password", 4,"result");
		log4j.infologs("valid data operation performed");
		Pobj.selectBranch(2);
		log4j.infologs("Selected Branch");
		/*Pobj.selectBranch("chandu");
		log4j.infologs("Branch selected from List");
*/		
	
		
		
		
		
		} catch (Exception e) {
			log4j.errorlogs(e);
			e.printStackTrace();
		}
	}
}
