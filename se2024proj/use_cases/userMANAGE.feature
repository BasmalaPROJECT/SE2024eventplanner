Feature: Event Creation and Management for Users

  Scenario: User creates and manages events
    Given a registered user with username "user" and password "password"
    When the user logs in
    Then they should be redirected to their profile page

    When the user clicks on "Create Event"
    Then they should be able to fill in event details:
      | Event Name       | Event Description        | Date       | Location        | Capacity |
      | Birthday Bash    | Celebrating a special day | 2024-04-10 | Community Center| 50       |

    And the user should be able to submit the event
    Then the event "Birthday Bash" should be created
    And the user should see a confirmation message

    And the user should be able to view their created events
    When the user checks their created events
    Then they should see the list of events they have created

    And the user should be able to edit an event
    When the user selects an event to edit
    And modifies the event details:
      | Event Name       | Event Description         | Date       | Location         | Capacity |
      | Updated Bash     | A revamped celebration    | 2024-04-15 | Community Center | 60       |
    Then the event details should be updated
    And the user should see a confirmation message

    And the user should be able to delete an event
    When the user selects an event to delete
    Then the event should be removed from their list of created events
    And the user should see a confirmation message

    And the user should be able to search for events
    When the user searches for events on "2024-04-15"
    Then they should see a list of events on that date

    And the user should be able to filter events by location
    When the user filters events by location "Community Center"
    Then they should see a list of events at that location

    And the user should be able to sort events by date
    When the user sorts events by date in ascending order
    Then they should see a sorted list of events

    And the user should be able to view event details
    When the user clicks on an event
    Then they should see detailed information about the event

    And the user should be able to register for an event
    When the user selects an event to register
    Then they should be able to register for the event
    And the event's capacity should decrease by 1
    And the user should see a confirmation message

    And the user should be able to unregister from an event
    When the user selects an event to unregister
    Then they should be removed from the list of attendees
    And the event's capacity should increase by 1
    And the user should see a confirmation message

    And the user should receive notifications for upcoming events
    When the user is logged in
    And an event they are registered for is approaching
    Then they should receive a reminder notification

