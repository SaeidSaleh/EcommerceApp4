@regression

Feature: User could login successfully

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"

    # Test Scenario 2
     Scenario: user login with valid email and password
       When user enters  login email
       And user enters login password
       And user press on login button
       Then user could login successfully.

    # Test Scenario 2"
     Scenario: user login with invalid email and password
       When user enters invalid login email
       And user enters invalid login password
       And user press on login button
       Then user could not login successfully.