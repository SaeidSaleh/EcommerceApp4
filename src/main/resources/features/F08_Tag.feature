@regression

Feature: Logged user could select different tags

  Background: user opens chrome browser.
    And user navigates to login page:"https://demo.nopcommerce.com/login?returnUrl=%2F"
    When user enters  login email
    And user enters login password
    And user press on login button

    # Test Scenario 8
  Scenario: logged user select Computers> Desktops > awes
      # Search :
    Given user select Computers Category
    And user select Desktops subcategory
    #awesome tag
    And user select awesome tag
    And user make sure af awesome selection
    #cool tag
    And user select cool tag
    And user make sure af cool selection


