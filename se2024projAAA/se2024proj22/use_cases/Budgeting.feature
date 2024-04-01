Feature: Budgeting and Finance

  Scenario: Estimate and Track Expenses
    Given I am a registered service provider
    When I plan the budget for an event
    And I track expenses related to the event
    Then I should be able to estimate and monitor expenses effectively

  Scenario: Categorize Expenses
    Given I am a registered service provider
    And I have incurred expenses for an event
    When I categorize these expenses
    Then I should be able to assign them to specific categories for better organization

  Scenario: View Budget Overview
    Given I am a registered service provider
    And I have planned and tracked expenses for an event
    When I view the budget overview
    Then I should see a summary of planned vs. actual expenses

  Scenario: Analyze Budget Variances
    Given I am a registered service provider
    And I have planned and tracked expenses for an event
    When I analyze the budget variances
    Then I should be able to identify any discrepancies between planned and actual expenses
