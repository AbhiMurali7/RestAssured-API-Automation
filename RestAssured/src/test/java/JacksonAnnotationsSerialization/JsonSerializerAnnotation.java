package JacksonAnnotationsSerialization;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializerAnnotation {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonSerializerPOJO ser_employee = new JsonSerializerPOJO();
		
		ser_employee.setFirstName("Abhi");
		
		ser_employee.setLastName("Murali");
		
		ser_employee.setEmail("abhi@testmail.com");
		
		ser_employee.setSkills(Arrays.asList("Rest Asurred", "Playwright"));
		
		Devices devices = new Devices();
		
		devices.setLaptop("Macbook Pro");
		
		devices.setMobile("Iphone 14 Pro Max");
		
		ser_employee.setDevices(devices);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//Custome to write the serializer to implement that allows registration
		
		SimpleModule simpleModule = new SimpleModule();
		
		simpleModule.addSerializer(JsonSerializerPOJO.class, new CustomSerializer());
		
		String employeeJson = mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(ser_employee);
		
		mapper.registerModule(simpleModule);
		
		System.out.println(employeeJson);

	}

}
