package com.Utility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.datatable.DataTable;




public class ConvertFeatureParamsUtil {
	private static Logger _log = LogManager.getLogger(ConvertFeatureParamsUtil.class);
	
	/*public static Map<String, String> getParamsFromTableAsMap(DataTable table){
		List<List<String>> tableData table= table.raw();
		Map<String,String> map = new HashMap<String, String>();
		try{
			for(int i=1;i<tableData.size();i++){
				map.put(tableData.get(i).get(0), tableData.get(i).get(1));
			}
		}
		catch(Exception e){
			_log.error(String.format("Can not convert datatable values %s", e.getMessage()));
		}
		return map;
	}*/
	
	/*public static Map<String, String> getRuntimeParamsFromTableAsMap(DataTable table,String Param, String ParamVal){
		List<List<String>> tableData table= table.raw();
		Map<String,String> map = new HashMap<String, String>();
		try{
			for(int i=1;i<tableData.size();i++){
				if(tableData.get(i).get(1).contains(Param)){
					map.put(tableData.get(i).get(0), ParamVal);
				}
				else{
					map.put(tableData.get(i).get(0), tableData.get(i).get(1));
				}
			}
		}
		catch(Exception e){
			_log.error(String.format("Can not convert datatable values %s", e.getMessage()));
		}
		return map;
	}*/
}
