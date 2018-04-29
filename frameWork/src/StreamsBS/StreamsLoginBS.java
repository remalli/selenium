package StreamsBS;

import org.testng.annotations.Test;

import BaseDriver.browserPrac;
import PobytPageObjects.Login;
import StreamsPG.LoginStreams;
import logs.log4j;

public class StreamsLoginBS {
	@Test
	public void LoginMethod() {
		try {
		browserPrac.startBrowser("chrome", "https://admin5.beta-wspbx.com");
		log4j.infologs("URL hosted");
		String filename = "\\src\\TestData\\Streams.xml";
		LoginStreams Pobj = new LoginStreams(filename);
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
		Pobj.NewUser();
		log4j.infologs("clicked on new user element");
		
		
		
		} catch (Exception e) {
			log4j.errorlogs(e);
			e.printStackTrace();
		}
	}
}
