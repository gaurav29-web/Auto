package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class VerifyDataGetRequest_XML {

	@Test
	public void VerifySingleRec(){
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body("CUSTOMER.ID", equalTo("15"))
		.log().all();
	}
	
	@Test
	public void VerifyMultipleRec(){
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body("CUSTOMER.text()", equalTo("15BillSeattle")) //.text() method returns all node values for JSON and saved. In equals to pass all values as string
		.log().all();
	}
	
	@Test
	public void VerifyUsingXPath(){
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body(hasXPath("/CUSTOMER/ID", containsString("15")));//get valye using xpath
	}
}
