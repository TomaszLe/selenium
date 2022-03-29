
Feature: Checkout
  User is able to buy a product


  Scenario: Successful checkout
    Given User on shop homepage
    When User selects "Java Selenium WebDriver" product
    And User fills address details
    Then User should be redirected to thank you page

