package bddstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

import java.io.File;

public class UploadImageAPI {

	@Test
	public void uploadImageTest() {
		
		RestAssured.baseURI = "https://petstore.swagger.io/";
			Response response = given()
				.header("Content-Type", "multipart/form-data")
				     .formParam("additionalMetadata", "test1")
				.multiPart("file", new File("/Users/abinayamurali/Downloads/address.png"), "image/png")
				.when()
				.post("v2/pet/9223372016900012000/uploadImage");
			
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.statusCode(), 200);
		
	}
	
	
	
}
