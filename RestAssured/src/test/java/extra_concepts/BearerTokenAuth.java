package extra_concepts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerTokenAuth {

	/*
	 * Bearer tokens enable requests to authenticate using an access key, such as a
	 * JSON Web Token (JWT). The token is a text string, included in the request
	 * header. In the request Authorization tab, select Bearer Token from the Type
	 * dropdown list. In the Token field, enter your API key value. For added
	 * security, store it in a variable and reference the variable by name.
	 */	
		
	@Test
	public void bearerTokenAuth() {
		String token = "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";
		given()
		 .header("Authorization", "Bearer" +token)
		.when()
		   .get("https://api.github/user/repos")
		.prettyPrint();
	}

}
