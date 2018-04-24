package BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class practiceProfile {

	@Test
	public void startBrowser()
	{
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("C:\\Users\\sudheer\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		options.addArguments("Disable-notifications");*/
		
		System.setProperty("webdriver.chrome.driver","E:\\Sudheer\\frameWork\\lib\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gostreams.beta-wspbx.com/home.jsp");
		}
}
