Feature: Login user
  Login user feature test for selenium demo app.



  Scenario: Login user with valid email address
    Given User with existent email address
    When User logs to the aplication
    Then User should be redirected to logged user page