package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		String json="{\n"
				+ "  \"employeeId\": 3,\n"
				+ "  \"name\": \"Abhi\",\n"
				+ "  \"email\": \"Abhi@testmail.com\"\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		
		JsonSetterPOJO pojo = mapper.readValue(json, JsonSetterPOJO.class);
			
		System.out.println(pojo.getId());
	}


}
