/**Select expected product from a list
 * Repeat all products, match text and click on respective button
 */
describe("Work on Practise app",function(){
	function selectItems(product){
		element.all(by.tagName("app-card")).each(function(item){
			item.element(by.css("h4 a")).getText().then(function(itemText){
				if(itemText==product){
					item.element(by.css("button")).click()
				}
			})
		})
	}
	it("submit form",function(){
		browser.get("https://rahulshettyacademy.com/angularpractice/")
		element(by.linkText("Shop")).click().then(function(){
			selectItems("Samsung Note 8")
			element(by.partialLinkText("Checkout")).getText().then(function(linkText){
				console.log(linkText)
				var res = linkText.split("(");
				//res[1].trim().substr(0, 1).toBe(1)
				expect(res[1].trim().charAt(0)).toBe("1")
			})
		})
	})
})