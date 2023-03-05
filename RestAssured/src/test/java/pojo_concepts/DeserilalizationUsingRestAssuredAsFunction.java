package pojo_concepts;

import static io.restassured.RestAssured.*;

import java.util.Map;

import io.restassured.common.mapper.TypeRef;

public class DeserilalizationUsingRestAssuredAsFunction {
	
	
	public void usingAsFunction() {
		
	Map<Object, Object> response =	given()
		.baseUri("https://reqres.in/")
		.when()
		.get("api/users/2")
		.then()
		.extract()
		.body()
		.as(new TypeRef <Map<Object,Object>>() {
		});  //As Type Ref RestAssured
		
		System.out.println(response);
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeserilalizationUsingRestAssuredAsFunction deserialization = new DeserilalizationUsingRestAssuredAsFunction();

		deserialization.usingAsFunction();
	}

}
