package stepdefinitions;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class StepDefinitions {
	@Given("api payload  passed")
	public void api_payload_passed() {
		
	    RestAssured.baseURI= "https://rahulshettyacademy.com";
	    // Write code here that turns the phrase above into concrete actions
		/*
		 * String response = given().log().all().queryParam("key",
		 * "qaclick123").header("Content-Type","Application/json").
		 * body("{\\r\\n  \\\"location\\\": {\\r\\n    \\\"lat\\\": -38.383494,\\r\\n    \\\"lng\\\": 33.427362\\r\\n  },\\r\\n  \\\"accuracy\\\": 50,\\r\\n  \\\"name\\\": \\\"NOIDA\\\",\\r\\n  \\\"phone_number\\\": \\\"(+91) 983 893 3937\\\",\\r\\n  \\\"address\\\": \\\"29, side layout, cohen 09\\\",\\r\\n  \\\"types\\\": [\\r\\n    \\\"shoe park\\\",\\r\\n    \\\"shop\\\"\\r\\n  ],\\r\\n  \\\"website\\\": \\\"http:\\/\\/google.com\\\",\\r\\n  \\\"language\\\": \\\"French-IN\\\"\\r\\n}\\r\\n"
		 * )
		 * .when().post("maps/api/place/add/json").then().assertThat().statusCode(200).
		 * extract().response().asString(); System.out.println(response); JsonPath
		 * js=new JsonPath(response); //for parsing Json String
		 * placeId=js.getString("place_id");
		 * 
		 * System.out.println(placeId);
		 */
	    System.out.println("1");
		//JsonPath js1=ReUsableMethods.rawToJson(response);
	   
	
	}

	@When("user calls AddplaceApi with POST method")
	public void user_calls_AddplaceApi_with_POST_method() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("2");
	}

	@Then("receives success status code")
	public void receives_success_status_code() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("3");
	}

	@Then("received status response as ok")
	public void received_status_response_as_ok() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("4");
	}
}
