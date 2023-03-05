package JacksonAnnotationsSerialization;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

/*@JsonRootName allows to have a root node specified over the JSON. 
 *We need to enable wrap root value as well.
*/

/*@JsonRootName annotation is used, if wrapping is enabled, to specify 
 * the name of the root wrapper to be used.
*/

@JsonRootName(value="employees")
public class JsonRootNamePOJO {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List <String> skills;

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
	
	
	
}
