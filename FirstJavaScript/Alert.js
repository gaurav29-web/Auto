/**
 * Work with actions in java script
 */

describe("Alert in JS",function(){
	it("Work on IRCTC", function(){
		browser.get("https://www.irctc.co.in/nget/train-search")
		browser.switchTo().alert().accept();
		browser.switchTo().alert().dismiss();
	})
})
