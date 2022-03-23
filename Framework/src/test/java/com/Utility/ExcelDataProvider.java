package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;
	public ExcelDataProvider(){
		File src = new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());e.printStackTrace();
			
		}
	}
	
	public String getStringVal(String sheetName,int row, int col){
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		
	}
	
	//Methodover riding with same name but diff params
	public double getNumericVal(String sheetName,int row, int col){
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
	public double getNumericVal(int sheetNum,int row, int col){
		return wb.getSheetAt(sheetNum).getRow(row).getCell(col).getNumericCellValue();
	}
}
