Feature: User Profiles for Event Management

  Scenario: Service provider registration and event management
    Given a new user with the role "service provider" and username "service_provider" and password "password"
    When the user signs up
    Then the user should be successfully registered as a service provider

    When the service provider logs in with username "service_provider" and password "password"
    Then they should be redirected to their dashboard
    And they should see an option to manage events

    When the service provider clicks on "Manage Events"
    Then they should be able to create a new event with details:
      | Event Name       | Event Description        | Date       | Location        | Capacity |
      | Grand Opening    | A spectacular opening    | 2024-03-15 | Event Hall A    | 200      |

    And they should be able to view and edit existing events
    When the service provider selects an event to edit
    Then they should be able to modify the event details

    And the service provider should be able to delete an event
    When the service provider selects an event to delete
    Then the event should be removed from their list of managed events

  Scenario: User registration and event participation
    Given a new user with the role "user" and username "user" and password "password"
    When the user signs up
    Then the user should be successfully registered

    When the user logs in with username "user" and password "password"
    Then they should be redirected to their profile page
    And they should see a list of upcoming events

    When the user selects an event to register
    Then they should be able to register for the event
    And the event's capacity should decrease by 1
    And the user should receive a confirmation of their registration

    And the user should be able to view the events they have registered for
    When the user checks their registered events
    Then they should see the list of events they have registered for

    And the user should be able to unregister from an event
    When the user selects an event to unregister
    Then they should be removed from the list of attendees
    And the event's capacity should increase by 1
    And the user should receive a confirmation of their unregistration

   
