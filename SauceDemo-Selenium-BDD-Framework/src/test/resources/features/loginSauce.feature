Feature: SauceDemo Login Functionality

  @positive
  Scenario: Login with a different valid user
    Given user navigates to saucedemo
    And enters valid username and password
    And clicks on login button
    Then user should be redirected to homepage

  @negative
  Scenario: Login with a locked out user
    Given user navigates to saucedemo
    And enters username "locked_out_user" and password "secret_sauce"
    And clicks on login button
    Then user should see a "locked out" error message