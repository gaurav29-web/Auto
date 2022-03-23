describe('Protractor Element',function() {  

it('Locators',function() {
browser.get('http://juliemr.github.io/protractor-demo/')
element(by.model("first")).sendKeys(10);
element(by.model("second")).sendKeys(5).then(function(){
	browser.sleep(4000)
})	
element(by.id("gobutton")).click()
/*element(by.css("h2[class='ng-binding']")).getText().then(function(text){
	console.log("Calculated value is = "+text) //get text with promise and then print
	expect(text).toBe("15")
});*/

expect(element(by.css("h2[class='ng-binding']")).getText()).toBe("15"); //here we dont need promise since 
//Jasmine assertion takes care of that
})
})