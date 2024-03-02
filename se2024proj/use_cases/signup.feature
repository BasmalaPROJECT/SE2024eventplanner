Feature: User Registration for Different Roles

  Scenario: Regular User Sign Up
    Given the user is on the sign-up page
    When the user enters valid registration information for a regular user
    And clicks the sign-up button
    Then the user should be successfully registered
    And redirected to the user dashboard
    And should see a welcome message for regular users

  Scenario: Service Provider Sign Up
    Given the service provider is on the sign-up page
    When the service provider enters valid registration information
    And clicks the sign-up button
    Then the service provider should be successfully registered
    And redirected to the service provider dashboard
    And should see a welcome message for service providers

  Scenario: Regular User provides incomplete registration information
    Given the user is on the sign-up page
    When the user enters incomplete registration information for a regular user
    And clicks the sign-up button
    Then the user should see error messages for the missing information

  Scenario: Service Provider provides incomplete registration information
    Given the service provider is on the sign-up page
    When the service provider enters incomplete registration information
    And clicks the sign-up button
    Then the service provider should see error messages for the missing information
