package StreamsPG;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.xml.sax.SAXException;

import ActionDriver.UDF;
import ActionDriver.waitClass;
import BaseDriver.browserPrac;
import utilities.xmlData;

public class LoginStreams {
	String filename;
	xmlData xml;
	
	public LoginStreams(String filename) throws IOException, ParserConfigurationException, SAXException{
		this.filename = filename;
		xml = new xmlData(filename);
	}
	
	public void Signin(String uname,String pwd, int index,String result) {
		String username = xml.getData(uname,index);
		String password = xml.getData(pwd,index);
		waitClass.visibility(UDF.By("id", "xusername"));
		UDF.clear("id", "xusername");
		UDF.enterInput("id", "xusername",username);
		waitClass.visibility(UDF.By("id", "password"));
		UDF.clear("id", "password");
		UDF.enterInput("id", "password",password);
		waitClass.elementtobeclickable(UDF.By("classname", "normalButton"));
		UDF.click("classname", "normalButton");
		String res = xml.getData(result, index);
		WebDriver driver = browserPrac.getDriver();
		
		if(username.equals("") && (password.equals("")) ) {
			waitClass.alerttobepresent();
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			Assert.assertEquals(res,text);
			alert.accept();
		}
		
		else if(password.equals("")) {
			waitClass.alerttobepresent();
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			Assert.assertEquals(res,text);
			alert.accept();
		}
		
		else if(username.equals("")) {
			waitClass.alerttobepresent();
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			Assert.assertEquals(res,text);
			alert.accept();
		}
		
		else if (res.contains("Invalid")) {
			System.out.println(res);
			waitClass.visibility(UDF.By("classname", "errorMessageLogin"));		
			Assert.assertEquals(res,"Invalid Username or Password");
		}
		
		else if (res.contains("Valid")) {
			waitClass.implicitWait();
			waitClass.elementtobeclickable(UDF.By("partiallinktext", "View Manager"));
			UDF.mousehover(UDF.getElement("partiallinktext", "View Manager"));
			UDF.click("partiallinktext", "View Manager");
			/*waitClass.visibility(UDF.By("id", "search_recents"));
			WebElement element = UDF.getElement("id", "search_recents");
			if (element.isDisplayed() && element.isEnabled()) {
				waitClass.elementtobeclickable(UDF.By("id", "spaneltab_4"));
				UDF.click("id", "spaneltab_4");
				waitClass.implicitWait();
				waitClass.elementtobeclickable(UDF.By("classname", "callMonitorPosition"));
				UDF.click("classname", "callMonitorPosition");
				waitClass.visibility(UDF.By("id", "ulm_callmonitor_option"));
				WebElement options = UDF.getElement("id", "ulm_callmonitor_option");
				if (options.isDisplayed() && options.isEnabled()) {
					waitClass.visibility(UDF.By("id", "acd_admin"));
					UDF.click("id", "acd_admin");
				}
			}*/
			
		}	
		
		else 
			System.out.println("No operation performed");
		
}
	
	public void NewUser() {
		waitClass.elementtobeclickable(UDF.By("partiallinktext", "Actions"));
		UDF.mousehover(UDF.getElement("partiallinktext", "Actions"));
		waitClass.visibility(UDF.By("partiallinktext", "New User"));
		UDF.click("partiallinktext", "New User");
	}
	
	
	
	
	
	
}	
