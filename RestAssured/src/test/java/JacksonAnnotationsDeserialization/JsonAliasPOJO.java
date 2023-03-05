package JacksonAnnotationsDeserialization;

import com.fasterxml.jackson.annotation.JsonAlias;

/*The @JsonAlias defines one or more alternative names for a property 
 * during deserialization.
*/

public class JsonAliasPOJO {

@JsonAlias({"employeeId", "empId", "empID", "empid"})	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
