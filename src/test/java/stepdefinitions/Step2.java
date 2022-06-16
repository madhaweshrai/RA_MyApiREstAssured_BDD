package stepdefinitions;
import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step2 {

	@Given("url")
	public void url() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("feature1");
	}

	@When("usl is passed")
	public void usl_is_passed() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("feature2");
	}



	
	
}
