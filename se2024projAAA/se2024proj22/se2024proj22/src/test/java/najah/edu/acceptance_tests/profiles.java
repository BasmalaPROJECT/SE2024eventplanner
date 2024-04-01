package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import static org.junit.Assert.assertEquals;
import najah.edu. serviceprovider;
import najah.edu.event;
import static org.junit.Assert.assertTrue;


public class profiles {

	serviceprovider s = new serviceprovider();
	event e = new event(1,"15feb",2,"nablus","marrid");
	event e1= new event(2,"15feb",2,"nablus","marrid");
	@Given("the service provider is logged in")
	public void the_service_provider_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions

		
	}

	@Given("navigates to the event management section")
	public void navigates_to_the_event_management_section() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("the service provider adds a new event with valid information")
	public void the_service_provider_adds_a_new_event_with_valid_information() {
		assertTrue(true);

	}

	@When("submits the event creation form")
	public void submits_the_event_creation_form() {
		assertTrue(true);
	}

	@Then("the event should be successfully created")
	public void the_event_should_be_successfully_created() {
	  s.addevent(e);

	}

	/*@Then("listed in the service provider's events")
	public void listed_in_the_service_provider_s_events() {
	    // Write code here that turns the phrase above into concrete actions

	}
*/
	@Given("has existing events in the system")
	public void has_existing_events_in_the_system() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("the service provider selects an event to edit")
	public void the_service_provider_selects_an_event_to_edit() {
		assertTrue(true);

	}

	@When("updates the event details")
	public void updates_the_event_details() {
		assertTrue(true);

	}

	@When("submits the event update form")
	public void submits_the_event_update_form() {
		assertTrue(true);
	}

	@Then("the event should be successfully updated")
	public void the_event_should_be_successfully_updated() {
	  s.updateevent(e, 1);

	}

	/*@Then("the changes should reflect in the service provider's events list")
	public void the_changes_should_reflect_in_the_service_provider_s_events_list() {
	    // Write code here that turns the phrase above into concrete actions

	}*/

	@Given("the user is logged in")
	public void the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("navigates to the event registration section")
	public void navigates_to_the_event_registration_section() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("the user selects an available event")
	public void the_user_selects_an_available_event() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("completes the event registration form")
	public void completes_the_event_registration_form() {
		assertTrue(true);
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
		assertTrue(true);
	}
/*
	@Then("the user should be successfully registered for the event")
	public void the_user_should_be_successfully_registered_for_the_event() {
	    // Write code here that turns the phrase above into concrete actions

	}*/

	/*@Then("receive a confirmation message")
	public void receive_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions

	}*/

	@Given("has registered for an event")
	public void has_registered_for_an_event() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("the user navigates to the event registration section")
	public void the_user_navigates_to_the_event_registration_section() {
		assertTrue(true);

	}

	@When("selects the registered event to cancel")
	public void selects_the_registered_event_to_cancel() {
		assertTrue(true);

	}

	@When("confirms the cancellation")
	public void confirms_the_cancellation() {
		assertTrue(true);

	}

	@Then("the user should be successfully unregistered from the event")
	public void the_user_should_be_successfully_unregistered_from_the_event() {
	    s.deleteevent(2);

	}

	/*@Then("receive a cancellation confirmation message")
	public void receive_a_cancellation_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions

	}*/
}
