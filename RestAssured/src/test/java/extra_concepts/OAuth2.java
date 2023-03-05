package extra_concepts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OAuth2 {
	
	
	@Test
	public void oAuth2() {
		String token = "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";
		given()
		 .auth()
		 .oauth2(token)
		.when()
		   .get("https://api.github/user/repos")
		.prettyPrint();
	}

}
