package pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class DeserializationUsingObjectMapper {
	
	// De-serialization is rebuilding the object from stream of bytes.
	
	String json="{\n"
			+ "  \"id\": 1790,\n"
			+ "  \"idBook\": 1790,\n"
			+ "  \"firstName\": \"Deeran\",\n"
			+ "  \"lastName\": \"K\"\n"
			+ "}";
	
	// Deserialization using ObjectMapper JSON path
	
	public void usingObjectMapper() throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		Author author = mapper.readValue(json, Author.class);
		
		System.out.println("Id is : " + author.getId());
		System.out.println("Id Book is : " + author.getIdBook());
		System.out.println("First name is : " + author.getFirstName());
		System.out.println("Last name is : " + author.getLastName());
		
	}
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		DeserializationUsingObjectMapper deserialization	= new DeserializationUsingObjectMapper(); 
		
		deserialization.usingObjectMapper();
		
		
	}
}
