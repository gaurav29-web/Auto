package restassuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutRequest {
	public HashMap map = new HashMap();
	
	@BeforeClass
	public void PutData(){
		map.put("employee_name", "morpheus");
		map.put("employee_salary", 10000);
		map.put("employee_age", 24);
		map.put("profile_image", "");
		int emp_id = 24;
		RestAssured.baseURI = "https://reqres.in/api/users";
		//add path for 
		RestAssured.basePath = "/update/"+emp_id;
	}
	
	//req details PUT- http://dummy.restapiexample.com/api/v1/update/24
	//body-- {"employee_name": "Doris Singh","employee_salary": 10000,"employee_age": 23,"profile_image": ""}
	//Get req -- http://dummy.restapiexample.com/api/v1/employee/24
	
	@Test
	public void PutUser(){
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all() //returns data on console
			.body("employee_name", equalTo("morpheus"));
	} 
}
