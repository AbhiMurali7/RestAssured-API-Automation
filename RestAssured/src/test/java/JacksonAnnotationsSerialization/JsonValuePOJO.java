package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.annotation.JsonValue;

/*The Jackson annotation @JsonValue tells Jackson that Jackson should not 
 *attempt to serialize the object itself, but rather call a method on the 
 *object which serializes the object to a JSON string.
*/

/*@JsonValue indicates a single method that the library will use to 
 * serialize the entire instance.
*/

public class JsonValuePOJO {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

/*
* The @JsonValue annotation is added to the method that Jackson is to 
* call to serialize the object into a JSON string
*/

	@JsonValue
	public String toJson(){
        return this.id + ", " + this.firstName;
    }
	
}
