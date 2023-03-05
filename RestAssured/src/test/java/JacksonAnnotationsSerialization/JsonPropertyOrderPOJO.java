package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*The @JsonPropertyOrder Jackson annotation can be used to specify in 
 * what order the fields of your Java object should be serialized into 
 * JSON.
*/

//alphabetic order
@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"name", "id", "email"})
public class JsonPropertyOrderPOJO {
	
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

	public void setName(String name) {
		this.name = name;
	}

	@JsonGetter(value = "mail")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
