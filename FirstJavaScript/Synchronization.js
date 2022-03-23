describe('Protractor baby steps',function() {  

it('Open Angular js website',function() {

browser.get("https://www.protractortest.org/#/");
browser.get('http://juliemr.github.io/protractor-demo/').then(function(){
	browser.sleep(6000); //unconditional wait
	console.log("I am last step"); 
	
	//Conditional wait
	var EC = protractor.expectedConditions;
	browser.wait(EC.visibilityOf(element(by.css(""))),8000)
});
})})