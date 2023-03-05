package pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Getters and Setters

/*Serialization is the process of converting an object's 
state into a byte stream. Deserialization is the process of 
recreating the actual Java object in memory using the byte stream. 
The object is kept alive through this approach.*/

public class SerializeAndDeserialize {
	
	ObjectMapper mapper = new ObjectMapper();
	String authorJson;

	public void Serialize() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String authorJson;

		// Create object of Pojo and set values

		Author author1 = new Author();
		author1.setFirstName("Vetrivel");
		author1.setLastName("C");
		author1.setId(1791);
		author1.setIdBook(1);

		authorJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(author1);

		System.out.println(authorJson);

	}

	public void Deserialize() throws JsonMappingException, JsonProcessingException {
		
		Author author = mapper.readValue(authorJson, Author.class);
		System.out.println(author.getId());
		System.out.println(author.getIdBook());
		System.out.println(author.getFirstName());
		System.out.println(author.getLastName());
	}

	public static void main(String[] args) throws JsonProcessingException {

		// TODO Auto-generated method stub
		
		SerializeAndDeserialize serializeAndDeserialize = 
				new SerializeAndDeserialize();
		serializeAndDeserialize.Serialize();
		serializeAndDeserialize.Deserialize();

	}

}
