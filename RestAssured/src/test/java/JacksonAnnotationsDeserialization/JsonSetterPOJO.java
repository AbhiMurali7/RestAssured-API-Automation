package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.annotation.JsonSetter;

/*The Jackson annotation @JsonSetter is used to tell Jackson that is 
 * should match the name of this setter method to a property name in 
 * the JSON data, when reading JSON into objects. This is useful if the 
 * property names used internally in your Java class is not the same as 
 * the property name used in the JSON file.
*/

/*@JsonSetter is an alternative to @JsonProperty that marks the method 
 * as a setter method.

This is incredibly useful when we need to read some JSON data, but the 
target entity class doesn't exactly match that data, and so we need to 
tune the process to make it fit.
*/

public class JsonSetterPOJO {

	private int id;
	
	private String name;
	 
	private String email;

	
	public int getId() {
		return id;
	}
	
	@JsonSetter(value = "employeeId")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

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
