package Home.Assignment;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;

public class HomeAssignment1 {
	
	public static void main(String[] args) {
		
		IncidentPayload2 requestbody2  = new IncidentPayload2();
		requestbody2.setShort_description("Created for Test");
		requestbody2.setNumber("CHG0030005");
		requestbody2.setDescription("RESTAPITEST");
		requestbody2.setImpact("3");
		requestbody2.setActive("true");
		
		given()
		  .baseUri("https://dev323254.service-now.com")
		  .basePath("/api/now/table/{tableName}")
		  .pathParam("tableName","change_request")
		  .contentType(ContentType.JSON)
		  .auth()
		  .basic("admin", "tSt7Hf=Z$zZ6")
		  .log().all()
		.when()
		  .body(requestbody2)
		  .post()
		.then()
		  .log().all()
		  .assertThat()
		  .statusCode(201)
		  .statusLine(Matchers.containsString("Created"))
		  .contentType(ContentType.JSON);		


	}

}
