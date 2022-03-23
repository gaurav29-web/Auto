describe('Protractor Page Object',function() {  
	var obj=require("./PageObject_PageLocators.js");
	//var d=require("./DataDrivenSample.js"); //normal JS data driven
	var jd=require("./JasmineDataDriven.js");//Jasmine data driven
	var using=require('jasmine-data-provider');//Jasmine data provider package will be imported
	beforeEach(function(){
		obj.getURL(); //Bracket since it is a method in parent JS file
	})
	
	using(jd.DataDriven,function(data, description){ // data is actual data(data set in Firstdata), description is data set name(FirstData)
		//appended description to change name in report
		it('Locators'+description,function() {//Used data driven example. Catch here is we are using single data set
		//	obj.first_txt.sendKeys(d.datadrive.firstinput); //Here pracket not needed since it is property
			obj.first_txt.sendKeys(data.firstinput);
		//	obj.second_txt.sendKeys(d.datadrive.secondinput).then(function(){
			obj.second_txt.sendKeys(data.secondinput).then(function(){
				browser.sleep(4000)
			})	
			obj.go_btn.click()
			//expect(obj.verifyVal_lbl.getText()).toBe(d.datadrive.result); 
			expect(obj.verifyVal_lbl.getText()).toBe(data.result); 
			})
	});
	
	afterEach(function(){
		console.log("Test completed")
	})
	})