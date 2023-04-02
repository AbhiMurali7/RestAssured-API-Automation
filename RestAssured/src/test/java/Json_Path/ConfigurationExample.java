package Json_Path;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {

	public static void main(String[] args) {
		
		String json = "[\n"
				+ "   {\n"
				+ "      \"name\" : \"john\",\n"
				+ "      \"gender\" : \"male\"\n"
				+ "   },\n"
				+ "   {\n"
				+ "      \"name\" : \"ben\"\n"
				+ "   }\n"
				+ "]";

		Configuration configuration = Configuration.defaultConfiguration();
		
		String result =	JsonPath
				.using(configuration)
				.parse(json)
				.read("$.[0].gender");
	
		System.out.println(result);
		
		//PathNotFoundException thrown
		/*String gender1 = JsonPath
				.using(configuration)
				.parse(json)
				.read("$[1]['gender']");
		System.out.println(gender1);*/
	
		//Works fine (null is returned) DEFAULT_PATH_LEAF_TO_NULL
		Configuration conf2 = configuration
				.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		
		String gender1 = JsonPath.using(conf2).parse(json).read("$[1]['gender']");
		
		System.out.println(gender1);
		
		
		//ALWAYS_RETURN_LIST
		Configuration conf3 = configuration.addOptions(Option.ALWAYS_RETURN_LIST);

		//Works fine
		List<String> result1 = JsonPath.using(conf3).parse(json).read("$[0]['gender']");
		
		System.out.println(result1);
		
		//REQUIRE_PROPERTIES
		
		Configuration conf4 = configuration.addOptions(Option.REQUIRE_PROPERTIES);
		
		//Works fine
		List<String> genders = JsonPath.using(configuration).parse(json).read("$[*]['gender']");
		
		System.out.println(genders);
		
		//PathNotFoundException thrown
		List<String> genders1 = JsonPath.using(conf4).parse(json).read("$[*]['gender']");
		
		System.out.println(genders1);
	}

}
