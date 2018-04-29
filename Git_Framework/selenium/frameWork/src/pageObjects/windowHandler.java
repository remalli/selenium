package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseDriver.browserPrac;
@Test
public class windowHandler {

	public void actionTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//sudheer//Desktop//seleniumlib files//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\Sudheer\\frameWork\\lib\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//Thread.sleep(2000);
		System.out.println("before");
		//driver.findElement(By.id("lst-ib")).sendKeys("images");
		List<WebElement> ids = driver.findElements(By.id("lst-ib"));
		for (WebElement webElement : ids) {
			webElement.getAttribute("id");
		}
		System.out.println("after");
		System.out.println(ids.size());
		ids.get(0).sendKeys("QA");
		Set<String> str=driver.getWindowHandles();
		System.out.println(str.size());
		List<String> str1=new ArrayList<>(str);
		str1.get(4);
		driver.switchTo().window(str1.get(4));
		
		driver.switchTo().frame(4);
		
		
		//Thread.sleep(2000);
		//driver.findElement(By.name("btnK")).click();
	}
}
