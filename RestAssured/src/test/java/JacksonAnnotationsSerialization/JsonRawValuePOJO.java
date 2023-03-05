package JacksonAnnotationsSerialization;

import com.fasterxml.jackson.annotation.JsonRawValue;

/*The @JsonRawValue Jackson annotation tells Jackson that this property 
 *value should written directly as it is to the JSON output. 
 *If the property is a String Jackson would normally have enclosed the 
 *value in quotation marks, 
 *but if annotated with the @JsonRawValue property Jackson won't do that.
*/

/*The @JsonRawValue annotation can instruct Jackson to serialize a 
 * property exactly as is.
*/

public class JsonRawValuePOJO {
	
	private int id = 1;//int value direct shouldn't be displayed in JSON O/P
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String skills="Playwright";
	
/*Notice how the value of the address property is now enclosed in 
*quotation marks, and all the quotation marks inside the value are 
*escaped.
*/

	@JsonRawValue
	private String course="{[\"RestAssured-Java\"],[\"Selenium\"]}";

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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	

}
