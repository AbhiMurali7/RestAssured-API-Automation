package JacksonAnnotationsSerialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/*The @JsonSerialize Jackson annotation is used to specify a custom 
* serializer for a field in a Java object.
*/

public class CustomSerializer extends StdSerializer<JsonSerializerPOJO> {

	public CustomSerializer(Class<JsonSerializerPOJO> t) {
		super(t);
	}

	public CustomSerializer() {
		this(null);
	}
	
	@Override
	public void serialize
	(JsonSerializerPOJO value,
			JsonGenerator jsonGenerator,
			SerializerProvider provider)
			throws IOException {

		jsonGenerator.writeStartObject();
		
		jsonGenerator.writeStringField("firstName", value.getFirstName());
		
		jsonGenerator.writeStringField("lastName", value.getLastName());
		
		jsonGenerator.writeStringField("email", value.getEmail());

		jsonGenerator.writeEndObject();
	}

}
