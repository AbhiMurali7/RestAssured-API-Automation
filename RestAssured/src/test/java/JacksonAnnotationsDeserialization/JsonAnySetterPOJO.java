package JacksonAnnotationsDeserialization;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

/*The Jackson annotation @JsonAnySetter instructs Jackson to call the 
* same setter method for all unrecognized fields in the JSON object. 
* By "unrecognized" I mean all fields that are not already mapped to 
* a property or setter method in the Java object.
*/

/*@JsonAnySetter allows us the flexibility of using a Map as standard 
 * properties. On deserialization, the properties from JSON will simply 
 * be added to the map.
*/

public class JsonAnySetterPOJO {
	
	private Map<String, Object> author = new HashMap<String, Object>();

	public Map<String, Object> getAuthor() {
		return author;
	}

	@JsonAnySetter
	public void setAuthor(String key , Object value) {
		author.put(key, value);
	}

}
