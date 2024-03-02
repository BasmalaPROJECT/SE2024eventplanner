Feature: Event Management by User (Attendee)

  Scenario: User searches for events
    Given the user is logged in
    And navigates to the event search section
    When the user searches for events by entering keywords or filters
    Then the user should see a list of relevant events
    And each event in the list should display key details like date, time, location, and category

  Scenario: User registers for an available event
    Given the user is logged in
    And navigates to the event details page
    When the user selects an available event to register
    And completes the event registration form
    And submits the registration form
    Then the user should be successfully registered for the event
    And receive a confirmation message

  Scenario: User cancels registration for an event
    Given the user is logged in
    And has previously registered for an event
    When the user navigates to the registered events section
    And selects the registered event to unregister
    And confirms the cancellation
    Then the user should be successfully unregistered from the event
    And receive a cancellation confirmation message

  Scenario: User views details of a registered event
    Given the user is logged in
    And has previously registered for an event
    When the user navigates to the registered events section
    And selects the registered event to view details
    Then the user should see detailed information about the event
    And options to manage their registration or view event-related media


