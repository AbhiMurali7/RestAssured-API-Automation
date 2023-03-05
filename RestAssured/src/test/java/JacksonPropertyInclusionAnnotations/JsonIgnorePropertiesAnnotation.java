package JacksonPropertyInclusionAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnorePropertiesAnnotation {
	
	@Test
	public void serializationWithJsonIgnoreProperties() throws JsonProcessingException {
		
		// Just create an object of Pojo class
		JsonIgnorePropertiesPOJO JsonIgnorePropertiesPOJO = new JsonIgnorePropertiesPOJO();
		JsonIgnorePropertiesPOJO.setFirstName("Amod");
		JsonIgnorePropertiesPOJO.setLastName("Mahajan");
		JsonIgnorePropertiesPOJO.setAge(29);
		JsonIgnorePropertiesPOJO.setGender("Male");
		JsonIgnorePropertiesPOJO.setSalary(12323.56);
		JsonIgnorePropertiesPOJO.setMarried(false);
		JsonIgnorePropertiesPOJO.setFullName("Animesh Prashant");
		JsonIgnorePropertiesPOJO.setEligibleForVote(false);
 
		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		
		String employeeJson = objectMapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(JsonIgnorePropertiesPOJO);
		
		System.out.println("Serialization...");
		System.out.println(employeeJson);
		
	}
	
	@Test
	public void deserializationWithJsonIgnoreProperties() throws JsonMappingException, JsonProcessingException
	{
		String employeeString = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\" : \"Mahajan\",\r\n" + 
				"  \"gender\" : \"Male\",\r\n" + 
				"  \"age\" : 29,\r\n" + 
				"  \"salary\" : 12323.56,\r\n" + 
				"  \"married\" : false,\r\n" + 
				"  \"fullName\" : \"Amod Mahajan Gupta\",\r\n" + 
				"  \"eligibleForVote\" : false\r\n" + 
				"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		//objectMapper
		JsonIgnorePropertiesPOJO JsonIgnorePropertiesPOJO = objectMapper
				.readValue(employeeString, JsonIgnorePropertiesPOJO.class);
		
		System.out.println("Deserialization...");
		System.out.println("First name :- "+JsonIgnorePropertiesPOJO.getFirstName());
		System.out.println("Last name :- "+JsonIgnorePropertiesPOJO.getLastName());
		System.out.println("Age :- "+JsonIgnorePropertiesPOJO.getAge());
		System.out.println("Gender :- "+JsonIgnorePropertiesPOJO.getGender());
		System.out.println("Salary :- "+JsonIgnorePropertiesPOJO.getSalary());
		System.out.println("Married :- "+JsonIgnorePropertiesPOJO.getMarried());
		System.out.println("Eligible for vote :- "+JsonIgnorePropertiesPOJO.getEligibleForVote());
		System.out.println("Full name :- "+JsonIgnorePropertiesPOJO.getFullName());
	}
}
	
