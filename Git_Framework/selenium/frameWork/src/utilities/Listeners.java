package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import BaseDriver.browserPrac;

public class Listeners implements ITestListener {

	WebDriver driver=browserPrac.getDriver();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test start started");
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(driver.getTitle());
		File pass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//int count = 1;
		try {
			//String file = result.getMethod().getMethodName();
			//System.out.println(file);
			FileUtils.copyFile(pass, new File("C:\\Users\\sudheer\\Desktop\\sudheer selinium\\Screen Shots\\success\\count.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//count++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		File pass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		int count = 0;
		try {
			String file = result.getMethod().getMethodName();
			FileUtils.copyFile(pass, new File("C:\\Users\\sudheer\\Desktop\\sudheer selinium\\Screen Shots\\failure\\file"+count+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		File pass=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		int count =0 ;
		try {
			String file = result.getMethod().getMethodName();
			FileUtils.copyFile(pass, new File("C:\\Users\\sudheer\\Desktop\\sudheer selinium\\Screen Shots\\skipped\\file"+count+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
