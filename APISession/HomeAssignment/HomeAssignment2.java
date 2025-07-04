package Home.Assignment;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class HomeAssignment2 {

	@Test
	public void main() {
				
		 File filename = new File(".\\src\\main\\resources\\request_payload\\changeRequestBody.json");
		 
		 
		 given()
		  .baseUri("https://dev323254.service-now.com")
		  .basePath("/api/now/table/{tableName}")
		  .pathParam("tableName","change_request")
		  .contentType(ContentType.JSON)
		  .auth()
		  .basic("admin", "tSt7Hf=Z$zZ6")
		  .log().all()
		.when()
		  .body(filename)
		  .post()
		.then()
		  .log().all()
		  .assertThat()
		  .statusCode(201)
		  .statusLine(Matchers.containsString("Created"))
		  .contentType(ContentType.JSON);				

		}

	}


