package extra_concepts;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class Outh2Demo {

	@Test
	public void generateToken(ITestContext context) {
		// TODO Auto-generated method stub
		
		String data = "{\n"
				+ "    \"name\":\"Murali\",\n"
				+ "    \"email\":\"test7@gmail.com\",\n"
				+ "    \"phone\":\"5555551234\",\n"
				+ "    \"password\":\"123456\",\n"
				+ "    \"password_confirmation\":\"123456\"\n"
				+ "}";
		
		String accessTokenResponse = given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://apingweb.com/api/register").asString();
		
		System.out.println(accessTokenResponse);
		
		context.setAttribute("token", accessTokenResponse);
		
	}
	
		@Test
		public void getData(ITestContext context) {
			
		String accessToken = (String) context.getAttribute("token");
		
				String response = given()
				 .auth()
				 .oauth2(accessToken)
		.when().log().all()
		.get("https://apingweb.com/api/articles")
		.asString();
		
		System.out.println(response);
		

	}

}
