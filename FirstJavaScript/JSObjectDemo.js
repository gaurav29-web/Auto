/**
 * 
 */
function car(){
	this.color ="Red"
	this.engine="turbo"
	this.brand ="i20"
		
	this.getModel = function(){
		console.log("this is i20 model")
	}
};


/*var a = new car();
a.getModel();*/// -- to be used in same file

//to use in any external file
module.exports = new car();