package UnitTest;

import org.testng.annotations.Test;

import JavaStringApp.DemoProgram;

public class DemoProgramTests {

	
	//Added dev code in src main. Added test code in tests. Added Jacoco plugins and config path. reprt is generated inside target-->sites-->index.html
	@Test
	public void PositiveTest(){
		DemoProgram obj1 = new DemoProgram();
		obj1.containsOrNot("Selenium Automation tool");
	}
	
	@Test
	public void NegativeTest(){
		DemoProgram obj1 = new DemoProgram();
		obj1.containsOrNot("Selenium tool");
	}
}
