package com.Exceptions;

public class UnifiedResponseException extends Exception{
private static final long serialVersionID = -6249272148532195542L;
	
	public UnifiedResponseException(){
		super("Resource cannot be loaded");
	}
	
	public UnifiedResponseException(String s){
		super(String.format("Resource cannot be loaded: %s",s));
	}
	
	public UnifiedResponseException(String s, Throwable err){
		super(String.format("Resource cannot be loaded: %s",s),err);
	}
}
