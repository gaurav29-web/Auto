var Jasmine2HtmlReporter = require('protractor-jasmine2-html-reporter');
exports.config = {
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['PageObject_Test.js'],
//capabilities: {//add to run test in firefox
	//  'browserName': 'firefox'
		  
		//  'browserName': ' internet explorer'
	//}
  
  onPrepare :function()
  {
	  //common pre-requisite for all specs
	  browser.driver.manage().window().maximize();
	  //reporting can be done
	  jasmine.getEnv().addReporter(
		        new Jasmine2HtmlReporter({
		          savePath: 'target/screenshots'
		        })
		      );
  },
  
  //adding suite 
  suites:{
	  Smoke: ['PageObject_Test.js','Locators_dropdown.js'],
  		Regression: 'Basics2.js'
  },
  
  //run color code report on cmd
  jasmineNodeOpts: {
	    showColors: true, // Use colors in the command line report.
	  }
};