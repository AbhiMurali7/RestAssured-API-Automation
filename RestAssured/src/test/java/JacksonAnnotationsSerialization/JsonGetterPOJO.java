package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.annotation.JsonGetter;

/*The @JsonGetter Jackson annotation is used to tell Jackson that a 
 * certain field value should be obtained from calling a getter method 
 * instead of via direct field access. The @JsonGetter annotation is 
 * useful if your Java class uses jQuery style for getter and setter names. For instance, instead of getPersonId() and setPersonId() you might have the methods personId() and personId(long id).*/

public class JsonGetterPOJO {
	
	private int id;
	
	private String name;
	 
	private String email;

	@JsonGetter(value = "employeeId")
	public int getId() {
		return id;
	}

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
