package com.ExcelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		//download Apache POI JARS and add to external JARS. JExcel API is another way to read write excel but it does not support XLSX. Only supports xls
		
		//Get file path
		File src = new File("C:\\Automation\\workspace\\SeleniumTutorial\\Testdata\\Test.xlsx");
		
		//Create input stream to read write
		FileInputStream file = new FileInputStream(src);
		
		//Create workbook object. XSSF for xlsx and HSSF for xls
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		//get sheet object either with sheet name or index count
		XSSFSheet st = wb.getSheetAt(0);
		
		//get column count for row 0. Row starts with 0 and column with 1
		int col =st.getRow(0).getLastCellNum();
		System.out.println(col + "Row count is ---"+st.getLastRowNum());
		for(int i=0;i<=st.getLastRowNum();i++){
			for(int j=0;j<col;j++){
				System.out.println(st.getRow(i).getCell(j).getStringCellValue());
			}
			
		}
		
		//Write data
		st.getRow(0).createCell(2).setCellValue("Set val 1");
		st.getRow(1).createCell(2).setCellValue("Set val 2");
		//To save data create file output stream
		FileOutputStream fileSave = new FileOutputStream(src);
		wb.write(fileSave);
		wb.close();
	}

}
