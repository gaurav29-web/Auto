package com.lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(){
		try{
			File src = new File("C:\\Automation\\workspace\\SeleniumTutorial\\Testdata\\Test.xlsx");
			
			//Create input stream to read write
			FileInputStream file = new FileInputStream(src);
			
			//Create workbook object. XSSF for xlsx and HSSF for xls
			wb = new XSSFWorkbook(file);
		}
		catch(Exception e){
			
		}
	}
	
	public String getData(int sheetNum, int row, int col){
		String data = wb.getSheetAt(sheetNum).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetNum){
		int row = wb.getSheetAt(sheetNum).getLastRowNum();
		row = row+1;
		return row;
	}
}
