package JacksonAnnotationsSerialization;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonRootNamePOJO ser_employee = new JsonRootNamePOJO();
		
		
		ser_employee.setFirstName("Abhi");
		
		ser_employee.setLastName("Murali");
		
		ser_employee.setEmail("abhi@testmail.com");
		
		ser_employee.setSkills(Arrays.asList("Rest Asurred", "Playwright"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		String employeeJson = mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(ser_employee);
		
		System.out.println(employeeJson);
	}

}
