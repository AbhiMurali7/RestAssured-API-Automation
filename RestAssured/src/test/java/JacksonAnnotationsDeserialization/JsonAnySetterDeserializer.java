package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		String json="{\n"
				+ "  \"id\": 1790,\n"
				+ "  \"idBook\": 1790,\n"
				+ "  \"firstName\": \"Deeran\",\n"
				+ "  \"lastName\": \"K\"\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		
		JsonAnySetterPOJO pojo = mapper.readValue(json, JsonAnySetterPOJO.class);
			
		System.out.println(pojo.getAuthor());
	}

}
