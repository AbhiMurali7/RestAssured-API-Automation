package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json="{\n"
				+ "  \"employeeId\": 3,\n"
				+ "  \"name\": \"Abhi\",\n"
				+ "  \"email\": \"Abhi@testmail.com\"\n"
				+ "}";
		
		
		
		 ObjectMapper mapper = new ObjectMapper();
		 
		 JsonCreatorPOJO pojo = mapper
				 .readValue(json, JsonCreatorPOJO.class);
		 
		 System.out.println(pojo.getId());
		 System.out.println(pojo.getName());
		 System.out.println(pojo.getEmail());
		 
		 
	}

}
