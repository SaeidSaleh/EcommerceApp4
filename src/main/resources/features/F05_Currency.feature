@regression

Feature: Logged User could switch between currencies US-Euro

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    When user enters  login email
    And user enters login password
    And user press on login button

    # Test Scenario 5
  Scenario: logged user should be able to change currency from Euro to Dollars

    And user search for adidas
    And user choose adidas Consortium Campus 80s Running Shoes
    And user press on currency list
    And user chooses Dollar currency
    And user make sure the adidas price in dollar

    # Test Scenario 5"
  Scenario: logged user should be able to change currency from US Dollars to Euro

    And user search for adidas
    And user choose adidas Consortium Campus 80s Running Shoes
    And user press on currency list
    And user chooses Euro currency
    And user make sure the adidas price in euro


