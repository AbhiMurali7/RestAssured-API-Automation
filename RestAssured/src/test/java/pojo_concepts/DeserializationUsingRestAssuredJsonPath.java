package pojo_concepts;

import io.restassured.path.json.JsonPath;

public class DeserializationUsingRestAssuredJsonPath {
	
	String json="{\n"
			+ "  \"id\": 1790,\n"
			+ "  \"idBook\": 1790,\n"
			+ "  \"firstName\": \"Deeran\",\n"
			+ "  \"lastName\": \"K\"\n"
			+ "}";

	// Deserialization using RestAssured Json path
	
	public void usingRAJsonPath() {
		
		JsonPath jsonPath = JsonPath.from(json);
		Author author = jsonPath.getObject("", Author.class);
		
		System.out.println("Id is : " + author.getId());
		System.out.println("Id Book is : " + author.getIdBook());
		System.out.println("First name is : " + author.getFirstName());
		System.out.println("Last name is : " + author.getLastName());
		
		// Another way
		Author author1 = jsonPath.getObject("$", Author.class);
		
		System.out.println("Id is : " + author1.getId());
		System.out.println("Id Book is : " + author1.getIdBook());
		System.out.println("First name is : " + author1.getFirstName());
		System.out.println("Last name is : " + author1.getLastName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeserializationUsingRestAssuredJsonPath deserialization = new DeserializationUsingRestAssuredJsonPath();

		deserialization.usingRAJsonPath();
		
	}

}
