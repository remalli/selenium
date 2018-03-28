package PobytPageObjects;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.xml.sax.SAXException;

import ActionDriver.UDF;
import ActionDriver.waitClass;


import utilities.xmlData;

public class Login {

	String filename;
	xmlData xml;
	
	public Login(String filename) throws IOException, ParserConfigurationException, SAXException{
		this.filename = filename;
		xml = new xmlData(filename);
	}
	
	public void Signin(String uname,String pwd, int index,String result) {
		String username = xml.getData(uname,index);
		String password = xml.getData(pwd,index);
		waitClass.visibility(UDF.By("xpath", "//*[@ng-model='userName']"));
		UDF.clear("xpath", "//*[@ng-model='userName']");
		UDF.enterInput("xpath", "//*[@ng-model='userName']",username);
		waitClass.visibility(UDF.By("xpath", "//*[@ng-model='password']"));
		UDF.clear("xpath", "//*[@ng-model='password']");
		UDF.enterInput("xpath", "//*[@ng-model='password']",password);
		waitClass.elementtobeclickable(UDF.By("xpath", "//button[contains(text(),'Login')]"));
		UDF.click("xpath", "//button[contains(text(),'Login')]");
		String res = xml.getData(result, index);
		
		if(username == null | password == null ) {
			waitClass.visibility(UDF.By("xpath", "//*[contains(text(),' UserName/Password Missing')]"));
			Assert.assertEquals(res," UserName/Password Missing");
		}
		
		if(username == null & password == null ) {
			waitClass.visibility(UDF.By("xpath", "//*[contains(text(),' UserName/Password Missing')]"));
			Assert.assertEquals(res," UserName/Password Missing");
		}
		
		if (res.contains("Invalid")) {
			waitClass.visibility(UDF.By("xpath", "//*[contains(text(),' Invalid username/Password')]"));
			Assert.assertEquals(res," Invalid username/Password");
		}
		
		if (res.contains("Valid")) {
			waitClass.visibility(UDF.By("xpath", "//*[contains(text(),'Select Branch')]"));
			
		}
		
	}
	
	public void selectBranch(int index) {
		waitClass.visibility(UDF.By("classname", "modal-content"));
		waitClass.visibilityOfTheElements(UDF.By("xpath", "//ul[@class='list-group ng-scope']/li[1]"));
		List<WebElement> hotelslist = UDF.getElements("xpath", "//ul[@class='list-group ng-scope']/li[1]");
		WebElement hotel = hotelslist.get(index);
		hotel.click();
	}
		public void selectBranch(String HName){
			List<WebElement> hotelsName = UDF.getElements("xpath", "//ul[@class='list-group ng-scope']/li[1]");
			
			for (WebElement webElement : hotelsName) {
				String hotelBranch = webElement.getText();
				
				if (hotelBranch.equalsIgnoreCase(HName)) {
					waitClass.visibility(UDF.By("id", "myInput"));
					UDF.enterInput("id", "myInput", HName);
					waitClass.elementtobeclickable(webElement);
					webElement.click();
				}
				
			}

		}
			
	}
	
	

