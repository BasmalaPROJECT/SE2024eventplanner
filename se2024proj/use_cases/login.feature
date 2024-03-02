Feature: User Login

  Scenario: Regular User Login
    Given the user navigates to the login page
    When the user enters valid regular user credentials
    And clicks on the login button
    Then the user should be logged in successfully
    And should be redirected to the user dashboard

  Scenario: Service Provider Login
    Given the user navigates to the login page
    When the user enters valid service provider credentials
    And clicks on the login button
    Then the user should be logged in successfully as a service provider
    And should be redirected to the service provider dashboard

  Scenario: Invalid Login Attempts
    Given the user navigates to the login page
    When the user enters invalid credentials for <user_type>
    And clicks on the login button
    Then the user should see an error message "<error_message>"

    Examples:
      | user_type         | error_message                        |
      | regular user      | Invalid username or password         |
      | service provider  | Service provider login failed        |

  Scenario: Forgot Password
    Given the user is on the login page
    When the user clicks on the "Forgot Password" link
    And provides a valid email address
    And clicks on the submit button
    Then the user should receive a password reset email
