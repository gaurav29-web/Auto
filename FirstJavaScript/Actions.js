/**
 * Work with actions in java script
 */

describe("Actions in JS",function(){
	it("Work on IRCTC", function(){
		browser.get("https://www.irctc.co.in/nget/train-search")
		
		browser.actions().mouseMove(element(by.css("input[role='searchbox']")).sendKeys("New Delhi")).perform();
		browser.actions().sendKeys(protractor.Key.ARROW_DOWN).perform();
		browser.actions().sendKeys(protractor.Key.ENTER).perform();
		browser.getAllWindowHandles().then(function(handles){
			browser.switchTo().window(handles[1])
			browser.getTitle().then(function(title){
				console.log(title)
			})
		})
		
	})
})
