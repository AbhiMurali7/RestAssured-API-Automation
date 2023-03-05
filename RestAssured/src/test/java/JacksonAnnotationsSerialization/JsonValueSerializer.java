package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonValuePOJO ser_employee = new JsonValuePOJO();
		
		ser_employee.setId(3);
		
		ser_employee.setFirstName("Abhi");
		
		ser_employee.setLastName("Murali");
		
		ser_employee.setEmail("abhi@testmail.com");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String employeeJson = mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(ser_employee);
		
		System.out.println(employeeJson);

	}

}
