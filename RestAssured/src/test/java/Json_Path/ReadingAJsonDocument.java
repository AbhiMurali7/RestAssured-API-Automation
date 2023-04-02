package Json_Path;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {

	// Read the Json document and get the values

	public static void parseOneTime() throws IOException {
		File jsonFile = new File("src/test/resources/bookstore.json");

		List<Object> priceList = JsonPath.read(jsonFile, "$..price");

		for (Object price : priceList) {
			System.out.println(price);
		}

	}

	// Parse only 1 time and read multiple times

	/*public static void parseEveryTime() throws IOException {

		InputStream jsonFile = new FileInputStream("src/test/resources/bookstore.json");

		// Configuration class kulla defaultConfiguration function jsonFile pass panna
		// sollurom

		Object parsedJsonDoc = Configuration
				.defaultConfiguration()
				.jsonProvider()
				.parse(jsonFile.readAllBytes()); // parse
																													// not

		List<Object> categoryList = JsonPath.read(parsedJsonDoc, "$..category");

		for (Object category : categoryList) {
			System.out.println(category);
		}
	}*/

	//Fluent API
	
	public static void FluentAPI() throws IOException {
		

		File jsonFile = new File("src/test/resources/bookstore.json");
		
		DocumentContext context = JsonPath.parse(jsonFile);
		List<Object> categoryList = context.read("$..category");
		
		for (Object category : categoryList) {
			System.out.println(category);
		}
		
		//another way
		Configuration config =	Configuration
		.defaultConfiguration();
		JsonPath.using(config)
		.parse(jsonFile)
		.read("$..category");
	}
	
	public static void main(String[] args) throws IOException {

		parseOneTime();
		FluentAPI();

	}
}
