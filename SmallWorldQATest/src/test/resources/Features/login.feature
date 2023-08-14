#Author : Shahrukh Bashir (shane.buriro@gmail.com)

Feature: Feature to test login functionality
  
  Scenario: Login should be successfull with valid credentials.
    Given browser is open
    And user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage.
