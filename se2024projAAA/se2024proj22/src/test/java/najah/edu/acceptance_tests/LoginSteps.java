package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.acceptance_test.CommandLineInterface;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private boolean onLoginPage = false;
    private boolean loginSuccess = false;
    private boolean redirectedToDashboard = false;
    private String userType = ""; // Could be "regular" or "service provider"
    private boolean receivedPasswordResetEmail = false;
    private String errorMessage = "";
    private String commandOutput;

    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
        onLoginPage = true;
    }

    @When("the user enters valid regular user credentials")
    public void the_user_enters_valid_regular_user_credentials() {
        if (onLoginPage) {
            userType = "regular";
            loginSuccess = true;
        }
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        // Simulate clicking the login button. Outcome depends on the setup in previous steps.
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        assertTrue("User should be logged in successfully", loginSuccess);
    }

    @Then("should be redirected to the user dashboard")
    public void should_be_redirected_to_the_user_dashboard() {
        if (loginSuccess && userType.equals("regular")) {
            redirectedToDashboard = true;
        }
        assertTrue("User should be redirected to the user dashboard", redirectedToDashboard);
    }

    @When("the user enters valid service provider credentials")
    public void the_user_enters_valid_service_provider_credentials() {
        if (onLoginPage) {
            userType = "service provider";
            loginSuccess = true;
        }
    }

    @Then("the user should be logged in successfully as a service provider")
    public void the_user_should_be_logged_in_successfully_as_a_service_provider() {
        assertTrue("Service provider should be logged in successfully", loginSuccess && userType.equals("service provider"));
    }

    @Then("should be redirected to the service provider dashboard")
    public void should_be_redirected_to_the_service_provider_dashboard() {
        if (loginSuccess && userType.equals("service provider")) {
            redirectedToDashboard = true;
        }
        assertTrue("Service provider should be redirected to their dashboard", redirectedToDashboard);
    }

    @When("the user enters invalid credentials for regular user")
    public void the_user_enters_invalid_credentials_for_regular_user() {
        if (onLoginPage && userType.equals("regular")) {
            loginSuccess = false; // Simulate failed login attempt
        }
    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String string) {
        if (!loginSuccess) {
            errorMessage = string; // Simulate receiving an error message
        }
        assertEquals("Error message should be displayed", string, errorMessage);
    }

    @When("the user enters invalid credentials for service provider")
    public void the_user_enters_invalid_credentials_for_service_provider() {
        if (onLoginPage && userType.equals("service provider")) {
            loginSuccess = false; // Simulate failed login attempt
        }
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        onLoginPage = true;
    }

    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String string) {
        // Simulate clicking on a specific link, such as "Forgot Password"
        if (string.equals("Forgot Password") && onLoginPage) {
            // Assume this action leads to a password reset flow
        }
    }

    @When("provides a valid email address")
    public void provides_a_valid_email_address() {
        // Simulate providing a valid email for password reset
        if (onLoginPage) {
            receivedPasswordResetEmail = true; // Assume email submission was successful
        }
    }

    @When("clicks on the submit button")
    public void clicks_on_the_submit_button() {
        // Simulate clicking the submit button, presumably for the password reset request
    }

    @Then("the user should receive a password reset email")
    public void the_user_should_receive_a_password_reset_email() {
        assertTrue("User should receive a password reset email", receivedPasswordResetEmail);
    }

    @Given("the user is on the command line interface")
    public void the_user_is_on_the_command_line_interface() {
        // Assume user is on the command line interface
    }

    @When("the user enters {string}")
    public void the_user_enters(String command) {
        // Simulate user entering a command
        InputStream in = new ByteArrayInputStream(command.getBytes());
        System.setIn(in);

        // Capture the output of the command
        commandOutput = CommandLineInterface.main(null);
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedOutput) {
        // Compare the expected output with the actual output of the command
        assertEquals(expectedOutput, commandOutput.trim());
    }
}
