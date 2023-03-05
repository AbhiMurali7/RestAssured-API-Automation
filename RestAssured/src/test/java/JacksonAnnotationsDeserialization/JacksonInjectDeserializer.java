package JacksonAnnotationsDeserialization;

import java.io.IOException;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectDeserializer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String json = "{\n" + "  \"id\": 3,\n" + "  \"email\": \"Abhi@testmail.com\"\n" + "}";

		InjectableValues value = new InjectableValues.Std().addValue(String.class, "Abhi");

		ObjectMapper mapper = new ObjectMapper();

		ObjectReader reader = mapper.reader(value);

		JacksonInjectPOJO pojo = reader.readValue(json, JacksonInjectPOJO.class);

		System.out.println(pojo.getName());

	}

}
