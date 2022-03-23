/**
 * Repeater, chain locator, css for identoical tags
 */
describe("Chain locators",function(){
	it("Test Chain locators",function(){
		browser.get("http://juliemr.github.io/protractor-demo/")
		element(by.model("first")).sendKeys(10);
element(by.model("second")).sendKeys(5);
element(by.id("gobutton")).click()
element(by.repeater("result in memory")).element(by.css("td:nth-child(3)")).getText().then(function(text){
	console.log(text);
});

	})
})
