package bddstyle;

import org.testng.ITestContext;
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
 
//How To Pass Value From One API To Another API Using TestNG – ITestContext

/*ITestContext is an interface that defines a test context that contains 
all the information for a given test run. An instance of this context is 
passed to the test listeners so they can query information about their 
environment.
two important methods setAttribute​(java.lang.String name, java.lang.Object 
value) and getAttribute​(java.lang.String name) provided by ITestContext 
interface.

setAttribute()
setAttribute(atttributeName, attributeValue) – Set a custom attribute. 
It is similar to adding an element in a Map as key-value pair.

getAttribute()
getAttribute(attributeName) – Get the value of given attribute name. 
Remember return type is an Object.
*/
		
public class ShareDataUsingITestContext {
	
	
	@Test
	public void createBooking(ITestContext context)
	{
		int bookingId = RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.contentType(ContentType.JSON)
			.body("{\r\n" + 
				"    \"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		.when()
			.post()
		.then()
			.log()
			.all()
			.extract()
			.jsonPath()
			.get("bookingid");
		// Storing data in a context to use for other tests
		context.setAttribute("bookingId", bookingId);
	}
	
	@Test
	public void updateBooking(ITestContext context)
	{
		// Retrieving required data from context
		int bookingId = (int) context.getAttribute("bookingId");
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/"+bookingId)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.contentType(ContentType.JSON)
			.body("{\r\n" + 
				"    \"firstname\" : \"Amod\",\r\n" + 
				"    \"lastname\" : \"Mahajan\",\r\n" + 
				"    \"totalprice\" : 222,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2022-01-01\",\r\n" + 
				"        \"checkout\" : \"2022-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		.when()
			.put()
		.then()
			.log()
			.all();
			
	}
	
}