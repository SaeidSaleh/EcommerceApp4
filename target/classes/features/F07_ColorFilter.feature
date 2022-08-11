@regression

Feature:Logged user could filter with color
  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    When user enters  login email
    And user enters login password
    And user press on login button

   # Test Scenario 7
  Scenario: user could filter with color
    Given user choose Apparel
    And user choose shoes subcategory
    And user filter with red color
    Then user make sure choosing the red shoes