package JacksonAnnotationsSerialization;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonAnyGetterPOJO anyGetterPOJO = new JsonAnyGetterPOJO();
		
		Map<String, Object> mapValues = new HashMap<String, Object>();
		
		mapValues.put("firstName" , "Abhi");
		mapValues.put("LastName" , "Murali");
		mapValues.put("email" , "abhi@testmail.com");
		mapValues.put("skills" , Arrays.asList("RestAssured-Java","Playwright"));
	
		anyGetterPOJO.setEmployee(mapValues);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(anyGetterPOJO);
		
		System.out.println(json);
	
	}

}
