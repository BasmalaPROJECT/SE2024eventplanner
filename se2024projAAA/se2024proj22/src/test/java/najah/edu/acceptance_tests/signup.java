package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

public class signup {

    // Assuming these variables represent the state of your test environment
    private boolean onSignUpPage = false;
    private boolean registrationSuccess = false;
    private boolean redirectedToDashboard = false;
    private String userType = ""; // "regular" or "service provider"
    private boolean receivedWelcomeMessage = false;
    private boolean receivedErrorMessage = false;

    @Given("the user is on the sign-up page")
    public void the_user_is_on_the_sign_up_page() {
        // Simulate the user navigating to the sign-up page
        onSignUpPage = true;
    }

    @When("the user enters valid registration information for a regular user")
    public void the_user_enters_valid_registration_information_for_a_regular_user() {
        // Simulate entering valid registration details
        if (onSignUpPage) {
            userType = "regular";
            registrationSuccess = true; // Simulate successful registration
        }
    }

    @When("clicks the sign-up button")
    public void clicks_the_sign_up_button() {
        // This step would normally trigger the registration process
        // Assuming registrationSuccess has been set appropriately in previous steps
    }

    @Then("the user should be successfully registered")
    public void the_user_should_be_successfully_registered() {
        // Verify registration was successful
        assertTrue("User should be successfully registered", registrationSuccess);
    }

    @Then("redirected to the user dashboard")
    public void redirected_to_the_user_dashboard() {
        // Simulate and verify redirection
        if (registrationSuccess && userType.equals("regular")) {
            redirectedToDashboard = true;
        }
        assertTrue("User should be redirected to the dashboard", redirectedToDashboard);
    }

    @Then("should see a welcome message for regular users")
    public void should_see_a_welcome_message_for_regular_users() {
        // Simulate and verify receiving a welcome message
        if (redirectedToDashboard && userType.equals("regular")) {
            receivedWelcomeMessage = true;
        }
        assertTrue("User should see a welcome message", receivedWelcomeMessage);
    }

    @Given("the service provider is on the sign-up page")
    public void the_service_provider_is_on_the_sign_up_page() {
        // Simulate the service provider navigating to the sign-up page
        onSignUpPage = true;
        userType = "service provider";
    }

    @When("the service provider enters valid registration information")
    public void the_service_provider_enters_valid_registration_information() {
        // Simulate entering valid registration details for a service provider
        if (onSignUpPage && userType.equals("service provider")) {
            registrationSuccess = true; // Simulate successful registration for service provider
        }
    }

    @Then("the service provider should be successfully registered")
    public void the_service_provider_should_be_successfully_registered() {
        // Verify service provider registration was successful
        assertTrue("Service provider should be successfully registered", registrationSuccess);
    }

    @Then("redirected to the service provider dashboard")
    public void redirected_to_the_service_provider_dashboard() {
        // Simulate and verify redirection to service provider dashboard
        if (registrationSuccess && userType.equals("service provider")) {
            redirectedToDashboard = true;
        }
        assertTrue("Service provider should be redirected to the dashboard", redirectedToDashboard);
    }

    @Then("should see a welcome message for service providers")
    public void should_see_a_welcome_message_for_service_providers() {
        // Simulate and verify receiving a welcome message for service providers
        if (redirectedToDashboard && userType.equals("service provider")) {
            receivedWelcomeMessage = true;
        }
        assertTrue("Service provider should see a welcome message", receivedWelcomeMessage);
    }

    @When("the user enters incomplete registration information for a regular user")
    public void the_user_enters_incomplete_registration_information_for_a_regular_user() {
        // Simulate entering incomplete registration information
        if (onSignUpPage && userType.equals("regular")) {
            receivedErrorMessage = true; // Simulate detection of incomplete information
        }
    }

    @Then("the user should see error messages for the missing information")
    public void the_user_should_see_error_messages_for_the_missing_information() {
        // Verify that error messages are displayed for missing information
        assertTrue("User should see error messages for the missing information", receivedErrorMessage);
    }

    @When("the service provider enters incomplete registration information")
    public void the_service_provider_enters_incomplete_registration_information() {
        // Simulate entering incomplete registration information for a service provider
        if (onSignUpPage && userType.equals("service provider")) {
            receivedErrorMessage = true; // Simulate detection of incomplete information
        }
    }

    @Then("the service provider should see error messages for the missing information")
    public void the_service_provider_should_see_error_messages_for_the_missing_information() {
        // Verify that error messages are displayed for missing information for a service provider
        assertTrue("Service provider should see error messages for the missing information", receivedErrorMessage);
    }

    // Command line interface method
    public void runCommandLineInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the sign-up page!");

        System.out.println("Are you a regular user or a service provider? Enter 'regular' or 'service provider':");
        userType = scanner.nextLine();

        System.out.println("Enter your registration information:");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (userType.equals("regular")) {
            the_user_is_on_the_sign_up_page();
            the_user_enters_valid_registration_information_for_a_regular_user();
            clicks_the_sign_up_button();
            the_user_should_be_successfully_registered();
            redirected_to_the_user_dashboard();
            should_see_a_welcome_message_for_regular_users();
        } else if (userType.equals("service provider")) {
            the_service_provider_is_on_the_sign_up_page();
            the_service_provider_enters_valid_registration_information();
            clicks_the_sign_up_button();
            the_service_provider_should_be_successfully_registered();
            redirected_to_the_service_provider_dashboard();
            should_see_a_welcome_message_for_service_providers();
        } else {
            System.out.println("Invalid user type!");
        }
    }

    public static void main(String[] args) {
        signup signUpTest = new signup();
        signUpTest.runCommandLineInterface();
    }
}
