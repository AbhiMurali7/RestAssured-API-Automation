package bddstyle;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class multipleRequestSpecification {
	
	
	
RequestSpecification rs;
	
	@BeforeClass
	public void setRequestSpecification()
	{
		rs= with()
		.baseUri("https://fakerestapi.azurewebsites.net/")
		.basePath("api/v1/");
		RestAssured.requestSpecification=rs;
	}

	@Test	
	public void getAuthors() {
		given()
		.when()
		.get("Authors")
		.prettyPrint();
	}

	@Test
	public void getBooks() {
		given()
		.when()
		.get("Books")
		.prettyPrint();
	}


}
