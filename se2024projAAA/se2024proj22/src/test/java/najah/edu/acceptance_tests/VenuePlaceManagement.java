package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.Venue;
import najah.edu.VenueBookingSystem;
import najah.edu.VenueManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VenuePlaceManagement {

    private String venueName;
    private boolean isAvailable;

    private VenueManagement managementSystem;
    private VenueBookingSystem bookingSystem;
    private Venue venue;
    VenueBookingSystem venueBookingSystem = new VenueBookingSystem();
    List<String> amenities = new ArrayList<>();
    VenueManagement v= new  VenueManagement ();

    @Given("there is a venue booking system")
    public void there_is_a_venue_booking_system() {
        bookingSystem = new VenueBookingSystem();
        bookingSystem.initialize();
    }

    @When("I check the availability of a venue for an event")
    public void i_check_the_availability_of_a_venue_for_an_event() {
        bookingSystem = new VenueBookingSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the venue name:");
        venueName = scanner.nextLine();
        isAvailable = bookingSystem.checkVenueAvailability(venueName);
    }

    @Then("I should see whether the venue is available or not")
    public void i_should_see_whether_the_venue_is_available_or_not() {
        System.out.println("Venue availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    @Given("I have access to the venue management system")
    public void i_have_access_to_the_venue_management_system() {
        managementSystem = new VenueManagement();
        managementSystem.grantAccess();
    }

    @When("I add a new venue with details")
    public void i_add_a_new_venue_with_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the venue name:");
        String name = scanner.nextLine();
        System.out.println("Enter the capacity:");
        int capacity = scanner.nextInt();
        System.out.println("Enter the pricing:");
        String pricing = scanner.next();
        v.addVenue(name, capacity, amenities, pricing);
    }

    @Then("the venue should be successfully added")
    public void the_venue_should_be_successfully_added() {
        System.out.println("Venue added successfully!");
    }

    @Given("there is a venue with name {string}")
    public void there_is_a_venue_with_name(String name) {
        venue = new Venue(name, 100, new ArrayList<>(), "$50/hr");
    }

    @When("I view the details of the venue")
    public void i_view_the_details_of_the_venue() {
        // Assuming venue is already initialized
    }

    @Then("I should see the capacity, amenities, and pricing of the venue")
    public void i_should_see_the_capacity_amenities_and_pricing_of_the_venue() {
        if (venue != null) {
            System.out.println("Venue: " + venue.getName());
            System.out.println("Capacity: " + venue.getCapacity());
            System.out.println("Amenities: " + venue.getAmenities());
            System.out.println("Pricing: " + venue.getPricing());
        } else {
            System.out.println("Venue details are not available.");
        }
    }

    // Command line interface method
    public void runCommandLineInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Venue Management System!");

        System.out.println("What would you like to do?");
        System.out.println("1. Check venue availability");
        System.out.println("2. Add a new venue");
        System.out.println("3. View venue details");
        System.out.println("Enter your choice:");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                i_check_the_availability_of_a_venue_for_an_event();
                i_should_see_whether_the_venue_is_available_or_not();
                break;
            case 2:
                i_add_a_new_venue_with_details();
                the_venue_should_be_successfully_added();
                break;
            case 3:
                i_view_the_details_of_the_venue();
                i_should_see_the_capacity_amenities_and_pricing_of_the_venue();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        VenuePlaceManagement venueManagement = new VenuePlaceManagement();
        venueManagement.runCommandLineInterface();
    }
}
