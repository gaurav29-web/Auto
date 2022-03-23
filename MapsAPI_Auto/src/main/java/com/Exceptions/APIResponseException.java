package com.Exceptions;

public class APIResponseException extends Exception{
	private static final long serialVersionID = -6249272148532195542L;
	
	public APIResponseException(){
		super("API Response Exception");
	}
	
	public APIResponseException(String s){
		super(String.format("API Response Exception: %s",s));
	}
	
	public APIResponseException(String s, Throwable err){
		super(String.format("API Response Exception: %s",s),err);
	}
}
