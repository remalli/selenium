package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelInput {
	
	static FileInputStream fip;
	static FileOutputStream fop;
	static String filename;
	static XSSFWorkbook  workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static String sheetname;
	
	public excelInput(String filename,String sheetname) throws IOException {
		this.filename=filename;
		this.sheetname = sheetname;
		fip=new FileInputStream(filename);
		workbook = new XSSFWorkbook(fip);
		sheet = workbook.getSheet(sheetname);
	}
	
	public static String getcelldata(String sheetname,String input) throws FileNotFoundException, IOException
	{
		workbook = new XSSFWorkbook(new FileInputStream(filename));
		sheet = workbook.getSheet(sheetname);
		String data = null;
		for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
			cell = sheet.getRow(0).getCell(i);
			if (cell.getCellType() == cell.CELL_TYPE_STRING) {
				data = cell.getStringCellValue();
			}
			else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
				data = String.valueOf(cell.getNumericCellValue());
			}
			else if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
				data = String.valueOf(cell.getBooleanCellValue());
			}
			
			if (data.equalsIgnoreCase(input)) {
			return sheet.getRow(1).getCell(i).getStringCellValue();
		}
		}
		return null;
	}
	
	
	
	public static String readData(int rownum,int cellnum) {
		cell = sheet.getRow(rownum).getCell(cellnum);
		if(cell.getCellType() == cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
			
		}
		if(cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());
		}
		
		if(cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		}
		return null;
	}
	
	public static void writeData(int rownum,int cellnum,String str) throws IOException {
		sheet.getRow(rownum).createCell(cellnum);
		if(cell.getCellType() ==cell.CELL_TYPE_STRING) {
			cell.setCellValue(str);
		}
		if(cell.getCellType() ==cell.CELL_TYPE_NUMERIC) {
			cell.setCellValue(str.toString());
		}
		
		if(cell.getCellType() ==cell.CELL_TYPE_BOOLEAN) {
			cell.setCellValue(str.toString());
		}
		fip.close();
		fop =new FileOutputStream(filename);
		workbook.write(fop);
		fop.close();
		
	}
	
	

}
