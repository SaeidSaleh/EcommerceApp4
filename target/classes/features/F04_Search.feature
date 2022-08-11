@regression

Feature: Logged User could search for any product

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    #When user enters  login email
    #And user enters login password
    #And user press on login button

    # Test Scenario 4
  Scenario: logged user should be able to search for any product.
    And user uses the search text field and enters adidas
    Then user clicks on the search button
    And check if search success

    # Test Scenario 4"
  Scenario: logged user should be able to search for any product.
    And user uses the search text field and enters Apple Mac Pro
    Then user clicks on the search button
    And user choose Apple MacBook Pro 13-inch
    And user check if returned product with the same SKU

