package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {

@Given("the user is on the sign-up page")
public void the_user_is_on_the_sign_up_page() {
   
	
}

@When("the user enters valid registration information for a regular user")
public void the_user_enters_valid_registration_information_for_a_regular_user() {


}

@When("clicks the sign-up button")
public void clicks_the_sign_up_button() {


}

@Then("the user should be successfully registered")
public void the_user_should_be_successfully_registered() {


}

@Then("redirected to the user dashboard")
public void redirected_to_the_user_dashboard() {


}

@Then("should see a welcome message for regular users")
public void should_see_a_welcome_message_for_regular_users() {


}

@Given("the service provider is on the sign-up page")
public void the_service_provider_is_on_the_sign_up_page() {


}

@When("the service provider enters valid registration information")
public void the_service_provider_enters_valid_registration_information() {


}

@Then("the service provider should be successfully registered")
public void the_service_provider_should_be_successfully_registered() {


}

@Then("redirected to the service provider dashboard")
public void redirected_to_the_service_provider_dashboard() {


}

@Then("should see a welcome message for service providers")
public void should_see_a_welcome_message_for_service_providers() {


}

@When("the user enters incomplete registration information for a regular user")
public void the_user_enters_incomplete_registration_information_for_a_regular_user() {


}

@Then("the user should see error messages for the missing information")
public void the_user_should_see_error_messages_for_the_missing_information() {


}

@When("the service provider enters incomplete registration information")
public void the_service_provider_enters_incomplete_registration_information() {


}

@Then("the service provider should see error messages for the missing information")
public void the_service_provider_should_see_error_messages_for_the_missing_information() {


}

@When("the user enters an invalid email format {string}")
public void the_user_enters_an_invalid_email_format(String string) {


}

@When("completes the other required information for a regular user")
public void completes_the_other_required_information_for_a_regular_user() {


}

@Then("the user should see an error message indicating the invalid email format")
public void the_user_should_see_an_error_message_indicating_the_invalid_email_format() {


}

@When("the service provider enters an invalid email format")
public void the_service_provider_enters_an_invalid_email_format() {


}

@When("completes the other required information")
public void completes_the_other_required_information() {


}

@Then("the service provider should see an error message indicating the invalid email format")
public void the_service_provider_should_see_an_error_message_indicating_the_invalid_email_format() {


}

@When("the user enters registration information with password {string}")
public void the_user_enters_registration_information_with_password(String string) {


}

@Then("the user should see an error message indicating the password is weak")
public void the_user_should_see_an_error_message_indicating_the_password_is_weak() {


}

@When("the service provider enters registration information with a weak password")
public void the_service_provider_enters_registration_information_with_a_weak_password() {
   
}

@Then("the service provider should see an error message indicating the password is weak")
public void the_service_provider_should_see_an_error_message_indicating_the_password_is_weak() {
    
	
}

}
