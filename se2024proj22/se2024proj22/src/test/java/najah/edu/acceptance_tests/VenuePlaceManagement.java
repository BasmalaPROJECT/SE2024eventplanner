package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VenuePlaceManagement {

	@Given("there is a venue booking system")
	public void there_is_a_venue_booking_system() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("I check the availability of a venue for an event")
	public void i_check_the_availability_of_a_venue_for_an_event() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("I should see whether the venue is available or not")
	public void i_should_see_whether_the_venue_is_available_or_not() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("the venue {string} is available")
	public void the_venue_is_available(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("I reserve the venue {string} for my event")
	public void i_reserve_the_venue_for_my_event(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("I should receive a confirmation of the reservation")
	public void i_should_receive_a_confirmation_of_the_reservation() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("I have access to the venue management system")
	public void i_have_access_to_the_venue_management_system() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("I add a new venue with details:")
	public void i_add_a_new_venue_with_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	}

	@Then("the venue {string} should be successfully added")
	public void the_venue_should_be_successfully_added(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("there is a venue {string}")
	public void there_is_a_venue(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("I view the details of the venue {string}")
	public void i_view_the_details_of_the_venue(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("I should see the capacity, amenities, and pricing of the venue")
	public void i_should_see_the_capacity_amenities_and_pricing_of_the_venue() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("I update the details of the venue {string} with:")
	public void i_update_the_details_of_the_venue_with(String string, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	}

	@Then("the details of the venue {string} should be updated successfully")
	public void the_details_of_the_venue_should_be_updated_successfully(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	
}
