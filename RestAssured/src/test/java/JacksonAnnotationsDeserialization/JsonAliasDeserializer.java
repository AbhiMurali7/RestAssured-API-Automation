package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub

		String json="{\n"
				+ "  \"empId\": 3,\n"
				+ "  \"name\": \"Abhi\",\n"
				+ "  \"email\": \"Abhi@testmail.com\"\n"
				+ "}";
		
		/*
		 * ObjectMapper mapper = new ObjectMapper();
		 * 
		 * JsonAliasPOJO pojo = mapper.readValue(json, JsonAliasPOJO.class);
		 */
		
		JsonAliasPOJO pojo = new ObjectMapper()
				.readerFor(JsonAliasPOJO.class).readValue(json);
		
		System.out.println(pojo.getId());
	}

}
