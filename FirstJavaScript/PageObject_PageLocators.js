function PageObjects(){

	this.first_txt = element(by.model("first"))
	this.second_txt= element(by.model("second"))
	this.go_btn = element(by.id("gobutton"))
	this.verifyVal_lbl = element(by.css("h2[class='ng-binding']"))
	
	this.getURL=function(){
		browser.get('http://juliemr.github.io/protractor-demo/')
	}
};

module.exports = new PageObjects();
