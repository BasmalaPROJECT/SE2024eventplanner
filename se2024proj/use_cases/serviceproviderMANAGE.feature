Feature: Event Management for Service Providers

  Background:
    Given a registered service provider with username "service_provider" and password "password"
    And the service provider logs in

  Scenario: Service provider adds a new event
    When the service provider clicks on "Add Event"
    Then they should be able to fill in event details:
      | Event Name       | Event Description        | Date       | Location        | Capacity |
      | Conference       | Industry insights sharing | 2024-05-20 | Convention Center| 100      |

    And the service provider should be able to submit the event
    Then the event "Conference" should be created
    And the service provider should see a confirmation message

  Scenario: Service provider edits an existing event
    When the service provider selects an event to edit
    And modifies the event details:
      | Event Name       | Event Description         | Date       | Location          | Capacity |
      | Updated Conference| Updated industry insights | 2024-06-15 | Convention Center | 120      |
    Then the event details should be updated
    And the service provider should see a confirmation message

  Scenario: Service provider deletes an existing event
    When the service provider selects an event to delete
    Then the event should be removed from the list of managed events
    And the service provider should see a confirmation message

  Scenario: Service provider views and manages attendee list
    Given an event named "Workshop" on 2024-07-10 at Workshop Hall with a capacity of 50
    When the service provider selects the "Workshop" event to manage attendees
    Then they should see a list of registered attendees
    And the service provider should be able to mark attendees as present
    And the service provider should be able to remove attendees from the list

 