package com.project.automation;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class putUser {
	
	@Test
	
	public void putUser() {
		
		JSONObject request=new JSONObject();
		request.put("name","morpheus");
		request.put("job","zion resident");
		
		given().
		body(request.toString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
		
	
	}
	

}
