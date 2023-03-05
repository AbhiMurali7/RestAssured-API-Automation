package pojo_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Serialization {
/* Serialization is a process of converting an object 
 * from its current state to a stream of bytes which can be 
 * written to a file or transported through a network or 
 * stored in a database.
 * 
 * POJO irukura JAVA Object,  JSON convert pannurathu- Serialization
 * JSON la irukura Key Value Pairs again POJO Java object construct- Deserialization
 */
	
	//data is obtained
	
	@Test
	
	public void serialization() {
	
	Map<String, Object> jsonBody = new HashMap<String, Object> ();
	
	List<String> skills = new ArrayList<String>();
	
	skills.add("Java");
	
	skills.add("Selenium");
	
	jsonBody.put("first_name", "Abhi");
	
	jsonBody.put("last_name", "Murali");
	
	jsonBody.put("email", "abhi@test.com");
	
	jsonBody.put("skills", skills);
	
	System.out.println(jsonBody);
	
	// Jackson Serialization
	
	Map<String, String> jsonBody1 = new HashMap<String, String> ();
	
	jsonBody1.put("email", "eve.holt@reqres.in");
	
	jsonBody1.put("password", "cityslicka");
	
	given()
	.baseUri("https://reqres.in")
	.header("Content-Type", "application/json")
	.body(jsonBody1)
	.log()
	.all()
	.when()
	.post("/api/login")
	.then()
	.log()
	.all();
	}
}
