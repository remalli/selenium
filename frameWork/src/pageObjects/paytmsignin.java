package pageObjects;

import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;

import ActionDriver.UDF;
import ActionDriver.waitClass;
import utilities.excelInput;

public class paytmsignin {

	excelInput excel;
	String filename;
	String sheetname;
	
	public paytmsignin(String filename,String sheetname) throws FileNotFoundException {
		excel = new excelInput(filename, sheetname);
		this.filename=filename;
		this.sheetname = sheetname;
	}
}
	
	/*public void signin() {
		try
		{
		waitClass.elementtobeclickable(UDF.By("linktext", "Log In/Sign Up"));
		UDF.click("linktext", "Log In/Sign Up");
		XSSFSheet sheet = excel.getsheet();
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			for (int j = 1; j < sheet.getRow(i).getLastCellNum(); j++) {
				String username = excel.readData(i, 0);
				waitClass.visibility(UDF.By("id", "input_0"));
				UDF.enterInput("id", "input_0", username);
				String password = excel.readData(i, 1);
				waitClass.visibility(UDF.By("id", "input_1"));
				UDF.enterInput("id", "input_1", password);
				waitClass.elementtobeclickable(UDF.By("xpath", "//button[@type='submit']"));
				UDF.click("xpath", "//button[@type='submit']");
			}
	
	
		}
		
	
		/*}
		catch (Exception e) {
		}
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*excel - username
	pass username to ur app
	
	excel - pwd
	pass pwd to ur app
	
	click on login*/
	
	
	
	
