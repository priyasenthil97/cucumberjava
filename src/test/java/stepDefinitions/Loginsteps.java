package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("hello login page");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
	  System.out.println("uname and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	   System.out.println("enter home page");
	}

}
