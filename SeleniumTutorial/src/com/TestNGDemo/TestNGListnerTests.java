package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Implmeneted Listener at class level. Listeners are interfaces that need to be implemented in a class
//@Listeners(com.TestNGDemo.TestNGListner.class)

//for suite level implement in test NG xml
public class TestNGListnerTests {

	@Test
	public void Test2(){
		Assert.assertEquals(12, 12,"Count match");			
	}
	
	@Test
	public void Test3(){
		Assert.assertEquals(12, 12,"Count match");		
	}
	
	@Test
	public void Test4(){
		Assert.assertTrue(true);		
	}
}
