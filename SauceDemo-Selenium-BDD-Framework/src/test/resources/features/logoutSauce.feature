Feature: SauceDemo Logout Functionality

  Background:
    Given user navigates to saucedemo
    And enters valid username and password
    And clicks on login button
    Then user should be redirected to homepage

  @single
  Scenario: Successful logout
    When the user clicks on the Menue Bar button
    And user clicks on Logout button
    Then the user should be redirected to the Login page