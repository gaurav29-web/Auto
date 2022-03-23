package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTestsDemo {
	//Syntax- Use dependsOnMthods and add method name, if dependent method passes then only the second method is executed
	@Test()
	public void StartApp(){
		System.out.println("StartApp");
		//manually fail test to see othet two tests are not running
		//Assert.assertEquals(12, 13);
	}
	
	@Test(dependsOnMethods="StartApp")
	public void LoginApp(){
		System.out.println("LoginApp");
	}
	
	@Test(dependsOnMethods="LoginApp")
	public void LogOutApp(){
		System.out.println("LogOutApp");
	}
		//Multiple dependency can be added as well		
		@Test(dependsOnMethods={"LoginApp","LogOutApp"})
		public void QuitApp(){
			System.out.println("QuitApp");
			
	}
}
