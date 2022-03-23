describe('Protractor baby steps',function() {  

it('Open Angular js website',function() {

browser.get("https://www.protractortest.org/#/");
browser.get('http://juliemr.github.io/protractor-demo/').then(function(){
	browser.sleep(6000);
	console.log("I am last step"); //Using then and function section we are asking JS code to run in sync
});
})

//Each it block will be called as a spec

it('close browswer', function() {

// code to close browser
})



})