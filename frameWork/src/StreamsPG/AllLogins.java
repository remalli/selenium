package StreamsPG;

import java.io.FileNotFoundException;
import java.io.IOException;

import ActionDriver.UDF;
import ActionDriver.waitClass;
import utilities.excelInput;

public class AllLogins {
	
	String filename;
	excelInput excel;
	
	public AllLogins(String filename,String sheetname) throws IOException {
		this.filename=filename;
		excel=new excelInput(filename,sheetname);
	}
	
	public String urlMethod(int row) throws FileNotFoundException, IOException {
			String url = excel.readData(row, 1);
			return url;
			
	}
	
	public void loginMethod(int row,String name) {
		String data= excel.readData(row, 0);
		String username= excel.readData(row, 2);
		String password= excel.readData(row, 3);
		if (data.equalsIgnoreCase("admin5")) {
			waitClass.visibility(UDF.By("id", "xusername"));
			UDF.clear("id", "xusername");
			UDF.enterInput("id", "xusername",username);
			waitClass.visibility(UDF.By("id", "password"));
			UDF.clear("id", "password");
			UDF.enterInput("id", "password",password);
			waitClass.elementtobeclickable(UDF.By("classname", "normalButton"));
			UDF.click("classname", "normalButton");
		}
		else if (data.equalsIgnoreCase("smartbox")){
			waitClass.visibility(UDF.By("id", "xusername"));
			UDF.clear("id", "xusername");
			UDF.enterInput("id", "xusername",username);
			waitClass.visibility(UDF.By("id", "password"));
			UDF.clear("id", "password");
			UDF.enterInput("id", "password",password);
			waitClass.elementtobeclickable(UDF.By("classname", "normalButton"));
			UDF.click("classname", "normalButton");
		}
		else if (data.equalsIgnoreCase("streams"))
		{
			waitClass.visibility(UDF.By("id", "xusername"));
			UDF.clear("id", "xusername");
			UDF.enterInput("id", "xusername",username);
			waitClass.visibility(UDF.By("id", "password"));
			UDF.clear("id", "password");
			UDF.enterInput("id", "password",password);
			waitClass.elementtobeclickable(UDF.By("id", "login_button"));
			UDF.click("id", "login_button");
		}
		else if (data.equalsIgnoreCase("web40"))
		{
			waitClass.visibility(UDF.By("id", "xusername"));
			UDF.clear("id", "xusername");
			UDF.enterInput("id", "xusername",username);
			waitClass.visibility(UDF.By("id", "password"));
			UDF.clear("id", "password");
			UDF.enterInput("id", "password",password);
			waitClass.elementtobeclickable(UDF.By("classname", "normalButton"));
			UDF.click("classname", "normalButton");
		}
	}
	
}
