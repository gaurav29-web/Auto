/**
 * 
 */
describe("Work on Practise app",function(){
	it("submit form",function(){
		browser.get("https://rahulshettyacademy.com/angularpractice/")
		element(by.name("name")).sendKeys("Gaurav")
		element(by.css("input[name='email']")).sendKeys("gaurav@test.com")
		element(by.id("exampleInputPassword1")).sendKeys("pass123")
		element(by.css("input[type='checkbox']")).click
		element(by.cssContainingText("select[input='exampleFormControlSelect1'] option", "Female")).click
		element.all(by.name("inlineRadioOptions")).get(1).click();
		//element.all(by.name("inlineRadioOptions")).first-- select first
		element(by.buttonText("Submit")).click().then(function(){
			element(by.css("div[class*='success']")).getText().then(function(text){
				console.log(text)
			})
		})
		element(by.name("name")).clear()
		element(by.name("name")).sendKeys("M").then(function(){
			element(by.css("[class*='alert alert-danger']")).getText().then(function(error){
				console.log(error)
			})
		})
	})
	
	
})