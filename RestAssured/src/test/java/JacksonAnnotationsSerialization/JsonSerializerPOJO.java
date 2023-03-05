package JacksonAnnotationsSerialization;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/*The @JsonSerialize Jackson annotation is used to specify a custom 
* serializer for a field in a Java object.
*/

/*@JsonSerialize indicates a custom serializer to use when marshalling 
 * the entity.
*/

@JsonSerialize(using = CustomSerializer.class) 
public class JsonSerializerPOJO {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List <String> skills;
	
	private Devices devices;
	
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

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Devices getDevices() {
		return devices;
	}

	public void setDevices(Devices devices) {
		this.devices = devices;
	}

	
	

}
