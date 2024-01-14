Feature: Test Sauce Demo Application

  Scenario: Validate login page functionality
    Given user is on login page
    When user enter firstname and lastname
    Then user click on login button
