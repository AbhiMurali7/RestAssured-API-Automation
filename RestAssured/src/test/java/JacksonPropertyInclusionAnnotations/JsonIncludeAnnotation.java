package JacksonPropertyInclusionAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIncludeAnnotation {

	public static void main(String[] args) throws JsonProcessingException {
		
		// Just create an object of Pojo class
		JsonIncludePOJO pojo = new JsonIncludePOJO();
		// Set value as you wish
		pojo.setFirstName("Amod");
		pojo.setLastName("Mahajan");
		pojo.setSalary(3434343);
		pojo.setMarried(true);

		// Converting a Java class object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();
		String pojoJson = objectMapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(pojo);
		
		System.out.println(pojoJson);

	}

}
