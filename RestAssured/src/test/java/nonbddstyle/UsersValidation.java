package nonbddstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UsersValidation {

	@Test(enabled = false)
	public void getAllUsers() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.GET, "api/users?page=2");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}

	@Test(enabled = false)
	public void getSingleUser() {
		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.GET, "api/users/650");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}

	@Test(enabled = false)
	public void createAUsers() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-Type", "application/json")
				.body("{\n" + "    \"name\": \"Abhi\",\n" + "  "
						+ "  \"job\": \"Admin\"\n" + "}");

		Response response = requestSpecification.request(Method.POST, "api/users");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}
	
	@Test(enabled = false)
	public void updateAUsers() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-Type", "application/json")
				.body("{\n"
						+ "    \"name\": \"Abhi\",\n"
						+ "    \"job\": \"zion resident\"\n"
						+ "}");

		Response response = requestSpecification.request(Method.PUT, "api/users/650");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}
	
	@Test(enabled = true)
	public void deleteAUsers() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.DELETE, "api/users/650");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}

}
