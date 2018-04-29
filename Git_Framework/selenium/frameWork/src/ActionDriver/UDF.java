package ActionDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BaseDriver.browserPrac;

import java.util.List;


public class UDF {
	
		static WebDriver driver = browserPrac.getDriver();
		static Actions actions=new Actions(driver);
		static Select select;
		
		public static By By(String type,String value) {
		
		if(type.equalsIgnoreCase("id")) {
			
			return By.id(value);
		}
		
		if(type.equalsIgnoreCase("classname")) {
			
			return By.className(value);
		}
			
		
		if(type.equalsIgnoreCase("linktext")) {
			return By.linkText(value);
		}
			
		
		if(type.equalsIgnoreCase("partiallinktext")) {
			
			return By.partialLinkText(value);
		}

		if(type.equalsIgnoreCase("xpath")) {
			
			return By.xpath(value);
		}
		
		if(type.equalsIgnoreCase("tagname")) {
			return By.tagName(value);
			
		}
		
		
		if(type.equalsIgnoreCase("css")) {
			return By.cssSelector(value);
		}
	
		return null;
		}
	
	public  static WebElement getElement(String Type,String value) {
		return	driver.findElement(By(Type,value));
	}
	
	public static List<WebElement> getElements(String Type,String value) {
		return driver.findElements(By(Type,value));		
	}
	
	public static void inputVal(String Type,String value,String text) {
		driver.findElement(By(Type,value)).sendKeys(text);
	}
	
	public static void inputtext(String Type,String value) {
		driver.findElement(By(Type,value)).click();
	}
	
	public static void enterInput(String type,String value,String text) {
		 driver.findElement(By(type, value)).sendKeys(text);	
	}
	
	public static void click(String type,String value) {
		driver.findElement(By(type, value)).click();
	}
	
	public static String gettext(String type,String value) {
		return driver.findElement(By(type, value)).getText();
	}
	
	public static void mousehover(WebElement element) {
		actions.moveToElement(element).build().perform();
	}
	
	public static void rightclick(WebElement element) {
		actions.moveToElement(element).contextClick().build().perform();
	}
	
	public static void doubleclick(WebElement element) {
		actions.moveToElement(element).doubleClick().build().perform();
	}
	
	public static void NewTab() {
		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
	}
	
	public static void clickonhold(WebElement element) {
		actions.moveToElement(element).clickAndHold().build().perform();
	}
	
	public static void draganddrop(WebElement element,WebElement source,WebElement target) {
		actions.moveToElement(element).dragAndDrop(source, target).build().perform();
	}
	
	public static void xymousehover(WebElement element,int xOffset,int yOffset) {
		actions.moveToElement(element, xOffset, yOffset).build().perform();
	}
	
	public static void clear(String Type,String value) {
		driver.findElement(By(Type,value)).clear();
	}
	
	public Select select(WebElement element) {
		select = new Select(element);
		return select;
	}
	
	public void selectbyid(Select select,int index) {
		select.selectByIndex(index);
	}
	public void selectbyvalue(Select select,String value) {
		select.selectByValue(value);
	}
	public void selectbytext(Select select,String text) {
		select.selectByVisibleText(text);
	}
	public void deselect(Select select,int index) {
		select.deselectByIndex(index);
	}
	public void deselect(Select select,String value) {
		select.deselectByValue(value);
	}
	public void deselectbytext(Select select,String text) {
		select.deselectByVisibleText(text);
	}

}	


