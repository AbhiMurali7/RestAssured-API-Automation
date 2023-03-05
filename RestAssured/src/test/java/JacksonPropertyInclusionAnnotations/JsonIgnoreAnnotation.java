package JacksonPropertyInclusionAnnotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreAnnotation {

	@Test
	public void serializationWithJsonIgnore() throws JsonProcessingException {
		// Just create an object of Pojo class
		JsonIgnorePOJO JsonIgnorePOJO = new JsonIgnorePOJO();
		JsonIgnorePOJO.setFirstName("Amod");
		JsonIgnorePOJO.setLastName("Mahajan");
		JsonIgnorePOJO.setAge(29);
		JsonIgnorePOJO.setGender("Male");
		JsonIgnorePOJO.setSalary(12323.56);
		JsonIgnorePOJO.setMarried(false);
		JsonIgnorePOJO.setFullName("Animesh Prashant");
		JsonIgnorePOJO.setEligibleForVote(false);

		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String employeeJson = objectMapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(JsonIgnorePOJO);
		
		System.out.println("Serialization...");
		System.out.println(employeeJson);

	}

	@Test
	public void deserializationWithJsonIgnore() throws JsonMappingException, JsonProcessingException {
		String employeeString = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\" : \"Mahajan\",\r\n"
				+ "  \"gender\" : \"Male\",\r\n" + "  \"age\" : 29,\r\n" + "  \"salary\" : 12323.56,\r\n"
				+ "  \"married\" : false,\r\n" + "  \"fullName\" : \"Amod Mahajan Gupta\",\r\n"
				+ "  \"eligibleForVote\" : false\r\n" + "}";

		ObjectMapper objectMapper = new ObjectMapper();
		JsonIgnorePOJO JsonIgnorePOJO = objectMapper
				.readValue(employeeString,
				JsonIgnorePOJO.class);
		
		System.out.println("Deserialization...");
		System.out.println("First name :- " + JsonIgnorePOJO.getFirstName());
		System.out.println("Last name :- " + JsonIgnorePOJO.getLastName());
		System.out.println("Age :- " + JsonIgnorePOJO.getAge());
		System.out.println("Gender :- " + JsonIgnorePOJO.getGender());
		System.out.println("Salary :- " + JsonIgnorePOJO.getSalary());
		System.out.println("Married :- " + JsonIgnorePOJO.getMarried());
		System.out.println("Eligible for vote :- " + JsonIgnorePOJO.getEligibleForVote());
		System.out.println("Full name :- " + JsonIgnorePOJO.getFullName());
	}
}
