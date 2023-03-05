package extra_concepts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

/*authentication is the process of verifying who a user is, 
while authorization is the process of verifying what they have access to.*/

/*Basic authentication involves sending a verified username and password 
 * with your request. In the request Authorization tab, select Basic Auth 
 * from the Type dropdown list.
 * Enter your API username and password in the Username and Password fields.
 * For extra security, store these in variables.*/ 


public class basicAuth {
	
	@Test(enabled=false)
	public void BasicAuth() {
		given()
		.auth()
		  .basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		   .get("basic-auth")
		.prettyPrint();
	}
	
	@Test
	public void TestBasicAuth() {
		 given()
		 .auth()
		   .basic("admin", "12345")
		 .baseUri("https://apingweb.com/api/auth/users")
		 .when()
		 .get("https://apingweb.com/api/auth/users")
		 .prettyPrint();
	}

}
