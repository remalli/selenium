package BussinessScripts;

import BaseDriver.browserPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class FindBy1 {
	@FindBy(partialLinkText="Login")
	WebElement username;
	@Test
	public void exec() {
		browserPrac.startBrowser("chrome", "http://dashboard.pobyt.co/#!/login");
		WebDriver driver=browserPrac.getDriver();
		PageFactory.initElements(driver, this);
		username.click();
		
	}
	
	
}

