package JacksonPropertyInclusionAnnotations;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*@JsonIgnore annotation is used to mark a property to be ignored at the 
 * field level.

The Jackson annotation @JsonIgnore is used to tell Jackson to ignore a 
certain property (field) of a Java object. The property is ignored both 
when reading JSON into Java objects, and when writing Java objects into 
JSON
*/

public class JsonIgnorePOJO {

	// private variables or data members of pojo class
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;
	private boolean married;

	@JsonIgnore
	private String fullName;
	@JsonIgnore
	private boolean eligibleForVote;

	// Getter and setter methods
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean getMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getFullName() {
		return this.fullName;
	}

	public boolean getEligibleForVote() {
		return this.eligibleForVote;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEligibleForVote(boolean eligibleForVote) {
		this.eligibleForVote = eligibleForVote;
	}
}
