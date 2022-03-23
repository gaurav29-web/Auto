  package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Constants {
	public static String MAPS_INFOBANK_FILEPATH = "./TestData/MAPS_INFOBANK.xlsm";
	public static Connection databaseConnection;
	public static Statement statement;
	public static ResultSet resultSet;
	public static ResultSetMetaData resultsetMetadata;
	public static XSSFWorkbook workbook;
	public static XSSFWorkbook MAPS_Infobank;
	public static XSSFSheet Environemnts;
	public static String MAPS_UI_URL;
	public static String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	public static final String ReportsPath = "./Reports/";
	
	public static void startInfobank() throws InvalidFormatException, IOException{
		MAPS_Infobank =new XSSFWorkbook(new File(MAPS_INFOBANK_FILEPATH));
		Environemnts = MAPS_Infobank.getSheet("Environments");
		String getEnvironment = BuildParameters.GetBaseENV();
		for(int i=1;i<=Environemnts.getLastRowNum();i++){
			if(Environemnts.getRow(i).getCell(i).getStringCellValue().equalsIgnoreCase(getEnvironment)){
				MAPS_UI_URL=Environemnts.getRow(i).getCell(i).getStringCellValue();
			}
		}
	}
}
