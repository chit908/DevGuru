package com.project.automation;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class deleteUser {
	
	@Test
	
	public void deleteUser() {
		given().
		get("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
		
	}

}
