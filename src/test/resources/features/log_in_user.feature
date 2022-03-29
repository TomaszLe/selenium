Feature: Login user
  Login user feature test for selenium demo app.



  Scenario: Login user with valid email address
    Given User with existent email address "test1@select.com"
    When User logs to the application
    Then User should be redirected to logged user page