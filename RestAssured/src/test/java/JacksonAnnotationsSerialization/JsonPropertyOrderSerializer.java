package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonPropertyOrderPOJO propertyOrderPOJO = new JsonPropertyOrderPOJO();
		
		propertyOrderPOJO.setId(3);
		
		propertyOrderPOJO.setName("Abhi");
		
		propertyOrderPOJO.setEmail("abhi@testmail.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(propertyOrderPOJO);
		
		System.out.println(json);
	

	}

}
