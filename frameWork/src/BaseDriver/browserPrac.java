package BaseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserPrac {
	
	static WebDriver driver;
	
	public static  WebDriver startBrowser(String browser, String url)
	{
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\framework\\frameWork\\lib\\Browsers\\chromedriver.exe");
		driver =new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\framework\\frameWork\\lib\\Browsers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver",
					  "D:\\framework\\frameWork\\lib\\Browsers\\chromedriver.exe");
			driver =new ChromeDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public void closeBrowser()
	{
		driver.close();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
