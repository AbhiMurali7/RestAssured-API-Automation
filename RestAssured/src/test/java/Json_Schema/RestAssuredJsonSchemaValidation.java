package Json_Schema;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

/*If you keep JSON Schema files in the resource folder of your project or 
rc/test/resources of a maven project then you can use matchesJsonSchemaInClasspath() 
method directly as you just need to pass the name of the JSON schema file. 

If you store JSON schema files at different locations within the project or 
outside the project then you can use the overloaded method matchesJsonSchema().*/

public class RestAssuredJsonSchemaValidation {

	@Test(enabled = false)
	public void validationsusingJsonSchemaInClassPath() {

		File inputJson= new File("src/test/resources/input.json");
		
		// GIVEN
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/auth")
		.contentType(ContentType.JSON)
				.body(inputJson)
				// WHEN
				.when().post()
				// THEN
				.then().assertThat().statusCode(200)
				.body("token", Matchers.notNullValue())
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("AuthJsonSchema.json"));
	}

	@Test
	public void validationsUsingMatchesJsonSchema() {
		File inputJson= new File("src/test/resources/input.json");

		// GIVEN
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/auth")
				.contentType(ContentType.JSON)
				.body(inputJson)
				// WHEN
				.when().post()
				// THEN
				.then().assertThat().statusCode(200)
				.body("token", Matchers.notNullValue())
				.body(JsonSchemaValidator
						.matchesJsonSchema(
						new File("src/test/resources/AuthJsonSchema.json")));
	}

}
