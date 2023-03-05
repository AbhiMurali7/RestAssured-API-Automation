package pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class DeserializationUsingJaywayJsonPath {

	String json="{\n"
			+ "  \"id\": 1790,\n"
			+ "  \"idBook\": 1790,\n"
			+ "  \"firstName\": \"Deeran\",\n"
			+ "  \"lastName\": \"K\"\n"
			+ "}";
	
	// Deserialization using Jayway JSON path
	
	public void UsingJaywayJsonPath() throws JsonMappingException, JsonProcessingException {
		
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		
		Configuration configuration = Configuration
		.builder()
		.mappingProvider(mappingProvider)
		.build();
		
		Author author = JsonPath.using(configuration)
		.parse(json)
		.read("$", Author.class);
		
		System.out.println("Id is : " + author.getId());
		System.out.println("Id Book is : " + author.getIdBook());
		System.out.println("First name is : " + author.getFirstName());
		System.out.println("Last name is : " + author.getLastName());
		
	}
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		DeserializationUsingJaywayJsonPath deserialization	= new DeserializationUsingJaywayJsonPath(); 
		
		deserialization.UsingJaywayJsonPath();
		
		
	}

}
