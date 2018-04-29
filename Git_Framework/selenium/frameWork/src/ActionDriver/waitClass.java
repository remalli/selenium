package ActionDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitClass extends UDF {
	
	static WebDriverWait wait =new WebDriverWait(driver, 50);
	
	public static  void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	 
	public static void visibility(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void visibility(By By) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By));
	}
	
	public static void visibilityOfTheElements(By By) {
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By));
	}

	public static void visibilityOfTheElements(WebElement element) {
	
	wait.until(ExpectedConditions.visibilityOfAllElements(element));
}
	
	public static void elementtobeclickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public static void elementtobeclickable(By By) {
	wait.until(ExpectedConditions.elementToBeClickable(By));	

	}
	
	public static void elementtobeselect(WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));

	}
	
	public static void elementtobeselect(By By) {
		wait.until(ExpectedConditions.elementToBeSelected(By));

	}

	public static void texttobepresent(WebElement element,String text) {
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));

}
	public static void texttobepresent(By By,String text) {
	wait.until(ExpectedConditions.textToBePresentInElement(By, text));
	}

	public static void alerttobepresent() {
		wait.until(ExpectedConditions.alertIsPresent());

	}
	
	public static void invisibilityofelement(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));

	}
	
	public static void invisibilityofelement(By By) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By));
		
	}
	
	public static void frametobeavaliable(String frameLocator) {
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

	}
	public static void frametobeavaliable(By By) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By));
		}
	
	public static void frametobeavaliable(WebElement element) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		}
	
	public static void frametobeavaliable(int x) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(x));
		}
	
	public static void presenceofelement(By By) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By));
	}
	
	public static void presenceofelements(By By) {
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By));
		
	}
	
}
