package com.TestNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test case start TC name "+result.getName()+" Test status "+result.getStatus());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test case pass TC name "+result.getName()+" Test status "+result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test case fail TC name "+result.getName()+" Test status "+result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result) {		
		System.out.println("On test case skip TC name "+result.getName()+" Test status "+result.getStatus());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test case pass/fail TC name "+result.getName()+" Test status "+result.getStatus());
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
