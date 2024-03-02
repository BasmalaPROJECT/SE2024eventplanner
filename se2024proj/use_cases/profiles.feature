Feature: Users and Service Providers profiles

  Scenario: Service provider creates a new event
    Given the service provider is logged in
    And navigates to the event management section
    When the service provider adds a new event with valid information
    And submits the event creation form
    Then the event should be successfully created
    And listed in the service provider's events

  Scenario: Service provider updates an existing event
    Given the service provider is logged in
    And has existing events in the system
    When the service provider selects an event to edit
    And updates the event details
    And submits the event update form
    Then the event should be successfully updated
    And the changes should reflect in the service provider's events list

  Scenario: User registers for an event
    Given the user is logged in
    And navigates to the event registration section
    When the user selects an available event
    And completes the event registration form
    And submits the registration form
    Then the user should be successfully registered for the event
    And receive a confirmation message

  Scenario: User cancels event registration
    Given the user is logged in
    And has registered for an event
    When the user navigates to the event registration section
    And selects the registered event to cancel
    And confirms the cancellation
    Then the user should be successfully unregistered from the event
    And receive a cancellation confirmation message

   
