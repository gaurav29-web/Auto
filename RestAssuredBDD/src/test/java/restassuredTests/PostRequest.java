package restassuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequest {
	public HashMap map = new HashMap();
	
	@BeforeClass
	public void PostData(){
		map.put("name", "morpheus");
		map.put("job", "leader");
		RestAssured.baseURI = "https://reqres.in/api/users";
	}
	
	@Test
	public void PostUser(){
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201)
			.body("name", equalTo("morpheus"));
	} 
}
