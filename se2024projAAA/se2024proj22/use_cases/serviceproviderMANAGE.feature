Feature: Event Creation and Management by Service Provider


  Scenario: Service provider adds a new party event
    Given the service provider is logged in
    And navigates to the event creation section
    When the service provider selects "Party" as the event category
    And fills in the event details with date, time, location, theme, and description
    And sets the attendee count
    And adds images and videos related to the event
    And submits the event creation form
    Then the party event should be successfully created
    And listed in the service provider's events under the "Party" category

  Scenario: Service provider edits an existing workshop event
    Given the service provider is logged in
    And has existing workshop events in the system
    When the service provider selects a workshop event to edit
    And updates the event details such as date, time, and description
    And adds or removes images related to the event
    And submits the event update form
    Then the workshop event should be successfully updated
    And the changes should reflect in the service provider's events list

  Scenario: Service provider deletes an existing event
    Given the service provider is logged in
    And has existing events in the system
    When the service provider selects an event to delete
    And confirms the deletion
    Then the event should be successfully deleted
    And no longer appear in the service provider's events list

  Scenario: Service provider manages guest list for a party
    Given the service provider is logged in
    And has a party event with registered attendees
    When the service provider navigates to the guest list management section for the party
    And adds new guests or removes existing guests
    And submits the guest list changes
    Then the service provider should see a confirmation message

