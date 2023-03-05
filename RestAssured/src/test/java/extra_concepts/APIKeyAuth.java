package extra_concepts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class APIKeyAuth {
	/*
	 * With API key auth, you send a key-value pair to the API either in the request
	 * headers or query parameters. In the request Authorization tab, select API Key
	 * from the Type list. Enter your key name and value, and select either Header
	 * or Query Params from the Add to dropdown list. You can store your values in
	 * variables for extra security.
	 */
	
	@Test(enabled=false)
	public void ApiKeyAuth() {
		given()
		.when()
		   .get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=8040126b683b0ca7b8acf5fbcfd4b93c")
		.prettyPrint();
	}
	
	@Test(enabled=false)
	public void apiKeyusingParams() {
		
		given()
		  .queryParam("q", "London")
		  .queryParam("appid", "a1b2c33d4e5f6g7h8i9jakblc")
		  .when()
		  .get("https://api.openweathermap.org/data/2.5/weather")
		  .then()
		  .log()
		  .body();		
	}
	@Test
	public void apiKeyusingHeaders() {
		
		given()
		  .header("q", "London")
		  .header("appid", "eaa9be0d0416582ef1be57cd8e828f56")
		  .when()
		  .get("https://api.openweathermap.org/data/2.5/weather")
		  .then()
		  .log()
		  .body();		
	}
}
