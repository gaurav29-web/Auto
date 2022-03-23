/**
 * Work with Frames in java script
 */

describe("Frames in JS",function(){
	it("Work on IRCTC", function(){
		browser.get("https://www.irctc.co.in/nget/train-search")
		browser.driver().manage().window().maximize();
		browser.switchTo().frame("id")
		element(by.css("id")).click()
	})
})
