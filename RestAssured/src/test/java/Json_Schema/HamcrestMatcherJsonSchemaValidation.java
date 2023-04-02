package Json_Schema;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherJsonSchemaValidation {
	
	@Test
	public void validate() throws IOException {
		
		File inputJson= new File ("src/test/resources/input.json");
		
		//File changed to String 
		String jsonContent = FileUtils.readFileToString(inputJson,"UTF-8");
		
		File jsonSchema = new File ("src/test/resources/AuthJsonSchema.json");
		
		MatcherAssert.assertThat(jsonContent, 
				JsonSchemaValidator.matchesJsonSchema(jsonSchema));
		
	}

}
