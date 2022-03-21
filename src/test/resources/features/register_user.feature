
Feature: Register user
  Register user feature test for selenium demo app.
  Description will be ignored and will not affect test execution.


  Scenario: Register user with unique email address
    Given User with unique email address
    When User registers in app
    Then User should be redirected to logged user page

  Scenario: Tworzenie uzytkownika z adresem email ktory juz istnieje w bazie danych

    Given User with existent email address
    When User registers in app
    Then An error will bi displayed " An account is already registered with your email address", user ist still on login page