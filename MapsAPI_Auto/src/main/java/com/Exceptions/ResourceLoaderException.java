package com.Exceptions;

public class ResourceLoaderException extends Exception{
private static final long serialVersionID = -6249272148532195542L;
	
	public ResourceLoaderException(){
		super("Resource cannot be loaded");
	}
	
	public ResourceLoaderException(String s){
		super(String.format("Resource cannot be loaded: %s",s));
	}
	
	public ResourceLoaderException(String s, Throwable err){
		super(String.format("Resource cannot be loaded: %s",s),err);
	}
}
