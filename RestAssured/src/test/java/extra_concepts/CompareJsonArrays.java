package extra_concepts;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareJsonArrays {
	
//	Compare Two JSON Using Jackson – Java Library
	
	String jsonArray1;
	String jsonArray2;
	ObjectMapper objectMapper;
	JsonNode jsonNode1;
	JsonNode jsonNode2;
	
	@Test
	public void compareTwoJsonArrays() throws JsonMappingException, JsonProcessingException
	{
		jsonArray1 = "[\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Mahajan\",\r\n" + 
				"    \"firstName\": \"Amod\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Katihar\",\r\n" + 
				"      \"state\": \"Bihar\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Animesh\",\r\n" + 
				"    \"firstName\": \"Prashant\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Kolkata\",\r\n" + 
				"      \"state\": \"WB\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"]";
		
		jsonArray2 = "[\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Mahajan\",\r\n" + 
				"    \"firstName\": \"Amod\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Katihar\",\r\n" + 
				"      \"state\": \"Bihar\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Animesh\",\r\n" + 
				"    \"firstName\": \"Prashant\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Kolkata\",\r\n" + 
				"      \"state\": \"WB\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"]";
		
		objectMapper = new ObjectMapper();
		jsonNode1 = objectMapper.readTree(jsonArray1);
		jsonNode2 = objectMapper.readTree(jsonArray2);
		
		// Checking if both json objects are same
		System.out.println(jsonNode1.equals(jsonNode2));
	}
	
	@Test
	public void compareTwoJsonArraysWithDifferentOrderOfElements() throws JsonMappingException, JsonProcessingException
	{
		
		// Change in order of elements in array will impact and it will not be considered same
		jsonArray1 = "[\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Mahajan\",\r\n" + 
				"    \"firstName\": \"Amod\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Katihar\",\r\n" + 
				"      \"state\": \"Bihar\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Animesh\",\r\n" + 
				"    \"firstName\": \"Prashant\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Kolkata\",\r\n" + 
				"      \"state\": \"WB\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"]";
		
		jsonArray2 = "[\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Animesh\",\r\n" + 
				"    \"firstName\": \"Prashant\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Kolkata\",\r\n" + 
				"      \"state\": \"WB\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"lastName\": \"Mahajan\",\r\n" + 
				"    \"firstName\": \"Amod\",\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"city\": \"Katihar\",\r\n" + 
				"      \"state\": \"Bihar\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"]";
		
		jsonNode1 = objectMapper.readTree(jsonArray1);
		jsonNode2 = objectMapper.readTree(jsonArray2);
		
		System.out.println(jsonNode1.equals(jsonNode2));
		
		
	}
 
}


