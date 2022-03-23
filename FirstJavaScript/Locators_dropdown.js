describe("Locators - All",function(){
	function Calc(a,b,c){
		element(by.model("first")).sendKeys(a);
		element(by.model("second")).sendKeys(b);
		element.all(by.tagName("option")).each(function(items){
			items.getAttribute("value").then(function(text){
				console.log(text);
				if(text==c){
					items.click();
				}
			})
		})
		element(by.id("gobutton")).click()
	}
	it("verify All locator",function(){
		browser.get("http://juliemr.github.io/protractor-demo/")
		for(var i=1;i<=3;i++){			
			Calc(i,i+1,"MULTIPLICATION");
		}
		
	})
})