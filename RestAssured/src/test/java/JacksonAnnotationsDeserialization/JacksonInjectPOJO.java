package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.annotation.JacksonInject;

/*The Jackson annotation @JacksonInject is used to inject values 
* into the parsed objects, instead of reading those values from the JSON. 
* For instance, imagine you are downloading person JSON objects from 
* various different sources, and would like to know what source a given 
* person object came from. The sources may not themselves contain that 
* information, but you can have Jackson inject that into the Java objects 
* created from the JSON objects.

To mark a field in a Java class as a field that needs to have its value 
injected by Jackson, add the @JacksonInject annotation above the field. 
*/

/*@JacksonInject indicates that a property will get its value from the 
 * injection and not from the JSON data.
*/

public class JacksonInjectPOJO {

	private int id;
	
	private String name;
	 
	private String email;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@JacksonInject
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 	
}
