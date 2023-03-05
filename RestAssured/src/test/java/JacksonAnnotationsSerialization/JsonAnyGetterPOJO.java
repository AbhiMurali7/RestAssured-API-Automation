package JacksonAnnotationsSerialization;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/*Jackson annotation enables you to use a Map as container for properties 
 * that you want to serialize to JSON
*/
public class JsonAnyGetterPOJO {
	
	private  Map<String, Object> employee;
	
@JsonAnyGetter
	public Map<String, Object> getEmployee() {
		return employee;
	}

	public void setEmployee(Map<String, Object> employee) {
		this.employee = employee;
	}
	

}
