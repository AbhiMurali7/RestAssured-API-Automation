package pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Author1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		// Create object of Pojo and set values
		
		Author author1 = new Author();
		author1.setFirstName("Vetrivel");
		author1.setLastName("C");
		author1.setId(1791);
		author1.setIdBook(1);
		
		// ObjectMapper class to serialize Pojo object to JSON
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(author1);
		System.out.println("Json Object is :-");
		System.out.println(json);

	}

}
