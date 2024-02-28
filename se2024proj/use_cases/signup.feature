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

  Scenario Outline: User provides invalid email during sign up
    Given the user is on the sign-up page
    When the user enters an invalid email format "<email>"
    And completes the other required information for a regular user
    And clicks the sign-up button
    Then the user should see an error message indicating the invalid email format

    Examples:
      | email                  |
      | invalidemail@com       |
      | missingatsign.com      |
      | user@invalidtld        |

  

  Scenario: Service Provider provides invalid email during sign up
    Given the service provider is on the sign-up page
    When the service provider enters an invalid email format
    And completes the other required information
    And clicks the sign-up button
    Then the service provider should see an error message indicating the invalid email format

  Scenario Outline: User provides weak password during sign up
    Given the user is on the sign-up page
    When the user enters registration information with password "<password>"
    And clicks the sign-up button
    Then the user should see an error message indicating the password is weak

    Examples:
      | password    |
      | 123456      |
      | password    |
      | qwerty      |

 

  Scenario: Service Provider provides weak password during sign up
    Given the service provider is on the sign-up page
    When the service provider enters registration information with a weak password
    And clicks the sign-up button
    Then the service provider should see an error message indicating the password is weak


