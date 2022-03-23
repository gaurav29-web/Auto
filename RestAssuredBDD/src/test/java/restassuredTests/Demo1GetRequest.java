package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Demo1GetRequest {

	@Test
	public void GetUsers(){
		given()
		.when()
			.get("https://reqres.in/api/users?page=1")
		.then()
		.statusCode(200)
		.assertThat().body("total_pages",equalTo(2))
		.header("Content-Type", equalTo("application/json; charset=utf-8"));
	}
}
