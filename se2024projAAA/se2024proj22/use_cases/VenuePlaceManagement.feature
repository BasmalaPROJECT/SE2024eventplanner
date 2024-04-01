Feature: Venue/Place Management

  Scenario: Integration with venue booking systems
    Given I am a registered user
    And there is a venue booking system
    When I check the availability of a venue for an event
    Then I should see whether the venue is available or not


  Scenario: Add new venue as a service provider
    Given I am a registered service provider
    And I have access to the venue management system
    When I add a new venue with details:
      | Name          | Capacity | Amenities                  | Pricing  |
      | New Venue     | 200      | WiFi, Projector, Catering | $100/hr  |
    Then the venue "New Venue" should be successfully added

  Scenario: View venue details
    Given I am a registered user
    And there is a venue "Example Venue"
    When I view the details of the venue "Example Venue"
    Then I should see the capacity, amenities, and pricing of the venue
