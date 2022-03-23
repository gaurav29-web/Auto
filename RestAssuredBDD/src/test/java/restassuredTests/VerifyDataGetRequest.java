package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class VerifyDataGetRequest {

	@Test
	public void VerifySingleRec(){
		given()
		.when()
		.get("https://reqres.in/api/users?page=1")
		.then()
		.statusCode(200)
		.body("data[0].first_name", equalTo("George")); //Use equal to for single content
	}
	
	//Use chrome extension for JSON path - JSON path finder
	@Test
	public void VerifyMultipleRec(){
		given()
		.when()
		.get("https://reqres.in/api/users?page=1")
		.then()
		.statusCode(200)
		.body("data.first_name", hasItems("George","Emma")); //Use hasitem for single record and HasItems for multiple content 
	}
	
	@Test
	public void VerifyParamAndHeader(){
		given()
			.param("page", "1")//Set Headers and params in Key value pair format
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.statusCode(200)
		.body("data.first_name", hasItem("George"));
	}
}
