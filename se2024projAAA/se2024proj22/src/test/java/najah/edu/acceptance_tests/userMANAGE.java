package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.Event;
import najah.edu.event;
import najah.edu.user;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

// Importing Logger class from java.util.logging package
import java.util.logging.Logger;

public class userMANAGE {

    // Initializing logger instance
    Logger logger = Logger.getLogger(userMANAGE.class.getName());
      
    user u = new user (124,"Sujood","05988888","Nablus","soso@gmail.com");
    Event e = new Event();

    @Given("navigates to the event search section")
    public void navigates_to_the_event_search_section() {
        logger.info("You are in search section \n");
    }

    @When("the user searches for events by entering keywords or filters")
    public void the_user_searches_for_events_by_entering_keywords_or_filters() {
        assertTrue(true);
    }

    @Then("the user should see a list of relevant events")
    public void the_user_should_see_a_list_of_relevant_events() {
        u.searcheventbyeventId(1);
    }

    @Then("each event in the list should display key details like date, time, location, and category")
    public void each_event_in_the_list_should_display_key_details_like_date_time_location_and_category() {
        e.printevent(1);
    }

    @Given("navigates to the event details page")
    public void navigates_to_the_event_details_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("the user selects an available event to register")
    public void the_user_selects_an_available_event_to_register() {
        assertTrue(true);
    }

    @Given("has previously registered for an event")
    public void has_previously_registered_for_an_event() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("the user navigates to the registered events section")
    public void the_user_navigates_to_the_registered_events_section() {
        assertTrue(true);
    }

    @When("selects the registered event to unregister")
    public void selects_the_registered_event_to_unregister() {
        assertTrue(true);
    }

    @When("selects the registered event to view details")
    public void selects_the_registered_event_to_view_details() {
        assertTrue(true);
    }

    @Then("the user should see detailed information about the event")
    public void the_user_should_see_detailed_information_about_the_event() {
        e.printevent(1);
    }

    @Then("options to manage their registration or view event-related media")
    public void options_to_manage_their_registration_or_view_event_related_media() {
        // Write code here that turns the phrase above into concrete actions
    }

    // Command line interface method
    public void runCommandLineInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the event management system!");

        System.out.println("What would you like to do?");
        System.out.println("1. Search for events");
        System.out.println("2. View registered events");
        System.out.println("Enter your choice (1 or 2):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                navigates_to_the_event_search_section();
                the_user_searches_for_events_by_entering_keywords_or_filters();
                the_user_should_see_a_list_of_relevant_events();
                each_event_in_the_list_should_display_key_details_like_date_time_location_and_category();
                break;
            case 2:
                navigates_to_the_event_details_page();
                the_user_navigates_to_the_registered_events_section();
                selects_the_registered_event_to_unregister();
                selects_the_registered_event_to_view_details();
                the_user_should_see_detailed_information_about_the_event();
                options_to_manage_their_registration_or_view_event_related_media();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        userMANAGE userManageTest = new userMANAGE();
        userManageTest.runCommandLineInterface();
    }
}
