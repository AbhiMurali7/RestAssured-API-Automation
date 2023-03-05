package bddstyle;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UserValidationsbdd {
	
	//given - all input details
	//when - submit for api-resource,HTTP methods
	//then - validate the response
	

	@Test(priority = 1, enabled = true)
	public void getAllUsersbdd() {

		given()
			.baseUri("https://reqres.in/")
		.when()
			.get("api/users?page=2")
		.prettyPrint();

	}
	
	@Test(enabled = false)
	public void registerUsersbdd() {

	String response =	given()
			.baseUri("https://reqres.in/")
			.header("Content-Type", "application/json")
			.body("{\n"
					+ "    \"email\": \"eve.holt@reqres.in\",\n"
					+ "    \"password\": \"pistol\"\n"
					+ "}")
		.when()
			.post("api/register")
		.then()
		.log()
		.all()
		.assertThat().statusCode(200)
//		.body("email", equalTo("eve.holt@reqres.in"))
		.extract().response().asString();
	
	System.out.println(response);
	
//	JsonPath js =new JsonPath(response); //for parsing json
	
//    String id = js.getString("id");
    
//    System.out.println(id);
		

	}
	
	@Test(enabled = false)
	public void updateAUsersbdd() {

		given()
			.baseUri("https://reqres.in/")
			.header("Content-Type", "application/json")
			.body("{\n"
					+ "    \"name\": \"morpheuse\",\n"
					+ "    \"job\": \"zion resident\"\n"
					+ "}")
		.when()
			.put("api/users/2")
		.prettyPrint();

	}
	
	@Test(enabled = false)
	public void deleteAUsersbdd() {

		given()
			.baseUri("https://reqres.in/")			
		.when()
			.delete("api/users/360")
		.prettyPrint();

	}
	
	
//	How To Send A JSON/XML File As Payload To Request
	
	@Test(enabled = false)
	public void createUserFromJsonFile() {
		
		File jsonFile = new File("postData.json");
		given()
		.baseUri("https://petstore.swagger.io/v2")
		.header("Content-Type", "application/json")
		.body(jsonFile)
		.when()
		.post("/store/order")
		.then()
		.log()
		.all()
		.assertThat().statusCode(200);
		
		
	}
	

}
