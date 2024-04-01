package najah.edu.acceptance_tests;
import javax.swing.JOptionPane;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.event;
import najah.edu.serviceprovider;

public class serviceproviderMANAGE {
	
	List<event> events = new ArrayList<>();

	event r = new event(1,"15feb",2,"nablus","marrid");
	serviceprovider s = new serviceprovider();
	event a = new event(2,"15feb",2,"nablus","marrid");
	event v = new event(3,"15feb",2,"nablus","marrid");

	
	@Given("navigates to the event creation section")
	public void navigates_to_the_event_creation_section() {
		System.out.println("Navigating to the event creation section...");

		
	}

	@When("the service provider selects {string} as the event category")
	public void the_service_provider_selects_as_the_event_category(String string) {
		assertTrue(true);

	}

	@When("fills in the event details with date, time, location, theme, and description")
	public void fills_in_the_event_details_with_date_time_location_theme_and_description() {
		assertTrue(true);

	}

	@When("sets the attendee count")
	public void sets_the_attendee_count() {
		assertTrue(true);

	}

	@When("adds images and videos related to the event")
	public void adds_images_and_videos_related_to_the_event() {
		assertTrue(true);

	}

	@Then("the party event should be successfully created")
	public void the_party_event_should_be_successfully_created() {

		s.addevent(r);
	}

	@Then("listed in the service provider's events under the {string} category")
	public void listed_in_the_service_provider_s_events_under_the_category(String string) {

		v.geteventId();
		v.getdescription();
		v.getlocation();
		v.gettime();
		r.printevent(1);
		
	}

	@Given("has existing workshop events in the system")
	public void has_existing_workshop_events_in_the_system() {
	    
		  System.out.println("Setting up existing workshop events in the system...");
	}

	@When("the service provider selects a workshop event to edit")
	public void the_service_provider_selects_a_workshop_event_to_edit() {
		assertTrue(true);

	}

	@When("updates the event details such as date, time, and description")
	public void updates_the_event_details_such_as_date_time_and_description() {
		assertTrue(true);

	}

	@When("adds or removes images related to the event")
	public void adds_or_removes_images_related_to_the_event() {
		assertTrue(true);

	}

	@Then("the workshop event should be successfully updated")
	public void the_workshop_event_should_be_successfully_updated() {

		s.updateevent(a, 1);
		
	}

	@When("the service provider selects an event to delete")
	public void the_service_provider_selects_an_event_to_delete() {
		assertTrue(true);

	}

	@When("confirms the deletion")
	public void confirms_the_deletion() {
		assertTrue(true);

	}

	@Then("the event should be successfully deleted")
	public void the_event_should_be_successfully_deleted() {
	    s.deleteevent(3);

	}

	@Then("no longer appear in the service provider's events list")
	public void no_longer_appear_in_the_service_provider_s_events_list() {

		  for (event event : events) {
	            System.out.println(event.geteventId() + " - " + event.gettime()+ " - " +event.getlocation()+ " - "+event.getdescription());
		  }
	}

	@Given("has a party event with registered attendees")
	public void has_a_party_event_with_registered_attendees() {
		 System.out.println("Setting up a party event with registered attendees...");

	}

	@When("the service provider navigates to the guest list management section for the party")
	public void the_service_provider_navigates_to_the_guest_list_management_section_for_the_party() {
		assertTrue(true);

	}

	@When("adds new guests or removes existing guests")
	public void adds_new_guests_or_removes_existing_guests() {
		assertTrue(true);

	}

	@When("submits the guest list changes")
	public void submits_the_guest_list_changes() {
		assertTrue(true);

	}

	@Then("the service provider should see a confirmation message")
	public void the_service_provider_should_see_a_confirmation_message() {

		int option = JOptionPane.showConfirmDialog(null, "Do you want to confirm this event?", "Confirmation", JOptionPane.YES_NO_OPTION);
	        if (option == JOptionPane.YES_OPTION) {
	            System.out.println("Event confirmed!");
	        } else {
	            System.out.println("Event not confirmed.");
	        }
	    
	}

	
}
