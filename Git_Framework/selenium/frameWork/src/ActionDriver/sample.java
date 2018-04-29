package ActionDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	
	@Test
	public  void runTest() {
		
		System.setProperty("webdriver.chrome.driver",
		  "E:\\Sudheer\\frameWork\\lib\\Browsers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
	}

}
