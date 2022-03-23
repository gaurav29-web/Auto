/** USe all, each, count and function concept
 * element.all(locator).get(index)
element.all(locator).first
element.all(locator).last

 */
describe("Locators - All",function(){
	function Add(a,b){
		element(by.model("first")).sendKeys(a);
		element(by.model("second")).sendKeys(b);
		element(by.id("gobutton")).click()
	}
	it("verify All locator",function(){
		browser.get("http://juliemr.github.io/protractor-demo/")
		for(var i=1;i<=3;i++){			
			Add(i,i+1);
		}
		element.all(by.repeater("result in memory")).count().then(function(text){
			console.log(text)
		})
		element.all(by.repeater("result in memory")).each(function(items){
			items.element(by.css("td:nth-child(3)")).getText().then(function(text){
				console.log(text);
			})
		})
	})
})