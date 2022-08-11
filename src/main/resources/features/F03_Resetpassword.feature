@regression

Feature: User could reset password

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/passwordrecovery"

  # Test Scenario 3
  Scenario: user write valid email to reset password
    When user enters email:"dfre301@eg.com"
    And user enters click recover button
    And user enters click recover button
    Then user could reset password successfully


  # Test Scenario 3"
  Scenario: user enters invalid not registered email address.
    When user enters email:"dfr@gmail.com"
    And user enters click recover button
    Then user should not be able to reset password