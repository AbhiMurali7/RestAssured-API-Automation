package bddstyle;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestSpecificationBuilderPattern {

//	Use the builder to construct a request specifications

	public static void main(String[] args) {
		
		
		String data = "{\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\n"
				+ "    \"password\": \"pistol\"\n"
				+ "}";

		/*
		 * RequestSpecBuilder builder = new RequestSpecBuilder();
		 * 
		 * builder.setBaseUri("https://fakerestapi.azurewebsites.net/");
		 * builder.setBasePath("api/v1/Books/"); RequestSpecification spec =
		 * builder.build();
		 * 
		 * RequestSpecification spec = builder
		 * .setBaseUri("https://fakerestapi.azurewebsites.net/")
		 * .setBasePath("api/v1/Books/") .build();
		 * RestAssured.given(spec).get("186").prettyPrint();
		 * 
		 * RestAssured.with().spec(spec).get("186").prettyPrint();
		 */

		//Another Method - Request and Response Specification Builder
		
		RequestSpecification req = new RequestSpecBuilder()
				.setBaseUri("https://reqres.in/")
				.setContentType(ContentType.JSON).build();

		ResponseSpecification resspec = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();
		
		RequestSpecification res = RestAssured.given().spec(req).body(data);

		Response response = res.when().post("api/register").then()
				.spec(resspec).extract().response();

		String responseString = response.asString();
		System.out.println(responseString);

	}

}
