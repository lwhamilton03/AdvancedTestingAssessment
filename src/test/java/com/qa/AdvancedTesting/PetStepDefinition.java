package com.qa.AdvancedTesting;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PetStepDefinition {
	
	private WebDriver driver = null; 
	
	private RequestSpecification request;
	private Response response;
	private ValidatableResponse json; 
	
	JSONObject jsonObj = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonInObj = new JSONObject(); 
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",Constants.CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^As a Vet$")
	public void as_a_Vet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I want to see records$")
	public void i_want_to_see_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^So that I can recommend the type of care to give their animals$")
	public void so_that_I_can_recommend_the_type_of_care_to_give_their_animals() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^As an administrator$")
	public void as_an_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I want to update records$")
	public void i_want_to_update_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^So that the correct prices$")
	public void so_that_the_correct_prices() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^updates are sent\\.$")
	public void updates_are_sent() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^i want to delete animal records$")
	public void i_want_to_delete_animal_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^so that check up emails aren't sent to deceased animals$")
	public void so_that_check_up_emails_aren_t_sent_to_deceased_animals() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I want to add new animals to our records$")
	public void i_want_to_add_new_animals_to_our_records() 
	{
		RestAssured.baseURI = Constants.VETPETAPI;
		request = RestAssured.given().header("Content-Type", "application/json");
	
		jsonInObj.put("id", 3);
		jsonInObj.put("name", "surgery");
		jsonArray.add(jsonInObj);
		jsonObj.put("jsonInObj", jsonInObj);
		jsonObj.put("firstName","Lucy");
		jsonObj.put("lastName", "Ham");
		jsonObj.put("id", "9");
		
		request.body(jsonObj.toString());
		
		response = request.when().post("/"); 
		
	
	}

	@Then("^So that I can quickly add new customers to our files$")
	public void so_that_I_can_quickly_add_new_customers_to_our_files() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@When("^i want to add new owners to our records,$")
	public void i_want_to_add_new_owners_to_our_records() throws Throwable {
		RestAssured.baseURI = Constants.OWNERPETAPI;
	}

	@Then("^So that paper work is kept to a minimum$")
	public void so_that_paper_work_is_kept_to_a_minimum() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^can be filled out with the help of the customer$")
	public void can_be_filled_out_with_the_help_of_the_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
