@regression

Feature: User could register with valid data

  Background: user opens chrome browser.
    And user navigates to registration page:"https://demo.nopcommerce.com/register?returnUrl=%2F"

  # Test Scenario 1
  Scenario: user registers with valid data.
    When user press on male checkbox.
    And user enters valid first name:"Saeid"
    And user enters valid last name:"Saleh"
    And user select valid date of birth.
    And user enters valid email address:"dfre302@eg.com"
    And user enters valid password:"12345678sA"
    And user confirm password:"12345678sA"
    And user clicks on register button.
      # Expected Result
    #Then user could register successfully.

  # Test Scenario 1"
  Scenario: user registers with invalid password.
    When user press on male checkbox.
    And user enters valid first name:"Saeid"
    And user enters valid last name:"Saleh"
    And user select valid date of birth.
    And user enters valid email address:"dfre3@eg.com"
    And user enters valid password:"123"
    And user confirm password:"123"
    And user clicks on register button.
    # Expected Result
    #Then user could not register successfully.

