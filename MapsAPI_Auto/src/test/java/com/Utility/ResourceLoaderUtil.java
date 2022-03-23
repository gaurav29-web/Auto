package com.Utility;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import com.Exceptions.ResourceLoaderException;

public class ResourceLoaderUtil {
	public JSONObject GetJsonFromResponseFolder(String fileName) throws ResourceLoaderException {
		return GetJsonFromFile(String.format("/mockJsonResponses/%s", fileName));
	}
	
	public JSONObject GetJsonFromRequestFolder(String fileName) throws ResourceLoaderException {
		return GetJsonFromFile(String.format("/mockJsonRequests/%s", fileName));
	}
	
	public JSONObject GetPOSTJsonFromRequestFolder(String fileName) throws ResourceLoaderException {
		return GetJsonFromFile(String.format("/POSTRequests/%s", fileName));
	}
	
	public InputStream GetFromRequestFolder(String fileName) throws ResourceLoaderException {
		return GetInputStreamFromFile(String.format("/jsonRequests/%s", fileName));
	}
	
	private JSONObject GetJsonFromFile(String fileName) throws ResourceLoaderException{
		if(!fileName.endsWith(".json")){
			fileName=fileName+".json"; 
		}
		try{
			InputStream jsonFile = this.getClass().getResourceAsStream(fileName);
			String jsonstring = IOUtils.toString(jsonFile,"UTF8");
			return new JSONObject(jsonstring);
		}
		catch(Exception e){
			throw new ResourceLoaderException(String.format("Json file %s cannot be loaded", fileName),e);
		}
	}
	
	public InputStream GetInputStreamFromFile(String fileName) throws ResourceLoaderException{
		if(!fileName.endsWith(".json")){
			fileName= fileName+".json";
		}
		try{
			return this.getClass().getResourceAsStream(fileName);
		}
		catch(Exception e){
			throw new ResourceLoaderException(String.format("Json file %s cannot be loaded", fileName),e);
		}
	}
}
