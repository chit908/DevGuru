package com.project.automation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class createUser {
	
	@Test
	
	public void createUser() {
		JSONObject request=new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		
		given().body(request.toString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).log().all();
		
		
		
	}

}
