package restassuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {
	
	@Test
	public void DeleteUser(){
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		//add path for 
		RestAssured.basePath = "/delete/24";
		Response res= when()
			.delete()
		.then()
			.statusCode(200)
			.log().all().extract().response();
		System.out.println(res.jsonPath().get("status"));
		System.out.println("APi response as string is == "+ res.asString());
	} 
}
