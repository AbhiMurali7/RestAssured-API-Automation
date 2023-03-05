package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*The Jackson annotation @JsonCreator is used to tell Jackson that the 
Java object has a constructor (a "creator") which can match the fields 
of a JSON object to the fields of the Java object.

The @JsonCreator annotation is useful in situations where the 
@JsonSetter annotation cannot be used. For instance, immutable objects 
do not have any setter methods, so they need their initial values injected
into the constructor. 

We can use the @JsonCreator annotation to tune the constructor/factory 
used in deserialization.

If we shouldn't use setter value, then we use constructor
*/



public class JsonCreatorPOJO {
	
	private int id;
	
	private String name;
	
	private String email;
	
	@JsonCreator
	public JsonCreatorPOJO(
			
			@JsonProperty("employeeId") int id, 
			
			@JsonProperty("name")String name,
			
			@JsonProperty("email")String email) {
		
		this.id =id;
		this.email=email;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

}
