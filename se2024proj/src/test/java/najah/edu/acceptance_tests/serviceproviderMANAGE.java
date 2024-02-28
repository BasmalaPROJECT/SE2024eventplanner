package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class serviceproviderMANAGE {


@Given("a registered service provider with username {string} and password {string}")
public void a_registered_service_provider_with_username_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the service provider logs in")
public void the_service_provider_logs_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("they should be able to fill in event details:")
public void they_should_be_able_to_fill_in_event_details(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
}

@Then("the service provider should be able to submit the event")
public void the_service_provider_should_be_able_to_submit_the_event() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the event {string} should be created")
public void the_event_should_be_created(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the service provider should see a confirmation message")
public void the_service_provider_should_see_a_confirmation_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("modifies the event details:")
public void modifies_the_event_details(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
}

@Then("the event details should be updated")
public void the_event_details_should_be_updated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the event should be removed from the list of managed events")
public void the_event_should_be_removed_from_the_list_of_managed_events() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("an event named {string} on {int}-{int}-{int} at Workshop Hall with a capacity of {int}")
public void an_event_named_on_at_workshop_hall_with_a_capacity_of(String string, Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the service provider selects the {string} event to manage attendees")
public void the_service_provider_selects_the_event_to_manage_attendees(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("they should see a list of registered attendees")
public void they_should_see_a_list_of_registered_attendees() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the service provider should be able to mark attendees as present")
public void the_service_provider_should_be_able_to_mark_attendees_as_present() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the service provider should be able to remove attendees from the list")
public void the_service_provider_should_be_able_to_remove_attendees_from_the_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	
}
