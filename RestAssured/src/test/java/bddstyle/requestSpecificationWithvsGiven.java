package bddstyle;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class requestSpecificationWithvsGiven {
	
	/*
	 * Difference b/w given() vs with()
	 * Both work in the same way, The only difference between {@link #with()} and
	 * {@link #given()} is syntactical.
	 */
	
	/*
	 * RequestSpecification in Rest Assured can be used to group together common
	 * request specs and turn them into a single object. This interface has methods
	 * for defining the base URL, base path, headers, and other parameters. To
	 * obtain a reference for RequestSpecification, we must use the given() function
	 * of the RestAssured class. We can't make an object out of RequestSpecification
	 * because it's an interface. Its implemented class is RequestSpecificationImpl.
	 */
	
	RequestSpecification requestspec;
	
	@BeforeClass
	public void setRequestSpecification()
	{
		requestspec= with()
		.baseUri("https://fakerestapi.azurewebsites.net/")
		.basePath("api/v1/");
	}

	@Test	
	public void getAuthors() {
		given()
		.spec(requestspec)
		.when()
		.get("Authors")
		.prettyPrint();
	}

	@Test
	public void getBooks() {
		given()
		.spec(requestspec)
		.when()
		.get("Books")
		.prettyPrint();
	}

}
